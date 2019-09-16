package org.cts.test;


import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Prmeters {
	@Parameters({"user","pass"})
	@Test
   private void tc1(@Optional("jgn") String s1,String s2) {
		System.out.println(s1);
		System.out.println(s2);
	}
	@Test(priority=-12)
	private void tc2() {
		System.out.println(2);
	}

}
