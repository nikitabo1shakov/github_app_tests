package com.nikitabolshakov.githubapptests.repository

import com.nikitabolshakov.githubapptests.model.SearchResponse
import retrofit2.Response

interface RepositoryCallback {
    fun handleGitHubResponse(response: Response<SearchResponse?>?)
    fun handleGitHubError()
}