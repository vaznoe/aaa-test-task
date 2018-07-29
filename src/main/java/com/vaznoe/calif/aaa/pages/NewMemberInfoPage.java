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
public class NewMemberInfoPage extends BasePage<NewMemberInfoPage> {

    private static final By MEMBER_FORM_FIRST_PAGE = By.cssSelector(".member-info-first-page");
    private static final By NAME_FORM_PAGE = By.cssSelector(".col-md-4 input");
    private static final By SAVE_BTN = By.cssSelector(".row.section-divider.primary-member-form button");

    @Override
    protected String getUrl() {
        return null;
    }

    @Step("Verify Member Info Page opened")
    public NewMemberInfoPage verifyMemberInfoPageOpened() {
        $(MEMBER_FORM_FIRST_PAGE).shouldBe(visible);
        return this;
    }

    @Step("Fill input field first name: {textValue}")
    public NewMemberInfoPage fillInputFirstName(String firtName) {
        $$(NAME_FORM_PAGE).get(0).setValue(firtName);
        return this;
    }

    @Step("Fill input field last name: {textValue}")
    public NewMemberInfoPage fillInputLastName(String lastName) {
        $$(NAME_FORM_PAGE).get(1).setValue(lastName);
        return this;
    }

    @Step("Select gender: {textValue}")
    public NewMemberInfoPage selectGender(String gender) {
        switch (gender) {
            case "Male":
                $("#optionsRadios1").click();
                break;
            case "Female":
                $("#optionsRadios2").click();
                break;
        }
        return this;
    }

    @Step("Click \"Save\" button")
    public ContactDetailsFormPage clickSaveButton() {
        $$(SAVE_BTN).first().click();
        return new ContactDetailsFormPage();
    }
}
