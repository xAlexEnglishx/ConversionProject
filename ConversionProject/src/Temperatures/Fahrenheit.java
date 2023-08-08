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
	public static boolean convertFahrenheitToFahrenheit (String InputTempNumText, String StudentTempResponseText) {
		BigDecimal fahrenheit = new BigDecimal(InputTempNumText);
		
		return ConversionVerifier.verifyEvaluation(fahrenheit, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertFahrenheitToCelsius (String InputTempNumText, String StudentTempResponseText) {
		double fahrenheit = Double.parseDouble(InputTempNumText);
		BigDecimal celsius = new BigDecimal((fahrenheit - 32) * 5 / 9);
		
		return ConversionVerifier.verifyEvaluation(celsius, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertFahrenheitToKelvin (String InputTempNumText, String StudentTempResponseText) {
		double fahrenheit = Double.parseDouble(InputTempNumText);
		BigDecimal kelvin = new BigDecimal(273.15 + ((fahrenheit - 32.0) * (5.0/9.0)));
		
		return ConversionVerifier.verifyEvaluation(kelvin, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertFahrenheitToRankine (String InputTempNumText, String StudentTempResponseText) {
		double fahrenheit = Double.parseDouble(InputTempNumText);
		BigDecimal rankine = new BigDecimal(fahrenheit + 459.67);
		
		return ConversionVerifier.verifyEvaluation(rankine, new BigDecimal(StudentTempResponseText));
	}
}
