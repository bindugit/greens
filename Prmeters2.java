package org.cts.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Prmeters2 {
	
	@Test
	private void tc3() {
		System.out.println(3);
	}
	
	@Parameters({"us","ps"})
	@Test
	private void tc5(String s1,String s2) {
		System.out.println(s1);
		System.out.println(s2);
	}

}
