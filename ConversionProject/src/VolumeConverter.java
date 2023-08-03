import javax.swing.*;
import java.awt.event.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

import Volumes.CubicFeet;
import Volumes.CubicInches;
import Volumes.Cups;
import Volumes.Gallons;
import Volumes.Liters;
import Volumes.Tablespoons;

public class VolumeConverter {
	
	public static boolean evaluateVolConversion(String InputTempNumText, String StudentTempResponseText, 
											VolumeEnum InputTempUnitDropdown, VolumeEnum TargetTempUnitDropdown) {
		System.out.println("test789" + " , " 
				+ InputTempNumText + " , " 
				+ StudentTempResponseText + " , " 
				+ InputTempUnitDropdown + " , " 
				+ TargetTempUnitDropdown);
		
		boolean evaluation = false;
		
		//Determine Input Volume Unit
		switch (InputTempUnitDropdown) {
	        case LITERS : evaluation = convertFromLiters(InputTempNumText, StudentTempResponseText, 
											TargetTempUnitDropdown);
	                 break;
	        case TABLESPOONS : evaluation = convertFromTablespoons(InputTempNumText, StudentTempResponseText, 
											TargetTempUnitDropdown);
	                 break;
	        case CUBIC_INCHES : evaluation = convertFromCubicInches(InputTempNumText, StudentTempResponseText, 
											TargetTempUnitDropdown);
	                 break;
	        case CUPS : evaluation = convertFromCups(InputTempNumText, StudentTempResponseText, 
											TargetTempUnitDropdown);
	                 break;
	        case CUBIC_FEET : evaluation = convertFromCubicFeet(InputTempNumText, StudentTempResponseText, 
											TargetTempUnitDropdown);
	        		 break;
	        case GALLONS : evaluation = convertFromGallons(InputTempNumText, StudentTempResponseText, 
											TargetTempUnitDropdown);
	        		 break;
	        default: return false;
		}
		
		return evaluation;
	}
	
	private static boolean convertFromLiters (String InputTempNumText, String StudentTempResponseText, 
												VolumeEnum TargetTempUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Volume Unit
		switch (TargetTempUnitDropdown) {
	        case LITERS : evaluation = Liters.convertLitersToLiters(InputTempNumText, StudentTempResponseText);
	                break;
	        case TABLESPOONS : evaluation = Liters.convertLitersToTablespoons(InputTempNumText, StudentTempResponseText);
					break;
			case CUBIC_INCHES : evaluation = Liters.convertLitersToCubicInches(InputTempNumText, StudentTempResponseText);
					break;
			case CUPS : evaluation = Liters.convertLitersToCups(InputTempNumText, StudentTempResponseText);
					break;
			case CUBIC_FEET : evaluation = Liters.convertLitersToCubicFeet(InputTempNumText, StudentTempResponseText);
					break;
			case GALLONS : evaluation = Liters.convertLitersToGallons(InputTempNumText, StudentTempResponseText);
					break;
			default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromTablespoons (String InputTempNumText, String StudentTempResponseText, 
													VolumeEnum TargetTempUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Volume Unit
		switch (TargetTempUnitDropdown) {
	        case LITERS : evaluation = Tablespoons.convertTablespoonsToLiters(InputTempNumText, StudentTempResponseText);
	                break;
	        case TABLESPOONS : evaluation = Tablespoons.convertTablespoonsToTablespoons(InputTempNumText, StudentTempResponseText);
					break;
			case CUBIC_INCHES : evaluation = Tablespoons.convertTablespoonsToCubicInches(InputTempNumText, StudentTempResponseText);
					break;
			case CUPS : evaluation = Tablespoons.convertTablespoonsToCups(InputTempNumText, StudentTempResponseText);
					break;
			case CUBIC_FEET : evaluation = Tablespoons.convertTablespoonsToCubicFeet(InputTempNumText, StudentTempResponseText);
					break;
			case GALLONS : evaluation = Tablespoons.convertTablespoonsToGallons(InputTempNumText, StudentTempResponseText);
					break;
			default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromCubicInches (String InputTempNumText, String StudentTempResponseText, 
													VolumeEnum TargetTempUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Volume Unit
		switch (TargetTempUnitDropdown) {
			case LITERS : evaluation = CubicInches.convertCubicInchesToLiters(InputTempNumText, StudentTempResponseText);
			        break;
			case TABLESPOONS : evaluation = CubicInches.convertCubicInchesToTablespoons(InputTempNumText, StudentTempResponseText);
					break;
			case CUBIC_INCHES : evaluation = CubicInches.convertCubicInchesToCubicInches(InputTempNumText, StudentTempResponseText);
					break;
			case CUPS : evaluation = CubicInches.convertCubicInchesToCups(InputTempNumText, StudentTempResponseText);
					break;
			case CUBIC_FEET : evaluation = CubicInches.convertCubicInchesToCubicFeet(InputTempNumText, StudentTempResponseText);
					break;
			case GALLONS : evaluation = CubicInches.convertCubicInchesToGallons(InputTempNumText, StudentTempResponseText);
					break;
			default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromCups (String InputTempNumText, String StudentTempResponseText, 
											VolumeEnum TargetTempUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Volume Unit
		switch (TargetTempUnitDropdown) {
			case LITERS : evaluation = Cups.convertCupsToLiters(InputTempNumText, StudentTempResponseText);
	        		break;
			case TABLESPOONS : evaluation = Cups.convertCupsToTablespoons(InputTempNumText, StudentTempResponseText);
					break;
			case CUBIC_INCHES : evaluation = Cups.convertCupsToCubicInches(InputTempNumText, StudentTempResponseText);
					break;
			case CUPS : evaluation = Cups.convertCupsToCups(InputTempNumText, StudentTempResponseText);
					break;
			case CUBIC_FEET : evaluation = Cups.convertCupsToCubicFeet(InputTempNumText, StudentTempResponseText);
					break;
			case GALLONS : evaluation = Cups.convertCupsToGallons(InputTempNumText, StudentTempResponseText);
					break;
			default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromCubicFeet (String InputTempNumText, String StudentTempResponseText, 
				VolumeEnum TargetTempUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Volume Unit
		switch (TargetTempUnitDropdown) {
			case LITERS : evaluation = CubicFeet.convertCubicFeetToLiters(InputTempNumText, StudentTempResponseText);
					break;
			case TABLESPOONS : evaluation = CubicFeet.convertCubicFeetToTablespoons(InputTempNumText, StudentTempResponseText);
					break;
			case CUBIC_INCHES : evaluation = CubicFeet.convertCubicFeetToCubicInches(InputTempNumText, StudentTempResponseText);
					break;
			case CUPS : evaluation = CubicFeet.convertCubicFeetToCups(InputTempNumText, StudentTempResponseText);
					break;
			case CUBIC_FEET : evaluation = CubicFeet.convertCubicFeetToCubicFeet(InputTempNumText, StudentTempResponseText);
					break;
			case GALLONS : evaluation = CubicFeet.convertCubicFeetToGallons(InputTempNumText, StudentTempResponseText);
					break;
			default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromGallons (String InputTempNumText, String StudentTempResponseText, 
				VolumeEnum TargetTempUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Volume Unit
		switch (TargetTempUnitDropdown) {
			case LITERS : evaluation = Gallons.convertGallonsToLiters(InputTempNumText, StudentTempResponseText);
					break;
			case TABLESPOONS : evaluation = Gallons.convertGallonsToTablespoons(InputTempNumText, StudentTempResponseText);
					break;
			case CUBIC_INCHES : evaluation = Gallons.convertGallonsToCubicInches(InputTempNumText, StudentTempResponseText);
					break;
			case CUPS : evaluation = Gallons.convertGallonsToCups(InputTempNumText, StudentTempResponseText);
					break;
			case CUBIC_FEET : evaluation = Gallons.convertGallonsToCubicFeet(InputTempNumText, StudentTempResponseText);
					break;
			case GALLONS : evaluation = Gallons.convertGallonsToGallons(InputTempNumText, StudentTempResponseText);
					break;
			default: return false;
		}
		return evaluation;
	}
	
	public static boolean verifyInputs(String InputTempNumText, String StudentTempResponseText) {
		boolean VertifyInputTempNumText = Pattern.matches("^-?\\d+(\\.\\d{1,1})?$", InputTempNumText);
		boolean VerifyStudentTempResponseText = Pattern.matches("^-?\\d+(\\.\\d{1,1})?$", StudentTempResponseText);
		if (VertifyInputTempNumText == true && VerifyStudentTempResponseText == true) {
			return true;
		} else {
			return false;
		}
	}
	
}
