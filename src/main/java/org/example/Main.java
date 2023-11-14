package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://youtube.com");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // get element by xpath then click it
//        driver.findElement(By.xpath("//*[@id=\"search\"]")).click();
        // send  text to element
        driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("selenium");
        // click search button
        driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]")).click();
        // wait 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // close browser
        driver.quit();
    }
}