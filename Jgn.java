package org.cts.test;

import org.testng.annotations.Test;

public class Jgn {
	@Test
	private void tc4() {
		System.out.println(4);
	}
	
	@Test(groups="sanity")
	private void tc5() {
		System.out.println(5);
		}
	
	@Test(groups="Regression")
	private void tc6() {
		System.out.println(6);
	}

}
