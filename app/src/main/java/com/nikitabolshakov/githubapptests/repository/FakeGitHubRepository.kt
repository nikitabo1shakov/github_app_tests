package com.nikitabolshakov.githubapptests.repository

import com.nikitabolshakov.githubapptests.model.SearchResponse
import com.nikitabolshakov.githubapptests.presenter.RepositoryContract
import retrofit2.Response

internal class FakeGitHubRepository : RepositoryContract {

    override fun searchGithub(
        query: String,
        callback: RepositoryCallback
    ) {
        callback.handleGitHubResponse(Response.success(SearchResponse(42, listOf())))
    }
}