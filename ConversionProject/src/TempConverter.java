import javax.swing.*;

import Temperatures.Celsius;
import Temperatures.Fahrenheit;
import Temperatures.Kelvin;
import Temperatures.Rankine;

import java.awt.event.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class TempConverter {
	
	public static boolean evaluateTempConversion(String InputNumberText, String StudentResponseText, 
										TemperatureEnum InputUnitDropdown, TemperatureEnum TargetUnitDropdown) {
		
		boolean evaluation = false;
		
		//Determine Input Temperature Unit
		switch (InputUnitDropdown) {
	        case FAHRENHEIT : evaluation = convertFromFahrenheit(InputNumberText, StudentResponseText, TargetUnitDropdown);
	                 break;
	        case CELSIUS : evaluation = convertFromCelsius(InputNumberText, StudentResponseText, TargetUnitDropdown);
	                 break;
	        case KELVIN : evaluation = convertFromKelvin(InputNumberText, StudentResponseText, TargetUnitDropdown);
	                 break;
	        case RANKINE : evaluation = convertFromRankine(InputNumberText, StudentResponseText, TargetUnitDropdown);
	                 break;
	        default: return false;
		}
		
		return evaluation;
	}
	
	private static boolean convertFromFahrenheit (String InputNumberText, String StudentResponseText, 
													TemperatureEnum TargetUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Temperature Unit
		switch (TargetUnitDropdown) {
	        case FAHRENHEIT : evaluation = Fahrenheit.convertFahrenheitToFahrenheit(InputNumberText, StudentResponseText);
	                 break;
	        case CELSIUS : evaluation = Fahrenheit.convertFahrenheitToCelsius(InputNumberText, StudentResponseText);
	                 break;
	        case KELVIN : evaluation = Fahrenheit.convertFahrenheitToKelvin(InputNumberText, StudentResponseText);
	                 break;
	        case RANKINE : evaluation = Fahrenheit.convertFahrenheitToRankine(InputNumberText, StudentResponseText);
	                 break;
	        default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromCelsius (String InputNumberText, String StudentResponseText, 
												TemperatureEnum TargetUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Temperature Unit
		switch (TargetUnitDropdown) {
	        case FAHRENHEIT : evaluation = Celsius.convertCelsiusToFahrenheit(InputNumberText, StudentResponseText);
	                 break;
	        case CELSIUS : evaluation = Celsius.convertCelsiusToCelsius(InputNumberText, StudentResponseText);
	                 break;
	        case KELVIN : evaluation = Celsius.convertCelsiusToKelvin(InputNumberText, StudentResponseText);
	                 break;
	        case RANKINE : evaluation = Celsius.convertCelsiusToRankine(InputNumberText, StudentResponseText);
	                 break;
	        default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromKelvin (String InputNumberText, String StudentResponseText, 
												TemperatureEnum TargetUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Temperature Unit
		switch (TargetUnitDropdown) {
	        case FAHRENHEIT : evaluation = Kelvin.convertKelvinToFahrenheit(InputNumberText, StudentResponseText);
	                 break;
	        case CELSIUS : evaluation = Kelvin.convertKelvinToCelsius(InputNumberText, StudentResponseText);
	                 break;
	        case KELVIN : evaluation = Kelvin.convertKelvinToKelvin(InputNumberText, StudentResponseText);
	                 break;
	        case RANKINE : evaluation = Kelvin.convertKelvinToRankine(InputNumberText, StudentResponseText);
	                 break;
	        default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromRankine (String InputNumberText, String StudentResponseText, 
												TemperatureEnum TargetUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Temperature Unit
		switch (TargetUnitDropdown) {
	        case FAHRENHEIT : evaluation = Rankine.convertRankineToFahrenheit(InputNumberText, StudentResponseText);
	                 break;
	        case CELSIUS : evaluation = Rankine.convertRankineToCelsius(InputNumberText, StudentResponseText);
	                 break;
	        case KELVIN : evaluation = Rankine.convertRankineToKelvin(InputNumberText, StudentResponseText);
	                 break;
	        case RANKINE : evaluation = Rankine.convertRankineToRankine(InputNumberText, StudentResponseText);
	                 break;
	        default: return false;
		}
		return evaluation;
	}
	
	public static boolean isPastAbsoluteZero(String InputNumberText, String StudentResponseText, 
											TemperatureEnum InputUnitDropdown, TemperatureEnum TargetUnitDropdown) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.HALF_UP);
		boolean evaluation = false;
		
		//Determine Past Absolute Zero
		switch (InputUnitDropdown) {
	        case FAHRENHEIT : if (Double.parseDouble(df.format(Double.parseDouble(InputNumberText))) < -459.7) {
						        	evaluation = true;
						        }
	                 break;
	        case CELSIUS : if (Double.parseDouble(df.format(Double.parseDouble(InputNumberText))) < -273.2) {
					        	evaluation = true;
					        }
	                 break;
	        case KELVIN : if (Double.parseDouble(df.format(Double.parseDouble(InputNumberText))) < -0) {
					        	evaluation = true;
					        }
	                 break;
	        case RANKINE : if (Double.parseDouble(df.format(Double.parseDouble(InputNumberText))) < -0) {
					        	evaluation = true;
					        }
	                 break;
	        default: return false;
		}
		switch (TargetUnitDropdown) {
	        case FAHRENHEIT : if (Double.parseDouble(df.format(Double.parseDouble(StudentResponseText))) < -459.7) {
						        	evaluation = true;
						        }
	                 break;
	        case CELSIUS : if (Double.parseDouble(df.format(Double.parseDouble(StudentResponseText))) < -273.2) {
					        	evaluation = true;
					        }
	                 break;
	        case KELVIN : if (Double.parseDouble(df.format(Double.parseDouble(StudentResponseText))) < -0) {
					        	evaluation = true;
					        }
	                 break;
	        case RANKINE : if (Double.parseDouble(df.format(Double.parseDouble(StudentResponseText))) < -0) {
					        	evaluation = true;
					        }
	                 break;
	        default: return false;
		}
		return evaluation;
	}

}
