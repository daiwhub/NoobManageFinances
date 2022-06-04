package com.daiw.noobmanagefinances.view.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import androidx.appcompat.app.AppCompatActivity
import com.daiw.noobmanagefinances.R

class SplashActivity : AppCompatActivity() {

    class MyHandler : Handler(Looper.getMainLooper()) {

        override fun dispatchMessage(msg: Message) {
            super.dispatchMessage(msg)
        }
    }

    private val mRunnable = Runnable {
        startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
        finish()
    }

    private val myHandler = MyHandler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //恢复原有的样式
        setTheme(R.style.Theme_NoobManageFinances);
        setContentView(R.layout.activity_splash)

        myHandler.postDelayed(mRunnable, 3000)
    }
}