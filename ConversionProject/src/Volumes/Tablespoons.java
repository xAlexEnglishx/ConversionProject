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
	public static boolean convertTablespoonsToTablespoons (String InputTempNumText, String StudentTempResponseText) {
		BigDecimal tablespoons = new BigDecimal(InputTempNumText);
		
		return ConversionVerifier.verifyEvaluation(tablespoons, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertTablespoonsToLiters (String InputTempNumText, String StudentTempResponseText) {
		double tablespoons = Double.parseDouble(InputTempNumText);
		BigDecimal liters = new BigDecimal(tablespoons / 67.628);
		
		return ConversionVerifier.verifyEvaluation(liters, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertTablespoonsToCubicInches (String InputTempNumText, String StudentTempResponseText) {
		double tablespoons = Double.parseDouble(InputTempNumText);
		BigDecimal cubicInches = new BigDecimal(tablespoons / 1.108);
		
		return ConversionVerifier.verifyEvaluation(cubicInches, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertTablespoonsToCups (String InputTempNumText, String StudentTempResponseText) {
		double tablespoons = Double.parseDouble(InputTempNumText);
		BigDecimal cups = new BigDecimal(tablespoons / 16);
		
		return ConversionVerifier.verifyEvaluation(cups, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertTablespoonsToCubicFeet (String InputTempNumText, String StudentTempResponseText) {
		double tablespoons = Double.parseDouble(InputTempNumText);
		BigDecimal cubicFeet = new BigDecimal(tablespoons / 1915);
		
		return ConversionVerifier.verifyEvaluation(cubicFeet, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertTablespoonsToGallons (String InputTempNumText, String StudentTempResponseText) {
		double tablespoons = Double.parseDouble(InputTempNumText);
		BigDecimal gallons = new BigDecimal(tablespoons / 265);
		
		return ConversionVerifier.verifyEvaluation(gallons, new BigDecimal(StudentTempResponseText));
	}
	
}
