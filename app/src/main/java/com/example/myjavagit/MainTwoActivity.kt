package com.example.myjavagit


import android.content.Intent
import android.view.View
import com.example.myjavagit.databinding.MainOneLayoutBinding
import com.example.myjavagit.databinding.MainTwoLayoutBinding

class MainTwoActivity : BaseActivity<MainTwoLayoutBinding>(), View.OnClickListener {
    override fun getLayoutResId(): Int {
        return R.layout.main_two_layout
    }

    override fun initView() {
        mViewDataBinding.text.text = "跳转到了第二个页面 哈哈哈"
        mViewDataBinding.button.setOnClickListener(this)

    }

    override fun initData() {

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button -> {
                finish()
            }
        }
    }
}

