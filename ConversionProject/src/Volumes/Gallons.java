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
	public static boolean convertGallonsToGallons (String InputTempNumText, String StudentTempResponseText) {
		BigDecimal gallons = new BigDecimal(InputTempNumText);
		
		return ConversionVerifier.verifyEvaluation(gallons, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertGallonsToLiters (String InputTempNumText, String StudentTempResponseText) {
		double gallons = Double.parseDouble(InputTempNumText);
		BigDecimal liters = new BigDecimal(gallons * 3.785);
		
		return ConversionVerifier.verifyEvaluation(liters, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertGallonsToTablespoons (String InputTempNumText, String StudentTempResponseText) {
		double gallons = Double.parseDouble(InputTempNumText);
		BigDecimal tablespoons = new BigDecimal(gallons * 256);
		
		return ConversionVerifier.verifyEvaluation(tablespoons, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertGallonsToCubicInches (String InputTempNumText, String StudentTempResponseText) {
		double gallons = Double.parseDouble(InputTempNumText);
		BigDecimal cubicInches = new BigDecimal(gallons * 231);
		
		return ConversionVerifier.verifyEvaluation(cubicInches, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertGallonsToCubicFeet (String InputTempNumText, String StudentTempResponseText) {
		double gallons = Double.parseDouble(InputTempNumText);
		BigDecimal cubicFeet = new BigDecimal(gallons / 7.48);
		
		return ConversionVerifier.verifyEvaluation(cubicFeet, new BigDecimal(StudentTempResponseText));
	}
	
	public static boolean convertGallonsToCups (String InputTempNumText, String StudentTempResponseText) {
		double gallons = Double.parseDouble(InputTempNumText);
		BigDecimal cups = new BigDecimal(gallons * 16);
		
		return ConversionVerifier.verifyEvaluation(cups, new BigDecimal(StudentTempResponseText));
	}
	
}
