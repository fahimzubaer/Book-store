/* Name: Fahim Zubaer 
*/

package assignment1;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class builder {

	private static JFrame title;
	private static  JTextField textField1;
	private static  JTextField textField2;
	private static  JTextField textField3;
	private static  JTextField textField4;
	private static  JTextField textField5;
	
	private static JButton btnexit;
	private static JButton btnprocess;
	private static JButton btnconfirm;
	private static JButton btnfin;
	private static JButton btnord;
	private static JButton btnview;
	private static JPanel panel;
	
	private static int currentord;
	private static Resolve resolve;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					builder window = new builder();
					window.title.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public builder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		title = new JFrame();
		title.setFont(new Font("Arial", Font.BOLD, 12));
		title.getContentPane().setBackground(Color.LIGHT_GRAY);
		title.setBackground(new Color(128, 0, 0));
		title.setTitle("Zebra Book Store");
		title.setBounds(100, 100, 888, 394);
		title.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		title.getContentPane().setLayout(null);
		
		JLabel lbl1 = new JLabel("Enter number of items in this order:");
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl1.setBounds(104, 29, 235, 17);
		title.getContentPane().add(lbl1);
		
		textField1 = new JTextField();
		textField1.setBounds(339, 28, 463, 20);
		title.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JLabel lbl2 = new JLabel("Enter Book ID for Item #1:");
		lbl2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl2.setBounds(158, 57, 166, 14);
		title.getContentPane().add(lbl2);
		
		textField2 = new JTextField();
		textField2.setBounds(339, 55, 463, 20);
		title.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JLabel lbl3 = new JLabel("Enter quantity for Item #1:");
		lbl3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl3.setBounds(158, 82, 181, 14);
		title.getContentPane().add(lbl3);
		
		textField3 = new JTextField();
		textField3.setBounds(339, 79, 463, 20);
		title.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		JLabel lbl4 = new JLabel("Item #1 info:");
		lbl4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl4.setBounds(244, 107, 89, 14);
		title.getContentPane().add(lbl4);
		
		textField4 = new JTextField();
		textField4.setBounds(339, 105, 463, 20);
		title.getContentPane().add(textField4);
		textField4.setColumns(10);
		
		JLabel lbl5 = new JLabel("Order subtotal for 0 item(s):");
		lbl5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl5.setBounds(149, 132, 175, 14);
		title.getContentPane().add(lbl5);
		
		textField5 = new JTextField();
		textField5.setBounds(338, 130, 464, 20);
		title.getContentPane().add(textField5);
		textField5.setColumns(10);
		
		JButton btnprocess = new JButton("Process Item #1");
		btnprocess.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnprocess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnprocess.setBounds(10, 265, 154, 30);
		title.getContentPane().add(btnprocess);
		
		JButton btnconfirm = new JButton("Confirm Item #1");
		btnconfirm.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnconfirm.setBounds(173, 265, 166, 30);
		title.getContentPane().add(btnconfirm);
		
		JButton btnview = new JButton("View Order");
		btnview.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnview.setBounds(349, 265, 112, 30);
		title.getContentPane().add(btnview);
		
		JButton btnfin  = new JButton("Finish Order");
		btnfin .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnfin .setFont(new Font("Tahoma", Font.BOLD, 12));
		btnfin .setBounds(471, 265, 130, 30);
		title.getContentPane().add(btnfin);
		
		JButton btnord = new JButton("New Order");
		btnord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnord.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnord.setBounds(611, 266, 105, 28);
		title.getContentPane().add(btnord);
		
		JButton btnexit = new JButton("Exit");
		btnexit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnexit.setBounds(726, 265, 76, 30);
		title.getContentPane().add(btnexit);
	}
	
	
	private static void buttons() {
		
		btnexit = new JButton("Exit");
		btnord = new JButton("New Order");
		btnfin = new JButton("Fininsh Order");
		btnprocess = new JButton("Process Item #"+ String.valueOf(currentord)+"");
		btnview = new JButton("View Order");
		btnconfirm = new JButton("Confirm Item"+String.valueOf(currentord)+"");
		
		btnconfirm.addActionListener(new ActionListener()
         {
                         @Override
                         public void actionPerformed(ActionEvent arg0) 
                         {
                                 JOptionPane.showMessageDialog(panel,"Item #"+String.valueOf(currentord)+" accepted");
                                 textField1.setEditable(false);
                                 btnprocess.setEnabled(true);
                                 btnconfirm.setEnabled(false);
                         }
                 });
		
		
		
		
		btnord.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
	
		btnexit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				title.dispose();
			
			}
			});
                
		panel.add(btnexit);
	}
	
	
	
	
}
