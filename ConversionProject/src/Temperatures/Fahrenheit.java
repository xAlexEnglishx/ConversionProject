package Temperatures;
import javax.swing.*;

import Verification.ConversionVerifier;

import java.awt.event.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class Fahrenheit {
	
	//Fahrenheit conversions
	public static boolean convertFahrenheitToFahrenheit (String InputNumberText, String StudentResponseText) {
		BigDecimal fahrenheit = new BigDecimal(InputNumberText);
		
		return ConversionVerifier.verifyEvaluation(fahrenheit, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertFahrenheitToCelsius (String InputNumberText, String StudentResponseText) {
		double fahrenheit = Double.parseDouble(InputNumberText);
		BigDecimal celsius = new BigDecimal((fahrenheit - 32) * 5 / 9);
		
		return ConversionVerifier.verifyEvaluation(celsius, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertFahrenheitToKelvin (String InputNumberText, String StudentResponseText) {
		double fahrenheit = Double.parseDouble(InputNumberText);
		BigDecimal kelvin = new BigDecimal(273.15 + ((fahrenheit - 32.0) * (5.0/9.0)));
		
		return ConversionVerifier.verifyEvaluation(kelvin, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertFahrenheitToRankine (String InputNumberText, String StudentResponseText) {
		double fahrenheit = Double.parseDouble(InputNumberText);
		BigDecimal rankine = new BigDecimal(fahrenheit + 459.67);
		
		return ConversionVerifier.verifyEvaluation(rankine, new BigDecimal(StudentResponseText));
	}
}
