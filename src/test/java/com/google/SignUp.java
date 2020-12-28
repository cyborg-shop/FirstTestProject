package com.google;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SignUp {

    @Test
    public void signUp() throws AWTException {

        System.setProperty("webdriver.chrome.driver", "/Users/vatuz/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.id("gb_70")).click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#identifierNext > div > button > div.VfPpkd-RLmnJb")));

        driver.findElement(By.id("identifierId")).sendKeys("limpvik77");

        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));

        driver.findElement(By.name("password")).sendKeys("odessa19ua");

        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        driver.quit();
    }
}
