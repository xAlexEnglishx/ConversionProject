package Temperatures;
import javax.swing.*;
import java.awt.event.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class Rankine {
	
	//Rankine conversions
	public static boolean convertRankineToRankine (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double rankine = Double.parseDouble(InputTempNumText);
		
		System.out.println("1: " + rankine + " , 2: "+ rankine + " , 3: " +
				String.valueOf(df.format(rankine)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(rankine)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean convertRankineToFahrenheit (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double rankine = Double.parseDouble(InputTempNumText);
//			1°R − 459.67
		double fahrenheit = rankine - 459.67;
		
		System.out.println("1: " + fahrenheit + " , 2: "+ fahrenheit + " , 3: " +
				String.valueOf(df.format(fahrenheit)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(fahrenheit)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean convertRankineToCelsius (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double rankine = Double.parseDouble(InputTempNumText);
//			(1°R − 491.67) × 5/9
		double celsius = (rankine - 491.67) * 5/9;
		
		System.out.println("1: " + celsius + " , 2: "+ celsius + " , 3: " +
				String.valueOf(df.format(celsius)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(celsius)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean convertRankineToKelvin (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double rankine = Double.parseDouble(InputTempNumText);
//			1°R × 5/9
		double kelvin = rankine * 5/9;
		
		System.out.println("1: " + kelvin + " , 2: "+ kelvin + " , 3: " +
				String.valueOf(df.format(kelvin)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(kelvin)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
}
