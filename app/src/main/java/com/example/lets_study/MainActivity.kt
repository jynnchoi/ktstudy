package com.example.lets_study

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            btn_login.setOnClickListener{
                var inputid = et_id.text.toString()
                var inputpw = et_pw.text.toString()

                if (inputid == "admin"&& inputpw == "admin") {
                    var alert = AlertDialog.Builder(this@MainActivity)
                    alert.setTitle("로그인")
                    alert.setMessage("Success")
                    alert.show()
                    val intent = Intent(this, SubActivity::class.java)
                    startActivity(intent)
                }

            }
    }
}