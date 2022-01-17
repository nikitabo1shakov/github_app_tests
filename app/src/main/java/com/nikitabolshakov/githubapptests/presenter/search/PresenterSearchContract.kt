package com.nikitabolshakov.githubapptests.presenter.search

import com.nikitabolshakov.githubapptests.presenter.PresenterContract

internal interface PresenterSearchContract : PresenterContract {
    fun searchGitHub(searchQuery: String)
}