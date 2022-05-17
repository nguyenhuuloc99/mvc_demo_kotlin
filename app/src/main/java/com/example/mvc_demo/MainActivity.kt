package com.example.mvc_demo

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var model: Student = getDatFromDb();
        var view = MainActivity();
        var controler = StudentControler(model, view);
        var btn: Button = findViewById(R.id.btn)
        btn.setOnClickListener {
          controler.UpdateView()
        }

    }

    private fun getDatFromDb(): Student {
        return Student("10", "john ")
    }

    fun printDetail(name: String, rollNo: String) {
        Log.d("students", "name=" + name);
        Log.d("students", "rollNo=" + rollNo);
    }
}