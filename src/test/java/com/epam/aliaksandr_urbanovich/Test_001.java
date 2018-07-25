package com.epam.aliaksandr_urbanovich;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_001 {

    private static WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test_001() {
        driver.get("https://www.tut.by/");

        String expecnedTitle = "Белорусский портал TUT.BY. Новости Беларуси и мира";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expecnedTitle);
    }

    @AfterClass
    public void down() {
        driver.quit();
    }
}