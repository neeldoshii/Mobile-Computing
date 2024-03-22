package com.example.graphicalprimitives

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class DrawingView(context: Context, attrs: AttributeSet) : View(context, attrs) {
    private val paint = Paint()

    init {
        paint.color = Color.BLACK
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 5f
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // Draw a circle
        canvas.drawCircle(200f, 200f, 100f, paint)

        // Draw a rectangle
        canvas.drawRect(300f, 300f, 500f, 400f, paint)

        // Draw a line
        canvas.drawLine(100f, 500f, 600f, 500f, paint)
    }
}