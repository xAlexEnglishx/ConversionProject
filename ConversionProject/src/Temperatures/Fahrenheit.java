package Temperatures;
import javax.swing.*;
import java.awt.event.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class Fahrenheit {
	
	//Fahrenheit conversions
	public static boolean convertFahrenheitToFahrenheit (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double fahrenheit = Double.parseDouble(InputTempNumText);
		
		System.out.println("f: " + fahrenheit + " , fahrenheit: "+ fahrenheit + " , calcedfahrenheit" +
				String.valueOf(df.format(fahrenheit)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(fahrenheit)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean convertFahrenheitToCelsius (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double fahrenheit = Double.parseDouble(InputTempNumText);
		double celsius = (fahrenheit - 32) * 5 / 9;
		
		System.out.println("f: " + fahrenheit + " , celsius: "+ celsius + " , calcedC" +
				String.valueOf(df.format(celsius)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(celsius)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean convertFahrenheitToKelvin (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double fahrenheit = Double.parseDouble(InputTempNumText);
		//273.15 + ((F - 32.0) * (5.0/9.0))
		double kelvin = 273.15 + ((fahrenheit - 32.0) * (5.0/9.0));
		
		System.out.println("f: " + fahrenheit + " , kelvin: "+ kelvin + " , calcedkelvin" +
				String.valueOf(df.format(kelvin)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(kelvin)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean convertFahrenheitToRankine (String InputTempNumText, String StudentTempResponseText) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		double studentTempResponse = Double.parseDouble(StudentTempResponseText);
		double fahrenheit = Double.parseDouble(InputTempNumText);
		//32°F + 459.67
		double rankine = fahrenheit + 459.67;
		
		System.out.println("f: " + fahrenheit + " , rankine: "+ rankine + " , calcedrankine" +
				String.valueOf(df.format(rankine)) + " , student: " + String.valueOf(df.format(studentTempResponse)));
		
		if (String.valueOf(df.format(rankine)).equals(String.valueOf(df.format(studentTempResponse)))) {
			System.out.println("MADE IT");
			return true;
		} else {
			return false;
		}
	}
}
