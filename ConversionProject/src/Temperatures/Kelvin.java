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
		
		System.out.println("1: " + kelvin + " , 2: "+ kelvin + " , 3: " +
				String.valueOf(df.format(kelvin)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(kelvin)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean convertKelvinToFahrenheit (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double kelvin = Double.parseDouble(InputTempNumText);
//			(0K − 273.15) × 9/5 + 32
		double fahrenheit = (kelvin - 273.15) * 9/5 + 32;
		
		System.out.println("1: " + fahrenheit + " , 2: "+ fahrenheit + " , 3: " +
				String.valueOf(df.format(fahrenheit)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(fahrenheit)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean convertKelvinToCelsius (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double kelvin = Double.parseDouble(InputTempNumText);
//			0K − 273.15 
		double celsius = kelvin - 273.15;
		
		System.out.println("1: " + celsius + " , 2: "+ celsius + " , 3: " +
				String.valueOf(df.format(celsius)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(celsius)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean convertKelvinToRankine (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double kelvin = Double.parseDouble(InputTempNumText);
//			K * 9/5
		double rankine = kelvin * 9/5;
		
		System.out.println("1: " + rankine + " , 2: "+ rankine + " , 3: " +
				String.valueOf(df.format(rankine)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(rankine)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
}
