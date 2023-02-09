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

public class REGISTER extends JFrame {

private JPanel contentPane;
private JTextField textNumber1;
private JTextField textNumber2;
private JTextField textField;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
REGISTER frame = new REGISTER();
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
public REGISTER() {
setTitle("ANIME SEARCHING PROGRAM");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 470, 350);
contentPane = new JPanel();
contentPane.setBackground(new Color(0, 255, 255));
setContentPane(contentPane);
contentPane.setLayout(null);

JLabel lblName = new JLabel("Name");
lblName.setBounds(36, 96, 109, 33);
lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
contentPane.add(lblName);

JLabel lblPassword = new JLabel("Password");
lblPassword.setBounds(36, 139, 109, 29);
lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
contentPane.add(lblPassword);

textNumber1 = new JTextField();
textNumber1.setBounds(165, 98, 200, 24);
contentPane.add(textNumber1);
textNumber1.setColumns(10);

textNumber2 = new JTextField();
textNumber2.setBounds(165, 138, 200, 24);
contentPane.add(textNumber2);
textNumber2.setColumns(10);

final JLabel lblREGISTER = new JLabel("REGISTER");
lblREGISTER.setBounds(140, 34, 150, 29);
lblREGISTER.setForeground(new Color(0, 0, 255));
lblREGISTER.setHorizontalAlignment(SwingConstants.CENTER);
lblREGISTER.setFont(new Font("Tahoma", Font.BOLD, 28));
contentPane.add(lblREGISTER);

final JButton btnContinue = new JButton("Continue");
btnContinue.setBounds(99, 249, 95, 39);
btnContinue.setFont(new Font("Tahoma", Font.PLAIN, 15));

contentPane.add(btnContinue);
JButton btnCancel = new JButton("Cancel");
btnCancel.setBounds(248, 249, 95, 39);
btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 15));
btnCancel.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
});
contentPane.add(btnCancel);
textField = new JTextField();
textField.setColumns(10);
textField.setBounds(165, 184, 200, 24);
contentPane.add(textField);
JLabel lblPasswordAgain = new JLabel("Password again");
lblPasswordAgain.setFont(new Font("Tahoma", Font.BOLD, 15));
lblPasswordAgain.setBounds(36, 184, 133, 29);
contentPane.add(lblPasswordAgain);
JPanel panel = new JPanel();
panel.setBounds(122, 24, 189, 52);
contentPane.add(panel);
}
}