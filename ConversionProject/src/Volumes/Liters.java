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
		
		System.out.println("f: " + liters + " , fahrenheit: "+ liters + " , calcedfahrenheit" +
				String.valueOf(df.format(liters)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
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
		
		System.out.println("f: " + tablespoons + " , celsius: "+ tablespoons + " , calcedC" +
				String.valueOf(df.format(tablespoons)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
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
		
		System.out.println("f: " + cubicInches + " , celsius: "+ cubicInches + " , calcedC" +
				String.valueOf(df.format(cubicInches)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
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
		
		System.out.println("f: " + cups + " , celsius: "+ cups + " , calcedC" +
				String.valueOf(df.format(cups)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
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
		
		System.out.println("f: " + cubicFeet + " , celsius: "+ cubicFeet + " , calcedC" +
				String.valueOf(df.format(cubicFeet)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
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
		
		System.out.println("f: " + gallons + " , celsius: "+ gallons + " , calcedC" +
				String.valueOf(df.format(gallons)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(gallons)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
}
