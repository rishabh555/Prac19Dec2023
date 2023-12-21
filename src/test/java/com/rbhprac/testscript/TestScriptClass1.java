package com.rbhprac.testscript;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestScriptClass1   {
	
	
	@Test
	public  void doSomethingClass1() throws IOException, InterruptedException {
		
		
        		System.out.println("Jenkisn run test");
		
        		Assert.assertEquals(true, true);
		
        		
		 
	}
}