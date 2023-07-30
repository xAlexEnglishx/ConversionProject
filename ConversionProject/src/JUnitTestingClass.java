import static org.junit.Assert.*;

import javax.swing.JLabel;
import javax.swing.JTextField;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitTestingClass {
	@Test
	public void test_JUnit() {
		System.out.println("testtttinggguh");
		String s = "lets test";
		assertEquals("lets test", s);
	}
	
	@Test
	public void testCtoF() {
		final JTextField textCelsius;
//		public static final JTextField textFahrenheit;
		TempConverter tc = new TempConverter();
		assertEquals("39.2", tc.convertCtoF(4));
	}

}
