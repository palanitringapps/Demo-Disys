package com.dysisdemo.ui.news

import com.dysisdemo.data.model.NewsData
import com.dysisdemo.data.model.NewsPayload

interface NewsDataSource {

    interface ResponseCallBack {
        fun onDataLoad(response: NewsPayload?)

        fun onFailure(result: String)
    }

    fun getNews(language: String?, callBack: ResponseCallBack)
}