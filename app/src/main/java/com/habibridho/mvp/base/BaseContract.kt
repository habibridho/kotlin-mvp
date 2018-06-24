package com.habibridho.mvp.base

interface BaseContract {
    interface Presenter<V: View> {
        fun onAttach(view: V)
        fun onDetach()
    }

    interface View {
        fun showLoading()
        fun hideLoading()
    }
}