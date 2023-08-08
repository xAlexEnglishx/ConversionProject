package Volumes;
import javax.swing.*;

import Verification.ConversionVerifier;

import java.awt.event.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class CubicFeet {
	
	//Cubic Feet conversions
	public static boolean convertCubicFeetToCubicFeet (String InputNumberText, String StudentResponseText) {
		BigDecimal cubicFeet = new BigDecimal(InputNumberText);
		
		return ConversionVerifier.verifyEvaluation(cubicFeet, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertCubicFeetToLiters (String InputNumberText, String StudentResponseText) {
		double cubicFeet = Double.parseDouble(InputNumberText);
		BigDecimal liters = new BigDecimal(cubicFeet * 28.317);
		
		return ConversionVerifier.verifyEvaluation(liters, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertCubicFeetToTablespoons (String InputNumberText, String StudentResponseText) {
		double cubicFeet = Double.parseDouble(InputNumberText);
		BigDecimal tablespoons = new BigDecimal(cubicFeet * 1915);
		
		return ConversionVerifier.verifyEvaluation(tablespoons, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertCubicFeetToCubicInches (String InputNumberText, String StudentResponseText) {
		double cubicFeet = Double.parseDouble(InputNumberText);
		BigDecimal cubicInches = new BigDecimal(cubicFeet * 1728);
		
		return ConversionVerifier.verifyEvaluation(cubicInches, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertCubicFeetToCups (String InputNumberText, String StudentResponseText) {
		double cubicFeet = Double.parseDouble(InputNumberText);
		BigDecimal cups = new BigDecimal(cubicFeet * 119.7);
		
		return ConversionVerifier.verifyEvaluation(cups, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertCubicFeetToGallons (String InputNumberText, String StudentResponseText) {
		double cubicFeet = Double.parseDouble(InputNumberText);
		BigDecimal gallons = new BigDecimal(cubicFeet * 7.481);
		
		return ConversionVerifier.verifyEvaluation(gallons, new BigDecimal(StudentResponseText));
	}
	
}
