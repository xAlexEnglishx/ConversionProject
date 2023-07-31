import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.awt.*;

public class TempConverter {
	
	//take 2 inputs, evaluate the first then run into switch based on second
	
	
	public static boolean evaluateTempConversion(String InputTempNumText, String StudentTempResponseText, 
										TemperatureEnum InputTempUnitDropdown, TemperatureEnum TargetTempUnitDropdown) {
		System.out.println("test789" + " , " 
				+ InputTempNumText + " , " 
				+ StudentTempResponseText + " , " 
				+ InputTempUnitDropdown + " , " 
				+ TargetTempUnitDropdown);
		
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
		
//		if (InputTempUnitDropdown == TemperatureEnum.CELSIUS && TargetTempUnitDropdown == TemperatureEnum.KELVIN) {
//			return true;
//		} else {
//			return false;
//		}
	}
	
	private static boolean convertFromFahrenheit (String InputTempNumText, String StudentTempResponseText, 
													TemperatureEnum TargetTempUnitDropdown) {
		boolean evaluation = false;
		
		//Determine Target Temperature Unit
		switch (TargetTempUnitDropdown) {
//	        case FAHRENHEIT : convertFromFahrenheit(InputTempNumText, StudentTempResponseText, 
//											TargetTempUnitDropdown);
//	                 break;
	        case CELSIUS : evaluation = convertFahrenheitToCelsius(InputTempNumText, StudentTempResponseText);
	                 break;
//	        case KELVIN : convertFromKelvin(InputTempNumText, StudentTempResponseText, 
//											TargetTempUnitDropdown);
//	                 break;
//	        case RANKINE : convertFromRankine(InputTempNumText, StudentTempResponseText, 
//											TargetTempUnitDropdown);
//	                 break;
	        default: return false;
		}
		return evaluation;
	}
	
	private static boolean convertFromCelsius (String InputTempNumText, String StudentTempResponseText, 
												TemperatureEnum TargetTempUnitDropdown) {
		return false;
	}
	
	private static boolean convertFromKelvin (String InputTempNumText, String StudentTempResponseText, 
												TemperatureEnum TargetTempUnitDropdown) {
		return false;
	}
	
	private static boolean convertFromRankine (String InputTempNumText, String StudentTempResponseText, 
												TemperatureEnum TargetTempUnitDropdown) {
		return false;
	}
	
	private static boolean convertFahrenheitToCelsius (String InputTempNumText, String StudentTempResponseText) {
		//Convert F to C
		DecimalFormat df = new DecimalFormat("#.0");
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
	
	public static boolean verifyInputs(String InputTempNumText, String StudentTempResponseText) {
		boolean VertifyInputTempNumText = Pattern.matches("^-?\\d+(\\.\\d{1,1})?$", InputTempNumText);
		boolean VerifyStudentTempResponseText = Pattern.matches("^-?\\d+(\\.\\d{1,1})?$", StudentTempResponseText);
		if (VertifyInputTempNumText == true && VerifyStudentTempResponseText == true) {
			return true;
		} else {
			return false;
		}
	}
	
	
	

	public String convertCtoF (double textCelsius) {
		//Convert C to F
//		String cText = textCelsius.getText();
//		double textCelsius = Double.parseDouble(textCelsius);
		System.out.println("test2");
		double f = (textCelsius * 9 / 5) + 32;
		DecimalFormat df = new DecimalFormat("#.#");
		return String.valueOf(df.format(f));
//		textFahrenheit.setText(String.valueOf(f));
	}
	
	public String convertFtoC (double textFahrenheit) {
		//Convert F to C
//		String fText = textFahrenheit.getText();
//		double f = Double.parseDouble(fText);
		double c = (textFahrenheit - 32) * 5 / 9;
		DecimalFormat df = new DecimalFormat("#.#");
		return String.valueOf(df.format(c));
//		textCelsius.setText(String.valueOf(c));
	}
	
}
