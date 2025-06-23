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

    // Activityが前面に表示され、ユーザとやりとりが可能になる直前に実行される
    // Activityをユーザに表示可能になるために必要な処理や初期化をここで処理する(DB処理や、必要な情報を画面にセットする)
    // 割り込み処理の発生（アプリ表示中に電話がくるなど）により、Activityが一時停止すると、onStop()が実行され、再開すると再びonResume()が実行される
    override fun onResume() {
        super.onResume()
        Log.i("LifeCycle", "MainActivityのonResumeが実行")
    }

    // アプリがバックグラウンドに移動したことを示すために実行される
    // Activityの一時停止状態になっている為、Activityが消えるとは限らない
    // 処理を停止しておく時などに使用する
    // 非常に短いので、データの保存等は行わない
    override fun onPause() {
        super.onPause()
        Log.i("LifeCycle", "MainActivityのonPauseが実行")
    }

    // アプリが完全にバックグラウンドに移動した時に実行される
    // Activityは非表示になり、停止する
    // 不要なリソースを解放したり、アニメーションの停止などの処理の負荷を抑えるような事を行う
    override fun onStop() {
        super.onStop()
        Log.i("LifeCycle", "MainActivityのonStopが実行")
    }

    // Activityの再表示の際に実行される
    // アプリキル(Activityが消滅)される時には実行されない
    override fun onRestart() {
        super.onRestart()
        Log.i("LifeCycle", "MainActivityのonRestartが実行")
    }
}