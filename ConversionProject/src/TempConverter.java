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
	
	public static boolean evaluateTempConversion(String InputTempNumText, String StudentTempResponseText, 
										TemperatureEnum InputTempUnitDropdown, TemperatureEnum TargetTempUnitDropdown) {
		
		boolean evaluation = false;
		
		//Determine Input Temperature Unit
		switch (InputTempUnitDropdown) {
	        case FAHRENHEIT : evaluation = convertFromFahrenheit(InputTempNumText, StudentTempResponseText, 
											TargetTempUnitDropdown);
	                 break;
	        case CELSIUS : evaluation = convertFromCelsius(InputTempNumText, StudentTempResponseText, 
											TargetTempUnitDropdown);
	                 break;
	        case KELVIN : evaluation = convertFromKelvin(InputTempNumText, StudentTempResponseText, 
											TargetTempUnitDropdown);
	                 break;
	        case RANKINE : evaluation = convertFromRankine(InputTempNumText, StudentTempResponseText, 
											TargetTempUnitDropdown);
	                 break;
	        default: return false;
		}
		
		return evaluation;
	}
	
	private static boolean convertFromFahrenheit (String InputTempNumText, String StudentTempResponseText, 
													TemperatureEnum TargetTempUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Temperature Unit
		switch (TargetTempUnitDropdown) {
	        case FAHRENHEIT : evaluation = Fahrenheit.convertFahrenheitToFahrenheit(InputTempNumText, StudentTempResponseText);
	                 break;
	        case CELSIUS : evaluation = Fahrenheit.convertFahrenheitToCelsius(InputTempNumText, StudentTempResponseText);
	                 break;
	        case KELVIN : evaluation = Fahrenheit.convertFahrenheitToKelvin(InputTempNumText, StudentTempResponseText);
	                 break;
	        case RANKINE : evaluation = Fahrenheit.convertFahrenheitToRankine(InputTempNumText, StudentTempResponseText);
	                 break;
	        default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromCelsius (String InputTempNumText, String StudentTempResponseText, 
												TemperatureEnum TargetTempUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Temperature Unit
		switch (TargetTempUnitDropdown) {
	        case FAHRENHEIT : evaluation = Celsius.convertCelsiusToFahrenheit(InputTempNumText, StudentTempResponseText);
	                 break;
	        case CELSIUS : evaluation = Celsius.convertCelsiusToCelsius(InputTempNumText, StudentTempResponseText);
	                 break;
	        case KELVIN : evaluation = Celsius.convertCelsiusToKelvin(InputTempNumText, StudentTempResponseText);
	                 break;
	        case RANKINE : evaluation = Celsius.convertCelsiusToRankine(InputTempNumText, StudentTempResponseText);
	                 break;
	        default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromKelvin (String InputTempNumText, String StudentTempResponseText, 
												TemperatureEnum TargetTempUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Temperature Unit
		switch (TargetTempUnitDropdown) {
	        case FAHRENHEIT : evaluation = Kelvin.convertKelvinToFahrenheit(InputTempNumText, StudentTempResponseText);
	                 break;
	        case CELSIUS : evaluation = Kelvin.convertKelvinToCelsius(InputTempNumText, StudentTempResponseText);
	                 break;
	        case KELVIN : evaluation = Kelvin.convertKelvinToKelvin(InputTempNumText, StudentTempResponseText);
	                 break;
	        case RANKINE : evaluation = Kelvin.convertKelvinToRankine(InputTempNumText, StudentTempResponseText);
	                 break;
	        default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromRankine (String InputTempNumText, String StudentTempResponseText, 
												TemperatureEnum TargetTempUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Temperature Unit
		switch (TargetTempUnitDropdown) {
	        case FAHRENHEIT : evaluation = Rankine.convertRankineToFahrenheit(InputTempNumText, StudentTempResponseText);
	                 break;
	        case CELSIUS : evaluation = Rankine.convertRankineToCelsius(InputTempNumText, StudentTempResponseText);
	                 break;
	        case KELVIN : evaluation = Rankine.convertRankineToKelvin(InputTempNumText, StudentTempResponseText);
	                 break;
	        case RANKINE : evaluation = Rankine.convertRankineToRankine(InputTempNumText, StudentTempResponseText);
	                 break;
	        default: return false;
		}
		return evaluation;
	}
	
	public static boolean verifyInputs(String InputTempNumText, String StudentTempResponseText) {
		boolean VertifyInputTempNumText = Pattern.matches("^-?\\d+(\\.\\d{1,1})?$", InputTempNumText);
		boolean VerifyStudentTempResponseText = Pattern.matches("^-?\\d+(\\.\\d{1,1})?$", StudentTempResponseText);
		if (VertifyInputTempNumText == true && VerifyStudentTempResponseText == true) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isPastAbsoluteZero(String InputTempNumText, String StudentTempResponseText, 
											TemperatureEnum InputTempUnitDropdown, TemperatureEnum TargetTempUnitDropdown) {
		DecimalFormat df = new DecimalFormat("#.0");
		df.setRoundingMode(RoundingMode.DOWN);
		boolean evaluation = false;
		
		//Determine Past Absolute Zero
		switch (InputTempUnitDropdown) {
	        case FAHRENHEIT : if (Double.parseDouble(df.format(Double.parseDouble(InputTempNumText))) < -459.67) {
						        	evaluation = true;
						        }
	                 break;
	        case CELSIUS : if (Double.parseDouble(df.format(Double.parseDouble(InputTempNumText))) < -273.15) {
					        	evaluation = true;
					        }
	                 break;
	        case KELVIN : if (Double.parseDouble(df.format(Double.parseDouble(InputTempNumText))) < -0) {
					        	evaluation = true;
					        }
	                 break;
	        case RANKINE : if (Double.parseDouble(df.format(Double.parseDouble(InputTempNumText))) < -0) {
					        	evaluation = true;
					        }
	                 break;
	        default: return false;
		}
		switch (TargetTempUnitDropdown) {
	        case FAHRENHEIT : if (Double.parseDouble(df.format(Double.parseDouble(StudentTempResponseText))) < -459.67) {
						        	evaluation = true;
						        }
	                 break;
	        case CELSIUS : if (Double.parseDouble(df.format(Double.parseDouble(StudentTempResponseText))) < -273.15) {
					        	evaluation = true;
					        }
	                 break;
	        case KELVIN : if (Double.parseDouble(df.format(Double.parseDouble(StudentTempResponseText))) < -0) {
					        	evaluation = true;
					        }
	                 break;
	        case RANKINE : if (Double.parseDouble(df.format(Double.parseDouble(StudentTempResponseText))) < -0) {
					        	evaluation = true;
					        }
	                 break;
	        default: return false;
		}
		return evaluation;
	}

}
