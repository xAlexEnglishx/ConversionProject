import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main {

	//Declare the GUI elements
	public static JFrame frmMain;
	public static JLabel lblCelsius;
	public static JTextField textCelsius;
	public static JLabel lblFahrenheit;
	public static JTextField textFahrenheit;
	public static JButton btnCalculateCtoF;
	public static JButton btnCalculateFtoC;
	
	
	public static void main(String[] args) {
		
		TempConverter tc = new TempConverter();
		
		//Set up the frame
		frmMain = new JFrame("Temperature Converter");
		frmMain.setSize(150, 200);
		frmMain.setLayout(new FlowLayout());
		
		//Create GUI Elements
		lblCelsius = new JLabel("Celsius:");
		textCelsius = new JTextField(10); // 10 is num of columns
		lblFahrenheit = new JLabel("Fahrenheit:");
		textFahrenheit = new JTextField(10);
		btnCalculateCtoF = new JButton("Convert C to F");
		//Add ActionListener
		btnCalculateCtoF.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					System.out.println("testsetsetsetset");
					textFahrenheit.setText(tc.convertCtoF(Float.parseFloat((textCelsius.getText()))));
//					//Convert C to F
//					String cText = textCelsius.getText();
//					double c = Double.parseDouble(cText);
//					double f = (c * 9 / 5) + 32;
//					textFahrenheit.setText(String.valueOf(f));
				}
			}
		);
		
		
		btnCalculateFtoC = new JButton("Convert F to C");
		//Add ActionListener
		btnCalculateFtoC.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					textCelsius.setText(tc.convertFtoC(Float.parseFloat((textFahrenheit.getText()))));
//					tc.convertFtoC(textCelsius, textFahrenheit);
					
//					//Convert F to C
//					String fText = textFahrenheit.getText();
//					double f = Double.parseDouble(fText);
//					double c = (f - 32) * 5 / 9;
//					textCelsius.setText(String.valueOf(c));
				}
			}
		);
		
		//Add the HUI Elements to the frame
		frmMain.add(lblCelsius);
		frmMain.add(textCelsius);
		frmMain.add(lblFahrenheit);
		frmMain.add(textFahrenheit);
		frmMain.add(btnCalculateCtoF);
		frmMain.add(btnCalculateFtoC);
		
		//Make the frame visible
		frmMain.setVisible(true);
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setDefaultCloseOperation(frmMain.EXIT_ON_CLOSE);
//		frmMain.dispatchEvent(new WindowEvent(frmMain, WindowEvent.WINDOW_CLOSING));
	}

}
