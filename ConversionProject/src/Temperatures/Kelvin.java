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
	public static boolean convertKelvinToKelvin (String InputTempNumText, String StudentTempResponseText) {
		BigDecimal kelvin = new BigDecimal(InputTempNumText);
		
		return ConversionVerifier.verifyEvaluation(kelvin, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertKelvinToFahrenheit (String InputTempNumText, String StudentTempResponseText) {
		double kelvin = Double.parseDouble(InputTempNumText);
		BigDecimal fahrenheit = new BigDecimal((kelvin - 273.15) * 9/5 + 32);
		
		return ConversionVerifier.verifyEvaluation(fahrenheit, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertKelvinToCelsius (String InputTempNumText, String StudentTempResponseText) {
		double kelvin = Double.parseDouble(InputTempNumText);
		BigDecimal celsius = new BigDecimal(kelvin - 273.15);
		
		return ConversionVerifier.verifyEvaluation(celsius, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertKelvinToRankine (String InputTempNumText, String StudentTempResponseText) {
		double kelvin = Double.parseDouble(InputTempNumText);
		BigDecimal rankine = new BigDecimal(kelvin * 9/5);
		
		return ConversionVerifier.verifyEvaluation(rankine, new BigDecimal(StudentTempResponseText));
	}
}
