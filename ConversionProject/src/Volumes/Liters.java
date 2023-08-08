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
	public static boolean convertLitersToLiters (String InputTempNumText, String StudentTempResponseText) {
		BigDecimal liters = new BigDecimal(InputTempNumText);
		
		return ConversionVerifier.verifyEvaluation(liters, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertLitersToTablespoons (String InputTempNumText, String StudentTempResponseText) {
		double liters = Double.parseDouble(InputTempNumText);
		BigDecimal tablespoons = new BigDecimal(liters * 67.628);
		
		return ConversionVerifier.verifyEvaluation(tablespoons, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertLitersToCubicInches (String InputTempNumText, String StudentTempResponseText) {
		double liters = Double.parseDouble(InputTempNumText);
		BigDecimal cubicInches = new BigDecimal(liters * 61.024);
		
		return ConversionVerifier.verifyEvaluation(cubicInches, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertLitersToCups (String InputTempNumText, String StudentTempResponseText) {
		double liters = Double.parseDouble(InputTempNumText);
		BigDecimal cups = new BigDecimal(liters * 4.227);
		
		return ConversionVerifier.verifyEvaluation(cups, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertLitersToCubicFeet (String InputTempNumText, String StudentTempResponseText) {
		double liters = Double.parseDouble(InputTempNumText);
		BigDecimal cubicFeet = new BigDecimal(liters / 28.317);
		
		return ConversionVerifier.verifyEvaluation(cubicFeet, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertLitersToGallons (String InputTempNumText, String StudentTempResponseText) {
		double liters = Double.parseDouble(InputTempNumText);
		BigDecimal gallons = new BigDecimal(liters / 3.785);
		
		return ConversionVerifier.verifyEvaluation(gallons, new BigDecimal(StudentTempResponseText));
	}
	
}
