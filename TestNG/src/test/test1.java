package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {

	@Test(groups = { "Smoke" })
	public void Demo() {

		System.out.println("Hello");
	}

	@BeforeTest
	public void Demo1() {
		System.out.println(0/1);
	}

	@AfterTest
	public void Demo2() {
		System.out.println("Execute after test");
	}

	@Test(groups = { "Smoke" })
	public void Demo3() {
		System.out.println("Hi");
	}

	@BeforeMethod
	public void befmeth() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void aftmeth() {
		System.out.println("After Method");
	}

}
