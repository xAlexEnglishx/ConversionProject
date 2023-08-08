package Temperatures;
import javax.swing.*;

import Verification.ConversionVerifier;

import java.awt.event.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class Rankine {
	
	//Rankine conversions
	public static boolean convertRankineToRankine (String InputNumberText, String StudentTempResponseText) {
		BigDecimal rankine = new BigDecimal(Double.parseDouble(InputNumberText));
		
		return ConversionVerifier.verifyEvaluation(rankine, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertRankineToFahrenheit (String InputNumberText, String StudentTempResponseText) {
		double rankine = Double.parseDouble(InputNumberText);
		BigDecimal fahrenheit = new BigDecimal(rankine - 459.67);
		
		return ConversionVerifier.verifyEvaluation(fahrenheit, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertRankineToCelsius (String InputNumberText, String StudentTempResponseText) {
		double rankine = Double.parseDouble(InputNumberText);
		BigDecimal celsius = new BigDecimal((rankine - 491.67) * 5/9);
		
		return ConversionVerifier.verifyEvaluation(celsius, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertRankineToKelvin (String InputNumberText, String StudentTempResponseText) {
		double rankine = Double.parseDouble(InputNumberText);
		BigDecimal kelvin = new BigDecimal(rankine * 5/9);
		
		return ConversionVerifier.verifyEvaluation(kelvin, new BigDecimal(StudentTempResponseText));
	}
}
