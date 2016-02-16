package com.fs.mvpdemo.framework.databind;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.fs.mvpdemo.framework.model.IModel;
import com.fs.mvpdemo.framework.presenter.ActivityPresenter;
import com.fs.mvpdemo.framework.view.IDelegate;

/**
 * Created by fangdean on 2016/2/16.
 */
public abstract class DataBindActivity<T extends IDelegate> extends ActivityPresenter<T> {
    protected DataBinder binder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binder = getDataBinder();
    }

    public abstract DataBinder getDataBinder();

    public <D extends IModel> void notifyModelChange(D data) {
        if (binder != null)
            binder.viewBindModel(viewDelegate, data);
    }
}
