import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.awt.*;

public class TempConverter {

	public String convertCtoF (double textCelsius) {
		//Convert C to F
//		String cText = textCelsius.getText();
//		double textCelsius = Double.parseDouble(textCelsius);
		System.out.println("test2");
		double f = (textCelsius * 9 / 5) + 32;
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("test3");
		return String.valueOf(df.format(f));
//		textFahrenheit.setText(String.valueOf(f));
	}
	
	void convertFtoC (JTextField textCelsius, JTextField textFahrenheit) {
		//Convert F to C
		String fText = textFahrenheit.getText();
		double f = Double.parseDouble(fText);
		double c = (f - 32) * 5 / 9;
		textCelsius.setText(String.valueOf(c));
	}
	
}
