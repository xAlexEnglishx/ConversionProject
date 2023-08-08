package Temperatures;
import javax.swing.*;

import Verification.ConversionVerifier;

import java.awt.event.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class Celsius {
	
	//Celsius conversions
	public static boolean convertCelsiusToCelsius (String InputTempNumText, String StudentTempResponseText) {
		BigDecimal celsius = new BigDecimal(Double.parseDouble(InputTempNumText));
		
		return ConversionVerifier.verifyEvaluation(celsius, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertCelsiusToFahrenheit (String InputTempNumText, String StudentTempResponseText) {
		double celsius = Double.parseDouble(InputTempNumText);
		BigDecimal fahrenheit = new BigDecimal((celsius * 9/5) + 32);
		
		return ConversionVerifier.verifyEvaluation(fahrenheit, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertCelsiusToKelvin (String InputTempNumText, String StudentTempResponseText) {
		double celsius = Double.parseDouble(InputTempNumText);
		BigDecimal kelvin = new BigDecimal(celsius + 273.15);
		
		return ConversionVerifier.verifyEvaluation(kelvin, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertCelsiusToRankine (String InputTempNumText, String StudentTempResponseText) {
		double celsius = Double.parseDouble(InputTempNumText);
		BigDecimal rankine = new BigDecimal(celsius * 9/5 + 491.67);
		
		return ConversionVerifier.verifyEvaluation(rankine, new BigDecimal(StudentTempResponseText));
	}
}
