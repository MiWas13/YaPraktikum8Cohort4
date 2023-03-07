package com.miwas.yapraktikum8cohort4.uikit

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.constraintlayout.widget.ConstraintLayout
import com.miwas.yapraktikum8cohort4.R

class UiKitButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout (context, attrs, defStyleAttr) {

    private val titleTextView: TextView
    private val arrow: AppCompatImageView
    private val mainButton: ViewGroup

    init {
        val attributes = context.theme.obtainStyledAttributes(attrs, R.styleable.UiKitButton, 0, 0)

        val title: String
        val isShowArrow: Boolean
        val isEnable: Boolean

        try {
            title = attributes.getString(R.styleable.UiKitButton_uiKitButton_title).orEmpty()
            isShowArrow = attributes.getBoolean(R.styleable.UiKitButton_uiKitButton_show_arrow, true)
            isEnable = attributes.getBoolean(R.styleable.UiKitButton_uiKitButton_enabled, true)
        } finally {
            attributes.recycle()
        }

        View.inflate(context, R.layout.ui_kit_button, this)

        titleTextView = findViewById(R.id.btnText)
        arrow = findViewById(R.id.btnIcon)
        mainButton = findViewById(R.id.rootUiKitButton)


        titleTextView.text = title
        mainButton.isEnabled = isEnable
        arrow.visibility = if (isShowArrow) View.VISIBLE else View.GONE

    }


    override fun setOnClickListener(l: OnClickListener?) {
        super.setOnClickListener(l)
        mainButton.setOnClickListener(l)
    }
}