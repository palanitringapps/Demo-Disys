package com.dysisdemo.ui.news

import androidx.lifecycle.ViewModel
import com.dysisdemo.data.model.NewsData

class NewsItemViewModel(var newsPayload: NewsData) : ViewModel() {

    fun imagePath(): String? {
        return newsPayload.image
    }
}