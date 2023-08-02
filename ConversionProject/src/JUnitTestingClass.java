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
import Volumes.CubicFeet;
import Volumes.CubicInches;
import Volumes.Cups;
import Volumes.Liters;
import Volumes.Tablespoons;

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
	//Liters
	@Test
	public void testSuccessConvertLitersToLiters() {
		assertEquals(true, Liters.convertLitersToLiters("1", "1"));
	}
	
	@Test
	public void testFailureConvertLiterstoLiters() {
		assertEquals(false, Liters.convertLitersToLiters("1", "0.6"));
	}
	
	@Test
	public void testSuccessConvertLitersToTablespoons() {
		assertEquals(true, Liters.convertLitersToTablespoons("1", "67.6"));
	}
	
	@Test
	public void testFailureConvertLitersToTablespoons() {
		assertEquals(false, Liters.convertLitersToTablespoons("1", "67.7"));
	}
	
	@Test
	public void testSuccessConvertLitersToCubicInches() {
		assertEquals(true, Liters.convertLitersToCubicInches("1", "61"));
	}
	
	@Test
	public void testFailureConvertLitersToCubicInches() {
		assertEquals(false, Liters.convertLitersToCubicInches("1", "61.1"));
	}
	
	@Test
	public void testSuccessConvertLitersToCups() {
		assertEquals(true, Liters.convertLitersToCups("1", "4.2"));
	}
	
	@Test
	public void testFailureConvertLitersToCups() {
		assertEquals(false, Liters.convertLitersToCups("1", "4.3"));
	}
	
	@Test
	public void testSuccessConvertLitersToCubicFeet() {
		assertEquals(true, Liters.convertLitersToCubicFeet("1", "0"));
		assertEquals(true, Liters.convertLitersToCubicFeet("3", "0.1"));
	}
	
	@Test
	public void testFailureConvertLitersToCubicFeet() {
		assertEquals(false, Liters.convertLitersToCubicFeet("1", "0.1"));
	}
	
	@Test
	public void testSuccessConvertLitersToGallons() {
		assertEquals(true, Liters.convertLitersToGallons("1", "0.2"));
	}
	
	@Test
	public void testFailureConvertLitersToGallons() {
		assertEquals(false, Liters.convertLitersToGallons("1", "0.3"));
	}
	
	//Tablespoons
	@Test
	public void testSuccessConvertTablespoonsToTablespoons() {
		assertEquals(true, Tablespoons.convertTablespoonsToTablespoons("1", "1"));
	}
	
	@Test
	public void testFailureConvertTablespoonsToTablespoons() {
		assertEquals(false, Tablespoons.convertTablespoonsToTablespoons("1", "0.6"));
	}
	
	@Test
	public void testSuccessConvertTablespoonsToLiters() {
		assertEquals(true, Tablespoons.convertTablespoonsToLiters("1", "0"));
		assertEquals(true, Tablespoons.convertTablespoonsToLiters("10", "0.1"));
	}
	
	@Test
	public void testFailureConvertTablespoonsToLiters() {
		assertEquals(false, Tablespoons.convertTablespoonsToLiters("1", "0.1"));
	}
	
	@Test
	public void testSuccessConvertTablespoonsToCubicInches() {
		assertEquals(true, Tablespoons.convertTablespoonsToCubicInches("1", "0.9"));
	}
	
	@Test
	public void testFailureConvertTablespoonsToCubicInches() {
		assertEquals(false, Tablespoons.convertTablespoonsToCubicInches("1", "0.1"));
	}
	
	@Test
	public void testSuccessConvertTablespoonsToCups() {
		assertEquals(true, Tablespoons.convertTablespoonsToCups("1", "0"));
		assertEquals(true, Tablespoons.convertTablespoonsToCups("2", "0.1"));
	}
	
	@Test
	public void testFailureConvertTablespoonsToCups() {
		assertEquals(false, Tablespoons.convertTablespoonsToCups("1", "0.1"));
	}
	
	@Test
	public void testSuccessConvertTablespoonsToCubicFeet() {
		assertEquals(true, Tablespoons.convertTablespoonsToCubicFeet("1", "0"));
		assertEquals(true, Tablespoons.convertTablespoonsToCubicFeet("1000", "0.5"));
	}
	
	@Test
	public void testFailureConvertTablespoonsToCubicFeet() {
		assertEquals(false, Tablespoons.convertTablespoonsToCubicFeet("1", "0.1"));
	}
	
	@Test
	public void testSuccessConvertTablespoonsToGallons() {
		assertEquals(true, Tablespoons.convertTablespoonsToGallons("1", "0"));
		assertEquals(true, Tablespoons.convertTablespoonsToGallons("100", "0.3"));
	}
	
	@Test
	public void testFailureConvertTablespoonsToGallons() {
		assertEquals(false, Tablespoons.convertTablespoonsToGallons("1", "0.1"));
	}
	
	//Cubic Inches
	@Test
	public void testSuccessConvertCubicInchesToCubicInches() {
		assertEquals(true, CubicInches.convertCubicInchesToCubicInches("1", "1"));
	}
	
	@Test
	public void testFailureConvertCubicInchesToCubicInches() {
		assertEquals(false, CubicInches.convertCubicInchesToCubicInches("1", "0.6"));
	}
	
	@Test
	public void testSuccessConvertCubicInchesToLiters() {
		assertEquals(true, CubicInches.convertCubicInchesToLiters("1", "0"));
		assertEquals(true, CubicInches.convertCubicInchesToLiters("10", "0.1"));
	}
	
	@Test
	public void testFailureConvertCubicInchesToLiters() {
		assertEquals(false, CubicInches.convertCubicInchesToLiters("1", "0.6"));
	}
	
	@Test
	public void testSuccessConvertCubicInchesToTablespoons() {
		assertEquals(true, CubicInches.convertCubicInchesToTablespoons("1", "1.1"));
	}
	
	@Test
	public void testFailureConvertCubicInchesToTablespoons() {
		assertEquals(false, CubicInches.convertCubicInchesToTablespoons("1", "1"));
	}
	
	@Test
	public void testSuccessConvertCubicInchesToCups() {
		assertEquals(true, CubicInches.convertCubicInchesToCups("1", "0"));
		assertEquals(true, CubicInches.convertCubicInchesToCups("2", "0.1"));
	}
	
	@Test
	public void testFailureConvertCubicInchesToCups() {
		assertEquals(false, CubicInches.convertCubicInchesToCups("1", "0.6"));
	}
	
	@Test
	public void testSuccessConvertCubicInchesToCubicFeet() {
		assertEquals(true, CubicInches.convertCubicInchesToCubicFeet("1", "0"));
		assertEquals(true, CubicInches.convertCubicInchesToCubicFeet("1000", "0.5"));
	}
	
	@Test
	public void testFailureConvertCubicInchesToCubicFeet() {
		assertEquals(false, CubicInches.convertCubicInchesToCubicFeet("1", "0.6"));
	}
	
	@Test
	public void testSuccessConvertCubicInchesToGallons() {
		assertEquals(true, CubicInches.convertCubicInchesToGallons("1", "0"));
		assertEquals(true, CubicInches.convertCubicInchesToGallons("100", "0.4"));
	}
	
	@Test
	public void testFailureConvertCubicInchesToGallons() {
		assertEquals(false, CubicInches.convertCubicInchesToGallons("1", "0.6"));
	}
	
	//Cups
	@Test
	public void testSuccessConvertCupsToCups() {
		assertEquals(true, Cups.convertCupsToCups("1", "1"));
	}
	
	@Test
	public void testFailureConvertCupsToCup() {
		assertEquals(false, Cups.convertCupsToCups("1", "0.6"));
	}
	
	@Test
	public void testSuccessConvertCupsToLiters() {
		assertEquals(true, Cups.convertCupsToLiters("1", "0.2"));
	}
	
	@Test
	public void testFailureConvertCupsToLiters() {
		assertEquals(false, Cups.convertCupsToLiters("1", "0.6"));
	}
	
	@Test
	public void testSuccessConvertCupsToTablespoons() {
		assertEquals(true, Cups.convertCupsToTablespoons("1", "16"));
	}
	
	@Test
	public void testFailureConvertCupsToTablespoons() {
		assertEquals(false, Cups.convertCupsToTablespoons("1", "0.6"));
	}
	
	@Test
	public void testSuccessConvertCupsToCubicInches() {
		assertEquals(true, Cups.convertCupsToCubicInches("1", "14.4"));
	}
	
	@Test
	public void testFailureConvertCupsToCubicInches() {
		assertEquals(false, Cups.convertCupsToCubicInches("1", "0.6"));
	}
	
	@Test
	public void testSuccessConvertCupsToCubicFeet() {
		assertEquals(true, Cups.convertCupsToCubicFeet("1", "0"));
		assertEquals(true, Cups.convertCupsToCubicFeet("100", "0.8"));
	}
	
	@Test
	public void testFailureConvertCupsToCubicFeet() {
		assertEquals(false, Cups.convertCupsToCubicFeet("1", "0.6"));
	}
	
	@Test
	public void testSuccessConvertCupsToGallons() {
		assertEquals(true, Cups.convertCupsToGallons("1", "0"));
		assertEquals(true, Cups.convertCupsToGallons("10", "0.6"));
	}
	
	@Test
	public void testFailureConvertCupsToGallons() {
		assertEquals(false, Cups.convertCupsToGallons("1", "0.6"));
	}
	
	//Cubic Feet
	@Test
	public void testSuccessConvertCubicFeetToCubicFeet() {
		assertEquals(true, CubicFeet.convertCubicFeetToCubicFeet("1", "1"));
	}
	
	@Test
	public void testFailureConvertCubicFeetToCubicFeet() {
		assertEquals(false, CubicFeet.convertCubicFeetToCubicFeet("1", "0.6"));
	}
	
	@Test
	public void testSuccessConvertCubicFeetToLiters() {
		assertEquals(true, CubicFeet.convertCubicFeetToLiters("1", "28.3"));
	}
	
	@Test
	public void testFailureConvertCubicFeetToLiters() {
		assertEquals(false, CubicFeet.convertCubicFeetToLiters("1", "28.4"));
	}
	
	@Test
	public void testSuccessConvertCubicFeetToTablespoons() {
		assertEquals(true, CubicFeet.convertCubicFeetToTablespoons("1", "1915"));
	}
	
	@Test
	public void testFailureConvertCubicFeetToTablespoons() {
		assertEquals(false, CubicFeet.convertCubicFeetToTablespoons("1", "28.4"));
	}
	
	@Test
	public void testSuccessConvertCubicFeetToCubicInches() {
		assertEquals(true, CubicFeet.convertCubicFeetToCubicInches("1", "1728"));
	}
	
	@Test
	public void testFailureConvertCubicFeetToCubicInches() {
		assertEquals(false, CubicFeet.convertCubicFeetToCubicInches("1", "28.4"));
	}
	
	@Test
	public void testSuccessConvertCubicFeetToCups() {
		assertEquals(true, CubicFeet.convertCubicFeetToCups("1", "119.7"));
	}
	
	@Test
	public void testFailureConvertCubicFeetToCups() {
		assertEquals(false, CubicFeet.convertCubicFeetToCups("1", "28.4"));
	}
	
	@Test
	public void testSuccessConvertCubicFeetToGallons() {
		assertEquals(true, CubicFeet.convertCubicFeetToGallons("1", "7.4"));
	}
	
	@Test
	public void testFailureConvertCubicFeetToGallons() {
		assertEquals(false, CubicFeet.convertCubicFeetToGallons("1", "28.4"));
	}
}
