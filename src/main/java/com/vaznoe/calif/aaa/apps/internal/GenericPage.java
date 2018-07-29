package com.vaznoe.calif.aaa.apps.internal;

import com.vaznoe.calif.aaa.apps.wrappers.BasePage;

import static com.vaznoe.calif.aaa.apps.wrappers.BaseTest.getPages;

/**
 * @author vaznoe
 * Date: 7/28/2018
 */
public interface GenericPage {

    static BasePage getPageObject(final GenericPage page) {
        getPages().putIfAbsent(page, page.create());
        return getPages().get(page);
    }

    BasePage create();
}
