import static org.junit.Assert.*;

import javax.swing.JLabel;
import javax.swing.JTextField;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitTestingClass {
//	@Test
//	public void test_JUnit() {
//		System.out.println("testtttinggguh");
//		String s = "lets test";
//		assertEquals("lets test", s);
//	}
//	
//	@Test
//	public void testCtoF() {
////		final JTextField textCelsius;
////		public static final JTextField textFahrenheit;
//		TempConverter tc = new TempConverter();
//		assertEquals("39.2", tc.convertCtoF(4));
//	}
//	
//	@Test
//	public void testFtoC() {
////		final JTextField textCelsius;
////		public static final JTextField textFahrenheit;
//		TempConverter tc = new TempConverter();
//		assertEquals("-15.6", tc.convertFtoC(4));
//	}
	
	//Test fahrenheit
	@Test
	public void testSuccessConvertFahrenheitToFahrenheit() {
		assertEquals(true, TempConverter.convertFahrenheitToFahrenheit("4.5", "4.5"));
	}
	
	@Test
	public void testFailureConvertFahrenheitToFahrenheit() {
		assertEquals(false, TempConverter.convertFahrenheitToFahrenheit("4.5", "4"));
	}
	
	@Test
	public void testSuccessConvertFahrenheitToCelsius() {
		assertEquals(true, TempConverter.convertFahrenheitToCelsius("32", "0"));
	}
	
	@Test
	public void testFailureConvertFahrenheitToCelsius() {
		assertEquals(false, TempConverter.convertFahrenheitToCelsius("32", "1"));
	}
	
	@Test
	public void testSuccessConvertFahrenheitToKelvin() {
		assertEquals(true, TempConverter.convertFahrenheitToKelvin("32", "273.1"));
	}
	
	@Test
	public void testFailureConvertFahrenheitToKelvin() {
		assertEquals(false, TempConverter.convertFahrenheitToKelvin("32", "273.2"));
	}
	
	@Test
	public void testSuccessConvertFahrenheitToRankine() {
		assertEquals(true, TempConverter.convertFahrenheitToRankine("32", "491.6"));
	}
	
	@Test
	public void testFailureConvertFahrenheitToRankine() {
		assertEquals(false, TempConverter.convertFahrenheitToRankine("32", "491.7"));
	}
	
	//Test celsius
	@Test
	public void testSuccessConvertCelsiusToCelsius() {
		assertEquals(true, TempConverter.convertCelsiusToCelsius("4.5", "4.5"));
	}
	
	@Test
	public void testFailureConvertCelsiusToCelsius() {
		assertEquals(false, TempConverter.convertCelsiusToCelsius("4.5", "4"));
	}
	
	@Test
	public void testSuccessConvertCelsiusToFahrenheit() {
		assertEquals(true, TempConverter.convertCelsiusToFahrenheit("0", "32"));
	}
	
	@Test
	public void testFailureConvertCelsiusToFahrenheit() {
		assertEquals(false, TempConverter.convertCelsiusToFahrenheit("0", "31"));
	}
	
	@Test
	public void testSuccessConvertCelsiusToKelvin() {
		assertEquals(true, TempConverter.convertCelsiusToKelvin("0", "273.1"));
	}
	
	@Test
	public void testFailureConvertCelsiusToKelvin() {
		assertEquals(false, TempConverter.convertCelsiusToKelvin("0", "273.2"));
	}
	
	@Test
	public void testSuccessConvertCelsiusToRankine() {
		assertEquals(true, TempConverter.convertCelsiusToRankine("0", "491.6"));
	}
	
	@Test
	public void testFailureConvertCelsiusToRankine() {
		assertEquals(false, TempConverter.convertCelsiusToRankine("0", "491.5"));
	}
	
	//Test Kelvin
	@Test
	public void testSuccessConvertKelvinToKelvin() {
		assertEquals(true, TempConverter.convertKelvinToKelvin("4.5", "4.5"));
	}
	
	@Test
	public void testFailureConvertKelvinToKelvin() {
		assertEquals(false, TempConverter.convertKelvinToKelvin("4.5", "4"));
	}
	
	@Test
	public void testSuccessConvertKelvinToFahrenheit() {
		assertEquals(true, TempConverter.convertKelvinToFahrenheit("0", "-459.6"));
	}
	
	@Test
	public void testFailureConvertKelvinToFahrenheit() {
		assertEquals(false, TempConverter.convertKelvinToFahrenheit("0", "-459.5"));
	}
	
	@Test
	public void testSuccessConvertKelvinToCelsius() {
		assertEquals(true, TempConverter.convertKelvinToCelsius("0", "-273.1"));
	}
	
	@Test
	public void testFailureConvertKelvinToCelsius() {
		assertEquals(false, TempConverter.convertKelvinToCelsius("0", "-273.2"));
	}
	
	@Test
	public void testSuccessConvertKelvinToRankine() {
		assertEquals(true, TempConverter.convertKelvinToRankine("1", "1.8"));
	}
	
	@Test
	public void testFailureConvertKelvinToRankine() {
		assertEquals(false, TempConverter.convertKelvinToRankine("1", "1.9"));
	}
	
	//Test Rankine
	@Test
	public void testSuccessConvertRankineToRankine() {
		assertEquals(true, TempConverter.convertRankineToRankine("4.5", "4.5"));
	}
	
	@Test
	public void testFailureConvertRankineToRankine() {
		assertEquals(false, TempConverter.convertRankineToRankine("4.5", "4"));
	}
	
	@Test
	public void testSuccessConvertRankineToFahrenheit() {
		assertEquals(true, TempConverter.convertRankineToFahrenheit("0", "-459.6"));
	}
	
	@Test
	public void testFailureConvertRankineToFahrenheit() {
		assertEquals(false, TempConverter.convertRankineToFahrenheit("0", "-459.7"));
	}
	
	@Test
	public void testSuccessConvertRankineToCelsius() {
		assertEquals(true, TempConverter.convertRankineToCelsius("0", "-273.1"));
	}
	
	@Test
	public void testFailureConvertRankineToCelsius() {
		assertEquals(false, TempConverter.convertRankineToCelsius("0", "-273.2"));
	}
	
	@Test
	public void testSuccessConvertRankineToKelvin() {
		assertEquals(true, TempConverter.convertRankineToKelvin("1", "0.5"));
	}
	
	@Test
	public void testFailureConvertRankineToKelvin() {
		assertEquals(false, TempConverter.convertRankineToKelvin("1", "0.6"));
	}
	
	
	
	//Volume Testing

}
