package Volumes;
import javax.swing.*;

import Verification.ConversionVerifier;

import java.awt.event.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class Gallons {
	
	//Gallons conversions
	public static boolean convertGallonsToGallons (String InputNumberText, String StudentResponseText) {
		BigDecimal gallons = new BigDecimal(InputNumberText);
		
		return ConversionVerifier.verifyEvaluation(gallons, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertGallonsToLiters (String InputNumberText, String StudentResponseText) {
		double gallons = Double.parseDouble(InputNumberText);
		BigDecimal liters = new BigDecimal(gallons * 3.785);
		
		return ConversionVerifier.verifyEvaluation(liters, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertGallonsToTablespoons (String InputNumberText, String StudentResponseText) {
		double gallons = Double.parseDouble(InputNumberText);
		BigDecimal tablespoons = new BigDecimal(gallons * 256);
		
		return ConversionVerifier.verifyEvaluation(tablespoons, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertGallonsToCubicInches (String InputNumberText, String StudentResponseText) {
		double gallons = Double.parseDouble(InputNumberText);
		BigDecimal cubicInches = new BigDecimal(gallons * 231);
		
		return ConversionVerifier.verifyEvaluation(cubicInches, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertGallonsToCubicFeet (String InputNumberText, String StudentResponseText) {
		double gallons = Double.parseDouble(InputNumberText);
		BigDecimal cubicFeet = new BigDecimal(gallons / 7.48);
		
		return ConversionVerifier.verifyEvaluation(cubicFeet, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertGallonsToCups (String InputNumberText, String StudentResponseText) {
		double gallons = Double.parseDouble(InputNumberText);
		BigDecimal cups = new BigDecimal(gallons * 16);
		
		return ConversionVerifier.verifyEvaluation(cups, new BigDecimal(StudentResponseText));
	}
	
}
