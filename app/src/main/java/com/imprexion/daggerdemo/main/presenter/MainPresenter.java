package com.imprexion.daggerdemo.main.presenter;

import android.util.Log;

import com.imprexion.daggerdemo.main.contract.IMainContract;
import com.imprexion.daggerdemo.main.di.component.DaggerMainComponent;
import com.imprexion.daggerdemo.main.di.module.MainModule;

import javax.inject.Inject;

/**
 * @author : yan
 * @date : 2019/11/30 16:48
 * @desc : TODO
 */
public class MainPresenter implements IMainContract.IMainPresenter {
    private static final String TAG = "MainPresenter";

    @Inject
    IMainContract.IMainModel mMainModel;

    IMainContract.IMainView mMainView;

    public MainPresenter(IMainContract.IMainView iMainView) {
        this.mMainView = iMainView;
    }

    @Override
    public void doPresenter() {
        Log.d(TAG, "doPresenter --------->");

        DaggerMainComponent
                .builder()
                .mainModule(new MainModule())
                .build()
                .inject(this);


        mMainModel.doModel();
        mMainView.doView();
    }
}
