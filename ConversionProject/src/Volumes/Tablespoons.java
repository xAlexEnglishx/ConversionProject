package Volumes;
import javax.swing.*;

import Verification.ConversionVerifier;

import java.awt.event.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class Tablespoons {

	//Tablespoons conversions
	public static boolean convertTablespoonsToTablespoons (String InputNumberText, String StudentResponseText) {
		BigDecimal tablespoons = new BigDecimal(InputNumberText);
		
		return ConversionVerifier.verifyEvaluation(tablespoons, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertTablespoonsToLiters (String InputNumberText, String StudentResponseText) {
		double tablespoons = Double.parseDouble(InputNumberText);
		BigDecimal liters = new BigDecimal(tablespoons / 67.628);
		
		return ConversionVerifier.verifyEvaluation(liters, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertTablespoonsToCubicInches (String InputNumberText, String StudentResponseText) {
		double tablespoons = Double.parseDouble(InputNumberText);
		BigDecimal cubicInches = new BigDecimal(tablespoons / 1.108);
		
		return ConversionVerifier.verifyEvaluation(cubicInches, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertTablespoonsToCups (String InputNumberText, String StudentResponseText) {
		double tablespoons = Double.parseDouble(InputNumberText);
		BigDecimal cups = new BigDecimal(tablespoons / 16);
		
		return ConversionVerifier.verifyEvaluation(cups, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertTablespoonsToCubicFeet (String InputNumberText, String StudentResponseText) {
		double tablespoons = Double.parseDouble(InputNumberText);
		BigDecimal cubicFeet = new BigDecimal(tablespoons / 1915);
		
		return ConversionVerifier.verifyEvaluation(cubicFeet, new BigDecimal(StudentResponseText));
	}
	
	public static boolean convertTablespoonsToGallons (String InputNumberText, String StudentResponseText) {
		double tablespoons = Double.parseDouble(InputNumberText);
		BigDecimal gallons = new BigDecimal(tablespoons / 256);
		
		return ConversionVerifier.verifyEvaluation(gallons, new BigDecimal(StudentResponseText));
	}
	
}
