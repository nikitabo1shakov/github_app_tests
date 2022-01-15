package com.nikitabolshakov.githubapptests.view.details

import com.nikitabolshakov.githubapptests.view.ViewContract

internal interface ViewDetailsContract : ViewContract {
    fun setCount(count: Int)
}