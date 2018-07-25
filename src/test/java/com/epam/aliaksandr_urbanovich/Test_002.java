package com.epam.aliaksandr_urbanovich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_002 {

    private static WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test_002() {
        driver.get("https://www.tut.by/");

        WebElement resource = driver.findElement(By.xpath("//*[@id=\"search_from_str\"]"));
        System.out.println("menu " + resource.getText());
        Assert.assertEquals(resource.getText(), "");
    }

    @AfterClass
    public void down() {
        driver.quit();
    }
}
