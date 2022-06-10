package mineshift;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;

public class FrmMineShift extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMineShift frame = new FrmMineShift();
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
	public FrmMineShift() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 320);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.highlight"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("MINE SHIFT");
		lblTitle.setForeground(new Color(0, 128, 128));
		lblTitle.setFont(new Font("Dubai", Font.BOLD | Font.ITALIC, 30));
		lblTitle.setBounds(98, 0, 184, 64);
		contentPane.add(lblTitle);
		
		JLabel lblTitle2 = new JLabel("By the creators of something\u2122");
		lblTitle2.setForeground(new Color(106, 90, 205));
		lblTitle2.setFont(new Font("Dubai", Font.BOLD, 15));
		lblTitle2.setBounds(88, 56, 214, 14);
		contentPane.add(lblTitle2);
		
		JLabel lblPhoto2 = new JLabel("");
		lblPhoto2.setIcon(new ImageIcon("C:\\Users\\cfbur\\Downloads\\\\ShiftMine-main\\ShiftMine-main\\src\\img\\Kaleb.jpg"));
		lblPhoto2.setBounds(0, 0, 88, 81);
		contentPane.add(lblPhoto2);
		
		JLabel lblPhoto1 = new JLabel("");
		lblPhoto1.setIcon(new ImageIcon("C:\\Users\\cfbur\\Downloads\\ShiftMine-main\\ShiftMine-main\\src\\img\\game.jpg"));
		lblPhoto1.setBounds(0, 80, 390, 204);
		contentPane.add(lblPhoto1);

		JLabel lblPhoto3 = new JLabel("");
		lblPhoto3.setIcon(new ImageIcon("C:\\Users\\cfbur\\Downloads\\\\ShiftMine-main\\ShiftMine-main\\src\\img\\Kaleb.jpg"));
		lblPhoto3.setBounds(315, 0, 92, 81);
		contentPane.add(lblPhoto3);
	}
}

