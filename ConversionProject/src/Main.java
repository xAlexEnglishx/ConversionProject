import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.awt.*;

public class Main {

	//Declare the GUI elements
	public static JFrame frmMain;
	
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
		
		//Set up the frame
		frmMain = new JFrame("Conversion Tool");
		frmMain.setSize(750, 750);
		frmMain.setLocation(100, 100);
		frmMain.setLayout(new FlowLayout());
		
		//Create temperature GUI Elements
		direction = new JLabel("Inputs must be numbers only up to the tenth decimal place.");
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
					boolean isPastAbsoluteZero = false;
					
					if (TempConverter.isPastAbsoluteZero(InputTempNumText.getText(), StudentTempResponseText.getText(),
							(TemperatureEnum)InputTempUnitDropdown.getSelectedItem(), 
							(TemperatureEnum)TargetTempUnitDropdown.getSelectedItem())) {
						isPastAbsoluteZero = true;
					}
					
					if (TempConverter.verifyInputs(InputTempNumText.getText(), StudentTempResponseText.getText())) {
						if (isPastAbsoluteZero) {
							System.out.println("Below Absolute Value");
							TempOutput.setText("Output: invalid, input below Absolute Value");
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
					System.out.println("Volume");
					if (VolumeConverter.verifyInputs(InputVolNumText.getText(), StudentVolResponseText.getText())) {
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
		
		
		//Add the Temperature GUI Elements to the frame
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
		
		//Add the volume GUI Elements to the frame
		frmMain.add(InputVolNumLabel);
		frmMain.add(InputVolNumText);
		frmMain.add(InputVolUnitLabel);
		frmMain.add(InputVolUnitDropdown);
		frmMain.add(TargetVolUnitLabel);
		frmMain.add(TargetVolUnitDropdown);
		frmMain.add(StudentVolResponseLabel);
		frmMain.add(StudentVolResponseText);
		frmMain.add(VolOutput);
		frmMain.add(btnCalculateVolConversion);
		
		//Make the frame visible
		frmMain.setVisible(true);
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
