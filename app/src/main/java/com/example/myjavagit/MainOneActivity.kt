package com.example.myjavagit


import com.example.myjavagit.databinding.MainLayoutBinding
import com.example.myjavagit.databinding.MainOneLayoutBinding

class MainOneActivity : BaseActivity<MainOneLayoutBinding>() {
    override fun getLayoutResId(): Int {
        return R.layout.main_one_layout
    }

    override fun initView() {
        mViewDataBinding.text.text = "跳转到了第二个页面 哈哈哈"
    }

    override fun initData() {

    }

}

