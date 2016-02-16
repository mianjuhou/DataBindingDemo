package com.fs.mvpdemo.framework.databind;

import com.fs.mvpdemo.framework.model.IModel;
import com.fs.mvpdemo.framework.view.IDelegate;

/**
 * Created by fangdean on 2016/2/16.
 */
public interface DataBinder <T extends IDelegate,D extends IModel> {
    void viewBindModel(T viewDelegate,D data);
}
