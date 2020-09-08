package com.example.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.support.design.widget.Snackbar


class MainActivity : AppCompatActivity(),View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }
    override fun onClick(v:View) {
        val intent = Intent(this, SecondActivity::class.java)
        val str1 = editText.text.toString()
        val str2 = editText2.text.toString()
        if (str1==""|| str2=="") {
            Snackbar.make(v, "数字を入れてください", Snackbar.LENGTH_INDEFINITE).show()
            return

        }
        val num1 = str1.toDouble()
        val num2 = str2.toDouble()

        var result = 1.1

            if (v.id == R.id.button) {
              result = num1 + num2
            } else if (v.id == R.id.button2) {
              result =  num1 - num2
            } else if (v.id == R.id.button3) {
              result = num1 * num2
            } else if (v.id == R.id.button4) {
                result = num1 / num2
            }




    intent.putExtra("VALUE1",result)
        startActivity(intent)

}
}
