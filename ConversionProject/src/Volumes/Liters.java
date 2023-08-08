package Volumes;
import javax.swing.*;

import Verification.ConversionVerifier;

import java.awt.event.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class Liters {

	//Liter conversions
	public static boolean convertLitersToLiters (String InputNumberText, String StudentResponseText) {
		BigDecimal liters = new BigDecimal(InputNumberText);
		
		return ConversionVerifier.verifyEvaluation(liters, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertLitersToTablespoons (String InputNumberText, String StudentResponseText) {
		double liters = Double.parseDouble(InputNumberText);
		BigDecimal tablespoons = new BigDecimal(liters * 67.628);
		
		return ConversionVerifier.verifyEvaluation(tablespoons, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertLitersToCubicInches (String InputNumberText, String StudentResponseText) {
		double liters = Double.parseDouble(InputNumberText);
		BigDecimal cubicInches = new BigDecimal(liters * 61.024);
		
		return ConversionVerifier.verifyEvaluation(cubicInches, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertLitersToCups (String InputNumberText, String StudentResponseText) {
		double liters = Double.parseDouble(InputNumberText);
		BigDecimal cups = new BigDecimal(liters * 4.227);
		
		return ConversionVerifier.verifyEvaluation(cups, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertLitersToCubicFeet (String InputNumberText, String StudentResponseText) {
		double liters = Double.parseDouble(InputNumberText);
		BigDecimal cubicFeet = new BigDecimal(liters / 28.317);
		
		return ConversionVerifier.verifyEvaluation(cubicFeet, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertLitersToGallons (String InputNumberText, String StudentResponseText) {
		double liters = Double.parseDouble(InputNumberText);
		BigDecimal gallons = new BigDecimal(liters / 3.785);
		
		return ConversionVerifier.verifyEvaluation(gallons, new BigDecimal(StudentResponseText));
	}
	
}
