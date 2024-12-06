package com.example.mobilebrowser

class DataBase {
    val urlList = mutableListOf(
        GridViewModel("Gismeteo", R.drawable.gis, "https://www.gismeteo.ru/"),
        GridViewModel("Yandex", R.drawable.yandex,"https://dzen.ru/?yredirect=true"),
        GridViewModel("Perplexity", R.drawable.perplexity,"https://www.perplexity.ai/"),
        GridViewModel("Github", R.drawable.github, "https://github.com/"),
        GridViewModel("Deeple", R.drawable.deeple, "https://www.deepl.com/"),
        GridViewModel("YouTube", R.drawable.youtube, "https://www.youtube.com/")
    )
}