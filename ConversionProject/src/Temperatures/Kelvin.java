package Temperatures;
import javax.swing.*;

import Verification.ConversionVerifier;

import java.awt.event.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class Kelvin {
	
	//Kelvin conversions
	public static boolean convertKelvinToKelvin (String InputNumberText, String StudentResponseText) {
		BigDecimal kelvin = new BigDecimal(InputNumberText);
		
		return ConversionVerifier.verifyEvaluation(kelvin, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertKelvinToFahrenheit (String InputNumberText, String StudentResponseText) {
		double kelvin = Double.parseDouble(InputNumberText);
		BigDecimal fahrenheit = new BigDecimal((kelvin - 273.15) * 9/5 + 32);
		
		return ConversionVerifier.verifyEvaluation(fahrenheit, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertKelvinToCelsius (String InputNumberText, String StudentResponseText) {
		double kelvin = Double.parseDouble(InputNumberText);
		BigDecimal celsius = new BigDecimal(kelvin - 273.15);
		
		return ConversionVerifier.verifyEvaluation(celsius, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertKelvinToRankine (String InputNumberText, String StudentResponseText) {
		double kelvin = Double.parseDouble(InputNumberText);
		BigDecimal rankine = new BigDecimal(kelvin * 9/5);
		
		return ConversionVerifier.verifyEvaluation(rankine, new BigDecimal(StudentResponseText));
	}
}
