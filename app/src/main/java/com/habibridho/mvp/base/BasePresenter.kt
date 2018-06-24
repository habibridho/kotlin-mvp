package com.habibridho.mvp.base

abstract class BasePresenter<V: BaseContract.View> : BaseContract.Presenter<V> {
    protected lateinit var view: V

    override fun onAttach(view: V) {
        this.view = view
    }

    override fun onDetach() {

    }
}