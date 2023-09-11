package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\syallapp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");

		WebElement input = driver.findElement(By.linkText("Checkboxes"));
		input.click();

		WebElement checkbox = driver.findElement(By.xpath("//input[1]"));
		checkbox.click();
		System.out.println("Check Box");

	}
}
