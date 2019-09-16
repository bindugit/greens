package org.cts.test;

import org.testng.annotations.Test;

public class Bin {
	
	@Test(groups="Regression")
	private void tc1() {
		System.out.println(1);
	}
	
	@Test(groups="sanity")
	private void tc2() {
		System.out.println(2);
	}
	
	@Test
	private void tc3() {
		System.out.println(3);
	}
	

}
