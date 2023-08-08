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
	public static boolean convertCubicInchesToCubicInches (String InputTempNumText, String StudentTempResponseText) {
		BigDecimal cubicInches = new BigDecimal(InputTempNumText);
		
		return ConversionVerifier.verifyEvaluation(cubicInches, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertCubicInchesToLiters (String InputTempNumText, String StudentTempResponseText) {
		double cubicInches = Double.parseDouble(InputTempNumText);
		BigDecimal liters = new BigDecimal(cubicInches / 61.024);
		
		return ConversionVerifier.verifyEvaluation(liters, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertCubicInchesToTablespoons (String InputTempNumText, String StudentTempResponseText) {
		double cubicInches = Double.parseDouble(InputTempNumText);
		BigDecimal tablespoons = new BigDecimal(cubicInches * 1.108);
		
		return ConversionVerifier.verifyEvaluation(tablespoons, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertCubicInchesToCups (String InputTempNumText, String StudentTempResponseText) {
		double cubicInches = Double.parseDouble(InputTempNumText);
		BigDecimal cups = new BigDecimal(cubicInches / 14.438);
		
		return ConversionVerifier.verifyEvaluation(cups, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertCubicInchesToCubicFeet (String InputTempNumText, String StudentTempResponseText) {
		double cubicInches = Double.parseDouble(InputTempNumText);
		BigDecimal cubicFeet = new BigDecimal(cubicInches / 1728);
		
		return ConversionVerifier.verifyEvaluation(cubicFeet, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertCubicInchesToGallons (String InputTempNumText, String StudentTempResponseText) {
		double cubicInches = Double.parseDouble(InputTempNumText);
		BigDecimal gallons = new BigDecimal(cubicInches / 231);
		
		return ConversionVerifier.verifyEvaluation(gallons, new BigDecimal(StudentTempResponseText));
	}
	
}
