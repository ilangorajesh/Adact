package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("ilango");
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("12345");

	WebElement login = driver.findElement(By.id("login"));
	login.click();

	

}
}