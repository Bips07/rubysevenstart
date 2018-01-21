package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepage {
	
void homepag(WebDriver a) throws InterruptedException
{
	a.navigate().to("https:flipkart.com");
 	//a.manage().timeouts().wait(100);
	//a.manage().window().maximize();
}
void login(WebDriver a)
{
	a.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9645902329");
	
}
}
