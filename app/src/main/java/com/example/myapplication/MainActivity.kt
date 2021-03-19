package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity(),View.OnClickListener,View.OnLongClickListener {
    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.setOnClickListener(this)
        btn.setOnClickListener(this)
   btnHappy.setOnClickListener(object: View.OnClickListener{
       override fun onClick(v: View?) {
           counter= (1..100).random()
           txv.text = counter.toString()
       }
   })

        TODO("Not yet implemented")
       }
   })
    }

    override fun onClick(view: View) {
        TODO("Not yet implemented")
        if (view.id.equals(R.id.txv)){
            counter++
        }
        else{
            counter = 0
        }

        txv.text = counter.toString()

    }
}
import kotlinx.android.synthetic.main.activity_main.*
