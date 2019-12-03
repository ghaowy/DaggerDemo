package com.imprexion.daggerandroiddemo.main.presenter;

import android.util.Log;

import com.imprexion.daggerandroiddemo.di.component.DaggerAppComponent;
import com.imprexion.daggerandroiddemo.main.contract.IMainContract;
import com.imprexion.daggerandroiddemo.main.model.MainModel;

import javax.inject.Inject;

/**
 * @author : yan
 * @date : 2019/12/2 19:54
 * @desc : TODO
 */
public class MainPresenter implements IMainContract.IMainPresenter {
    private static final String TAG = "MainPresenter";
    private IMainContract.IMainView mIMainView;

    @Inject
    MainModel mModel;

    public MainPresenter(IMainContract.IMainView iMainView) {
        mIMainView = iMainView;
    }

    @Override
    public void doInPresenter() {
//        DaggerPresenterComponent
//                .builder()
//                .build()
//                .inject(this);

        DaggerAppComponent
                .builder()
                .build()
                .inject(this);

        Log.d(TAG, "doInPresenter------------------->");
        mIMainView.doInView();

        mModel.doInModel();
    }
}
