import javax.swing.*;

import Temperatures.Celsius;
import Temperatures.Fahrenheit;
import Temperatures.Kelvin;
import Temperatures.Rankine;

import java.awt.event.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class TempConverter {
	
	//take 2 inputs, evaluate the first then run into switch based on second
	
	
	public static boolean evaluateTempConversion(String InputTempNumText, String StudentTempResponseText, 
										TemperatureEnum InputTempUnitDropdown, TemperatureEnum TargetTempUnitDropdown) {
		System.out.println("test789" + " , " 
				+ InputTempNumText + " , " 
				+ StudentTempResponseText + " , " 
				+ InputTempUnitDropdown + " , " 
				+ TargetTempUnitDropdown);
		
		boolean evaluation = false;
		
		//Determine Input Temperature Unit
		switch (InputTempUnitDropdown) {
	        case FAHRENHEIT : evaluation = convertFromFahrenheit(InputTempNumText, StudentTempResponseText, 
											TargetTempUnitDropdown);
	                 break;
	        case CELSIUS : evaluation = convertFromCelsius(InputTempNumText, StudentTempResponseText, 
											TargetTempUnitDropdown);
	                 break;
	        case KELVIN : evaluation = convertFromKelvin(InputTempNumText, StudentTempResponseText, 
											TargetTempUnitDropdown);
	                 break;
	        case RANKINE : evaluation = convertFromRankine(InputTempNumText, StudentTempResponseText, 
											TargetTempUnitDropdown);
	                 break;
	        default: return false;
		}
		
		return evaluation;
	}
	
	private static boolean convertFromFahrenheit (String InputTempNumText, String StudentTempResponseText, 
													TemperatureEnum TargetTempUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Temperature Unit
		switch (TargetTempUnitDropdown) {
	        case FAHRENHEIT : evaluation = Fahrenheit.convertFahrenheitToFahrenheit(InputTempNumText, StudentTempResponseText);
	                 break;
	        case CELSIUS : evaluation = Fahrenheit.convertFahrenheitToCelsius(InputTempNumText, StudentTempResponseText);
	                 break;
	        case KELVIN : evaluation = Fahrenheit.convertFahrenheitToKelvin(InputTempNumText, StudentTempResponseText);
	                 break;
	        case RANKINE : evaluation = Fahrenheit.convertFahrenheitToRankine(InputTempNumText, StudentTempResponseText);
	                 break;
	        default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromCelsius (String InputTempNumText, String StudentTempResponseText, 
												TemperatureEnum TargetTempUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Temperature Unit
		switch (TargetTempUnitDropdown) {
	        case FAHRENHEIT : evaluation = Celsius.convertCelsiusToFahrenheit(InputTempNumText, StudentTempResponseText);
	                 break;
	        case CELSIUS : evaluation = Celsius.convertCelsiusToCelsius(InputTempNumText, StudentTempResponseText);
	                 break;
	        case KELVIN : evaluation = Celsius.convertCelsiusToKelvin(InputTempNumText, StudentTempResponseText);
	                 break;
	        case RANKINE : evaluation = Celsius.convertCelsiusToRankine(InputTempNumText, StudentTempResponseText);
	                 break;
	        default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromKelvin (String InputTempNumText, String StudentTempResponseText, 
												TemperatureEnum TargetTempUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Temperature Unit
		switch (TargetTempUnitDropdown) {
	        case FAHRENHEIT : evaluation = Kelvin.convertKelvinToFahrenheit(InputTempNumText, StudentTempResponseText);
	                 break;
	        case CELSIUS : evaluation = Kelvin.convertKelvinToCelsius(InputTempNumText, StudentTempResponseText);
	                 break;
	        case KELVIN : evaluation = Kelvin.convertKelvinToKelvin(InputTempNumText, StudentTempResponseText);
	                 break;
	        case RANKINE : evaluation = Kelvin.convertKelvinToRankine(InputTempNumText, StudentTempResponseText);
	                 break;
	        default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromRankine (String InputTempNumText, String StudentTempResponseText, 
												TemperatureEnum TargetTempUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Temperature Unit
		switch (TargetTempUnitDropdown) {
	        case FAHRENHEIT : evaluation = Rankine.convertRankineToFahrenheit(InputTempNumText, StudentTempResponseText);
	                 break;
	        case CELSIUS : evaluation = Rankine.convertRankineToCelsius(InputTempNumText, StudentTempResponseText);
	                 break;
	        case KELVIN : evaluation = Rankine.convertRankineToKelvin(InputTempNumText, StudentTempResponseText);
	                 break;
	        case RANKINE : evaluation = Rankine.convertRankineToRankine(InputTempNumText, StudentTempResponseText);
	                 break;
	        default: return false;
		}
		return evaluation;
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
