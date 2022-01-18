package com.nikitabolshakov.githubapptests.presenter

import com.nikitabolshakov.githubapptests.repository.RepositoryCallback

internal interface RepositoryContract {
    fun searchGithub(
        query: String,
        callback: RepositoryCallback
    )
}