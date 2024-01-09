package com.qascript;

//import org.junit.Assert;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchAction {

    @Test
    public void OpenBrowser() {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yashwanth.s\\Downloads\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("headless");
        //options.addArguments("disable-gpu"); 
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        Assert.assertTrue("Page title is not correct", driver.getTitle().equals("Google"));
        
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium Java");
        searchInput.submit(); // Assuming the 'submit' action is for the search input form.

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul"))); // Waiting for search results.

        driver.quit(); // Close the browser after the test.
    }
}
