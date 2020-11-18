package com.example.lets_study

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        btn_logout.setOnClickListener{
                var alert = AlertDialog.Builder(this@SubActivity)
                alert.setTitle("로그아웃")
                alert.setMessage("Success")
                alert.show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

        btn_dalcom.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, OneFragment())
                .commit()
        }
        btn_siru.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, TwoFragment())
                .commit()
        }

    }
}