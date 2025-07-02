package com.classnumber_00_domaekazuki.st31_kadai05

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    // 画面が生成されたときに実行される
    // 画面生成時、一度しか実行されない
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("LifeCycle", "MainActivityのonCreateが実行")
        super.onCreate(savedInstanceState)
        // アプリフルスクリーンで表示
        enableEdgeToEdge()
        // どのxmlファイル使うか
        setContentView(R.layout.activity_main)
        // 余白いい感じにしてくれる
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val button: Button = findViewById(R.id.transitionButton)
        button.setOnClickListener {
            // 指示書(Intent)を作成
            // 1つ目の引数 : context(どこの画面から指示が出ているか)
            // this -> この画面
            // 2つ目の引数 : 遷移先のクラス(::class.javaを付けてJavaのクラスに変換)
            val intent = Intent(this, ResultActivity::class.java)
            // 値を受け渡したい場合
            intent.putExtra("VALUE", "MainActivityからの値")
            // 画面遷移
            startActivity(intent)
        }
    }

    // 画面が見える状態になった時に実行される
    // 操作可能になるまでの間に実行される
    // 初期化処理使われる(GPS、イベントリスナーの更新)
    // 画面遷移で元に戻った時に実行される
    override fun onStart() {
        Log.i("LifeCycle", "MainActivityのonStartが実行")
        super.onStart()
    }

    // 画面が前面に表示され、ユーザとのやり取りができる直前に実行
    // DBの更新など必要な情報を更新する処理などを実行する
    override fun onResume() {
        Log.i("LifeCycle", "MainActivityのonResumeが実行")
        super.onResume()
    }

    // アプリがバックグラウンドに移動した時に実行される
    // 画面が一時停止状態になっている為、画面が消えている訳ではない
    // 処理を一時停止にするときに使われる
    // 非常に短いので、データの保存等は行わない
    override fun onPause() {
        Log.i("LifeCycle", "MainActivityのonPauseが実行")
        super.onPause()
    }

    // アプリが完全バックグランドに移動した時に実行
    // 画面は非表示になり、停止する
    // 不要なリソースを解放したり、思い処理の負荷を抑える
    override fun onStop() {
        Log.i("LifeCycle", "MainActivityのonStopが実行")
        super.onStop()
    }

    // 画面再表示で実行される
    override fun onRestart() {
        Log.i("LifeCycle", "MainActivityのonRestartが実行")
        super.onRestart()
    }

    // 画面が破棄されたとき
    // 画面の構成が変わった時にも実行(縦から横になった時)
    override fun onDestroy() {
        Log.i("LifeCycle", "MainActivityのonDestroyが実行")
        super.onDestroy()
    }
}