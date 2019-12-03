package com.imprexion.daggerandroiddemo.main.model;

import android.util.Log;

import com.imprexion.daggerandroiddemo.main.contract.IMainContract;

/**
 * @author : yan
 * @date : 2019/12/2 19:54
 * @desc : TODO
 */
public class MainModel implements IMainContract.IMainModel {
    private static final String TAG = "MainModel";

    @Override
    public void doInModel() {
        Log.d(TAG, "doInModel------------------>");
    }
}
