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
        TextView tvName = get(R.id.textView);
        tvName.setText("设置姓名");
        TextView tvAge = get(R.id.textView2);
        tvAge.setText("设置年龄");
    }

    public void setName(String text) {
        TextView tv = get(R.id.textView);
        tv.setText(text);
    }

    public void setAge(String text) {
        TextView tv = get(R.id.textView2);
        tv.setText(text);
    }
}
