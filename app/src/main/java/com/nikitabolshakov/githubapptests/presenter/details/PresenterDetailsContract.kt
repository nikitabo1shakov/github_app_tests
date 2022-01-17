package com.nikitabolshakov.githubapptests.presenter.details

import com.nikitabolshakov.githubapptests.presenter.PresenterContract

internal interface PresenterDetailsContract : PresenterContract {
    fun setCounter(count: Int)
    fun onIncrement()
    fun onDecrement()
}