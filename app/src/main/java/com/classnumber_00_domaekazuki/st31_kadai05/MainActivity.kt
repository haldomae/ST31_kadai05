package com.classnumber_00_domaekazuki.st31_kadai05

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    // Activityが生成される時に実行される
    // 最初にしか実行しない
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
    // 本来は初期化処理はonStart()で行った方が良い(GPS,センサー,イベントリスナーの更新など)
    // 遷移で元に戻った時にも呼ばれる
    // カメラ、音声の準備
    // 位置情報の更新など
    override fun onStart() {
        super.onStart()
        Log.i("LifeCycle", "MainActivityのonStartが実行")
    }
}