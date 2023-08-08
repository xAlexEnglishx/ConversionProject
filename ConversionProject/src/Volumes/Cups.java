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
	public static boolean convertCupsToCups (String InputTempNumText, String StudentTempResponseText) {
		BigDecimal cups = new BigDecimal(InputTempNumText);
		
		return ConversionVerifier.verifyEvaluation(cups, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertCupsToLiters (String InputTempNumText, String StudentTempResponseText) {
		double cups = Double.parseDouble(InputTempNumText);
		BigDecimal liters = new BigDecimal(cups / 4.227);
		
		return ConversionVerifier.verifyEvaluation(liters, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertCupsToTablespoons (String InputTempNumText, String StudentTempResponseText) {
		double cups = Double.parseDouble(InputTempNumText);
		BigDecimal tablespoons = new BigDecimal(cups * 16);
		
		return ConversionVerifier.verifyEvaluation(tablespoons, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertCupsToCubicInches (String InputTempNumText, String StudentTempResponseText) {
		double cups = Double.parseDouble(InputTempNumText);
		BigDecimal cubicInches = new BigDecimal(cups * 14.438);
		
		return ConversionVerifier.verifyEvaluation(cubicInches, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertCupsToCubicFeet (String InputTempNumText, String StudentTempResponseText) {
		double cups = Double.parseDouble(InputTempNumText);
		BigDecimal cubicFeet = new BigDecimal(cups / 119.7);
		
		return ConversionVerifier.verifyEvaluation(cubicFeet, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertCupsToGallons (String InputTempNumText, String StudentTempResponseText) {
		double cups = Double.parseDouble(InputTempNumText);
		BigDecimal gallons = new BigDecimal(cups / 16);
		
		return ConversionVerifier.verifyEvaluation(gallons, new BigDecimal(StudentTempResponseText));
	}
	
}
