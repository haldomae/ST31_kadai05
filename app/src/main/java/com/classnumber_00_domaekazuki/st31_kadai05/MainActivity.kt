package com.classnumber_00_domaekazuki.st31_kadai05

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var orderText: String = ""
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val menuButtonList: Array<View> = arrayOf(
            findViewById(R.id.menu1),
            findViewById(R.id.menu2),
            findViewById(R.id.menu3),
            findViewById(R.id.menu4),
            findViewById(R.id.menu5),
            findViewById(R.id.menu6),
        )

        var orderText: String = ""
        val menuText: TextView = findViewById(R.id.menuText)
        for(menuButton in menuButtonList){
            menuButton.setOnClickListener { buttonView ->
                // ViewをButton型にキャストしてgetText()を呼び出す
                val buttonText = (buttonView as Button).text.toString()
                orderText = menuText.text.toString() + buttonText + "\n"
                menuText.text = orderText
            }
        }
        val submitButton: Button = findViewById(R.id.submitButton)
        submitButton.setOnClickListener {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("MENU", orderText) // 取得したテキストをputExtraに渡す
                startActivity(intent) // 画面遷移を実行
        }
    }

    override fun onResume() {
        super.onResume()
        orderText = ""
        val menuText: TextView = findViewById(R.id.menuText)
        menuText.text = orderText
        val makeText = Toast.makeText(this, "メニューを選択してください", Toast.LENGTH_SHORT)
        makeText.show()

    }
}