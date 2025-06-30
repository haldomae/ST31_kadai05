package com.classnumber_00_domaekazuki.st31_kadai05

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    // 画面が生成される時に実行される
    // 最初しか実行されない
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("LifeCycle", "MainActivityのonCreateが実行")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    // Activityがユーザに見える状態になった時に実行される
    // 操作可能になるまでに間実行される
    // データの初期化などに使用される(GPS,センサー)
    // 画面遷移から戻ってきたときも実行されます
    // カメラ、音声の準備
    override fun onStart() {
        Log.i("LifeCycle", "MainActivityのonStartが実行")
        super.onStart()
    }
}