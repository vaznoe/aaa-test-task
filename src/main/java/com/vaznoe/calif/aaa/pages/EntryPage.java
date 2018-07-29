package com.vaznoe.calif.aaa.pages;

import com.vaznoe.calif.aaa.apps.wrappers.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.vaznoe.calif.aaa.apps.utils.properties.SystemProperty.BASE_URL;

/**
 * @author vaznoe
 * Date: 7/28/18
 */
public class EntryPage extends BasePage<EntryPage> {

    private static final By ZIP_MODAL_WINDOW = By.cssSelector(".modal-content");
    private static final By ZIP_FIELD = By.cssSelector(".modal-content input");
    private static final By GO_BTN = By.cssSelector(".modal-content a");

    @Override
    protected String getUrl() {
        return BASE_URL.getValue() + "/?navt=bxp";
    }

    @Step("Verify Zip Modal Window opened")
    public EntryPage verifyZipModalWindowOpened() {
        $(ZIP_MODAL_WINDOW).shouldBe(visible);
        return this;
    }

    @Step("Fill input zip code {textValue}")
    public EntryPage inputZipCode(String textValue) {
        $(ZIP_FIELD).setValue(textValue);
        return this;
    }

    @Step("Click \"GO\" button")
    public HomePage clickGoButton() {
        $(GO_BTN).click();
        return new HomePage();
    }
}
