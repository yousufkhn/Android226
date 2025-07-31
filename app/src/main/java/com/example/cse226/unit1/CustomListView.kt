package com.example.cse226.unit1

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cse226.R

class CustomListView : AppCompatActivity() {

    private lateinit var listview:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list_view)

        listview = findViewById<ListView>(R.id.list_view)

        val items = listOf(
            Item("Item 1", "Subtitle 1", R.drawable.spiderman),
            Item("Item 2", "Subtitle 2", R.drawable.spiderman),
            Item("Item 3", "Subtitle 3", R.drawable.spiderman),
        )

        val adapter = CustomAdapter(this, items)
        listview.adapter = adapter

        listview.setOnItemClickListener { _, _, position, _ ->
            val clickedItem = items[position]
            Toast.makeText(this, "Clicked: ${clickedItem.title}", Toast.LENGTH_SHORT).show()
        }
    }
}