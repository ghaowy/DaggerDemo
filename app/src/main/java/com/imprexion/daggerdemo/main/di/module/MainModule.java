package com.imprexion.daggerdemo.main.di.module;

import com.imprexion.daggerdemo.main.contract.IMainContract;
import com.imprexion.daggerdemo.main.model.MainModel;
import com.imprexion.daggerdemo.main.presenter.MainPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author : yan
 * @date : 2019/11/30 16:51
 * @desc : TODO
 */
@Module
public class MainModule {

    public IMainContract.IMainView mMainView;

    public MainModule() {
    }

    public MainModule(IMainContract.IMainView mainView) {
        mMainView = mainView;
    }

    @Provides
    public IMainContract.IMainView provideMainActivity() {
        return mMainView;
    }


    @Provides
    @Singleton
    public IMainContract.IMainModel provideMainModel() {
        return new MainModel();
    }


    @Provides
    public IMainContract.IMainPresenter provideMainPresenter(IMainContract.IMainView iMainView) {
        return new MainPresenter(iMainView);
    }
}
