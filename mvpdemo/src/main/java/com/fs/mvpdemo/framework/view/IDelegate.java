package com.fs.mvpdemo.framework.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by fangdean on 2016/2/15.
 */
public interface IDelegate {
    void create(LayoutInflater i, ViewGroup container, Bundle savedInstanceState);
    View getRootView();
}
