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
	public static boolean convertCubicFeetToCubicFeet (String InputTempNumText, String StudentTempResponseText) {
		BigDecimal cubicFeet = new BigDecimal(InputTempNumText);
		
		return ConversionVerifier.verifyEvaluation(cubicFeet, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertCubicFeetToLiters (String InputTempNumText, String StudentTempResponseText) {
		double cubicFeet = Double.parseDouble(InputTempNumText);
		BigDecimal liters = new BigDecimal(cubicFeet * 28.317);
		
		return ConversionVerifier.verifyEvaluation(liters, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertCubicFeetToTablespoons (String InputTempNumText, String StudentTempResponseText) {
		double cubicFeet = Double.parseDouble(InputTempNumText);
		BigDecimal tablespoons = new BigDecimal(cubicFeet * 1915);
		
		return ConversionVerifier.verifyEvaluation(tablespoons, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertCubicFeetToCubicInches (String InputTempNumText, String StudentTempResponseText) {
		double cubicFeet = Double.parseDouble(InputTempNumText);
		BigDecimal cubicInches = new BigDecimal(cubicFeet * 1728);
		
		return ConversionVerifier.verifyEvaluation(cubicInches, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertCubicFeetToCups (String InputTempNumText, String StudentTempResponseText) {
		double cubicFeet = Double.parseDouble(InputTempNumText);
		BigDecimal cups = new BigDecimal(cubicFeet * 119.7);
		
		return ConversionVerifier.verifyEvaluation(cups, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertCubicFeetToGallons (String InputTempNumText, String StudentTempResponseText) {
		double cubicFeet = Double.parseDouble(InputTempNumText);
		BigDecimal gallons = new BigDecimal(cubicFeet * 7.481);
		
		return ConversionVerifier.verifyEvaluation(gallons, new BigDecimal(StudentTempResponseText));
	}
	
}
