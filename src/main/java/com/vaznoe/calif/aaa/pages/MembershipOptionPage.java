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
public class MembershipOptionPage extends BasePage<MembershipOptionPage> {

    private static final By RV_MOTORCYCLE_INTO_NEW_MEMBERSHIP_PAGE = By.cssSelector(".member-info-first-page");
    private static final By EXTRACOVER_OPTION_BTNS = By.cssSelector(".form-group.clearfix.extra-coverage-question button");

    @Override
    protected String getUrl() {
        return null;
    }

    @Step("Verify Members Options Page opened")
    public MembershipOptionPage verifyMembersOptionsPageOpened() {
        $(RV_MOTORCYCLE_INTO_NEW_MEMBERSHIP_PAGE).shouldBe(visible);
        return this;
    }

    @Step("click \"No Thanks\" button")
    public FinalTotalAndSubmitFormPage clickNoThanksButton() {
        $$(EXTRACOVER_OPTION_BTNS).get(1).click();
        return new FinalTotalAndSubmitFormPage();
    }
}
