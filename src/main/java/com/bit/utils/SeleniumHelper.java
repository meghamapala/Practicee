package com.bit.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;

public class SeleniumHelper {

	public static Properties readPropertyFile(String path) throws IOException {
		FileInputStream f=new FileInputStream(new File(path));
		Properties prop=new Properties();
		prop.load(f);
		return prop;
	}
	
	public static void click(WebElement element) {
		element.click();
	}

}
