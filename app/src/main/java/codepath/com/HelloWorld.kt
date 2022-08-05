package codepath.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class HelloWorld : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.introButton)
        button.setOnClickListener {
            Log.v("Hello World","Button clicked")
            Toast.makeText(this,"Hi back at you!", Toast.LENGTH_SHORT).show()
        }
    }
}