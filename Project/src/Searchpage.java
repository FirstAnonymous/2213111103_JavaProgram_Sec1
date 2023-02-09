import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JSplitPane;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;

public class Searchpage extends JFrame {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JPanel contentPane;
private JTextField textField;
private JTextField textField_2;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Searchpage frame = new Searchpage();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the frame.
*/
public Searchpage() {
setTitle("ANIME SEARCHING PROGRAM");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 900, 800);
contentPane = new JPanel();
contentPane.setBackground(new Color(192, 192, 192));
setContentPane(contentPane);
contentPane.setLayout(null);

JLabel lblName = new JLabel("NAME : ");
lblName.setForeground(new Color(255, 255, 255));
lblName.setBounds(236, 254, 131, 33);
lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
contentPane.add(lblName);

final JLabel lblREGISTER = new JLabel("\u0E43\u0E2A\u0E48 File \u0E23\u0E39\u0E1B");
lblREGISTER.setBackground(new Color(0, 0, 0));
lblREGISTER.setBounds(0, 100, 886, 54);
lblREGISTER.setForeground(new Color(0, 0, 0));
lblREGISTER.setHorizontalAlignment(SwingConstants.CENTER);
lblREGISTER.setFont(new Font("Tahoma", Font.BOLD, 28));
contentPane.add(lblREGISTER);
JButton btnตกลง = new JButton("\u0E15\u0E01\u0E25\u0E07");
btnตกลง.setBounds(388, 583, 95, 39);
btnตกลง.setFont(new Font("Tahoma", Font.PLAIN, 15));
btnตกลง.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
});
contentPane.add(btnตกลง);
JLabel lblsynopsis = new JLabel("Genre : ");
lblsynopsis.setForeground(new Color(255, 255, 255));
lblsynopsis.setFont(new Font("Tahoma", Font.BOLD, 20));
lblsynopsis.setBounds(236, 305, 106, 33);
contentPane.add(lblsynopsis);
JLabel lbldisnep = new JLabel("");
lbldisnep.setIcon(new ImageIcon("C:\\Users\\MR.SAKURA_Z\\Downloads\\12345.png"));
lbldisnep.setBounds(374, 476, 95, 62);
contentPane.add(lbldisnep);
JLabel lblNewLabel = new JLabel("");
lblNewLabel.setIcon(new ImageIcon("C:\\Users\\MR.SAKURA_Z\\Downloads\\1200px-Logonetflix.png"));
lblNewLabel.setBounds(238, 490, 77, 41);
contentPane.add(lblNewLabel);
JLabel lblNewLabel_1 = new JLabel("");
lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\MR.SAKURA_Z\\Downloads\\M.png"));
lblNewLabel_1.setBounds(517, 470, 95, 64);
contentPane.add(lblNewLabel_1);
JLabel lblNewLabel_2 = new JLabel("");
lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\MR.SAKURA_Z\\Downloads\\png.png"));
lblNewLabel_2.setBounds(94, 490, 89, 39);
contentPane.add(lblNewLabel_2);
JLabel lblNewLabel_2_1 = new JLabel("");
lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\MR.SAKURA_Z\\Downloads\\P.png"));
lblNewLabel_2_1.setBounds(652, 490, 46, 39);
contentPane.add(lblNewLabel_2_1);
JLabel lblNewLabel_3 = new JLabel("");
lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\MR.SAKURA_Z\\Downloads\\R.png"));
lblNewLabel_3.setBounds(768, 486, 37, 54);
contentPane.add(lblNewLabel_3);
JLabel lblSynopsis = new JLabel("Synopsis : ");
lblSynopsis.setForeground(Color.WHITE);
lblSynopsis.setFont(new Font("Tahoma", Font.BOLD, 20));
lblSynopsis.setBounds(236, 358, 131, 33);
contentPane.add(lblSynopsis);
textField = new JTextField();
textField.setBounds(352, 255, 241, 30);
contentPane.add(textField);
textField.setColumns(10);
textField_2 = new JTextField();
textField_2.setColumns(10);
textField_2.setBounds(352, 360, 241, 30);
contentPane.add(textField_2);
JButton btnยกเลิก = new JButton("\u0E22\u0E01\u0E40\u0E25\u0E34\u0E01");
btnยกเลิก.setFont(new Font("Tahoma", Font.PLAIN, 15));
btnยกเลิก.setBounds(388, 655, 95, 39);
contentPane.add(btnยกเลิก);
JPanel panel = new JPanel();
panel.setBorder(new EmptyBorder(0, 0, 0, 0));
panel.setBackground(new Color(255, 255, 0));
panel.setBounds(236, 10, 410, 214);
contentPane.add(panel);
JComboBox comboBox = new JComboBox();
comboBox.setBounds(352, 306, 241, 30);
contentPane.add(comboBox);
JCheckBox chckbxNewCheckBox = new JCheckBox("");
chckbxNewCheckBox.setBounds(61, 494, 23, 29);
contentPane.add(chckbxNewCheckBox);
JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
chckbxNewCheckBox_1.setBounds(210, 494, 23, 29);
contentPane.add(chckbxNewCheckBox_1);
JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("");
chckbxNewCheckBox_1_1.setBounds(354, 494, 23, 29);
contentPane.add(chckbxNewCheckBox_1_1);
JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("");
chckbxNewCheckBox_1_1_1.setBounds(488, 494, 23, 29);
contentPane.add(chckbxNewCheckBox_1_1_1);
JCheckBox chckbxNewCheckBox_1_1_1_1 = new JCheckBox("");
chckbxNewCheckBox_1_1_1_1.setBounds(625, 494, 23, 29);
contentPane.add(chckbxNewCheckBox_1_1_1_1);
JCheckBox chckbxNewCheckBox_1_1_1_1_1 = new JCheckBox("");
chckbxNewCheckBox_1_1_1_1_1.setBounds(740, 494, 23, 29);
contentPane.add(chckbxNewCheckBox_1_1_1_1_1);
}
}