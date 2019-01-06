package home.bygaga.com.myapplication2

import android.content.Intent
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import io.reactivex.Observable

class MainActivity : AppCompatActivity() {
    lateinit var vText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vText = findViewById(R.id.tv_message)
        vText.setTextColor(0xFFFF00000.toInt())


        vText.setOnClickListener {
            Log.e("tag", "НАЖАТА КНОПКА")
            val i = Intent(this, SecondActivity::class.java)
            i.putExtra("tag1", vText.text)
            startActivityForResult(i, 0)

            //TODO finish here
            val o = Observable.create<String>{
                it.onNext("Bygaga63")
            }
        }

        Log.v("tag", "Был запущен onCreate")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(data != null) {
            val str = data.getStringExtra("tag2")

            vText.text = str
        }
    }
    override fun onStart() {
        super.onStart()
    }
}


