package com.imprexion.daggerandroiddemo.di.component;

import com.imprexion.daggerandroiddemo.app.DemoApplication;
import com.imprexion.daggerandroiddemo.di.module.AllActivityModule;
import com.imprexion.daggerandroiddemo.main.contract.IMainContract;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * @author : yan
 * @date : 2019/12/2 11:08
 * @desc : TODO
 */
@Singleton
@Component(modules = {AndroidInjectionModule.class, AllActivityModule.class})
public interface AppComponent {
    void inject(DemoApplication application);

    void inject(IMainContract.IMainPresenter presenter);
}