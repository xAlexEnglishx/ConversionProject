package Temperatures;
import javax.swing.*;
import java.awt.event.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class Kelvin {
	
	//Kelvin conversions
	public static boolean convertKelvinToKelvin (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double kelvin = Double.parseDouble(InputTempNumText);
		
		if (String.valueOf(df.format(kelvin)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertKelvinToFahrenheit (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double kelvin = Double.parseDouble(InputTempNumText);
		double fahrenheit = (kelvin - 273.15) * 9/5 + 32;
		
		if (String.valueOf(df.format(fahrenheit)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertKelvinToCelsius (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double kelvin = Double.parseDouble(InputTempNumText);
		double celsius = kelvin - 273.15;
		
		if (String.valueOf(df.format(celsius)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
	
	public static boolean convertKelvinToRankine (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double kelvin = Double.parseDouble(InputTempNumText);
		double rankine = kelvin * 9/5;
		
		if (String.valueOf(df.format(rankine)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("Correct Calculation");
			return true;
		} else {
			System.out.println("Incorrect Calculation");
			return false;
		}
	}
}
