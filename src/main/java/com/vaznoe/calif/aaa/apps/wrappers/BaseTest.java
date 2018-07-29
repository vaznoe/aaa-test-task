package com.vaznoe.calif.aaa.apps.wrappers;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.vaznoe.calif.aaa.apps.Config;
import com.vaznoe.calif.aaa.apps.internal.GenericPage;
import com.vaznoe.calif.aaa.apps.internal.TestCase;
import com.vaznoe.calif.aaa.apps.listeners.EventListener;
import com.vaznoe.calif.aaa.apps.listeners.TestListener;
import com.vaznoe.calif.aaa.apps.utils.report.AllurePropertiesUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.WebDriverRunner.addListener;

/**
 * @author vaznoe
 * Date: 7/28/2018
 */
@Listeners({
        TestListener.class
})
public abstract class BaseTest implements TestCase, Config {

    public static String userAgent;
    private String testName;

    @BeforeSuite(alwaysRun = true)
    public void setUp() {
        addListener(new EventListener());
    }

    @BeforeMethod(alwaysRun = true)
    public void configureBrowserBeforeTest(Method testMethod) {
        this.testName = testMethod.getName();
        getDriver().manage().window().maximize();
    }

    /**
     * Returns the webdriver object for that given thread
     *
     * @return - WebDriver object
     */
    public static WebDriver getDriver() {
        return WebDriverRunner.getWebDriver();
    }

    /**
     * Thread-safe container in which are stored values as page instances
     */
    private static final ThreadLocal<Map<GenericPage, BasePage>> PAGES = ThreadLocal.withInitial(() -> new HashMap<>());

    public static Map<GenericPage, BasePage> getPages() {
        return PAGES.get();
    }

    @AfterSuite(alwaysRun = true)
    public static void createAllureProperties() {
        AllurePropertiesUtil.create();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        cleanUpPages();
        Selenide.close();
    }

    /**
     * Cleaning collection Pages
     */
    private void cleanUpPages() {
        PAGES.remove();
    }
}