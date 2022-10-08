package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FacebookTestingApp {

    public static final String XPATH_COOKIES = "//div[contains(@class, \"_9xo5\")]/button[2]";
    public static final String XPATH_NEW_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a[1]";
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH ="//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[]args){
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement button1 = driver.findElement(By.xpath(XPATH_COOKIES));
        button1.click();

        WebElement button2 = driver.findElement(By.xpath(XPATH_NEW_ACCOUNT));
        button2.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement day = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_SELECT_DAY)));
        Select selectDay = new Select(day);
        selectDay.selectByValue("16");

        WebElement month = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(month);
        selectMonth.selectByValue("5");

        WebElement year = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(year);
        selectYear.selectByValue("1992");
    }
}
