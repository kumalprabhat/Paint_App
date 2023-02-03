package com.prac.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.prac.paintapp.PaintView.Companion.colorList
import com.prac.paintapp.PaintView.Companion.currentBrush
import com.prac.paintapp.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object{
        var path = Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val redBtn = findViewById<ImageButton>(R.id.red_color)
        val blueBtn = findViewById<ImageButton>(R.id.blue_color)
        val blackBtn = findViewById<ImageButton>(R.id.black_color)
        val eraseBtn = findViewById<ImageButton>(R.id.white_color)

        redBtn.setOnClickListener(){
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }

        blueBtn.setOnClickListener(){
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }

        blackBtn.setOnClickListener(){
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }

        eraseBtn.setOnClickListener(){
            pathList.clear()
            colorList.clear()
            path.reset()
        }
    }

    private fun currentColor(color: Int){
        currentBrush = color
        path = Path()
    }
}