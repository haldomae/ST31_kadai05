package com.classnumber_00_domaekazuki.st31_kadai05

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("LifeCycle", "ResultActivityのonCreateが実行")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val returnButton: Button =
            findViewById(R.id.returnButton)
        returnButton.setOnClickListener {
//            val intent =
//                Intent(this, MainActivity::class.java)
            // 画面を生成
//            startActivity(intent)
            // 画面を破棄
            finish()
        }
    }

    override fun onStart() {
        Log.i("LifeCycle", "ResultActivityのonStartが実行")
        super.onStart()
    }

    override fun onResume() {
        Log.i("LifeCycle", "ResultActivityのonResumeが実行")
        super.onResume()
    }


    override fun onPause() {
        Log.i("LifeCycle", "ResultActivityのonPauseが実行")
        super.onPause()
    }


    override fun onStop() {
        Log.i("LifeCycle", "ResultActivityのonStopが実行")
        super.onStop()
    }

    override fun onRestart() {
        Log.i("LifeCycle", "ResultActivityのonRestartが実行")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.i("LifeCycle", "ResultActivityのonDestroyが実行")
        super.onDestroy()
    }
}