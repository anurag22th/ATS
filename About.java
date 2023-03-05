package cab.booking.system;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class About extends JFrame implements ActionListener {

    JButton b1;
    JLabel l1;
    Font f, f1, f2;
    TextArea t1;
    String s;

    public About() {

        setLayout(null);
        JButton b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(180, 430, 120, 20);
        b1.addActionListener(this);

        Font f = new Font("RALEWAY", Font.BOLD, 180);
        setFont(f);

        s = "                                    About Projects          \n  "
                + "\n 78.ANURAG PAREEK\n80.PARTH SAWANT\n94.SOUMIL SALVI\nOnline Ambulance Booking System specializing in Hiring Ambulances for "
                + "customers. It is an online system through which customers "
                + "can view available ambulances; register the ambulances, view profile and "
                + "book ambulances.\n\n"
                + "With the ambulance booking system, consumers will be able to "
                + "make reservations online as well as make it easier and save time\n\n"
                + "It allows users to book their ambulance online, manage their bookings .\n"
  
                + "\nThe software acts as a 24/7 office due to its all-time availability."
                + "\nIt increases the efficiency of the system in offering quality "
                + "services to its patients."
               
                ;

        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20, 100, 450, 300);

        add(t1);

        Font f1 = new Font("RALEWAY", Font.BOLD, 16);
        t1.setFont(f1);

        Container contentPane = this.getContentPane();
        t1 = new TextArea();

        JLabel l1 = new JLabel("About Project");
        add(l1);
        l1.setBounds(170, 10, 180, 80);
        l1.setForeground(Color.red);

        Font f2 = new Font("RALEWAY", Font.BOLD, 20);
        l1.setFont(f2);

        setBounds(700, 220, 500, 550);

        setLayout(null);
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e) {
        dispose();
    }

    public static void main(String args[]) {
        new About().setVisible(true);
    }

}
