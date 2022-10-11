package com.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotClass 
{
	
	
	public static void screenshot(WebDriver driver) throws IOException
	{
		Date d=new Date();
		DateFormat d1=new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date=d1.format(d);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		File myfile=new File("./ScreenShotFolder\\"+date+".jpg");
		
		FileHandler.copy(source, myfile);
		
	}
	
	
	
}
