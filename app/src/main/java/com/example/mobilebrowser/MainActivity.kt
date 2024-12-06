package com.example.mobilebrowser

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.AdapterView
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private lateinit var gridViewGV: GridView

    private val urlList = DataBase().urlList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        title = ""
        setSupportActionBar(toolbar)
        gridViewGV = findViewById(R.id.gridViewGV)

        val adapter = GridViewAdapter(list = urlList, this@MainActivity)
        gridViewGV.adapter = adapter

        gridViewGV.onItemClickListener = AdapterView.OnItemClickListener{_, _, position, _ ->
            //startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(list[position].url)))
            val url = urlList[position].url
            val intent = Intent(this, BrowserActivity::class.java)
            intent.putExtra("URL", url)
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.exitMenu -> {
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}