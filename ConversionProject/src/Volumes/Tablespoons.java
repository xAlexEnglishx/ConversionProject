package Volumes;
import javax.swing.*;
import java.awt.event.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class Tablespoons {

	//Tablespoons conversions
	public static boolean convertTablespoonsToTablespoons (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double tablespoons = Double.parseDouble(InputTempNumText);
		
		if (String.valueOf(df.format(tablespoons)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertTablespoonsToLiters (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double tablespoons = Double.parseDouble(InputTempNumText);
		double liters = tablespoons / 67.628;
		
		if (String.valueOf(df.format(liters)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertTablespoonsToCubicInches (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double tablespoons = Double.parseDouble(InputTempNumText);
		double cubicInches = tablespoons / 1.108;
		
		if (String.valueOf(df.format(cubicInches)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertTablespoonsToCups (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double tablespoons = Double.parseDouble(InputTempNumText);
		double cups = tablespoons / 16;
		
		if (String.valueOf(df.format(cups)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertTablespoonsToCubicFeet (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double tablespoons = Double.parseDouble(InputTempNumText);
		double cubicFeet = tablespoons / 1915;
		
		if (String.valueOf(df.format(cubicFeet)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertTablespoonsToGallons (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double tablespoons = Double.parseDouble(InputTempNumText);
		double gallons = tablespoons / 265;
		
		if (String.valueOf(df.format(gallons)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
}
