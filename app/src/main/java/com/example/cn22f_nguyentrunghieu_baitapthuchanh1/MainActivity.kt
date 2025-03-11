package com.example.cn22f_nguyentrunghieu_baitapthuchanh1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.app.NotificationManagerCompat
import com.example.cn22f_nguyentrunghieu_baitapthuchanh1.ui.theme.CN22F_NguyenTrungHieu_BaiTapThucHanh1Theme
import android.content.Context
import android.widget.Toast
import androidx.core.app.NotificationCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val check: Button = findViewById(R.id.check)
        val name: EditText = findViewById(R.id.name)
        val age: EditText = findViewById(R.id.age)

        check.setOnClickListener {
            val nameText = name.text.toString().trim()
            val ageText = age.text.toString().trim()

            if(nameText.isNotBlank() && ageText.isNotBlank()){
                val ageValue = ageText.toIntOrNull() ?: -1
                if (ageValue < 2){
                    Toast.makeText(this, "$nameText la em be", Toast.LENGTH_SHORT).show()
                }
                else if (ageValue < 6 ){
                    Toast.makeText(this, "$nameText la tre em", Toast.LENGTH_SHORT).show()
                }
                else if (ageValue <= 65){
                    Toast.makeText(this, "$nameText la nguoi lon", Toast.LENGTH_SHORT).show()
                    //ng lon
                }
                else if (ageValue > 65){
                    Toast.makeText(this, "$nameText la nguoi gia", Toast.LENGTH_SHORT).show()
                    //ng lon
                }
            }
        }

    }
}

