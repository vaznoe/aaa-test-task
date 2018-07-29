package com.vaznoe.calif.aaa.tests;

import com.vaznoe.calif.aaa.apps.wrappers.BaseTest;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.vaznoe.calif.aaa.tests.testUtils.TestDataUtils.*;
import static org.testng.AssertJUnit.assertEquals;

/**
 * @author vaznoe
 * Date: 7/28/18
 */
@Feature("Membership")
public class NewMembershipTests extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void before() {
        entryPage().openPage()
                .verifyZipModalWindowOpened()
                .inputZipCode(zipCode)
                .clickGoButton();
    }

    @Test(groups = "regression")
    public void newMembershipForMaleTest() {
        String errorMessage = newMembershipSetUp("Male");
        assertEquals(errorMessage, "Payment Method is required.");
    }

    @Test(groups = "regression")
    public void newMembershipForFemaleTest() {
        String errorMessage = newMembershipSetUp("Female");
        assertEquals(errorMessage, "Payment Method is required.");
    }

    private String newMembershipSetUp(String gender) {
        return homePage().verifyHomePageOpened()
                .clickJoinAAAButton()

                .verifyStartNewMembershipPageOpened()
                .clickGetStartedButton()

                .verifyMemberInfoPageOpened()
                .fillInputFirstName(firstName)
                .fillInputLastName(lastName)
                .selectGender(gender)
                .clickSaveButton()

                .verifyContactDetailsPageOpened()
                .fillInputAddress(address)
                .fillInputCity(city)
                .fillInputState(state)
                .fillInputZipCode(zipCode)
                .fillInputEmail(email)
                .chooseCommunicationPreferences("No")
                .fillInputPhoneNumber(phoneNumber)
                .selectIsThisCellPhone("No")
                .clickNextButton()

                .verifyAdditionalMembersPageOpened()
                .clickNoThanksButton()

                .verifyMembersOptionsPageOpened()
                .clickNoThanksButton()

                .verifyFinalTotalAndSubmitFormPageOpened()
                .clickProceedToCheckoutButton()

                .verifyPaymentPageOpened()
                .clickSubmitPaymentButton()

                .verifyErrorMessageIsDisplayed();
    }
}
