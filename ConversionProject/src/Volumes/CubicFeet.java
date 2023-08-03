package Volumes;
import javax.swing.*;
import java.awt.event.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class CubicFeet {
	
	//Cubic Feet conversions
	public static boolean convertCubicFeetToCubicFeet (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double cubicFeet = Double.parseDouble(InputTempNumText);
		
		if (String.valueOf(df.format(cubicFeet)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertCubicFeetToLiters (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double cubicFeet = Double.parseDouble(InputTempNumText);
		double liters = cubicFeet * 28.317;
		
		if (String.valueOf(df.format(liters)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertCubicFeetToTablespoons (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double cubicFeet = Double.parseDouble(InputTempNumText);
		double tablespoons = cubicFeet * 1915;
		
		if (String.valueOf(df.format(tablespoons)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertCubicFeetToCubicInches (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double cubicFeet = Double.parseDouble(InputTempNumText);
		double cubicInches = cubicFeet * 1728;
		
		if (String.valueOf(df.format(cubicInches)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertCubicFeetToCups (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double cubicFeet = Double.parseDouble(InputTempNumText);
		double cups = cubicFeet * 119.7;
		
		if (String.valueOf(df.format(cups)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertCubicFeetToGallons (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double cubicFeet = Double.parseDouble(InputTempNumText);
		double gallons = cubicFeet * 7.481;
		
		if (String.valueOf(df.format(gallons)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
}
