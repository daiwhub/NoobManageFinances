package com.daiw.noobmanagefinances.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.daiw.noobmanagefinances.R

class LoginActivity : AppCompatActivity() , View.OnClickListener {

    private lateinit var mEdtUserName: EditText
    private lateinit var mEdtPwd: EditText
    private lateinit var mTvForgetPwd: TextView
    private lateinit var mTvRegister: TextView
    private lateinit var mBtnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initView()
        setListener()
    }

    private fun initView() {
        mEdtUserName = findViewById(R.id.edt_login_username)
        mEdtPwd = findViewById(R.id.edt_login_pwd)
        mTvForgetPwd = findViewById(R.id.tv_login_forget)
        mTvRegister = findViewById(R.id.tv_login_register)
        mBtnLogin = findViewById(R.id.btn_login)
    }

    private fun setListener() {
        mTvForgetPwd.setOnClickListener(this)
        mTvRegister.setOnClickListener(this)
        mBtnLogin.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.tv_login_forget -> {}
            R.id.tv_login_register -> {}
            R.id.btn_login -> {
                startActivity(Intent(this,HomeActivity::class.java))
                finish()
            }
        }
    }
}