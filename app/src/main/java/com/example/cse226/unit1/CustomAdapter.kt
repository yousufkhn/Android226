package com.example.cse226.unit1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.cse226.R
import com.example.cse226.unit1.Item

class CustomAdapter(
    private val context: Context,
    private val items:List<Item>
): BaseAdapter() {
    override fun getCount(): Int = items.size
    override fun getItem(position: Int): Any = items[position]
    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position:Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.list_item, parent, false)

        val title: TextView = view.findViewById(R.id.itemTitle)
        val subtitle: TextView = view.findViewById(R.id.itemSubtitle)
        val image: ImageView = view.findViewById(R.id.itemImage)

        val item = items[position]
        title.text = item.title
        subtitle.text = item.subtitle
        image.setImageResource(item.imageRes)

        return view
    }
}