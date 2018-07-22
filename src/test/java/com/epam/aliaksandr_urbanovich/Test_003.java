package com.epam.aliaksandr_urbanovich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_003 {
    private static WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test_003() {
        driver.get("https://www.tut.by/");

        WebElement button = driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/input[2]"));
        Assert.assertEquals(button.getText(), "");
    }

    @AfterClass
    public void down() {
        driver.quit();
    }
}
