package com.vaznoe.calif.aaa.pages;

import com.vaznoe.calif.aaa.apps.wrappers.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.vaznoe.calif.aaa.apps.utils.properties.SystemProperty.BASE_URL;
import static org.openqa.selenium.By.linkText;

/**
 * @author vaznoe
 * Date: 7/28/18
 */
public class HomePage extends BasePage<HomePage> {

    private static final By HOME_PAGE = By.id("page-container");

    @Override
    protected String getUrl() {
        return null;
    }

    @Step("Verify Home Page opened")
    public HomePage verifyHomePageOpened() {
        $(HOME_PAGE).shouldBe(visible);
        return this;
    }

    @Step("click \"JOIN AAA\" button")
    public CreateNewMembershipPage clickJoinAAAButton() {
        $(linkText("JOIN AAA")).click();
        return new CreateNewMembershipPage();
    }
}
