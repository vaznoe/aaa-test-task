package com.vaznoe.calif.aaa.pages;

import com.vaznoe.calif.aaa.apps.wrappers.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

/**
 * @author vaznoe
 * Date: 7/28/18
 */
public class PaymentPage extends BasePage<PaymentPage> {

    private static final By PAYMENT_INFO_PAGE = By.cssSelector(".container");
    private static final By SUBMIT_BTN = By.id("paymentSubmitBtn");
    private static final By ERROR = By.className("errorContent");

    @Override
    protected String getUrl() {
        return null;
    }

    @Step("Verify Payment Page opened")
    public PaymentPage verifyPaymentPageOpened() {
        $(PAYMENT_INFO_PAGE).shouldBe(visible);
        return this;
    }

    @Step("Click \"Submit Payment\" button")
    public PaymentPage clickSubmitPaymentButton() {
        $(SUBMIT_BTN).click();
        return this;
    }

    @Step("Verify Error Message is displayed")
    public String verifyErrorMessageIsDisplayed() {
       return $(ERROR).shouldBe(visible).getText();
    }
}
