package com.cookandroid.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    lateinit var imgView : ImageView
    lateinit var editText1 : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "배경색 바꾸기"

        imgView = findViewById<ImageView>(R.id.imgView1)
        editText1 = findViewById<EditText>(R.id.editText1)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        var mInflater = menuInflater
        mInflater.inflate(R.menu.menu1,menu)
        return true

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.subRotate -> {
                imgView.rotation = java.lang.Float.parseFloat(editText1.text.toString())
                return true
            }

            R.id.img_1 -> {
                item.setChecked(true);
                imgView.setImageResource(R.drawable.img1)
                return true
            }
            R.id.img_2 -> {
                item.setChecked(true);
                imgView.setImageResource(R.drawable.img2)
                return true
            }
            R.id.img_3 -> {
                item.setChecked(true);
                imgView.setImageResource(R.drawable.img3)
                return true
            }

        }
        return false
    }

}
