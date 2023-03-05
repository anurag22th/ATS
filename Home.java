/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cab.booking.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Home extends JFrame{
    String username;
    public static void main(String[] args) {
        new Home("").setVisible(true);
    }
    
    public Home(String username) {
        super("Ambulance Booking System");
	this.username = username;
        setForeground(Color.CYAN);
        setLayout(null); 

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("cab/booking/system/icons/ambulance8.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);
        
        JLabel l1 = new JLabel("Ambulance Booking System");
	l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 55));
	l1.setBounds(780, 60, 1000, 100);
	NewLabel.add(l1);
		
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        JMenu m1 = new JMenu("PATIENT");
        m1.setForeground(Color.BLUE);
	menuBar.add(m1);
		
        JMenuItem mi1 = new JMenuItem("ADD PATIENT");
	m1.add(mi1);
        
        JMenuItem mi2 = new JMenuItem("UPDATE PATIENT DETAIL");
	m1.add(mi2);
        
        JMenuItem mi3 = new JMenuItem("VIEW PATIENT DETAILS");
	m1.add(mi3);
        
        JMenuItem mi4 = new JMenuItem("DELETE PATIENT DETAILS");
	m1.add(mi4);
        
        mi1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddCustomer(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new UpdateCustomer(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewCustomer().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new DeleteCustomer().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        
		
	JMenu m2 = new JMenu("BOOK INTRACITY AMBULANCE");
        m2.setForeground(Color.RED);
	menuBar.add(m2);
        
        JMenuItem mi7 = new JMenuItem("BOOK Ambulance");
	m2.add(mi7);
        
        JMenuItem mi5 = new JMenuItem("VIEW BOOKED ");
	m2.add(mi5);
        
       
        mi7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new BookCab(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        

	mi5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewBookedCab(username).setVisible(true);
                }catch(Exception e ){}
                
            }
	});
        
        
        JMenu m3 = new JMenu("BOOK INTERCITY Ambulance");
        m3.setForeground(Color.BLUE);
	menuBar.add(m3);
        
        JMenuItem mi8 = new JMenuItem("VIEW Ambulance");
	m3.add(mi8);
        
        JMenuItem mi9 = new JMenuItem("BOOK Ambulance");
	m3.add(mi9);
        
        JMenuItem mi10 = new JMenuItem("VIEW BOOKED Ambulance");
	m3.add(mi10);
        
        mi8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new ViewCabs().setVisible(true);
            }
	});
        
        
        
	mi9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new BookIntercityCab(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewInterCityBookedCab(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        
        
        JMenu m9 = new JMenu("BILL");
        m9.setForeground(Color.BLUE);
	menuBar.add(m9);
        
        JMenuItem mi18 = new JMenuItem("CHECK BILL");
	m9.add(mi18);
        
        mi18.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new CheckBill(username).setVisible(true);
                }catch(Exception e){ }
            }
	});
        
        
        JMenu m5 = new JMenu("PAYMENT");
        m5.setForeground(Color.RED);
	menuBar.add(m5);
        
        JMenuItem mi12 = new JMenuItem("PAY USING PAYTM");
	m5.add(mi12);
        
        mi12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Payment().setVisible(true);
            }
	});
        
        

        
        JMenu m7 = new JMenu("ABOUT");
        m7.setForeground(Color.RED);
	menuBar.add(m7);
        
        JMenuItem mi15 = new JMenuItem("ABOUT");
	m7.add(mi15);
        
        mi15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new About().setVisible(true);
            }
	});
        
        
        
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}
