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
public class ContactDetailsFormPage extends BasePage<ContactDetailsFormPage> {

    private static final By MEMBER_CONTACT_INFO_FORM = By.cssSelector(".col-md-12");
    private static final By FORM_FILED = By.cssSelector(".col-md-6 input");
    private static final By COMMUNICATION = By.cssSelector(".form-group.communications input");
    private static final By NEXT_BTN = By.cssSelector(".row.section-divider.contact-info-form button");

    @Override
    protected String getUrl() {
        return null;
    }

    @Step("Verify Contact Details Page opened")
    public ContactDetailsFormPage verifyContactDetailsPageOpened() {
        $(MEMBER_CONTACT_INFO_FORM).shouldBe(visible);
        return this;
    }

    @Step("Fill input field address: {textValue}")
    public ContactDetailsFormPage fillInputAddress(String textValue) {
        $$(FORM_FILED).get(0).setValue(textValue);
        return this;
    }

    @Step("Fill input field city: {textValue}")
    public ContactDetailsFormPage fillInputCity(String textValue) {
        $$(FORM_FILED).get(1).setValue(textValue);
        return this;
    }

    @Step("Fill input field state: {textValue}")
    public ContactDetailsFormPage fillInputState(String textValue) {
        $$(FORM_FILED).get(2).setValue(textValue);
        return this;
    }

    @Step("Fill input field zip code: {textValue}")
    public ContactDetailsFormPage fillInputZipCode(String textValue) {
        $$(FORM_FILED).get(3).setValue(textValue);
        return this;
    }

    @Step("Fill input field email: {textValue}")
    public ContactDetailsFormPage fillInputEmail(String textValue) {
        $$(FORM_FILED).get(4).setValue(textValue);
        return this;
    }

    @Step("Fill input field phone number: {textValue}")
    public ContactDetailsFormPage fillInputPhoneNumber(String textValue) {
        $$(FORM_FILED).get(5).setValue(textValue);
        return this;
    }

    @Step("Select is this cell phone: {textValue}")
    public ContactDetailsFormPage selectIsThisCellPhone(String textValue) {
        if (textValue.equals("Yes")) {
            $$(FORM_FILED).get(6).click();
        } else {
            $$(FORM_FILED).get(7).click();
        }
        return this;
    }

    @Step("Choose Communication Preferences: {textValue}")
    public ContactDetailsFormPage chooseCommunicationPreferences(String textValue) {
        if (textValue.equals("Yes")) {
            $$(COMMUNICATION).get(0).click();
        } else {
            $$(COMMUNICATION).get(1).click();
        }
        return this;
    }

    @Step("Click \"Next\" button")
    public AdditionalMembersPage clickNextButton() {
        $$(NEXT_BTN).get(0).click();
        return new AdditionalMembersPage();
    }
}
