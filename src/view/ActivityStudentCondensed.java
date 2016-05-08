package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JToggleButton;
import javax.swing.JTextField;

public class ActivityStudentCondensed {

	private JFrame activityList;
	private JTextField statusTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActivityStudentCondensed window = new ActivityStudentCondensed();
					window.activityList.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ActivityStudentCondensed() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		activityList = new JFrame();
		activityList.setTitle("Activity List");
		activityList.setBounds(100, 100, 800, 320);
		activityList.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		activityList.getContentPane().setLayout(null);
		
		JPanel tabulatedSubmissionsPanel = new JPanel();
		tabulatedSubmissionsPanel.setBackground(Color.WHITE);
		tabulatedSubmissionsPanel.setBounds(10, 36, 764, 214);
		activityList.getContentPane().add(tabulatedSubmissionsPanel);
		GridBagLayout gbl_tabulatedSubmissionsPanel = new GridBagLayout();
		gbl_tabulatedSubmissionsPanel.columnWidths = new int[]{155, 87, 0, 200, 216, 0};
		gbl_tabulatedSubmissionsPanel.rowHeights = new int[]{35, 35, 35, 35, 35, 35, 0};
		gbl_tabulatedSubmissionsPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_tabulatedSubmissionsPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		tabulatedSubmissionsPanel.setLayout(gbl_tabulatedSubmissionsPanel);
		
		JLabel studentIDLabel = new JLabel("Activity Name");
		studentIDLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_studentIDLabel = new GridBagConstraints();
		gbc_studentIDLabel.fill = GridBagConstraints.BOTH;
		gbc_studentIDLabel.insets = new Insets(0, 0, 5, 5);
		gbc_studentIDLabel.gridx = 0;
		gbc_studentIDLabel.gridy = 0;
		tabulatedSubmissionsPanel.add(studentIDLabel, gbc_studentIDLabel);
		
		JLabel studentNameLabel = new JLabel("Activity Filename");
		studentNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_studentNameLabel = new GridBagConstraints();
		gbc_studentNameLabel.gridwidth = 2;
		gbc_studentNameLabel.fill = GridBagConstraints.BOTH;
		gbc_studentNameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_studentNameLabel.gridx = 1;
		gbc_studentNameLabel.gridy = 0;
		tabulatedSubmissionsPanel.add(studentNameLabel, gbc_studentNameLabel);
		
		JLabel studentSectionLabel = new JLabel("Date Uploaded");
		studentSectionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_studentSectionLabel = new GridBagConstraints();
		gbc_studentSectionLabel.fill = GridBagConstraints.BOTH;
		gbc_studentSectionLabel.insets = new Insets(0, 0, 5, 5);
		gbc_studentSectionLabel.gridx = 3;
		gbc_studentSectionLabel.gridy = 0;
		tabulatedSubmissionsPanel.add(studentSectionLabel, gbc_studentSectionLabel);
		
		JLabel studentSourceCodeLabel = new JLabel("Activity Deadline");
		studentSourceCodeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_studentSourceCodeLabel = new GridBagConstraints();
		gbc_studentSourceCodeLabel.fill = GridBagConstraints.BOTH;
		gbc_studentSourceCodeLabel.insets = new Insets(0, 0, 5, 0);
		gbc_studentSourceCodeLabel.gridx = 4;
		gbc_studentSourceCodeLabel.gridy = 0;
		tabulatedSubmissionsPanel.add(studentSourceCodeLabel, gbc_studentSourceCodeLabel);
		
		JLabel lblBasicFunctions = new JLabel("Basic Functions");
		GridBagConstraints gbc_lblBasicFunctions = new GridBagConstraints();
		gbc_lblBasicFunctions.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblBasicFunctions.insets = new Insets(0, 0, 5, 5);
		gbc_lblBasicFunctions.gridx = 0;
		gbc_lblBasicFunctions.gridy = 1;
		tabulatedSubmissionsPanel.add(lblBasicFunctions, gbc_lblBasicFunctions);
		
		JLabel lblBasicFunctionspdf = new JLabel("Basic Functions.pdf");
		GridBagConstraints gbc_lblBasicFunctionspdf = new GridBagConstraints();
		gbc_lblBasicFunctionspdf.anchor = GridBagConstraints.WEST;
		gbc_lblBasicFunctionspdf.insets = new Insets(0, 0, 5, 5);
		gbc_lblBasicFunctionspdf.gridx = 1;
		gbc_lblBasicFunctionspdf.gridy = 1;
		tabulatedSubmissionsPanel.add(lblBasicFunctionspdf, gbc_lblBasicFunctionspdf);
		
		JButton btnUpload = new JButton("Save");
		GridBagConstraints gbc_btnUpload = new GridBagConstraints();
		gbc_btnUpload.insets = new Insets(0, 0, 5, 5);
		gbc_btnUpload.gridx = 2;
		gbc_btnUpload.gridy = 1;
		tabulatedSubmissionsPanel.add(btnUpload, gbc_btnUpload);
		
		JLabel deliverableDateSubmitted1Label = new JLabel("1/2/2016 1:30:29 PM UTC+0800");
		GridBagConstraints gbc_deliverableDateSubmitted1Label = new GridBagConstraints();
		gbc_deliverableDateSubmitted1Label.anchor = GridBagConstraints.WEST;
		gbc_deliverableDateSubmitted1Label.fill = GridBagConstraints.VERTICAL;
		gbc_deliverableDateSubmitted1Label.insets = new Insets(0, 0, 5, 5);
		gbc_deliverableDateSubmitted1Label.gridx = 3;
		gbc_deliverableDateSubmitted1Label.gridy = 1;
		tabulatedSubmissionsPanel.add(deliverableDateSubmitted1Label, gbc_deliverableDateSubmitted1Label);
		
		JLabel lblPm = new JLabel("1/4/2016 2:30 PM");
		GridBagConstraints gbc_lblPm = new GridBagConstraints();
		gbc_lblPm.anchor = GridBagConstraints.WEST;
		gbc_lblPm.insets = new Insets(0, 0, 5, 0);
		gbc_lblPm.gridx = 4;
		gbc_lblPm.gridy = 1;
		tabulatedSubmissionsPanel.add(lblPm, gbc_lblPm);
		
		JLabel lblConditionalStatements = new JLabel("Conditional Statements");
		GridBagConstraints gbc_lblConditionalStatements = new GridBagConstraints();
		gbc_lblConditionalStatements.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblConditionalStatements.insets = new Insets(0, 0, 5, 5);
		gbc_lblConditionalStatements.gridx = 0;
		gbc_lblConditionalStatements.gridy = 2;
		tabulatedSubmissionsPanel.add(lblConditionalStatements, gbc_lblConditionalStatements);
		
		JLabel lblConditionalStatementspdf = new JLabel("Conditional Statements.pdf");
		GridBagConstraints gbc_lblConditionalStatementspdf = new GridBagConstraints();
		gbc_lblConditionalStatementspdf.anchor = GridBagConstraints.WEST;
		gbc_lblConditionalStatementspdf.insets = new Insets(0, 0, 5, 5);
		gbc_lblConditionalStatementspdf.gridx = 1;
		gbc_lblConditionalStatementspdf.gridy = 2;
		tabulatedSubmissionsPanel.add(lblConditionalStatementspdf, gbc_lblConditionalStatementspdf);
		
		JButton btnSave = new JButton("Save");
		GridBagConstraints gbc_btnSave = new GridBagConstraints();
		gbc_btnSave.insets = new Insets(0, 0, 5, 5);
		gbc_btnSave.gridx = 2;
		gbc_btnSave.gridy = 2;
		tabulatedSubmissionsPanel.add(btnSave, gbc_btnSave);
		
		JLabel deliverableDateSubmitted2Label = new JLabel("1/9/2016 1:30:29 PM UTC+0800");
		GridBagConstraints gbc_deliverableDateSubmitted2Label = new GridBagConstraints();
		gbc_deliverableDateSubmitted2Label.anchor = GridBagConstraints.WEST;
		gbc_deliverableDateSubmitted2Label.fill = GridBagConstraints.VERTICAL;
		gbc_deliverableDateSubmitted2Label.insets = new Insets(0, 0, 5, 5);
		gbc_deliverableDateSubmitted2Label.gridx = 3;
		gbc_deliverableDateSubmitted2Label.gridy = 2;
		tabulatedSubmissionsPanel.add(deliverableDateSubmitted2Label, gbc_deliverableDateSubmitted2Label);
		
		JLabel lblPm_1 = new JLabel("1/11/2016 2:30 PM");
		GridBagConstraints gbc_lblPm_1 = new GridBagConstraints();
		gbc_lblPm_1.anchor = GridBagConstraints.WEST;
		gbc_lblPm_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblPm_1.gridx = 4;
		gbc_lblPm_1.gridy = 2;
		tabulatedSubmissionsPanel.add(lblPm_1, gbc_lblPm_1);
		
		JLabel lblLoops = new JLabel("Loops");
		GridBagConstraints gbc_lblLoops = new GridBagConstraints();
		gbc_lblLoops.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblLoops.insets = new Insets(0, 0, 5, 5);
		gbc_lblLoops.gridx = 0;
		gbc_lblLoops.gridy = 3;
		tabulatedSubmissionsPanel.add(lblLoops, gbc_lblLoops);
		
		JLabel lblLoopspdf = new JLabel("Loops.pdf");
		GridBagConstraints gbc_lblLoopspdf = new GridBagConstraints();
		gbc_lblLoopspdf.anchor = GridBagConstraints.WEST;
		gbc_lblLoopspdf.insets = new Insets(0, 0, 5, 5);
		gbc_lblLoopspdf.gridx = 1;
		gbc_lblLoopspdf.gridy = 3;
		tabulatedSubmissionsPanel.add(lblLoopspdf, gbc_lblLoopspdf);
		
		JButton btnSave_1 = new JButton("Save");
		GridBagConstraints gbc_btnSave_1 = new GridBagConstraints();
		gbc_btnSave_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnSave_1.gridx = 2;
		gbc_btnSave_1.gridy = 3;
		tabulatedSubmissionsPanel.add(btnSave_1, gbc_btnSave_1);
		
		JLabel deliverableDateSubmitted3Label = new JLabel("1/16/2016 1:30:29 PM UTC+0800");
		GridBagConstraints gbc_deliverableDateSubmitted3Label = new GridBagConstraints();
		gbc_deliverableDateSubmitted3Label.anchor = GridBagConstraints.WEST;
		gbc_deliverableDateSubmitted3Label.fill = GridBagConstraints.VERTICAL;
		gbc_deliverableDateSubmitted3Label.insets = new Insets(0, 0, 5, 5);
		gbc_deliverableDateSubmitted3Label.gridx = 3;
		gbc_deliverableDateSubmitted3Label.gridy = 3;
		tabulatedSubmissionsPanel.add(deliverableDateSubmitted3Label, gbc_deliverableDateSubmitted3Label);
		
		JLabel lblPm_2 = new JLabel("1/18/2016 2:30 PM");
		GridBagConstraints gbc_lblPm_2 = new GridBagConstraints();
		gbc_lblPm_2.anchor = GridBagConstraints.WEST;
		gbc_lblPm_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblPm_2.gridx = 4;
		gbc_lblPm_2.gridy = 3;
		tabulatedSubmissionsPanel.add(lblPm_2, gbc_lblPm_2);
		
		JLabel lblFunctions = new JLabel("Functions");
		GridBagConstraints gbc_lblFunctions = new GridBagConstraints();
		gbc_lblFunctions.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFunctions.insets = new Insets(0, 0, 5, 5);
		gbc_lblFunctions.gridx = 0;
		gbc_lblFunctions.gridy = 4;
		tabulatedSubmissionsPanel.add(lblFunctions, gbc_lblFunctions);
		
		JLabel lblFunctionspdf = new JLabel("Functions.pdf");
		GridBagConstraints gbc_lblFunctionspdf = new GridBagConstraints();
		gbc_lblFunctionspdf.anchor = GridBagConstraints.WEST;
		gbc_lblFunctionspdf.insets = new Insets(0, 0, 5, 5);
		gbc_lblFunctionspdf.gridx = 1;
		gbc_lblFunctionspdf.gridy = 4;
		tabulatedSubmissionsPanel.add(lblFunctionspdf, gbc_lblFunctionspdf);
		
		JButton btnSave_2 = new JButton("Save");
		GridBagConstraints gbc_btnSave_2 = new GridBagConstraints();
		gbc_btnSave_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnSave_2.gridx = 2;
		gbc_btnSave_2.gridy = 4;
		tabulatedSubmissionsPanel.add(btnSave_2, gbc_btnSave_2);
		
		JLabel deliverableDateSubmitted4Label = new JLabel("1/23/2016 1:20:05 PM UTC+0800");
		GridBagConstraints gbc_deliverableDateSubmitted4Label = new GridBagConstraints();
		gbc_deliverableDateSubmitted4Label.anchor = GridBagConstraints.WEST;
		gbc_deliverableDateSubmitted4Label.fill = GridBagConstraints.VERTICAL;
		gbc_deliverableDateSubmitted4Label.insets = new Insets(0, 0, 5, 5);
		gbc_deliverableDateSubmitted4Label.gridx = 3;
		gbc_deliverableDateSubmitted4Label.gridy = 4;
		tabulatedSubmissionsPanel.add(deliverableDateSubmitted4Label, gbc_deliverableDateSubmitted4Label);
		
		JLabel lblPm_3 = new JLabel("1/25/2016 2:30 PM");
		GridBagConstraints gbc_lblPm_3 = new GridBagConstraints();
		gbc_lblPm_3.anchor = GridBagConstraints.WEST;
		gbc_lblPm_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblPm_3.gridx = 4;
		gbc_lblPm_3.gridy = 4;
		tabulatedSubmissionsPanel.add(lblPm_3, gbc_lblPm_3);
		
		JLabel lblAsciiArtI = new JLabel("ASCII Art I");
		GridBagConstraints gbc_lblAsciiArtI = new GridBagConstraints();
		gbc_lblAsciiArtI.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblAsciiArtI.insets = new Insets(0, 0, 0, 5);
		gbc_lblAsciiArtI.gridx = 0;
		gbc_lblAsciiArtI.gridy = 5;
		tabulatedSubmissionsPanel.add(lblAsciiArtI, gbc_lblAsciiArtI);
		
		JLabel lblAsciiArtIpdf = new JLabel("ASCII Art I.pdf");
		GridBagConstraints gbc_lblAsciiArtIpdf = new GridBagConstraints();
		gbc_lblAsciiArtIpdf.anchor = GridBagConstraints.WEST;
		gbc_lblAsciiArtIpdf.insets = new Insets(0, 0, 0, 5);
		gbc_lblAsciiArtIpdf.gridx = 1;
		gbc_lblAsciiArtIpdf.gridy = 5;
		tabulatedSubmissionsPanel.add(lblAsciiArtIpdf, gbc_lblAsciiArtIpdf);
		
		JButton btnSave_3 = new JButton("Save");
		GridBagConstraints gbc_btnSave_3 = new GridBagConstraints();
		gbc_btnSave_3.insets = new Insets(0, 0, 0, 5);
		gbc_btnSave_3.gridx = 2;
		gbc_btnSave_3.gridy = 5;
		tabulatedSubmissionsPanel.add(btnSave_3, gbc_btnSave_3);
		
		JLabel deliverableDateSubmitted5Label = new JLabel("1/30/2016 3:16:41 PM UTC+0800");
		GridBagConstraints gbc_deliverableDateSubmitted5Label = new GridBagConstraints();
		gbc_deliverableDateSubmitted5Label.anchor = GridBagConstraints.WEST;
		gbc_deliverableDateSubmitted5Label.fill = GridBagConstraints.VERTICAL;
		gbc_deliverableDateSubmitted5Label.insets = new Insets(0, 0, 0, 5);
		gbc_deliverableDateSubmitted5Label.gridx = 3;
		gbc_deliverableDateSubmitted5Label.gridy = 5;
		tabulatedSubmissionsPanel.add(deliverableDateSubmitted5Label, gbc_deliverableDateSubmitted5Label);
		
		JLabel lblPm_4 = new JLabel("2/1/2016 2:30 PM");
		GridBagConstraints gbc_lblPm_4 = new GridBagConstraints();
		gbc_lblPm_4.anchor = GridBagConstraints.WEST;
		gbc_lblPm_4.gridx = 4;
		gbc_lblPm_4.gridy = 5;
		tabulatedSubmissionsPanel.add(lblPm_4, gbc_lblPm_4);
		
		statusTextField = new JTextField();
		statusTextField.setEditable(false);
		statusTextField.setBounds(0, 261, 784, 20);
		activityList.getContentPane().add(statusTextField);
		statusTextField.setColumns(10);
	}
}
