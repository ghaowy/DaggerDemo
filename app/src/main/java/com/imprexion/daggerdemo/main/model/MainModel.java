package com.imprexion.daggerdemo.main.model;

import android.util.Log;

import com.imprexion.daggerdemo.main.contract.IMainContract;

/**
 * @author : yan
 * @date : 2019/11/30 16:47
 * @desc : TODO
 */
public class MainModel implements IMainContract.IMainModel {
    private static final String TAG = "MainModel";

    @Override
    public void doModel() {
        Log.d(TAG, "doModel ---->");
    }
}
