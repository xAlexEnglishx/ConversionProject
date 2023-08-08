package Volumes;
import javax.swing.*;

import Verification.ConversionVerifier;

import java.awt.event.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class Cups {

	//Cups conversions
	public static boolean convertCupsToCups (String InputNumberText, String StudentResponseText) {
		BigDecimal cups = new BigDecimal(InputNumberText);
		
		return ConversionVerifier.verifyEvaluation(cups, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertCupsToLiters (String InputNumberText, String StudentResponseText) {
		double cups = Double.parseDouble(InputNumberText);
		BigDecimal liters = new BigDecimal(cups / 4.227);
		
		return ConversionVerifier.verifyEvaluation(liters, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertCupsToTablespoons (String InputNumberText, String StudentResponseText) {
		double cups = Double.parseDouble(InputNumberText);
		BigDecimal tablespoons = new BigDecimal(cups * 16);
		
		return ConversionVerifier.verifyEvaluation(tablespoons, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertCupsToCubicInches (String InputNumberText, String StudentResponseText) {
		double cups = Double.parseDouble(InputNumberText);
		BigDecimal cubicInches = new BigDecimal(cups * 14.438);
		
		return ConversionVerifier.verifyEvaluation(cubicInches, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertCupsToCubicFeet (String InputNumberText, String StudentResponseText) {
		double cups = Double.parseDouble(InputNumberText);
		BigDecimal cubicFeet = new BigDecimal(cups / 119.7);
		
		return ConversionVerifier.verifyEvaluation(cubicFeet, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertCupsToGallons (String InputNumberText, String StudentResponseText) {
		double cups = Double.parseDouble(InputNumberText);
		BigDecimal gallons = new BigDecimal(cups / 16);
		
		return ConversionVerifier.verifyEvaluation(gallons, new BigDecimal(StudentResponseText));
	}
	
}
