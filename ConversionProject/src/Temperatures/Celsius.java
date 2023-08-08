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
	public static boolean convertCelsiusToCelsius (String InputNumberText, String StudentResponseText) {
		BigDecimal celsius = new BigDecimal(Double.parseDouble(InputNumberText));
		
		return ConversionVerifier.verifyEvaluation(celsius, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertCelsiusToFahrenheit (String InputNumberText, String StudentResponseText) {
		double celsius = Double.parseDouble(InputNumberText);
		BigDecimal fahrenheit = new BigDecimal((celsius * 9/5) + 32);
		
		return ConversionVerifier.verifyEvaluation(fahrenheit, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertCelsiusToKelvin (String InputNumberText, String StudentResponseText) {
		double celsius = Double.parseDouble(InputNumberText);
		BigDecimal kelvin = new BigDecimal(celsius + 273.15);
		
		return ConversionVerifier.verifyEvaluation(kelvin, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertCelsiusToRankine (String InputNumberText, String StudentResponseText) {
		double celsius = Double.parseDouble(InputNumberText);
		BigDecimal rankine = new BigDecimal(celsius * 9/5 + 491.67);
		
		return ConversionVerifier.verifyEvaluation(rankine, new BigDecimal(StudentResponseText));
	}
}
