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
        val finishButton: Button = findViewById(R.id.finishButton)
        finishButton.setOnClickListener {
            // 戻る事ができる
//            val intent: Intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
            // 画面を終了して、「捨てる」(戻る事ができなくなる)
            finish()
        }
    }
    override fun onStart() {
        super.onStart()
        Log.i("LifeCycle", "ResultActivityのonStartが実行")
    }
    override fun onResume() {
        super.onResume()
        Log.i("LifeCycle", "ResultActivityのonResumeが実行")
    }
    override fun onPause() {
        super.onPause()
        Log.i("LifeCycle", "ResultActivityのonPauseが実行")
    }
    override fun onStop() {
        super.onStop()
        Log.i("LifeCycle", "ResultActivityのonStopが実行")
    }
    override fun onRestart() {
        super.onRestart()
        Log.i("LifeCycle", "ResultActivityのonRestartが実行")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("LifeCycle", "ResultActivityのonDestroyが実行")
    }
}