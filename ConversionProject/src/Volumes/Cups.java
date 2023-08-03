package Volumes;
import javax.swing.*;
import java.awt.event.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class Cups {

	//Cups conversions
	public static boolean convertCupsToCups (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double cups = Double.parseDouble(InputTempNumText);
		
		if (String.valueOf(df.format(cups)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertCupsToLiters (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double cups = Double.parseDouble(InputTempNumText);
		double liters = cups / 4.227;
		
		if (String.valueOf(df.format(liters)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertCupsToTablespoons (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double cups = Double.parseDouble(InputTempNumText);
		double tablespoons = cups * 16;
		
		if (String.valueOf(df.format(tablespoons)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertCupsToCubicInches (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double cups = Double.parseDouble(InputTempNumText);
		double cubicInches = cups * 14.438;
		
		if (String.valueOf(df.format(cubicInches)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertCupsToCubicFeet (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double cups = Double.parseDouble(InputTempNumText);
		double cubicFeet = cups / 119.7;
		
		if (String.valueOf(df.format(cubicFeet)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertCupsToGallons (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double cups = Double.parseDouble(InputTempNumText);
		double gallons = cups / 16;
		
		if (String.valueOf(df.format(gallons)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
}
