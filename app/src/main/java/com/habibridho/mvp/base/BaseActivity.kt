package com.habibridho.mvp.base

import android.app.ProgressDialog
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.progressDialog

abstract class BaseActivity : AppCompatActivity(), BaseContract.View {

    protected var pd : ProgressDialog = progressDialog("Loading...")

    override fun showLoading() {
        pd.show()
    }

    override fun hideLoading() {
        pd.hide()
    }

}