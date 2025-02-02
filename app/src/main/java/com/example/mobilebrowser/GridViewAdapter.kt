package com.example.mobilebrowser

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class GridViewAdapter (
    private val list: List<GridViewModel>,
    private val context: Context
) : BaseAdapter(){

    private var layoutInflater: LayoutInflater? = null
    private lateinit var textViewTV: TextView
    private lateinit var imageViewIV: ImageView

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, view: View?, p2: ViewGroup?): View {
        var convertView = view
        if (layoutInflater == null){
            layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        if (convertView == null){
            convertView = layoutInflater!!.inflate(R.layout.gridview_item, null)
        }
        imageViewIV = convertView!!.findViewById(R.id.imageViewIV)
        textViewTV = convertView.findViewById(R.id.textViewTV)

        imageViewIV.setImageResource(list[position].image)
        textViewTV.text = list[position].name
        return convertView
    }

}