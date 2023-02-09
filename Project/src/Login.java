import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;

@SuppressWarnings({ "serial", "unused" })
public class Login extends JFrame {

private JPanel contentPane;
private String Name;
private static JTextField Password;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
   try {
        Login frame = new Login(Password);
        frame.setVisible(true);
       } catch (Exception e) {
           e.printStackTrace();
     }
    }
 });
}
/**
* Create the frame.
 * @parampassword 
*/
@SuppressWarnings("null")
public Login(JTextField password) {
setTitle("ANIME SEARCHING PROGRAM");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 450, 355);
setUndecorated(true);
contentPane = new JPanel();
contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
contentPane.setBackground(new Color(0, 255, 255));
contentPane.setLayout(new BorderLayout(0,0));
setContentPane(contentPane);
contentPane.setLayout(null);

javax.swing.JLabel Name = new JLabel("Name");
Name.setBackground(new Color(255, 255, 255));
Name.setForeground(new Color(0, 0, 0));
Name.setFont(new Font("Tahoma", Font.BOLD, 15));
Name.setBounds(36, 108, 109, 33);
contentPane.add(Name, BorderLayout.CENTER);

javax.swing.JLabel Password = new JLabel("Password");
Password.setFont(new Font("Tahoma", Font.BOLD, 15));
Password.setBounds(36, 151, 109, 29);
contentPane.add(Password);

JTextField name = new JTextField();
name.setBounds(165, 110, 200, 24);
contentPane.add(name, BorderLayout.CENTER);
((JTextField) name).setColumns(10);

password = new JTextField();
password.setBounds(165, 153, 200, 24);
contentPane.add(password, BorderLayout.CENTER);
((JTextField) password).setColumns(10);

final JButton btnContinue = new JButton("Continue");
btnContinue.setFont(new Font("Tahoma", Font.PLAIN, 15));

btnContinue.setBounds(99, 211, 95, 39);
contentPane.add(btnContinue, BorderLayout.CENTER);

JButton btnCancel = new JButton("Cancel");
btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 15));
btnCancel.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
});
Frame lblNewLabel = null;
lblNewLabel.setBackground(new Color(255, 255, 255));
contentPane.add(lblNewLabel, BorderLayout.CENTER);
btnCancel.setBounds(251, 211, 95, 39);
contentPane.add(btnCancel);
JLabel lblLogin = new JLabel("LOGIN");
lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
lblLogin.setForeground(new Color(0, 0, 255));
lblLogin.setBackground(new Color(0, 0, 255));
lblLogin.setFont(new Font("Tahoma", Font.BOLD, 28));
lblLogin.setBounds(165, 56, 98, 29);
contentPane.add(lblLogin, BorderLayout.NORTH);
JLabel lblNewLabel_1 = new JLabel("New label");
contentPane.add(lblNewLabel, BorderLayout.SOUTH);
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public JTextField getPassword() {
	return Password;
}
public void setPassword(JTextField password) {
	Password = password;
}
}
