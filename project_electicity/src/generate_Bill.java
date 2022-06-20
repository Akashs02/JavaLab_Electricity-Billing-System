
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class generate_Bill extends Frame implements ActionListener {

	JLabel name, address ,ph_no, state, city, meter_no, email;
	JButton print,exit;
	public generate_Bill(String Name,String Meter_Number,String Address,String State,String City,String Mail,String Ph_num){
		super("GENERATED BILL");
		JPanel p =new JPanel();
	        
		name = new JLabel("NAME :");
		p.add(name);
		JLabel ABC=new JLabel(Name);
		p.add(ABC);
	    meter_no = new JLabel("METER NUMBER :");
	    p.add(meter_no);
	    JLabel vdf=new JLabel(Meter_Number);
	    address = new JLabel("ADDRESS : ");
	    p.add(vdf);
	    p.add(address);
	   JLabel Address_label =new JLabel(Address);
	   JLabel karnataka=new JLabel(State) ;
	   JLabel state = new JLabel("STATE :");
	    p.add(Address_label);
	    p.add(state);
	    p.add(karnataka);
	    JLabel bangalore=new JLabel(City);
	    city = new JLabel("CITY :");
	    p.add(city);
	    p.add(bangalore);
	    JLabel mail=new JLabel(Mail);
	    email = new JLabel("EMAIL :");
	    p.add(email);
	    p.add(mail);
	    JLabel ph=new JLabel(Ph_num);
	    ph_no = new JLabel("PHONE NUMBER :");
	    p.add(ph_no);
	    p.add(ph);
	    JLabel amount = new JLabel("Amount:");
	    calculate_bill bill  = new calculate_bill();
	    double amt = bill.Calculate("123");
	    JLabel amt_label = new JLabel(Double.toString(amt));
	    p.add(amount);
	    p.add(amt_label);
	    print = new JButton("PRINT");
        exit = new JButton("EXIT");
		
//        p.add(print);
        p.add(exit);
        add(p);
        p.setLayout(new GridLayout(9,2));
        setSize(650,600);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("end");
		
	

}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
