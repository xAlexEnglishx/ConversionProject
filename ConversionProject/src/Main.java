import javax.swing.*;

import Verification.ConversionVerifier;

import java.awt.event.*;
import java.text.DecimalFormat;
import java.awt.*;

public class Main {

	//Declare the GUI elements
	public static JFrame frmMain;
	
	//Temperature variables
	public static JLabel direction;
	public static JLabel tempDirection;
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
	
	public static JLabel lineBreak1;
	public static JLabel lineBreak2;
	
	//Volume variables
	public static JLabel InputVolNumLabel;
	public static JTextField InputVolNumText;
	public static JLabel InputVolUnitLabel;
	public static JComboBox<VolumeEnum> InputVolUnitDropdown;
	public static JLabel TargetVolUnitLabel;
	public static JComboBox<VolumeEnum> TargetVolUnitDropdown;
	public static JLabel StudentVolResponseLabel;
	public static JTextField StudentVolResponseText;
	public static JLabel VolOutput;
	public static JButton btnCalculateVolConversion;
	
	public static void main(String[] args) {
		
		//Create temperature GUI Elements
		direction = new JLabel("Inputs must be numbers only. They can have up to 15 digits past the decimal point.");
		tempDirection = new JLabel("Temperature inputs must not be lower than absolute zero.");
		InputTempNumLabel = new JLabel("Input Numerical Value:");
		InputTempNumText = new JTextField(10);
		InputTempUnitLabel = new JLabel("Input Unit of Measure:");
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
					//Validate inputs
					if (ConversionVerifier.verifyInputs(InputTempNumText.getText(), StudentTempResponseText.getText())) {
						if (TempConverter.isPastAbsoluteZero(InputTempNumText.getText(), StudentTempResponseText.getText(),
								(TemperatureEnum)InputTempUnitDropdown.getSelectedItem(), 
								(TemperatureEnum)TargetTempUnitDropdown.getSelectedItem())) {
							System.out.println("Below Absolute Zero");
							TempOutput.setText("Output: invalid, input below Absolute Zero");
						} else {
							//Evaluate conversion
							boolean conversionEvaluation = TempConverter.evaluateTempConversion(
									InputTempNumText.getText(), 
									StudentTempResponseText.getText(),
									(TemperatureEnum)InputTempUnitDropdown.getSelectedItem(), 
									(TemperatureEnum)TargetTempUnitDropdown.getSelectedItem());
							
							if (conversionEvaluation == true) {
								TempOutput.setText("Output: correct");
							} else {
								TempOutput.setText("Output: incorrect");
							}
						}
					} else {
						System.out.println("Invalid entry");
						TempOutput.setText("Output: invalid");
					}
				}
			}
		);
		
		
		//Create volume GUI Elements
		InputVolNumLabel = new JLabel("Input Numerical Value:");
		InputVolNumText = new JTextField(10);
		InputVolUnitLabel = new JLabel("Input Unit of Measure:");
		VolumeEnum[] volumeUnits = { 
				VolumeEnum.LITERS,
				VolumeEnum.TABLESPOONS,
				VolumeEnum.CUBIC_INCHES,
				VolumeEnum.CUPS,
				VolumeEnum.CUBIC_FEET,
				VolumeEnum.GALLONS
		};
		InputVolUnitDropdown = new JComboBox<>(volumeUnits);
		InputVolUnitDropdown.setSelectedIndex(0);
		
		TargetVolUnitLabel = new JLabel("Target Unit of Measure:");
		TargetVolUnitDropdown = new JComboBox<>(volumeUnits);
		TargetVolUnitDropdown.setSelectedIndex(0);
		
		StudentVolResponseLabel = new JLabel("Student Response:");
		StudentVolResponseText = new JTextField(10);
		VolOutput = new JLabel("Output:");
		btnCalculateVolConversion = new JButton("Evaluate Volume Conversion");
		
		//Add ActionListener
		btnCalculateVolConversion.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					//Validate inputs
					if (ConversionVerifier.verifyInputs(InputVolNumText.getText(), StudentVolResponseText.getText())) {
						//Evaluate conversion
						boolean conversionEvaluation = VolumeConverter.evaluateVolConversion(
								InputVolNumText.getText(), 
								StudentVolResponseText.getText(),
								(VolumeEnum)InputVolUnitDropdown.getSelectedItem(), 
								(VolumeEnum)TargetVolUnitDropdown.getSelectedItem());
						
						if (conversionEvaluation == true) {
							VolOutput.setText("Output: correct");
						} else {
							VolOutput.setText("Output: incorrect");
						}
					} else {
						System.out.println("Invalid entry");
						VolOutput.setText("Output: invalid");
					}
				}
			}
		);
		
		
		//Set up frame
		frmMain = new JFrame("Conversion Tool");
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMain.setSize(800, 750);
		frmMain.setLocation(100, 100);
		frmMain.setLocationRelativeTo(null);
		frmMain.setLayout(null);
		
		JPanel directionPanel = new JPanel();
		JPanel tempDirectionPanel = new JPanel();

		JPanel tempInputPanel = new JPanel();
		JPanel tempTargetPanel = new JPanel();
		JPanel tempOutputPanel = new JPanel();

		JPanel volInputPanel = new JPanel();
		JPanel volTargetPanel = new JPanel();
		JPanel volOutputPanel = new JPanel();
		
		JPanel linePanel1 = new JPanel();
		JPanel linePanel2 = new JPanel();
		lineBreak1 = new JLabel("----------------------------------------------------------------------------------------");
		lineBreak2 = new JLabel("----------------------------------------------------------------------------------------");
		
		directionPanel.setBounds(0, 0, 800, 20);
		tempDirectionPanel.setBounds(0, 20, 800, 20);
		
		linePanel1.setBounds(0, 50, 800, 50);
		
		tempInputPanel.setBounds(0, 100, 800, 50);
		tempTargetPanel.setBounds(0, 150, 800, 50);
		tempOutputPanel.setBounds(0, 200, 800, 50);
		
		linePanel2.setBounds(0, 250, 800, 50);
		
		volInputPanel.setBounds(0, 300, 800, 50);
		volTargetPanel.setBounds(0, 350, 800, 50);
		volOutputPanel.setBounds(0, 400, 800, 50);
		
		
		//Add the directions to the frame
		directionPanel.add(direction);
		tempDirectionPanel.add(tempDirection);
		
		linePanel1.add(lineBreak1);
		
		//Add the Temperature GUI Elements to the frame
		tempInputPanel.add(InputTempUnitLabel);
		tempInputPanel.add(InputTempUnitDropdown);
		tempInputPanel.add(InputTempNumLabel);
		tempInputPanel.add(InputTempNumText);
		tempTargetPanel.add(TargetTempUnitLabel);
		tempTargetPanel.add(TargetTempUnitDropdown);
		tempTargetPanel.add(StudentTempResponseLabel);
		tempTargetPanel.add(StudentTempResponseText);
		tempOutputPanel.add(TempOutput);
		tempOutputPanel.add(btnCalculateTempConversion);
		
		linePanel2.add(lineBreak2);
		
		//Add the volume GUI Elements to the frame
		volInputPanel.add(InputVolUnitLabel);
		volInputPanel.add(InputVolUnitDropdown);
		volInputPanel.add(InputVolNumLabel);
		volInputPanel.add(InputVolNumText);
		volTargetPanel.add(TargetVolUnitLabel);
		volTargetPanel.add(TargetVolUnitDropdown);
		volTargetPanel.add(StudentVolResponseLabel);
		volTargetPanel.add(StudentVolResponseText);
		volOutputPanel.add(VolOutput);
		volOutputPanel.add(btnCalculateVolConversion);
		
		frmMain.add(directionPanel);
		frmMain.add(tempDirectionPanel);
		
		frmMain.add(linePanel1);
		
		frmMain.add(tempInputPanel);
		frmMain.add(tempTargetPanel);
		frmMain.add(tempOutputPanel);
		
		frmMain.add(linePanel2);
		
		frmMain.add(volInputPanel);
		frmMain.add(volTargetPanel);
		frmMain.add(volOutputPanel);
  
    	frmMain.setVisible(true);
		
	}

}
