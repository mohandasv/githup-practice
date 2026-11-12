package com.adhira.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.adhira.base.BaseTest;
import com.adhira.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test(
        priority = 1,
        groups = {"smoke"}
    )
    public void validLoginTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
            "standard_user",
            "secret_sauce"
        );

        String actualTitle = driver.getTitle();

        String expectedTitle = "Swag Labs";

        Assert.assertEquals(
            actualTitle,
            expectedTitle
        );

        System.out.println("Login Test Passed");
    }
}