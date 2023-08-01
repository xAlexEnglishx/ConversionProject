package Temperatures;
import javax.swing.*;
import java.awt.event.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class Celsius {
	
	//Celsius conversions
	public static boolean convertCelsiusToCelsius (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double celsius = Double.parseDouble(InputTempNumText);
		
		System.out.println("1: " + celsius + " , 2: "+ celsius + " , 3: " +
				String.valueOf(df.format(celsius)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(celsius)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean convertCelsiusToFahrenheit (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double celsius = Double.parseDouble(InputTempNumText);
//			(0°C × 9/5) + 32
		double fahrenheit = (celsius * 9/5) + 32;
		
		System.out.println("1: " + fahrenheit + " , 2: "+ fahrenheit + " , 3: " +
				String.valueOf(df.format(fahrenheit)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(fahrenheit)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean convertCelsiusToKelvin (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double celsius = Double.parseDouble(InputTempNumText);
//			0°C + 273.15
		double kelvin = celsius + 273.15;
		
		System.out.println("1: " + kelvin + " , 2: "+ kelvin + " , 3: " +
				String.valueOf(df.format(kelvin)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(kelvin)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean convertCelsiusToRankine (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double celsius = Double.parseDouble(InputTempNumText);
//			0°C × 9/5 + 491.67
		double rankine = celsius * 9/5 + 491.67;
		
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
