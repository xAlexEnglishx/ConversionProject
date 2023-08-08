package Volumes;
import javax.swing.*;

import Verification.ConversionVerifier;

import java.awt.event.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class CubicInches {

	//Cubic Inches conversions
	public static boolean convertCubicInchesToCubicInches (String InputNumberText, String StudentResponseText) {
		BigDecimal cubicInches = new BigDecimal(InputNumberText);
		
		return ConversionVerifier.verifyEvaluation(cubicInches, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertCubicInchesToLiters (String InputNumberText, String StudentResponseText) {
		double cubicInches = Double.parseDouble(InputNumberText);
		BigDecimal liters = new BigDecimal(cubicInches / 61.024);
		
		return ConversionVerifier.verifyEvaluation(liters, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertCubicInchesToTablespoons (String InputNumberText, String StudentResponseText) {
		double cubicInches = Double.parseDouble(InputNumberText);
		BigDecimal tablespoons = new BigDecimal(cubicInches * 1.108);
		
		return ConversionVerifier.verifyEvaluation(tablespoons, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertCubicInchesToCups (String InputNumberText, String StudentResponseText) {
		double cubicInches = Double.parseDouble(InputNumberText);
		BigDecimal cups = new BigDecimal(cubicInches / 14.438);
		
		return ConversionVerifier.verifyEvaluation(cups, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertCubicInchesToCubicFeet (String InputNumberText, String StudentResponseText) {
		double cubicInches = Double.parseDouble(InputNumberText);
		BigDecimal cubicFeet = new BigDecimal(cubicInches / 1728);
		
		return ConversionVerifier.verifyEvaluation(cubicFeet, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertCubicInchesToGallons (String InputNumberText, String StudentResponseText) {
		double cubicInches = Double.parseDouble(InputNumberText);
		BigDecimal gallons = new BigDecimal(cubicInches / 231);
		
		return ConversionVerifier.verifyEvaluation(gallons, new BigDecimal(StudentResponseText));
	}
	
}
