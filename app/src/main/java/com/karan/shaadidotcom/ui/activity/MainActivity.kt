package com.karan.shaadidotcom.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.snackbar.Snackbar
import com.karan.shaadidotcom.ui.viewmodel.MainActivityViewModel
import com.karan.shaadidotcom.R
import com.karan.shaadidotcom.ui.adapter.MatchesAdapter
import com.karan.shaadidotcom.utils.subscribe
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Should have  extended this to BaseSessionActivity with viewmodel and viewBinding , since its a demo
 * i.e why not went into deep implementation , however [base] package can be checked for the base classes for
 * activity and viewmodels , which will help when we want to scale the project at later point of time
 *
 */
class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainActivityViewModel
    private lateinit var matchesAdapter: MatchesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViewModel()
        setupViews()
        loadData()
    }

    private fun setupViewModel() {
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        subscribe(viewModel.loading) { progress.isVisible = it }
        subscribe(viewModel.profiles) { matchesAdapter.setData(it) }
        subscribe(viewModel.errSnackbar) { showErrSnackbar(it) }
    }

    private fun setupViews() {
        matchesAdapter = MatchesAdapter(viewModel)
        matches_rv.adapter = matchesAdapter
    }

    private fun loadData() {
        viewModel.fetchData(10)
    }

    private fun showErrSnackbar(message: String) {
        Snackbar.make(activity_content, message, Snackbar.LENGTH_SHORT).show()
    }
}
