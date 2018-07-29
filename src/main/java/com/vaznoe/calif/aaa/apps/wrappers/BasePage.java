package com.vaznoe.calif.aaa.apps.wrappers;

import com.vaznoe.calif.aaa.apps.internal.PageObjectsSupplier;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

/**
 * @author vaznoe
 * Date: 7/28/2018
 */
public abstract class BasePage<T> implements PageObjectsSupplier {

    @SuppressWarnings("unchecked")
    private T get() {
        return (T) this;
    }

    protected abstract String getUrl();

    @Step("Open page")
    public T openPage() {
        open(getUrl());
        return get();
    }
}
