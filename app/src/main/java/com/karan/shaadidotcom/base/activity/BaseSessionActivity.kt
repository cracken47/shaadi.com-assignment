package com.karan.shaadidotcom.base.activity


import androidx.databinding.ViewDataBinding
import com.karan.shaadidotcom.base.viewModel.BaseSessionViewModel
import com.toppr.core.base.activity.BaseViewModelActivity
import com.toppr.core.base.activity.InflateActivityLayout
import kotlin.reflect.KClass

abstract class BaseSessionActivity<VB : ViewDataBinding, VM : BaseSessionViewModel>(
    inflater: InflateActivityLayout<VB>,
    viewModelClass: KClass<VM>
) : BaseViewModelActivity<VB, VM>(inflater, viewModelClass) {

    override fun VB.onResume(vm: VM) {

    }

    override fun VB.observeViewModel(vm: VM) {
        vm.apply {

        }
    }
}