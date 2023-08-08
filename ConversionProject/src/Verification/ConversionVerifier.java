package Verification;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class ConversionVerifier {
	
	static DecimalFormat decimalFormat = new DecimalFormat("#.0");

	public static boolean verifyInputs(String InputNumText, String StudentResponseText) {
		boolean VertifyInputTempNumText = Pattern.matches("^-?\\d+(\\.\\d{1,15})?$", InputNumText);
		boolean VerifyStudentTempResponseText = Pattern.matches("^-?\\d+(\\.\\d{1,15})?$", StudentResponseText);
		if (VertifyInputTempNumText == true && VerifyStudentTempResponseText == true) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean verifyEvaluation(BigDecimal convertedUnit, BigDecimal studentResponse) {
		if (String.valueOf(decimalFormat.format(convertedUnit.setScale(1, RoundingMode.HALF_UP)))
			.equals(String.valueOf(decimalFormat.format(studentResponse.setScale(1, RoundingMode.HALF_UP))))) {
				System.out.println("Correct Calculation");
				return true;
		} else {
				System.out.println("Incorrect Calculation");
				return false;
		}
	}
	
}
