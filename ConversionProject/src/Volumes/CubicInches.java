package Volumes;
import javax.swing.*;
import java.awt.event.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class CubicInches {

	//Cubic Inches conversions
	public static boolean convertCubicInchesToCubicInches (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double cubicInches = Double.parseDouble(InputTempNumText);
		
		if (String.valueOf(df.format(cubicInches)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertCubicInchesToLiters (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double cubicInches = Double.parseDouble(InputTempNumText);
		double liters = cubicInches / 61.024;
		
		if (String.valueOf(df.format(liters)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertCubicInchesToTablespoons (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double cubicInches = Double.parseDouble(InputTempNumText);
		double tablespoons = cubicInches * 1.108;
		
		if (String.valueOf(df.format(tablespoons)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertCubicInchesToCups (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double cubicInches = Double.parseDouble(InputTempNumText);
		double cups = cubicInches / 14.438;
		
		if (String.valueOf(df.format(cups)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertCubicInchesToCubicFeet (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double cubicInches = Double.parseDouble(InputTempNumText);
		double cubicFeet = cubicInches / 1728;
		
		if (String.valueOf(df.format(cubicFeet)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertCubicInchesToGallons (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double cubicInches = Double.parseDouble(InputTempNumText);
		double gallons = cubicInches / 231;
		
		if (String.valueOf(df.format(gallons)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
}
