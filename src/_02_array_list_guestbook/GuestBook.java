package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import _01_array_list_visualizer.data.ArrayList;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
		
	
	public  void Action() {
		button.setText("Add Name");
		button.addActionListener(this);
		button2.setText("View Names");
		button2.addActionListener(this);
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		frame.pack();
		frame.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		GuestBook Book = new GuestBook();
		Book.Action();
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	ArrayList<String> list = new ArrayList<String>();
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton)arg0.getSource();
		if(buttonClicked==button) {
			String names = JOptionPane.showInputDialog("Enter a name");
			list.add(names);
				
		
		}
		else if(buttonClicked==button2) {
			for (int i = 0; i < list.size(); i++) {
				String s = list.get(i);
				System.out.println("Guest #"+ (i+1)+" "+s);
			}
			
			
		}
	}
}

