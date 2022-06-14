package mineShift;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class FrmMineShift extends JFrame {

	private JPanel contentPane;
	private JTextField textBoard;
	private JLabel lblMoveLeft;
	
	int count = 3; // Move counter (3 moves per turn)
	int team = 1; // Team Tracker
	int turn = 1; // Total Turn 
	
	ImageIcon icon = new ImageIcon(FrmMineShift.class.getResource("/Kaleb.jpg")); // Image to use

	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					
					FrmMineShift frame = new FrmMineShift();
					frame.setVisible(true);
					
				} 
				catch (Exception e) {
					
					e.printStackTrace();
					
				}
				
			}
			
		});
		
	}



	public FrmMineShift() {
		
		setTitle("Mine Shift");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Game Board
		textBoard = new JTextField();
		textBoard.setBackground(Color.WHITE);
		textBoard.setEditable(false);
		textBoard.setBounds(10, 57, 464, 493);
		contentPane.add(textBoard);
		textBoard.setColumns(10);
		
		JLabel lblTitle = new JLabel("Mine Shift");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblTitle.setBounds(183, 9, 115, 37);
		contentPane.add(lblTitle);
		
		// Tracking how many moves left
		lblMoveLeft = new JLabel("Move Left: 3");
		lblMoveLeft.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMoveLeft.setBounds(484, 57, 140, 14);
		contentPane.add(lblMoveLeft);
		
		// Tracking whose turn it is 
		JLabel lblTurn = new JLabel("Turn: Team 1 (1)"); // Team # (total # of turn)
		lblTurn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTurn.setBounds(484, 24, 140, 14);
		contentPane.add(lblTurn);
		
		// Turn the Tile - 1 per turn (90 degrees - cw or ccw)
		JButton btnTurnTile = new JButton("Turn Tile");
		btnTurnTile.setBounds(484, 117, 89, 23);
		contentPane.add(btnTurnTile);
		
		// Move the stone
		JButton btnMove = new JButton("Move");
		btnMove.setBounds(484, 189, 89, 23);
		contentPane.add(btnMove);
		
		btnTurnTile.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent event) {
				
				for(int i = 0; i < 1; i++) {
					
					count--; // Total move -1
					lblMoveLeft.setText("Move Left: " + count);
					btnTurnTile.setEnabled(false); // Once per turn
					
				}
				
				// Change Turn
				if(count == 0) {
					
					if(team == 1) { // If team 1's turn is over
						
						team++; // Change to team 2
						turn++; 
						lblTurn.setText("Turn: Team " + team + " (" + turn + ")");
						btnTurnTile.setEnabled(true);
						btnMove.setEnabled(true);
						count = 3;
						lblMoveLeft.setText("Move Left: " + count);
						
					}
					else if(team == 2) { // If team 2's turn is over
						
						team--; // change to team 1
						turn++; 
						lblTurn.setText("Turn: Team " + team + " (" + turn + ")");
						btnTurnTile.setEnabled(true);
						btnMove.setEnabled(true);
						count = 3;
						lblMoveLeft.setText("Move Left: " + count);
						
					}
					
				}
				
			}
			
		});
		
		btnMove.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent event) {
				
				// Combination of Moves - 3 total per turn
				if(count == 1) {  
					
					for(int i = 0; i < 1; i++) {
					
						count--;
						lblMoveLeft.setText("Move Left: " + count);
						if(count == 0) {
						
							btnMove.setEnabled(false);
					
						}
					
					}
					
				}
				else if (count == 2) {
					
					for(int i = 0; i < 1; i++) {
						
						count--;
						lblMoveLeft.setText("Move Left: " + count);
						if(count == 0) {
							
							btnMove.setEnabled(false);
					
						}
						
					}
					
				}
				else if (count == 3) {
					
					for(int i = 0; i < 1; i++) {
						
						count--;
						lblMoveLeft.setText("Move Left: " + count);
						if(count == 0) {
							
							btnMove.setEnabled(false);
					
						}
						
					}
					
				}
				
				// Change Turn
				if(count == 0) {
					
					if(team == 1) { // If team 1's turn is over
						
						team++;
						turn++; 
						lblTurn.setText("Turn: Team " + team + " (" + turn + ")");
						btnTurnTile.setEnabled(true);
						btnMove.setEnabled(true);
						count = 3;
						lblMoveLeft.setText("Move Left: " + count);
						
					}
					else if(team == 2) { // If team 2's turn is over
						
						team--;
						turn++; 
						lblTurn.setText("Turn: Team " + team + " (" + turn + ")");
						btnTurnTile.setEnabled(true);
						btnMove.setEnabled(true);
						count = 3;
						lblMoveLeft.setText("Move Left: " + count);
						
					}
					
				}
				
				
			}
			
		});
		
		// Start the Game
		JButton btnPlay = new JButton("Play");
		btnPlay.setBounds(484, 315, 89, 23);
		contentPane.add(btnPlay);
			
		btnPlay.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent event) {
				
				btnPlay.setEnabled(false);
				JOptionPane.showMessageDialog(null, "mine shift rules", "Mine Shift", JOptionPane.INFORMATION_MESSAGE, icon); // rules??
				
			}
			
		});
		
		// Reset the Game
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(484, 385, 89, 23);
		contentPane.add(btnReset);
		
		btnReset.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent event) {
				
				count = 3;
				team = 1;
				turn = 1; 
				lblTurn.setText("Turn: Team " + team + " (" + turn + ")");
				lblMoveLeft.setText("Move Left: " + count);
				btnTurnTile.setEnabled(true);
				btnMove.setEnabled(true);
				
			}
			
		});
		
		
	}
}
