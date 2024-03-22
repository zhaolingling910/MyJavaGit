package com.example.myjavagit


import com.example.myjavagit.databinding.MainLayoutBinding

class MainActivity : BaseActivity<MainLayoutBinding>() {
    override fun getLayoutResId(): Int {
        return R.layout.main_layout
    }

    override fun initView() {
        mViewDataBinding.text.text = "使用git ，练习git命令"
    }

    override fun initData() {

    }

}

