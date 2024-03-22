package com.example.myjavagit


import android.content.Intent
import android.view.View
import com.example.myjavagit.databinding.MainOneLayoutBinding

class MainOneActivity : BaseActivity<MainOneLayoutBinding>(), View.OnClickListener {
    override fun getLayoutResId(): Int {
        return R.layout.main_one_layout
    }

    override fun initView() {
        mViewDataBinding.text.text = "跳转到了第二个页面 哈哈哈"
        mViewDataBinding.button.setOnClickListener(this)
        mViewDataBinding.buttonOne.setOnClickListener(this)
    }

    override fun initData() {

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button -> {
                finish()
            }
            R.id.buttonOne -> {
                val intent = Intent(this, MainTwoActivity::class.java)
                startActivity(intent)
            }
        }
    }
}

