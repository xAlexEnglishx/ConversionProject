package Volumes;
import javax.swing.*;
import java.awt.event.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class Tablespoons {
	
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
	
	//Tablespoons conversions
	public static boolean convertTablespoonsToTablespoons (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double tablespoons = Double.parseDouble(InputTempNumText);
		
		if (String.valueOf(df.format(tablespoons)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
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
			System.out.println("MADE IT");
			return true;
		} else {
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
			System.out.println("MADE IT");
			return true;
		} else {
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
			System.out.println("MADE IT");
			return true;
		} else {
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
			System.out.println("MADE IT");
			return true;
		} else {
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
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
//	public static boolean convertLitersToCubicInches (String InputTempNumText, String StudentTempResponseText) {
//		DecimalFormat df = new DecimalFormat("#.0");
//		df.setRoundingMode(RoundingMode.DOWN);
//		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
//		double liters = Double.parseDouble(InputTempNumText);
//		double cubicInches = liters * 61.024;
//		
//		System.out.println("1: " + cubicInches + " , 2: "+ cubicInches + " , 3" +
//				String.valueOf(df.format(cubicInches)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
//		
//		if (String.valueOf(df.format(cubicInches)).equals(String.valueOf(df.format(studentTempResponse)))) {
//			System.out.println("MADE IT");
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//	public static boolean convertLitersToCups (String InputTempNumText, String StudentTempResponseText) {
//		DecimalFormat df = new DecimalFormat("#.0");
//		df.setRoundingMode(RoundingMode.DOWN);
//		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
//		double liters = Double.parseDouble(InputTempNumText);
//		double cups = liters * 4.227;
//		
//		System.out.println("1: " + cups + " , 2: "+ cups + " , 3" +
//				String.valueOf(df.format(cups)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
//		
//		if (String.valueOf(df.format(cups)).equals(String.valueOf(df.format(studentTempResponse)))) {
//			System.out.println("MADE IT");
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//	public static boolean convertLitersToCubicFeet (String InputTempNumText, String StudentTempResponseText) {
//		DecimalFormat df = new DecimalFormat("#.0");
//		df.setRoundingMode(RoundingMode.DOWN);
//		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
//		double liters = Double.parseDouble(InputTempNumText);
//		double cubicFeet = liters / 28.317;
//		
//		System.out.println("1: " + cubicFeet + " , 2: "+ cubicFeet + " , 3" +
//				String.valueOf(df.format(cubicFeet)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
//		
//		if (String.valueOf(df.format(cubicFeet)).equals(String.valueOf(df.format(studentTempResponse)))) {
//			System.out.println("MADE IT");
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//	public static boolean convertLitersToGallons (String InputTempNumText, String StudentTempResponseText) {
//		DecimalFormat df = new DecimalFormat("#.0");
//		df.setRoundingMode(RoundingMode.DOWN);
//		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
//		double liters = Double.parseDouble(InputTempNumText);
//		double gallons = liters / 3.785;
//		
//		System.out.println("1: " + gallons + " , 2: "+ gallons + " , 3" +
//				String.valueOf(df.format(gallons)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
//		
//		if (String.valueOf(df.format(gallons)).equals(String.valueOf(df.format(studentTempResponse)))) {
//			System.out.println("MADE IT");
//			return true;
//		} else {
//			return false;
//		}
//	}
	
}
