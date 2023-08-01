import static org.junit.Assert.*;

import javax.swing.JLabel;
import javax.swing.JTextField;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Temperatures.Celsius;
import Temperatures.Fahrenheit;
import Temperatures.Kelvin;
import Temperatures.Rankine;

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
		assertEquals(true, Fahrenheit.convertFahrenheitToFahrenheit("4.5", "4.5"));
	}
	
	@Test
	public void testFailureConvertFahrenheitToFahrenheit() {
		assertEquals(false, Fahrenheit.convertFahrenheitToFahrenheit("4.5", "4"));
	}
	
	@Test
	public void testSuccessConvertFahrenheitToCelsius() {
		assertEquals(true, Fahrenheit.convertFahrenheitToCelsius("32", "0"));
	}
	
	@Test
	public void testFailureConvertFahrenheitToCelsius() {
		assertEquals(false, Fahrenheit.convertFahrenheitToCelsius("32", "1"));
	}
	
	@Test
	public void testSuccessConvertFahrenheitToKelvin() {
		assertEquals(true, Fahrenheit.convertFahrenheitToKelvin("32", "273.1"));
	}
	
	@Test
	public void testFailureConvertFahrenheitToKelvin() {
		assertEquals(false, Fahrenheit.convertFahrenheitToKelvin("32", "273.2"));
	}
	
	@Test
	public void testSuccessConvertFahrenheitToRankine() {
		assertEquals(true, Fahrenheit.convertFahrenheitToRankine("32", "491.6"));
	}
	
	@Test
	public void testFailureConvertFahrenheitToRankine() {
		assertEquals(false, Fahrenheit.convertFahrenheitToRankine("32", "491.7"));
	}
	
	//Test celsius
	@Test
	public void testSuccessConvertCelsiusToCelsius() {
		assertEquals(true, Celsius.convertCelsiusToCelsius("4.5", "4.5"));
	}
	
	@Test
	public void testFailureConvertCelsiusToCelsius() {
		assertEquals(false, Celsius.convertCelsiusToCelsius("4.5", "4"));
	}
	
	@Test
	public void testSuccessConvertCelsiusToFahrenheit() {
		assertEquals(true, Celsius.convertCelsiusToFahrenheit("0", "32"));
	}
	
	@Test
	public void testFailureConvertCelsiusToFahrenheit() {
		assertEquals(false, Celsius.convertCelsiusToFahrenheit("0", "31"));
	}
	
	@Test
	public void testSuccessConvertCelsiusToKelvin() {
		assertEquals(true, Celsius.convertCelsiusToKelvin("0", "273.1"));
	}
	
	@Test
	public void testFailureConvertCelsiusToKelvin() {
		assertEquals(false, Celsius.convertCelsiusToKelvin("0", "273.2"));
	}
	
	@Test
	public void testSuccessConvertCelsiusToRankine() {
		assertEquals(true, Celsius.convertCelsiusToRankine("0", "491.6"));
	}
	
	@Test
	public void testFailureConvertCelsiusToRankine() {
		assertEquals(false, Celsius.convertCelsiusToRankine("0", "491.5"));
	}
	
	//Test Kelvin
	@Test
	public void testSuccessConvertKelvinToKelvin() {
		assertEquals(true, Kelvin.convertKelvinToKelvin("4.5", "4.5"));
	}
	
	@Test
	public void testFailureConvertKelvinToKelvin() {
		assertEquals(false, Kelvin.convertKelvinToKelvin("4.5", "4"));
	}
	
	@Test
	public void testSuccessConvertKelvinToFahrenheit() {
		assertEquals(true, Kelvin.convertKelvinToFahrenheit("0", "-459.6"));
	}
	
	@Test
	public void testFailureConvertKelvinToFahrenheit() {
		assertEquals(false, Kelvin.convertKelvinToFahrenheit("0", "-459.5"));
	}
	
	@Test
	public void testSuccessConvertKelvinToCelsius() {
		assertEquals(true, Kelvin.convertKelvinToCelsius("0", "-273.1"));
	}
	
	@Test
	public void testFailureConvertKelvinToCelsius() {
		assertEquals(false, Kelvin.convertKelvinToCelsius("0", "-273.2"));
	}
	
	@Test
	public void testSuccessConvertKelvinToRankine() {
		assertEquals(true, Kelvin.convertKelvinToRankine("1", "1.8"));
	}
	
	@Test
	public void testFailureConvertKelvinToRankine() {
		assertEquals(false, Kelvin.convertKelvinToRankine("1", "1.9"));
	}
	
	//Test Rankine
	@Test
	public void testSuccessConvertRankineToRankine() {
		assertEquals(true, Rankine.convertRankineToRankine("4.5", "4.5"));
	}
	
	@Test
	public void testFailureConvertRankineToRankine() {
		assertEquals(false, Rankine.convertRankineToRankine("4.5", "4"));
	}
	
	@Test
	public void testSuccessConvertRankineToFahrenheit() {
		assertEquals(true, Rankine.convertRankineToFahrenheit("0", "-459.6"));
	}
	
	@Test
	public void testFailureConvertRankineToFahrenheit() {
		assertEquals(false, Rankine.convertRankineToFahrenheit("0", "-459.7"));
	}
	
	@Test
	public void testSuccessConvertRankineToCelsius() {
		assertEquals(true, Rankine.convertRankineToCelsius("0", "-273.1"));
	}
	
	@Test
	public void testFailureConvertRankineToCelsius() {
		assertEquals(false, Rankine.convertRankineToCelsius("0", "-273.2"));
	}
	
	@Test
	public void testSuccessConvertRankineToKelvin() {
		assertEquals(true, Rankine.convertRankineToKelvin("1", "0.5"));
	}
	
	@Test
	public void testFailureConvertRankineToKelvin() {
		assertEquals(false, Rankine.convertRankineToKelvin("1", "0.6"));
	}
	
	
	
	//Volume Testing

}
