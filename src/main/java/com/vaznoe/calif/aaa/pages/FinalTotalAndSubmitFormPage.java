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
public class FinalTotalAndSubmitFormPage extends BasePage<FinalTotalAndSubmitFormPage> {

    private static final By TOTAL_SUBMIT_FORM_PAGE = By.cssSelector(".container");
    private static final By PROCEED_TO_CHECKOUT_BTN = By.id("proceedToCheckoutButton");

    @Override
    protected String getUrl() {
        return null;
    }

    @Step("Verify Final Total and Submit Form Page opened")
    public FinalTotalAndSubmitFormPage verifyFinalTotalAndSubmitFormPageOpened() {
        $(TOTAL_SUBMIT_FORM_PAGE).shouldBe(visible);
        return this;
    }

    @Step("Click \"Proceed to Checkout\" button")
    public PaymentPage clickProceedToCheckoutButton() {
        $$(PROCEED_TO_CHECKOUT_BTN).get(0).click();
        return new PaymentPage();
    }
}
