package com.nikitabolshakov.githubapptests.presenter

import com.nikitabolshakov.githubapptests.model.SearchResponse
import com.nikitabolshakov.githubapptests.repository.RepositoryCallback
import io.reactivex.Observable

interface RepositoryContract {

    fun searchGithub(
        query: String,
        callback: RepositoryCallback
    )

    fun searchGithub(
        query: String
    ): Observable<SearchResponse>

    suspend fun searchGithubAsync(
        query: String
    ): SearchResponse
}