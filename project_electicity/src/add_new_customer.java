
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class add_new_customer extends Frame implements ActionListener {

//	JLabel name, meter_no, address, state, city, email, ph_no;
//	JTextField name_txt, meter_no_txt, address_txt, state_txt, city_txt, email_txt, ph_no_txt;
//	JButton submit, cancel;
//
//	public add_new_customer() {
//		super("ADD CUSTOMER");
//
//		JPanel p = new JPanel();
//		p.setLayout(new GridLayout(9, 2, 10, 10));
//
//		p.setBackground(Color.WHITE);
//
//		name = new JLabel("NAME :");
//		name_txt = new JTextField();
//		p.add(name);
//		p.add(name_txt);
//
//		meter_no = new JLabel("METER NUMBER :");
//		meter_no_txt = new JTextField();
//		p.add(meter_no);
//		p.add(meter_no_txt);
//
//		address = new JLabel("ADDRESS : ");
//		address_txt = new JTextField();
//		p.add(address);
//		p.add(address_txt);
//
//		state = new JLabel("STATE :");
//		state_txt = new JTextField("KARNATAKA");
//		p.add(state);
//		p.add(state_txt);
//
//		city = new JLabel("CITY :");
//		city_txt = new JTextField("Bangalore");
//		p.add(city);
//		p.add(city_txt);
//
//		email = new JLabel("EMAIL :");
//		email_txt = new JTextField();
//		p.add(email);
//		p.add(email_txt);
//
//		ph_no = new JLabel("PHONE NUMBER :");
//		ph_no_txt = new JTextField();
//		p.add(ph_no);
//		p.add(ph_no_txt);
//
//		submit = new JButton("SUBMIT");
//		cancel = new JButton("CANCEL");
//
//		p.add(submit);
//		p.add(cancel);
//		add(p);
//		p.setLayout(new BorderLayout());
//		setSize(650, 600);
//		setVisible(true);
////        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//		add(p, "Center");
//
//		ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("images/hicon1.jpg"));
//		Image i3 = ic1.getImage().getScaledInstance(150, 280, Image.SCALE_DEFAULT);
//		ImageIcon ic2 = new ImageIcon(i3);
//		JLabel l8 = new JLabel(ic2);
//
//		add(l8, "West");
//		// for changing the color of the whole
////        getContentPane().setBackground(Color.WHITE);
//
//		System.out.println("end");
//		addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				dispose();
//			}
//		});

	JLabel name, meter_no, address, state, city, email, ph_no, image;
	JTextField nametxt, meter_no_txt, address_txt, state_txt, city_txt, email_txt, ph_no_txt;
	JButton submit, cancel;

	public add_new_customer(){
        super("Add Customer");
        setLocation(350,200);
        setSize(650,600);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(9,2,10,10));

        p.setBackground(Color.WHITE);

        name = new JLabel("Name");
        nametxt = new JTextField();
        p.add(name);
        p.add(nametxt);
        meter_no = new JLabel("Meter No");
        meter_no_txt = new JTextField();
        p.add(meter_no);
        p.add(meter_no_txt);
        address = new JLabel("Address");
        address_txt = new JTextField();
        p.add(address);
        p.add(address_txt);
        state = new JLabel("State");
        state_txt = new JTextField();
        p.add(state);
        p.add(state_txt);
        city = new JLabel("City");
        city_txt = new JTextField();
        p.add(city);
        p.add(city_txt);
        email = new JLabel("Email");
        email_txt = new JTextField();
        p.add(email);
        p.add(email_txt);
        ph_no = new JLabel("Phone Number");
        ph_no_txt = new JTextField();
        p.add(ph_no);
        p.add(ph_no_txt);

        submit = new JButton("Submit");
        cancel = new JButton("Cancel");

        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);

        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);

        p.add(submit);
        p.add(cancel);
        setLayout(new BorderLayout());

        add(p,"Center");

        ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("images/hicon1.jpg"));
        Image i3 = ic1.getImage().getScaledInstance(150, 280,Image.SCALE_DEFAULT);
        ImageIcon ic2 = new ImageIcon(i3);
        image = new JLabel(ic2);


        add(image,"West");
        //for changing the color of the whole 
//        getContentPane().setBackground(Color.WHITE);

        submit.addActionListener(this);
        cancel.addActionListener(this);
        setSize(1000,800);
//        setLocation(250,120);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
