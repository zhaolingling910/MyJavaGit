package com.example.myjavagit


import android.content.Intent
import android.view.View
import com.example.myjavagit.databinding.MainLayoutBinding

class MainActivity : BaseActivity<MainLayoutBinding>(), View.OnClickListener {
    override fun getLayoutResId(): Int {
        return R.layout.main_layout
    }

    override fun initView() {
        mViewDataBinding.text.text = "使用git ，练习git命令"
        mViewDataBinding.button.setOnClickListener(this)
    }

    override fun initData() {

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button -> {
                // 创建一个意图来启动另一个活动
                val intent = Intent(this, MainOneActivity::class.java)
                startActivity(intent)
            }
        }
    }

}

