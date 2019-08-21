package com.dysisdemo.ui.news

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.dysisdemo.R
import com.dysisdemo.data.model.NewsPayload
import com.dysisdemo.databinding.ActivityNewsLayoutBinding

class NewsListActivity : AppCompatActivity(), NewsListItemView {

    private lateinit var bind: ActivityNewsLayoutBinding
    private lateinit var adapter: NewsItemsAdapter
    private lateinit var viewModel: NewsListViewModel

    override fun showNewsList(payload: NewsPayload?) {
        bind.swipeContainer.isRefreshing = false
        adapter.updateData(payload?.payload)
    }

    override fun showLoadFailedMessage(error: String) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = DataBindingUtil.setContentView(this, R.layout.activity_news_layout)


        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        bind.rvItems.layoutManager = layoutManager

        val repository = NewsItemRepository(NewsRemoteDataService())
        val factory = NewsListViewModel.NewsListViewModelFactory(application, repository, this)
        viewModel = ViewModelProviders.of(this, factory).get(NewsListViewModel::class.java)
        bind.model = viewModel
        viewModel.getNewsData()

        adapter = NewsItemsAdapter()
        bind.rvItems.adapter = adapter
        bind.swipeContainer.setOnRefreshListener(object : SwipeRefreshLayout.OnRefreshListener {
            override fun onRefresh() {
                viewModel.getNewsData()
            }

        })

    }
}