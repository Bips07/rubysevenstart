package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rubysevenstart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//Bipin//Downloads//Testing//chromedriver_win32//chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.navigate().to("https:google.com");
		d.close();
	}

}
