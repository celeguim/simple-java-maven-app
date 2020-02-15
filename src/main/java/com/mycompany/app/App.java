package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 */
public class App {

	private final String message = "Hello World!";

	public App() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		System.setProperty("webdriver.chrome.driver", "/Users/celeguim/Downloads/chromedriver");
		WebDriver webdriver = new ChromeDriver(chromeOptions);
		webdriver.get("http://localhost:8080/");
		webdriver.manage().logs();
		webdriver.getPageSource();
		webdriver.getTitle();
		webdriver.findElement(By.id("j_username"));
	}

	public static void main(String[] args) {
		System.out.println(new App().getMessage());
	}

	private final String getMessage() {
		return message;
	}

}
