package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class rubysevenstart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions co =new ChromeOptions();
		co.addArguments("--start maximized");
		System.setProperty("webdriver.chrome.driver", "C://Users//Bipin//Downloads//Testing//chromedriver_win32//chromedriver.exe");
		WebDriver d=new ChromeDriver(co);
		d.navigate().to("https:google.com");
		//d.manage().window().maximize();
		homepage a=new homepage();
		a.homepag(d);
		a.login(d);
	}

}
