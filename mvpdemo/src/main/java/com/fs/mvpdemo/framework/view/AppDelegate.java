package com.fs.mvpdemo.framework.view;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by fangdean on 2016/2/15.
 */
public abstract class AppDelegate implements IDelegate {
    protected View rootView;

    public abstract int getRootLayoutId();

    @Override
    public void create(LayoutInflater i, ViewGroup container, Bundle savedInstanceState) {
        int rootLayoutId = getRootLayoutId();
        rootView = i.inflate(rootLayoutId, null);
    }

    @Override
    public View getRootView() {
        return rootView;
    }

    public void setRootView(View rootView) {
        this.rootView = rootView;
    }

    ///////////////////////////////////////////////
    ///////////////////////////////////////////////
    protected SparseArray<View> mViews = new SparseArray<View>();

    public <T extends View> T bindView(int id) {
        T view = (T) mViews.get(id);
        if (view == null) {
            view = (T) rootView.findViewById(id);
            mViews.put(id, view);
        }
        return view;
    }

    public <T extends View> T get(int id) {
        return (T) bindView(id);
    }

    public void setOnClickListener(View.OnClickListener listener, int... ids) {
        if (ids == null)
            return;
        for (int id : ids) {
            get(id).setOnClickListener(listener);
        }
    }

    ////////////////////////////////////////////
    ////////////////////////////////////////////
    @Override
    public void initWidget() {
    }
}
