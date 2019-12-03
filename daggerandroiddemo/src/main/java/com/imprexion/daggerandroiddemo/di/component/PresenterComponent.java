package com.imprexion.daggerandroiddemo.di.component;

import com.imprexion.daggerandroiddemo.di.module.PresenterModule;
import com.imprexion.daggerandroiddemo.main.presenter.MainPresenter;

import dagger.Component;

/**
 * @author : yan
 * @date : 2019/12/2 20:02
 * @desc : TODO
 */
@Component(modules = PresenterModule.class)
public interface PresenterComponent {
    void inject(MainPresenter presenter);
}
