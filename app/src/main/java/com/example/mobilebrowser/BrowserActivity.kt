package com.example.mobilebrowser


import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity

class BrowserActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private lateinit var webViewVM: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browser)

        webViewVM = findViewById(R.id.webViewWV)
        toolbar = findViewById(R.id.toolbar)
        title = ""
        setSupportActionBar(toolbar)

        webViewVM.webViewClient = WebViewClient()
        webViewVM.settings.javaScriptEnabled = true

        val url = intent.getStringExtra("URL")
        if (url != null) {
            webViewVM.loadUrl(url)
        }


    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.exitMenu -> {
                finishAffinity()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}