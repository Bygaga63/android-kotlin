package home.bygaga.com.myapplication2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        val vEdit = findViewById<EditText>(R.id.act2_edit)
        val button = findViewById<Button>(R.id.act2_button)
        button.setOnClickListener {
            val newStr = vEdit.text.toString()
            val i = Intent()
            i.putExtra("tag2", newStr)
            setResult(0, i)
            this.finish()
        }

        val str = intent.getStringExtra("tag1")

        vEdit.setText(str)

    }
}