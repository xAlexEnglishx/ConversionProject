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
