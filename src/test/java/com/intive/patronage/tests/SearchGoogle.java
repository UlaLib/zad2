package com.intive.patronage.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class SearchGoogle {

    public SearchGoogle() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/chromedriver.exe");
        System.out.println("We are inside constructor SearchGoogle class");
    }
@Test
    public void myFirstAction(){
        System.out.println("We are inside myFirstAction method");

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://google.com");

    driver.findElement(By.id("lst-ib")).sendKeys("intive");
    driver.findElement(By.id("hplogo")).click();
    driver.findElement(By.name("btnK")).click();

    WebElement element = driver.findElement(By.className("_Rm"));
    String j = element.getText();
    System.out.println(j);
    Assert.assertEquals("https://www.intive.com/en",j);

    driver.quit();
    }

}
