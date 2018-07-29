package com.vaznoe.calif.aaa.pages;

import com.vaznoe.calif.aaa.apps.wrappers.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * @author vaznoe
 * Date: 7/28/18
 */
public class AdditionalMembersPage extends BasePage<AdditionalMembersPage> {

    private static final By ADD_ADDITIONAL_PERSON_INTO_NEW_MEMBERSHIP_PAGE = By.cssSelector(".member-info-first-page");
    public static final By ADDITIONAL_MEMBERSHIP_BTNS = By.cssSelector(".additional-member.active-form button");

    @Override
    protected String getUrl() {
        return null;
    }

    @Step("Verify Additional Members Page opened")
    public AdditionalMembersPage verifyAdditionalMembersPageOpened() {
        $(ADD_ADDITIONAL_PERSON_INTO_NEW_MEMBERSHIP_PAGE).shouldBe(visible);
        return this;
    }

    @Step("Click \"No Thanks\" button")
    public MembershipOptionPage clickNoThanksButton() {
        $$(ADDITIONAL_MEMBERSHIP_BTNS).get(1).click();
        return new MembershipOptionPage();
    }
}
