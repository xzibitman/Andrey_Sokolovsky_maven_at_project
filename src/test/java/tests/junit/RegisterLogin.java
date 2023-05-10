package tests.junit;

import PageObjects.BookingLogIn;
import PageObjects.BookingPersonal;
import PageObjects.BookingRegister;
import PageObjects.MailPage;
import org.junit.Assert;
import org.junit.Test;
import settings.ConfigProperty;


public class RegisterLogin {
    private final BookingLogIn bookingLogIn = new BookingLogIn();
    private final BookingRegister bookingRegister = new BookingRegister();
    private final MailPage mailPage = new MailPage();
    private final BookingPersonal bookingPersonal = new BookingPersonal();

    public RegisterLogin() {
    }

    @Test
    public void bookingTestRegister() throws InterruptedException {
        mailPage.openPage();
        mailPage.loginMail(ConfigProperty.property.getProperty("emailName"));
        bookingRegister.openBookingPage();
        bookingRegister.enterEmailInSignIn();
        bookingRegister.submitEnterEmail();
        bookingRegister.enterNewPassword();
        bookingRegister.confirmNewPassword();
        bookingRegister.submitEnterPassword();
        mailPage.openPage();
        mailPage.loginMail(ConfigProperty.property.getProperty("emailName"));
        Thread.sleep(5000);
        mailPage.refreshMail();
        mailPage.openConfirmLetter();
        Thread.sleep(4000);
        mailPage.clickConfirmButton();
        bookingPersonal.closeActiveTab();
        bookingLogIn.openSignInPage();
        bookingRegister.enterEmailInSignIn();
        bookingRegister.submitEnterEmail();
        bookingLogIn.enterVerifiedPassword();
        bookingRegister.submitEnterPassword();
        mailPage.openPage();
        mailPage.loginMail(ConfigProperty.property.getProperty("emailName"));
        Thread.sleep(60000);
        mailPage.refreshMail();
        mailPage.openVerifyLetter();
        mailPage.clickVerifyButton();
        bookingPersonal.openPersonalPage();
        Assert.assertTrue("Иконка верифайд отсутствует",bookingPersonal.checkVerifyIcon());

    }

}
