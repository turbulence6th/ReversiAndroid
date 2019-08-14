package com.turbulence6th.reversi

import android.content.Context
import android.util.AttributeSet
import android.webkit.WebView

class ReversiView : WebView {

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        val width = measuredWidth
        val height = measuredHeight

        if (width < height) {
            setMeasuredDimension(width, width)
        } else {
            setMeasuredDimension(height, height)
        }
    }
}