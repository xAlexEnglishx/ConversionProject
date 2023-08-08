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
	
	public static boolean evaluateVolConversion(String InputNumberText, String StudentResponseText, 
											VolumeEnum InputUnitDropdown, VolumeEnum TargetUnitDropdown) {
		
		boolean evaluation = false;
		
		//Determine Input Volume Unit
		switch (InputUnitDropdown) {
	        case LITERS : evaluation = convertFromLiters(InputNumberText, StudentResponseText, 
	        								TargetUnitDropdown);
	                 break;
	        case TABLESPOONS : evaluation = convertFromTablespoons(InputNumberText, StudentResponseText, 
	        								TargetUnitDropdown);
	                 break;
	        case CUBIC_INCHES : evaluation = convertFromCubicInches(InputNumberText, StudentResponseText, 
	        								TargetUnitDropdown);
	                 break;
	        case CUPS : evaluation = convertFromCups(InputNumberText, StudentResponseText, 
	        								TargetUnitDropdown);
	                 break;
	        case CUBIC_FEET : evaluation = convertFromCubicFeet(InputNumberText, StudentResponseText, 
	        								TargetUnitDropdown);
	        		 break;
	        case GALLONS : evaluation = convertFromGallons(InputNumberText, StudentResponseText, 
	        								TargetUnitDropdown);
	        		 break;
	        default: return false;
		}
		
		return evaluation;
	}
	
	private static boolean convertFromLiters (String InputNumberText, String StudentResponseText, 
												VolumeEnum TargetUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Volume Unit
		switch (TargetUnitDropdown) {
	        case LITERS : evaluation = Liters.convertLitersToLiters(InputNumberText, StudentResponseText);
	                break;
	        case TABLESPOONS : evaluation = Liters.convertLitersToTablespoons(InputNumberText, StudentResponseText);
					break;
			case CUBIC_INCHES : evaluation = Liters.convertLitersToCubicInches(InputNumberText, StudentResponseText);
					break;
			case CUPS : evaluation = Liters.convertLitersToCups(InputNumberText, StudentResponseText);
					break;
			case CUBIC_FEET : evaluation = Liters.convertLitersToCubicFeet(InputNumberText, StudentResponseText);
					break;
			case GALLONS : evaluation = Liters.convertLitersToGallons(InputNumberText, StudentResponseText);
					break;
			default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromTablespoons (String InputNumberText, String StudentResponseText, 
													VolumeEnum TargetUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Volume Unit
		switch (TargetUnitDropdown) {
	        case LITERS : evaluation = Tablespoons.convertTablespoonsToLiters(InputNumberText, StudentResponseText);
	                break;
	        case TABLESPOONS : evaluation = Tablespoons.convertTablespoonsToTablespoons(InputNumberText, StudentResponseText);
					break;
			case CUBIC_INCHES : evaluation = Tablespoons.convertTablespoonsToCubicInches(InputNumberText, StudentResponseText);
					break;
			case CUPS : evaluation = Tablespoons.convertTablespoonsToCups(InputNumberText, StudentResponseText);
					break;
			case CUBIC_FEET : evaluation = Tablespoons.convertTablespoonsToCubicFeet(InputNumberText, StudentResponseText);
					break;
			case GALLONS : evaluation = Tablespoons.convertTablespoonsToGallons(InputNumberText, StudentResponseText);
					break;
			default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromCubicInches (String InputNumberText, String StudentResponseText, 
													VolumeEnum TargetUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Volume Unit
		switch (TargetUnitDropdown) {
			case LITERS : evaluation = CubicInches.convertCubicInchesToLiters(InputNumberText, StudentResponseText);
			        break;
			case TABLESPOONS : evaluation = CubicInches.convertCubicInchesToTablespoons(InputNumberText, StudentResponseText);
					break;
			case CUBIC_INCHES : evaluation = CubicInches.convertCubicInchesToCubicInches(InputNumberText, StudentResponseText);
					break;
			case CUPS : evaluation = CubicInches.convertCubicInchesToCups(InputNumberText, StudentResponseText);
					break;
			case CUBIC_FEET : evaluation = CubicInches.convertCubicInchesToCubicFeet(InputNumberText, StudentResponseText);
					break;
			case GALLONS : evaluation = CubicInches.convertCubicInchesToGallons(InputNumberText, StudentResponseText);
					break;
			default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromCups (String InputNumberText, String StudentResponseText, 
											VolumeEnum TargetUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Volume Unit
		switch (TargetUnitDropdown) {
			case LITERS : evaluation = Cups.convertCupsToLiters(InputNumberText, StudentResponseText);
	        		break;
			case TABLESPOONS : evaluation = Cups.convertCupsToTablespoons(InputNumberText, StudentResponseText);
					break;
			case CUBIC_INCHES : evaluation = Cups.convertCupsToCubicInches(InputNumberText, StudentResponseText);
					break;
			case CUPS : evaluation = Cups.convertCupsToCups(InputNumberText, StudentResponseText);
					break;
			case CUBIC_FEET : evaluation = Cups.convertCupsToCubicFeet(InputNumberText, StudentResponseText);
					break;
			case GALLONS : evaluation = Cups.convertCupsToGallons(InputNumberText, StudentResponseText);
					break;
			default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromCubicFeet (String InputNumberText, String StudentResponseText, 
												 VolumeEnum TargetUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Volume Unit
		switch (TargetUnitDropdown) {
			case LITERS : evaluation = CubicFeet.convertCubicFeetToLiters(InputNumberText, StudentResponseText);
					break;
			case TABLESPOONS : evaluation = CubicFeet.convertCubicFeetToTablespoons(InputNumberText, StudentResponseText);
					break;
			case CUBIC_INCHES : evaluation = CubicFeet.convertCubicFeetToCubicInches(InputNumberText, StudentResponseText);
					break;
			case CUPS : evaluation = CubicFeet.convertCubicFeetToCups(InputNumberText, StudentResponseText);
					break;
			case CUBIC_FEET : evaluation = CubicFeet.convertCubicFeetToCubicFeet(InputNumberText, StudentResponseText);
					break;
			case GALLONS : evaluation = CubicFeet.convertCubicFeetToGallons(InputNumberText, StudentResponseText);
					break;
			default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromGallons (String InputNumberText, String StudentResponseText, 
											   VolumeEnum TargetUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Volume Unit
		switch (TargetUnitDropdown) {
			case LITERS : evaluation = Gallons.convertGallonsToLiters(InputNumberText, StudentResponseText);
					break;
			case TABLESPOONS : evaluation = Gallons.convertGallonsToTablespoons(InputNumberText, StudentResponseText);
					break;
			case CUBIC_INCHES : evaluation = Gallons.convertGallonsToCubicInches(InputNumberText, StudentResponseText);
					break;
			case CUPS : evaluation = Gallons.convertGallonsToCups(InputNumberText, StudentResponseText);
					break;
			case CUBIC_FEET : evaluation = Gallons.convertGallonsToCubicFeet(InputNumberText, StudentResponseText);
					break;
			case GALLONS : evaluation = Gallons.convertGallonsToGallons(InputNumberText, StudentResponseText);
					break;
			default: return false;
		}
		return evaluation;
	}
	
}
