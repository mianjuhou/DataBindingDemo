package com.fs.mvpdemo.demo.login;

import android.view.View;

import com.fs.mvpdemo.R;
import com.fs.mvpdemo.framework.databind.DataBindActivity;
import com.fs.mvpdemo.framework.databind.DataBinder;

/**
 * Created by fangdean on 2016/2/16.
 */
public class LoginActivity extends DataBindActivity<LoginDelegate>{
    private LoginBean bean=new LoginBean();
    @Override
    protected void bindEventListener() {
        super.bindEventListener();
        viewDelegate.setOnClickListener(listener,R.id.button,R.id.button2);
    }

    @Override
    public DataBinder getDataBinder() {
        return new LoginDataBinder();
    }

    @Override
    public Class<LoginDelegate> getDelegateClass() {
        return LoginDelegate.class;
    }

    private View.OnClickListener listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.button:
                    bean.setName("fangdean");
                    notifyModelChange(bean);
                    break;
                case R.id.button2:
                    bean.setAge("27");
                    notifyModelChange(bean);
                    break;
            }
        }
    };
}
