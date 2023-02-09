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
import javax.swing.border.TitledBorder;

public class Homepage extends JFrame {

private JPanel contentPane;
private JTextField textField;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Homepage frame = new Homepage();
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
public Homepage() {
setTitle("ANIME SEARCHING PROGRAM");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 900, 600);
contentPane = new JPanel();
contentPane.setBackground(new Color(0, 255, 255));
setContentPane(contentPane);
contentPane.setLayout(null);

final JLabel lblREGISTER = new JLabel("ANIME SEARCHING");
lblREGISTER.setBackground(new Color(0, 0, 0));
lblREGISTER.setBounds(170, 53, 581, 72);
lblREGISTER.setForeground(new Color(255, 255, 255));
lblREGISTER.setHorizontalAlignment(SwingConstants.CENTER);
lblREGISTER.setFont(new Font("ZoodRangmah3.1", Font.BOLD, 98));
contentPane.add(lblREGISTER);
JButton btnBack = new JButton("Search");
btnBack.setBounds(410, 338, 95, 39);
btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
btnBack.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
});
contentPane.add(btnBack);
JLabel lblProgram = new JLabel("PROGRAM");
lblProgram.setHorizontalAlignment(SwingConstants.CENTER);
lblProgram.setForeground(Color.WHITE);
lblProgram.setFont(new Font("ZoodRangmah3.1", Font.BOLD, 98));
lblProgram.setBackground(Color.BLACK);
lblProgram.setBounds(170, 123, 581, 72);
contentPane.add(lblProgram);
JButton btnLogin = new JButton("LOGIN");
btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
btnLogin.setBounds(762, 240, 112, 39);
contentPane.add(btnLogin);
JButton btnBack_1_1 = new JButton("REGISTER");
btnBack_1_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	}
});
btnBack_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
btnBack_1_1.setBounds(762, 311, 112, 39);
contentPane.add(btnBack_1_1);
JButton btnBack_1_1_1 = new JButton("EXIT");
btnBack_1_1_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	}
});
btnBack_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
btnBack_1_1_1.setBounds(762, 380, 112, 39);
contentPane.add(btnBack_1_1_1);
JPanel panel = new JPanel();
panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
panel.setBackground(new Color(128, 128, 128));
panel.setForeground(new Color(128, 128, 128));
panel.setBounds(741, 220, 165, 218);
contentPane.add(panel);
JPanel panel_1 = new JPanel();
panel_1.setBackground(new Color(0, 0, 0));
panel_1.setBounds(0, 45, 886, 150);
contentPane.add(panel_1);
textField = new JTextField();
textField.setBounds(318, 260, 278, 40);
contentPane.add(textField);
textField.setColumns(10);
JLabel lblNewLabel = new JLabel("");
lblNewLabel.setIcon(new ImageIcon("E:\\File\\Project\\\u0E27\u0E31\u0E15\u0E16\u0E38\u0E14\u0E34\u0E1A\u0E17\u0E33\u0E2D\u0E34\u0E19\u0E42\u0E17\u0E23\\\u0E1B\u0E23\u0E30\u0E01\u0E2D\u0E1A\\\u0E23\u0E31\u0E49\u0E27.png"));
lblNewLabel.setBounds(0, 228, 905, 413);
contentPane.add(lblNewLabel);
JLabel lblNewLabel_1 = new JLabel("");
lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\MR.SAKURA_Z\\Downloads\\1200.png"));
lblNewLabel_1.setBounds(-86, 111, 593, 530);
contentPane.add(lblNewLabel_1);
}
}