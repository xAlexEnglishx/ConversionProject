package Volumes;
import javax.swing.*;
import java.awt.event.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class Liters {
	
//	LITERS,
//	TABLESPOONS,
//	CUBIC_INCHES,
//	CUPS,
//	CUBIC_FEET,
//	GALLONS
	
//	Liters
//	Tablespoons
//	CubicInches
//	Cups
//	CubicFeet
//	Gallons
	
	//Liter conversions
	public static boolean convertLitersToLiters (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double liters = Double.parseDouble(InputTempNumText);
		
		if (String.valueOf(df.format(liters)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean convertLitersToTablespoons (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double liters = Double.parseDouble(InputTempNumText);
		double tablespoons = liters * 67.628;
		
		if (String.valueOf(df.format(tablespoons)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean convertLitersToCubicInches (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double liters = Double.parseDouble(InputTempNumText);
		double cubicInches = liters * 61.024;
		
		if (String.valueOf(df.format(cubicInches)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean convertLitersToCups (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double liters = Double.parseDouble(InputTempNumText);
		double cups = liters * 4.227;
		
		if (String.valueOf(df.format(cups)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean convertLitersToCubicFeet (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double liters = Double.parseDouble(InputTempNumText);
		double cubicFeet = liters / 28.317;
		
		if (String.valueOf(df.format(cubicFeet)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean convertLitersToGallons (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double liters = Double.parseDouble(InputTempNumText);
		double gallons = liters / 3.785;
		
		if (String.valueOf(df.format(gallons)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
}
