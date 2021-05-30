package com.thesevenitsolutions.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.thesevenitsolutions.recyclerview.login
import kotlinx.android.synthetic.main.activity_login.*

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnlogin.setOnClickListener {
            if (login.text!!.toString() == "nikhil" && password.text!!.toString() == "gohil"){
                Toast.makeText(this,"login successfull",Toast.LENGTH_LONG).show()
                startActivity(Intent(this,MainActivity::class.java))

            }else{

                Toast.makeText(this,"wrong password or username",Toast.LENGTH_LONG).show()

            }
        }

    }
}