package com.example.cse226.unit1.assignment1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cse226.R

class CricketerHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cricketer_home)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val cricketers = listOf(
            Cricketer("Virat Kohli", "India", 890),
            Cricketer("Babar Azam", "Pakistan", 870),
            Cricketer("Steve Smith", "Australia", 860),
            Cricketer("Rohit Sharma", "India", 850),
            Cricketer("Kane Williamson", "New Zealand", 845),
            Cricketer("Joe Root", "England", 840),
            Cricketer("David Warner", "Australia", 835),
            Cricketer("Shubman Gill", "India", 830),
            Cricketer("Marnus Labuschagne", "Australia", 825),
            Cricketer("Quinton de Kock", "South Africa", 820)
        )

        val adapter = CricketAdapter(cricketers)
        recyclerView.adapter = adapter
    }
}