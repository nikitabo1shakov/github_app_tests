package com.nikitabolshakov.githubapptests.view

import com.nikitabolshakov.githubapptests.model.SearchResult

internal interface ViewContract {
    fun displaySearchResults(
        searchResults: List<SearchResult>,
        totalCount: Int
    )

    fun displayError()
    fun displayError(error: String)
    fun displayLoading(show: Boolean)
}