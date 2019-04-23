package com.yt.develop

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.yt.baselib.constants.RouterConstance

import kotlinx.android.synthetic.main.activity_main.*


@Route(path = RouterConstance.APP_ACTIVITY_URL_MAIN)
class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.bt_to_contacts ->  {
                ARouterUtil.startActivity(RouterConstance.CONTACTS_ACTIVITY_URL_MAIN)
            }

            R.id.bt_to_found ->{
                ARouterUtil.startActivity(RouterConstance.FOUND_ACTIVITY_URL_MAIN)
            }
            R.id.bt_to_message -> {
                ARouterUtil.startActivity(RouterConstance.MESSAGE_ACTIVITY_URL_MAIN)
            }
            R.id.bt_to_mine -> {
                ARouterUtil.startActivity(RouterConstance.MINE_ACTIVITY_URL_MAIN)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ARouter.getInstance().inject(this)
        bt_to_contacts.setOnClickListener(this)
        bt_to_found.setOnClickListener(this)
        bt_to_message.setOnClickListener(this)
        bt_to_mine.setOnClickListener(this)
    }
}
