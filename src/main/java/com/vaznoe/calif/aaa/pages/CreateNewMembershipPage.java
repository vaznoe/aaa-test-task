package com.vaznoe.calif.aaa.pages;

import com.vaznoe.calif.aaa.apps.wrappers.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.Wait;
import static java.time.Duration.ofSeconds;

/**
 * @author vaznoe
 * Date: 7/28/18
 */
public class CreateNewMembershipPage extends BasePage<CreateNewMembershipPage> {
    
    private static final By START_MEMBERSHIP = By.cssSelector(".container-fluid.ng-scope");
    private static final By GET_STARTED_BTN = By.id("classicSelectButtonTop");

    @Override
    protected String getUrl() {
        return null;
    }

    @Step("Verify Start New Membership Page opened")
    public CreateNewMembershipPage verifyStartNewMembershipPageOpened() {
        $(START_MEMBERSHIP).shouldBe(visible);
        return this;
    }

    @Step("Click \"Get Started\" button")
    public NewMemberInfoPage clickGetStartedButton() {
        $(GET_STARTED_BTN).click();
        Wait().withTimeout(ofSeconds(3));
        return new NewMemberInfoPage();
    }
}
