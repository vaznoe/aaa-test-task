package com.vaznoe.calif.aaa.apps.listeners;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author vaznoe
 * Date: 7/28/2018
 */
public class EventListener implements WebDriverEventListener {

    private static final Logger LOGGER = Logger.getLogger(EventListener.class);

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        LOGGER.info("clicked element with " + getLocatorFromElement(element));
    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        LOGGER.info("change value of element with " + getLocatorFromElement(webElement));
    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        LOGGER.info("changed value of element with " + getLocatorFromElement(webElement));
    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver arg2) {
        LOGGER.info("find element " + by);
    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateBack(WebDriver driver) {
        LOGGER.info("before back");
    }

    @Override
    public void afterNavigateBack(WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateForward(WebDriver driver) {
        LOGGER.info("before forward");
    }

    @Override
    public void afterNavigateForward(WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {

    }

    @Override
    public void beforeAlertAccept(WebDriver webDriver) {
        LOGGER.info("before alert accept");
    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {
        LOGGER.info("after alert accept");
    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {
        LOGGER.info("after alert dismiss");
    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {
        LOGGER.info("before alert dismiss");
    }

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {
        LOGGER.info("navigate to " + url);
    }

    @Override
    public void afterNavigateTo(String s, WebDriver webDriver) {

    }

    @Override
    public void beforeScript(String script, WebDriver driver) {
        //LOGGER.info("running script " + script);
    }

    @Override
    public void afterScript(String s, WebDriver webDriver) {

    }

    @Override
    public void beforeSwitchToWindow(String s, WebDriver webDriver) {

    }

    @Override
    public void afterSwitchToWindow(String s, WebDriver webDriver) {

    }

    @Override
    public void onException(Throwable thrw, WebDriver driver) {
        LOGGER.info(thrw.getMessage());
    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {

    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {

    }

    private String getLocatorFromElement(WebElement element) {
        String str = element.toString();
        Pattern p = Pattern.compile("->\\s(.*)(?=\\])");
        Matcher m = p.matcher(str);
        return m.find() && m.groupCount() > 0 ? m.group(1) : str;
    }
}

