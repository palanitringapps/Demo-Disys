package com.dysisdemo.ui.news

import com.dysisdemo.data.model.NewsPayload

interface NewsListItemView {
    fun showNewsList(payload: NewsPayload?)
    fun showLoadFailedMessage(error: String)
}