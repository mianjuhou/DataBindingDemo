package com.fs.mvpdemo.demo.login;

import android.widget.TextView;

import com.fs.mvpdemo.R;
import com.fs.mvpdemo.framework.view.AppDelegate;

/**
 * Created by fangdean on 2016/2/15.
 */
public class LoginDelegate extends AppDelegate {
    @Override
    public int getRootLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initWidget() {
        super.initWidget();
        TextView tv = get(R.id.textView);
        tv.setText("设置文本");
    }

    public void setText(String text) {
        TextView tv = get(R.id.textView);
        tv.setText(text);
    }
}
