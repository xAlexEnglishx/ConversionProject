import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
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
	
	//Temperature variables
	public static JLabel direction;
	public static JLabel InputTempNumLabel;
	public static JTextField InputTempNumText;
	public static JLabel InputTempUnitLabel;
	public static JComboBox<TemperatureEnum> InputTempUnitDropdown;
	public static JLabel TargetTempUnitLabel;
	public static JComboBox<TemperatureEnum> TargetTempUnitDropdown;
	public static JLabel StudentTempResponseLabel;
	public static JTextField StudentTempResponseText;
	public static JLabel TempOutput;
	public static JButton btnCalculateTempConversion;
	
	
	
	public static void main(String[] args) {
		
		TempConverter tc = new TempConverter();
		
		//Set up the frame
		frmMain = new JFrame("Conversion Tool");
//		frmMain.setSize(150, 200);
		frmMain.setSize(750, 750);
		frmMain.setLocation(100, 100);
		frmMain.setLayout(new FlowLayout());
		
		//Create test GUI Elements
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
					System.out.println("test1");
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
		
		
		
	
		
		
		//Create temperature GUI Elements
		direction = new JLabel("Inputs must be numbers only up to the tenth decimal place.");
		InputTempNumLabel = new JLabel("Input Numerical Value:");
		InputTempNumText = new JTextField(10);
		InputTempUnitLabel = new JLabel("Input Unit of Measure:");
//		String[] temperatureStrings = { "Fahrenheit", "Celsius", "Kelvin", "Rankine"};
		TemperatureEnum[] temperatureUnits = { 
				TemperatureEnum.FAHRENHEIT, 
				TemperatureEnum.CELSIUS,
				TemperatureEnum.KELVIN,
				TemperatureEnum.RANKINE
		};
		InputTempUnitDropdown = new JComboBox<>(temperatureUnits);
		InputTempUnitDropdown.setSelectedIndex(0);
		
		TargetTempUnitLabel = new JLabel("Target Unit of Measure:");
		TargetTempUnitDropdown = new JComboBox<>(temperatureUnits);
		TargetTempUnitDropdown.setSelectedIndex(0);
		
		StudentTempResponseLabel = new JLabel("Student Response:");
		StudentTempResponseText = new JTextField(10);
		TempOutput = new JLabel("Output:");
		btnCalculateTempConversion = new JButton("Evaluate Temperature Conversion");
		
		//Add ActionListener
		btnCalculateTempConversion.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					//Verfiy up to tenths place, anything else reveals invalid before calculation
					//validate inputs
					if (TempConverter.verifyInputs(InputTempNumText.getText(), StudentTempResponseText.getText())) {
						//Evaluate conversion
						boolean conversionEvaluation = TempConverter.evaluateTempConversion(
								InputTempNumText.getText(), 
								StudentTempResponseText.getText(),
								(TemperatureEnum)InputTempUnitDropdown.getSelectedItem(), 
								(TemperatureEnum)TargetTempUnitDropdown.getSelectedItem());
						System.out.println("test1234" + conversionEvaluation);
						
						if (conversionEvaluation == true) {
							TempOutput.setText("Output: correct");
						} else {
							TempOutput.setText("Output: incorrect");
						}
					} else {
						TempOutput.setText("Output: invalid");
					}
				}
			}
		);
		
		
		//Add the HUI Elements to the frame
		frmMain.add(direction);
		frmMain.add(InputTempNumLabel);
		frmMain.add(InputTempNumText);
		frmMain.add(InputTempUnitLabel);
		frmMain.add(InputTempUnitDropdown);
		frmMain.add(TargetTempUnitLabel);
		frmMain.add(TargetTempUnitDropdown);
		frmMain.add(StudentTempResponseLabel);
		frmMain.add(StudentTempResponseText);
		frmMain.add(TempOutput);
		frmMain.add(btnCalculateTempConversion);
		
		//Make the frame visible
		frmMain.setVisible(true);
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
