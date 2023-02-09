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

public class Page extends JFrame {

private JPanel contentPane;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Page frame = new Page();
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
public Page() {
setTitle("ANIME SEARCHING PROGRAM");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 900, 600);
contentPane = new JPanel();
contentPane.setBackground(new Color(0, 255, 255));
setContentPane(contentPane);
contentPane.setLayout(null);

JLabel lblName = new JLabel("Genre : Comedy");
lblName.setForeground(new Color(255, 255, 255));
lblName.setBounds(483, 136, 160, 33);
lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
contentPane.add(lblName);

JLabel lblPassword = new JLabel("Yearning to make friends and perform live with a band, lonely and");
lblPassword.setForeground(new Color(255, 255, 255));
lblPassword.setBounds(362, 222, 513, 52);
lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
contentPane.add(lblPassword);

final JLabel lblREGISTER = new JLabel("BOCCHI THE ROCK");
lblREGISTER.setBounds(362, 88, 395, 29);
lblREGISTER.setForeground(new Color(255, 255, 255));
lblREGISTER.setHorizontalAlignment(SwingConstants.CENTER);
lblREGISTER.setFont(new Font("Tahoma", Font.BOLD, 28));
contentPane.add(lblREGISTER);
JButton btnBack = new JButton("Back");
btnBack.setBounds(781, 10, 95, 39);
btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
btnBack.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
});
contentPane.add(btnBack);
JLabel lblAndSociallyAnxious = new JLabel("socially anxious Hitori \"Bocchi\" Gotou devotes her time to playing the guitar.");
lblAndSociallyAnxious.setForeground(new Color(255, 255, 255));
lblAndSociallyAnxious.setFont(new Font("Tahoma", Font.BOLD, 12));
lblAndSociallyAnxious.setBounds(309, 260, 624, 52);
contentPane.add(lblAndSociallyAnxious);
JLabel lblOnA = new JLabel("On a fateful day, Bocchi meets the outgoing drummer Nijika Ijichi, ");
lblOnA.setForeground(new Color(255, 255, 255));
lblOnA.setFont(new Font("Tahoma", Font.BOLD, 12));
lblOnA.setBounds(309, 297, 624, 52);
contentPane.add(lblOnA);
JLabel lblAndSociallyAnxious_1_1 = new JLabel("who invites her to join Kessoku Band when their guitarist, Ikuyo Kita,");
lblAndSociallyAnxious_1_1.setForeground(new Color(255, 255, 255));
lblAndSociallyAnxious_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
lblAndSociallyAnxious_1_1.setBounds(309, 337, 624, 52);
contentPane.add(lblAndSociallyAnxious_1_1);
JLabel lblAndSociallyAnxious_1_1_1 = new JLabel("flees before their first show. Soon after, Bocchi meets her final bandmate");
lblAndSociallyAnxious_1_1_1.setForeground(new Color(255, 255, 255));
lblAndSociallyAnxious_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
lblAndSociallyAnxious_1_1_1.setBounds(309, 376, 519, 52);
contentPane.add(lblAndSociallyAnxious_1_1_1);
JLabel lblAndSociallyAnxious_1_1_1_1 = new JLabel("\u2014the cool bassist Ryou Yamada.");
lblAndSociallyAnxious_1_1_1_1.setForeground(new Color(255, 255, 255));
lblAndSociallyAnxious_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
lblAndSociallyAnxious_1_1_1_1.setBounds(309, 417, 624, 52);
contentPane.add(lblAndSociallyAnxious_1_1_1_1);
JLabel lblsynopsis = new JLabel("[Synopsis]");
lblsynopsis.setForeground(new Color(255, 255, 255));
lblsynopsis.setFont(new Font("Tahoma", Font.BOLD, 20));
lblsynopsis.setBounds(508, 179, 106, 33);
contentPane.add(lblsynopsis);
JPanel panel = new JPanel();
panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
panel.setBackground(new Color(0, 128, 255));
panel.setBounds(278, 58, 543, 421);
contentPane.add(panel);
JLabel lbldisnep = new JLabel("");
lbldisnep.setIcon(new ImageIcon("C:\\Users\\MR.SAKURA_Z\\Downloads\\12345.png"));
lbldisnep.setBounds(362, 489, 95, 62);
contentPane.add(lbldisnep);
JLabel lblNewLabel = new JLabel("");
lblNewLabel.setIcon(new ImageIcon("C:\\Users\\MR.SAKURA_Z\\Downloads\\1200px-Logonetflix.png"));
lblNewLabel.setBounds(236, 502, 77, 41);
contentPane.add(lblNewLabel);
JLabel lblNewLabel_1 = new JLabel("");
lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\MR.SAKURA_Z\\Downloads\\M.png"));
lblNewLabel_1.setBounds(508, 487, 95, 64);
contentPane.add(lblNewLabel_1);
JLabel lblNewLabel_2 = new JLabel("");
lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\MR.SAKURA_Z\\Downloads\\png.png"));
lblNewLabel_2.setBounds(90, 502, 89, 39);
contentPane.add(lblNewLabel_2);
JLabel lblNewLabel_2_1 = new JLabel("");
lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\MR.SAKURA_Z\\Downloads\\P.png"));
lblNewLabel_2_1.setBounds(646, 505, 46, 39);
contentPane.add(lblNewLabel_2_1);
JLabel lblNewLabel_3 = new JLabel("");
lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\MR.SAKURA_Z\\Downloads\\R.png"));
lblNewLabel_3.setBounds(765, 499, 37, 54);
contentPane.add(lblNewLabel_3);
JLabel lblNewLabel_4 = new JLabel("");
lblNewLabel_4.setForeground(new Color(255, 255, 0));
lblNewLabel_4.setBackground(new Color(255, 255, 0));
lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\MR.SAKURA_Z\\Downloads\\3.png"));
lblNewLabel_4.setBounds(30, 58, 243, 417);
contentPane.add(lblNewLabel_4);
JPanel panel_1 = new JPanel();
panel_1.setBounds(25, 58, 258, 421);
contentPane.add(panel_1);
JLabel lblNewLabel_3_1 = new JLabel("");
lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\MR.SAKURA_Z\\Downloads\\Blue.png"));
lblNewLabel_3_1.setBounds(40, 494, 44, 54);
contentPane.add(lblNewLabel_3_1);
JLabel lblNewLabel_3_1_1 = new JLabel("");
lblNewLabel_3_1_1.setIcon(new ImageIcon("C:\\Users\\MR.SAKURA_Z\\Downloads\\red.png"));
lblNewLabel_3_1_1.setBounds(455, 494, 44, 54);
contentPane.add(lblNewLabel_3_1_1);
JLabel lblNewLabel_3_1_1_1 = new JLabel("");
lblNewLabel_3_1_1_1.setIcon(new ImageIcon("C:\\Users\\MR.SAKURA_Z\\Downloads\\red.png"));
lblNewLabel_3_1_1_1.setBounds(182, 494, 44, 54);
contentPane.add(lblNewLabel_3_1_1_1);
JLabel lblNewLabel_3_1_1_1_1 = new JLabel("");
lblNewLabel_3_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\MR.SAKURA_Z\\Downloads\\red.png"));
lblNewLabel_3_1_1_1_1.setBounds(708, 494, 44, 54);
contentPane.add(lblNewLabel_3_1_1_1_1);
JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("");
lblNewLabel_3_1_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\MR.SAKURA_Z\\Downloads\\red.png"));
lblNewLabel_3_1_1_1_1_1.setBounds(323, 494, 44, 54);
contentPane.add(lblNewLabel_3_1_1_1_1_1);
JLabel lblNewLabel_3_1_1_1_1_1_1 = new JLabel("");
lblNewLabel_3_1_1_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\MR.SAKURA_Z\\Downloads\\red.png"));
lblNewLabel_3_1_1_1_1_1_1.setBounds(592, 494, 44, 54);
contentPane.add(lblNewLabel_3_1_1_1_1_1_1);
JPanel panel_2 = new JPanel();
panel_2.setBounds(25, 479, 794, 74);
contentPane.add(panel_2);
}
}