package com.imprexion.daggerandroiddemo.di.module;

import com.imprexion.daggerandroiddemo.main.contract.IMainContract;
import com.imprexion.daggerandroiddemo.main.model.MainModel;
import com.imprexion.daggerandroiddemo.main.presenter.MainPresenter;
import com.imprexion.daggerandroiddemo.main.view.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * @author : yan
 * @date : 2019/12/2 11:18
 * @desc : TODO
 */
@Module
public class MainModule {

    @Provides
    IMainContract.IMainPresenter providePresenter(MainActivity activity) {
        return new MainPresenter(activity);
    }

    @Provides
    IMainContract.IMainModel provideModel() {
        return new MainModel();
    }
}
