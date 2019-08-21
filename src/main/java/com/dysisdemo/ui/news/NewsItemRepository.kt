package com.dysisdemo.ui.news

import com.dysisdemo.ui.login.DataSource

class NewsItemRepository(var newsDataSource: NewsDataSource) {
    fun getNewsItemSuccessData(
        lang: String?,
        callBack: NewsDataSource.ResponseCallBack
    ) {
        newsDataSource.getNews(lang, callBack)
    }
}