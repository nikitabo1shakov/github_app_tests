package com.nikitabolshakov.githubapptests.view.search

import com.nikitabolshakov.githubapptests.model.SearchResult
import com.nikitabolshakov.githubapptests.view.ViewContract

internal interface ViewSearchContract : ViewContract {
    fun displaySearchResults(
        searchResults: List<SearchResult>,
        totalCount: Int
    )

    fun displayError()
    fun displayError(error: String)
    fun displayLoading(show: Boolean)
}