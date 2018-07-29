package com.vaznoe.calif.aaa.apps.internal;

import com.vaznoe.calif.aaa.pages.*;

import static com.vaznoe.calif.aaa.apps.internal.PageObjectsSupplier.PageObject.*;

/**
 * @author vaznoe
 * Date: 7/28/2018
 */
public interface PageObjectsSupplier<T extends PageObjectsSupplier<T>> {

    default EntryPage entryPage() {
        return (EntryPage) GenericPage.getPageObject(ENTRY_PAGE);
    }

    default HomePage homePage() {
        return (HomePage) GenericPage.getPageObject(HOME_PAGE);
    }

    default CreateNewMembershipPage createNewMembershipPage() {
        return (CreateNewMembershipPage) GenericPage.getPageObject(NEW_MEMBER_INFO_FORM_PAGE);
    }

    default NewMemberInfoPage newMemberInfoPage() {
        return (NewMemberInfoPage) GenericPage.getPageObject(NEW_MEMBER_INFO_FORM_PAGE);
    }

    default ContactDetailsFormPage contactInformationFormPage() {
        return (ContactDetailsFormPage) GenericPage.getPageObject(CONTACT_DETAILS_FORM_PAGE);
    }

    default AdditionalMembersPage additionalMembersPage() {
        return (AdditionalMembersPage) GenericPage.getPageObject(ADDITIONAL_MEMBERS_PAGE);
    }

    default MembershipOptionPage membershipOptionPage() {
        return (MembershipOptionPage) GenericPage.getPageObject(MEMBERSHIP_OPTION_PAGE);
    }

    default FinalTotalAndSubmitFormPage finalTotalAndSubmitFormPage() {
        return (FinalTotalAndSubmitFormPage) GenericPage.getPageObject(FINAL_TOTAL_SUBMIT_FORM_PAGE);
    }

    default PaymentPage paymentPage() {
        return (PaymentPage) GenericPage.getPageObject(PAYMENT_PAGE);
    }

    enum PageObject implements GenericPage {

        ENTRY_PAGE {
            public EntryPage create() {
                return new EntryPage();
            }
        },

        HOME_PAGE {
            public HomePage create() {
                return new HomePage();
            }
        },
        
        CRATE_NEW_MEMBERSHIP_PAGE {
            public CreateNewMembershipPage create() {
                return new CreateNewMembershipPage();
            }
        },

        NEW_MEMBER_INFO_FORM_PAGE {
            public NewMemberInfoPage create() {
                return new NewMemberInfoPage();
            }
        },

        CONTACT_DETAILS_FORM_PAGE {
            public ContactDetailsFormPage create() {
                return new ContactDetailsFormPage();
            }
        },

        ADDITIONAL_MEMBERS_PAGE {
            public AdditionalMembersPage create() {
                return new AdditionalMembersPage();
            }
         },

        MEMBERSHIP_OPTION_PAGE {
            public MembershipOptionPage create() {
                return new MembershipOptionPage();
            }
        },

        FINAL_TOTAL_SUBMIT_FORM_PAGE {
            public FinalTotalAndSubmitFormPage create() {
                return new FinalTotalAndSubmitFormPage();
            }
         },

        PAYMENT_PAGE {
            public PaymentPage create() {
                return new PaymentPage();
            }
        }
    }
}