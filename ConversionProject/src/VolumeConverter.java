import javax.swing.*;
import java.awt.event.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

import Volumes.CubicInches;
import Volumes.Cups;
import Volumes.Liters;
import Volumes.Tablespoons;

public class VolumeConverter {
	
	//take 2 inputs, evaluate the first then run into switch based on second
	
	
	public static boolean evaluateVolConversion(String InputTempNumText, String StudentTempResponseText, 
											VolumeEnum InputTempUnitDropdown, VolumeEnum TargetTempUnitDropdown) {
		System.out.println("test789" + " , " 
				+ InputTempNumText + " , " 
				+ StudentTempResponseText + " , " 
				+ InputTempUnitDropdown + " , " 
				+ TargetTempUnitDropdown);
		
		boolean evaluation = false;
		
//		LITERS,
//		TABLESPOONS,
//		CUBIC_INCHES,
//		CUPS,
//		CUBIC_FEET,
//		GALLONS
		//Determine Input Volume Unit
		switch (InputTempUnitDropdown) {
	        case LITERS : evaluation = convertFromLiters(InputTempNumText, StudentTempResponseText, 
											TargetTempUnitDropdown);
	                 break;
	        case TABLESPOONS : evaluation = convertFromTablespoons(InputTempNumText, StudentTempResponseText, 
											TargetTempUnitDropdown);
	                 break;
	        case CUBIC_INCHES : evaluation = convertFromCubicInches(InputTempNumText, StudentTempResponseText, 
											TargetTempUnitDropdown);
	                 break;
	        case CUPS : evaluation = convertFromCups(InputTempNumText, StudentTempResponseText, 
											TargetTempUnitDropdown);
	                 break;
	        case CUBIC_FEET : evaluation = convertFromCubicFeet(InputTempNumText, StudentTempResponseText, 
											TargetTempUnitDropdown);
	        		 break;
	        case GALLONS : evaluation = convertFromGallons(InputTempNumText, StudentTempResponseText, 
											TargetTempUnitDropdown);
	        		 break;
	        default: return false;
		}
		
		return evaluation;
	}
	
	private static boolean convertFromLiters (String InputTempNumText, String StudentTempResponseText, 
												VolumeEnum TargetTempUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Volume Unit
		switch (TargetTempUnitDropdown) {
	        case LITERS : evaluation = Liters.convertLitersToLiters(InputTempNumText, StudentTempResponseText);
	                break;
	        case TABLESPOONS : evaluation = Liters.convertLitersToTablespoons(InputTempNumText, StudentTempResponseText);
					break;
			case CUBIC_INCHES : evaluation = Liters.convertLitersToCubicInches(InputTempNumText, StudentTempResponseText);
					break;
			case CUPS : evaluation = Liters.convertLitersToCups(InputTempNumText, StudentTempResponseText);
					break;
			case CUBIC_FEET : evaluation = Liters.convertLitersToCubicFeet(InputTempNumText, StudentTempResponseText);
					break;
			case GALLONS : evaluation = Liters.convertLitersToGallons(InputTempNumText, StudentTempResponseText);
					break;
			default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromTablespoons (String InputTempNumText, String StudentTempResponseText, 
													VolumeEnum TargetTempUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Volume Unit
		switch (TargetTempUnitDropdown) {
	        case LITERS : evaluation = Tablespoons.convertTablespoonsToLiters(InputTempNumText, StudentTempResponseText);
	                break;
	        case TABLESPOONS : evaluation = Tablespoons.convertTablespoonsToTablespoons(InputTempNumText, StudentTempResponseText);
					break;
			case CUBIC_INCHES : evaluation = Tablespoons.convertTablespoonsToCubicInches(InputTempNumText, StudentTempResponseText);
					break;
			case CUPS : evaluation = Tablespoons.convertTablespoonsToCups(InputTempNumText, StudentTempResponseText);
					break;
			case CUBIC_FEET : evaluation = Tablespoons.convertTablespoonsToCubicFeet(InputTempNumText, StudentTempResponseText);
					break;
			case GALLONS : evaluation = Tablespoons.convertTablespoonsToGallons(InputTempNumText, StudentTempResponseText);
					break;
			default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromCubicInches (String InputTempNumText, String StudentTempResponseText, 
													VolumeEnum TargetTempUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Volume Unit
		switch (TargetTempUnitDropdown) {
			case LITERS : evaluation = CubicInches.convertCubicInchesToLiters(InputTempNumText, StudentTempResponseText);
			        break;
			case TABLESPOONS : evaluation = CubicInches.convertCubicInchesToTablespoons(InputTempNumText, StudentTempResponseText);
					break;
			case CUBIC_INCHES : evaluation = CubicInches.convertCubicInchesToCubicInches(InputTempNumText, StudentTempResponseText);
					break;
			case CUPS : evaluation = CubicInches.convertCubicInchesToCups(InputTempNumText, StudentTempResponseText);
					break;
			case CUBIC_FEET : evaluation = CubicInches.convertCubicInchesToCubicFeet(InputTempNumText, StudentTempResponseText);
					break;
			case GALLONS : evaluation = CubicInches.convertCubicInchesToGallons(InputTempNumText, StudentTempResponseText);
					break;
			default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromCups (String InputTempNumText, String StudentTempResponseText, 
											VolumeEnum TargetTempUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Volume Unit
		switch (TargetTempUnitDropdown) {
			case LITERS : evaluation = Cups.convertCupsToLiters(InputTempNumText, StudentTempResponseText);
	        		break;
			case TABLESPOONS : evaluation = Cups.convertCupsToTablespoons(InputTempNumText, StudentTempResponseText);
					break;
			case CUBIC_INCHES : evaluation = Cups.convertCupsToCubicInches(InputTempNumText, StudentTempResponseText);
					break;
			case CUPS : evaluation = Cups.convertCupsToCups(InputTempNumText, StudentTempResponseText);
					break;
			case CUBIC_FEET : evaluation = Cups.convertCupsToCubicFeet(InputTempNumText, StudentTempResponseText);
					break;
			case GALLONS : evaluation = Cups.convertCupsToGallons(InputTempNumText, StudentTempResponseText);
					break;
		default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromCubicFeet (String InputTempNumText, String StudentTempResponseText, 
				VolumeEnum TargetTempUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Volume Unit
		//switch (TargetTempUnitDropdown) {
		//case FAHRENHEIT : evaluation = convertFahrenheitToFahrenheit(InputTempNumText, StudentTempResponseText);
		//break;
		//case CELSIUS : evaluation = convertFahrenheitToCelsius(InputTempNumText, StudentTempResponseText);
		//break;
		//case KELVIN : evaluation = convertFahrenheitToKelvin(InputTempNumText, StudentTempResponseText);
		//break;
		//case RANKINE : evaluation = convertFahrenheitToRankine(InputTempNumText, StudentTempResponseText);
		//break;
		//default: return false;
		//}
		return evaluation;
	}
	
	private static boolean convertFromGallons (String InputTempNumText, String StudentTempResponseText, 
				VolumeEnum TargetTempUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Volume Unit
		//switch (TargetTempUnitDropdown) {
		//case FAHRENHEIT : evaluation = convertFahrenheitToFahrenheit(InputTempNumText, StudentTempResponseText);
		//break;
		//case CELSIUS : evaluation = convertFahrenheitToCelsius(InputTempNumText, StudentTempResponseText);
		//break;
		//case KELVIN : evaluation = convertFahrenheitToKelvin(InputTempNumText, StudentTempResponseText);
		//break;
		//case RANKINE : evaluation = convertFahrenheitToRankine(InputTempNumText, StudentTempResponseText);
		//break;
		//default: return false;
		//}
		return evaluation;
	}
	
//	private static boolean convertFromCelsius (String InputTempNumText, String StudentTempResponseText, 
//												TemperatureEnum TargetTempUnitDropdown) {
//		boolean evaluation = false;
//		
//		//Determine Target Temperature Unit
//		switch (TargetTempUnitDropdown) {
//	        case FAHRENHEIT : evaluation = convertCelsiusToFahrenheit(InputTempNumText, StudentTempResponseText);
//	                 break;
//	        case CELSIUS : evaluation = convertCelsiusToCelsius(InputTempNumText, StudentTempResponseText);
//	                 break;
//	        case KELVIN : evaluation = convertCelsiusToKelvin(InputTempNumText, StudentTempResponseText);
//	                 break;
//	        case RANKINE : evaluation = convertCelsiusToRankine(InputTempNumText, StudentTempResponseText);
//	                 break;
//	        default: return false;
//		}
//		return evaluation;
//	}
//	
//	private static boolean convertFromKelvin (String InputTempNumText, String StudentTempResponseText, 
//												TemperatureEnum TargetTempUnitDropdown) {
//		boolean evaluation = false;
//		
//		//Determine Target Temperature Unit
//		switch (TargetTempUnitDropdown) {
//	        case FAHRENHEIT : evaluation = convertKelvinToFahrenheit(InputTempNumText, StudentTempResponseText);
//	                 break;
//	        case CELSIUS : evaluation = convertKelvinToCelsius(InputTempNumText, StudentTempResponseText);
//	                 break;
//	        case KELVIN : evaluation = convertKelvinToKelvin(InputTempNumText, StudentTempResponseText);
//	                 break;
//	        case RANKINE : evaluation = convertKelvinToRankine(InputTempNumText, StudentTempResponseText);
//	                 break;
//	        default: return false;
//		}
//		return evaluation;
//	}
//	
//	private static boolean convertFromRankine (String InputTempNumText, String StudentTempResponseText, 
//												TemperatureEnum TargetTempUnitDropdown) {
//		boolean evaluation = false;
//		
//		//Determine Target Temperature Unit
//		switch (TargetTempUnitDropdown) {
//	        case FAHRENHEIT : evaluation = convertRankineToFahrenheit(InputTempNumText, StudentTempResponseText);
//	                 break;
//	        case CELSIUS : evaluation = convertRankineToCelsius(InputTempNumText, StudentTempResponseText);
//	                 break;
//	        case KELVIN : evaluation = convertRankineToKelvin(InputTempNumText, StudentTempResponseText);
//	                 break;
//	        case RANKINE : evaluation = convertRankineToRankine(InputTempNumText, StudentTempResponseText);
//	                 break;
//	        default: return false;
//		}
//		return evaluation;
//	}
	
	
	
	
	
	//Fahrenheit conversions
	protected static boolean convertLitersToLiters (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double fahrenheit = Double.parseDouble(InputTempNumText);
		
		System.out.println("f: " + fahrenheit + " , fahrenheit: "+ fahrenheit + " , calcedfahrenheit" +
				String.valueOf(df.format(fahrenheit)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(fahrenheit)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	
	//Fahrenheit conversions
	protected static boolean convertFahrenheitToFahrenheit (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double fahrenheit = Double.parseDouble(InputTempNumText);
		
		System.out.println("f: " + fahrenheit + " , fahrenheit: "+ fahrenheit + " , calcedfahrenheit" +
				String.valueOf(df.format(fahrenheit)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(fahrenheit)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	protected static boolean convertFahrenheitToCelsius (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double fahrenheit = Double.parseDouble(InputTempNumText);
		double celsius = (fahrenheit - 32) * 5 / 9;
		
		System.out.println("f: " + fahrenheit + " , celsius: "+ celsius + " , calcedC" +
				String.valueOf(df.format(celsius)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(celsius)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	protected static boolean convertFahrenheitToKelvin (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double fahrenheit = Double.parseDouble(InputTempNumText);
		//273.15 + ((F - 32.0) * (5.0/9.0))
		double kelvin = 273.15 + ((fahrenheit - 32.0) * (5.0/9.0));
		
		System.out.println("f: " + fahrenheit + " , kelvin: "+ kelvin + " , calcedkelvin" +
				String.valueOf(df.format(kelvin)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(kelvin)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	protected static boolean convertFahrenheitToRankine (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double fahrenheit = Double.parseDouble(InputTempNumText);
		//32°F + 459.67
		double rankine = fahrenheit + 459.67;
		
		System.out.println("f: " + fahrenheit + " , rankine: "+ rankine + " , calcedrankine" +
				String.valueOf(df.format(rankine)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(rankine)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	//Celsius conversions
	protected static boolean convertCelsiusToCelsius (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double celsius = Double.parseDouble(InputTempNumText);
		
		System.out.println("1: " + celsius + " , 2: "+ celsius + " , 3: " +
				String.valueOf(df.format(celsius)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(celsius)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	protected static boolean convertCelsiusToFahrenheit (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double celsius = Double.parseDouble(InputTempNumText);
//		(0°C × 9/5) + 32
		double fahrenheit = (celsius * 9/5) + 32;
		
		System.out.println("1: " + fahrenheit + " , 2: "+ fahrenheit + " , 3: " +
				String.valueOf(df.format(fahrenheit)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(fahrenheit)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	protected static boolean convertCelsiusToKelvin (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double celsius = Double.parseDouble(InputTempNumText);
//		0°C + 273.15
		double kelvin = celsius + 273.15;
		
		System.out.println("1: " + kelvin + " , 2: "+ kelvin + " , 3: " +
				String.valueOf(df.format(kelvin)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(kelvin)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	protected static boolean convertCelsiusToRankine (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double celsius = Double.parseDouble(InputTempNumText);
//		0°C × 9/5 + 491.67
		double rankine = celsius * 9/5 + 491.67;
		
		System.out.println("1: " + rankine + " , 2: "+ rankine + " , 3: " +
				String.valueOf(df.format(rankine)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(rankine)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	//Kelvin conversions
	protected static boolean convertKelvinToKelvin (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double kelvin = Double.parseDouble(InputTempNumText);
		
		System.out.println("1: " + kelvin + " , 2: "+ kelvin + " , 3: " +
				String.valueOf(df.format(kelvin)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(kelvin)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	protected static boolean convertKelvinToFahrenheit (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double kelvin = Double.parseDouble(InputTempNumText);
//		(0K − 273.15) × 9/5 + 32
		double fahrenheit = (kelvin - 273.15) * 9/5 + 32;
		
		System.out.println("1: " + fahrenheit + " , 2: "+ fahrenheit + " , 3: " +
				String.valueOf(df.format(fahrenheit)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(fahrenheit)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	protected static boolean convertKelvinToCelsius (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double kelvin = Double.parseDouble(InputTempNumText);
//		0K − 273.15 
		double celsius = kelvin - 273.15;
		
		System.out.println("1: " + celsius + " , 2: "+ celsius + " , 3: " +
				String.valueOf(df.format(celsius)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(celsius)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	protected static boolean convertKelvinToRankine (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double kelvin = Double.parseDouble(InputTempNumText);
//		K * 9/5
		double rankine = kelvin * 9/5;
		
		System.out.println("1: " + rankine + " , 2: "+ rankine + " , 3: " +
				String.valueOf(df.format(rankine)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(rankine)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	
	
	//Rankine conversions
	protected static boolean convertRankineToRankine (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double rankine = Double.parseDouble(InputTempNumText);
		
		System.out.println("1: " + rankine + " , 2: "+ rankine + " , 3: " +
				String.valueOf(df.format(rankine)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(rankine)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	protected static boolean convertRankineToFahrenheit (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double rankine = Double.parseDouble(InputTempNumText);
//		1°R − 459.67
		double fahrenheit = rankine - 459.67;
		
		System.out.println("1: " + fahrenheit + " , 2: "+ fahrenheit + " , 3: " +
				String.valueOf(df.format(fahrenheit)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(fahrenheit)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	protected static boolean convertRankineToCelsius (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double rankine = Double.parseDouble(InputTempNumText);
//		(1°R − 491.67) × 5/9
		double celsius = (rankine - 491.67) * 5/9;
		
		System.out.println("1: " + celsius + " , 2: "+ celsius + " , 3: " +
				String.valueOf(df.format(celsius)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(celsius)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	protected static boolean convertRankineToKelvin (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double rankine = Double.parseDouble(InputTempNumText);
//		1°R × 5/9
		double kelvin = rankine * 5/9;
		
		System.out.println("1: " + kelvin + " , 2: "+ kelvin + " , 3: " +
				String.valueOf(df.format(kelvin)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(kelvin)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	
	
	
	public static boolean verifyInputs(String InputTempNumText, String StudentTempResponseText) {
		boolean VertifyInputTempNumText = Pattern.matches("^-?\\d+(\\.\\d{1,1})?$", InputTempNumText);
		boolean VerifyStudentTempResponseText = Pattern.matches("^-?\\d+(\\.\\d{1,1})?$", StudentTempResponseText);
		if (VertifyInputTempNumText == true && VerifyStudentTempResponseText == true) {
			return true;
		} else {
			return false;
		}
	}
	
	
	

	public String convertCtoF (double textCelsius) {
		//Convert C to F
//		String cText = textCelsius.getText();
//		double textCelsius = Double.parseDouble(textCelsius);
		System.out.println("test2");
		double f = (textCelsius * 9 / 5) + 32;
		DecimalFormat df = new DecimalFormat("#.#");
		return String.valueOf(df.format(f));
//		textFahrenheit.setText(String.valueOf(f));
	}
	
	public String convertFtoC (double textFahrenheit) {
		//Convert F to C
//		String fText = textFahrenheit.getText();
//		double f = Double.parseDouble(fText);
		double c = (textFahrenheit - 32) * 5 / 9;
		DecimalFormat df = new DecimalFormat("#.#");
		return String.valueOf(df.format(c));
//		textCelsius.setText(String.valueOf(c));
	}
	
}
