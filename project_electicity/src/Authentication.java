
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class Authentication extends JFrame implements ActionListener {
	 JLabel user_name,password;
	 JTextField user_name_txt;
	 JPasswordField password_text;
	 JButton login,cancel;
	 JPanel p2,p3;
	 JLabel img;
	 
	public Authentication() {
		super("LOGIN PAGE");
		user_name = new JLabel("USER-NAME: ");
		password = new JLabel("PASSWORD: ");
		
	  user_name_txt = new JTextField(15);
      password_text = new JPasswordField(15);
	      
	        login = new JButton("Login");
	        cancel=new JButton("Cancel");
	        
	        ImageIcon ic3=new ImageIcon(ClassLoader.getSystemResource("images/shock1.jpg"));
	        Image i3=ic3.getImage().getScaledInstance(340,370,Image.SCALE_DEFAULT);
	        ImageIcon icc3=new ImageIcon(i3);
	        img=new JLabel(icc3);
	        
	        setLayout(new BorderLayout());
	        setVisible(true);
	        
	        p2 = new JPanel();
	        p3 = new JPanel();
	        
	        add(img,BorderLayout.WEST);
	        
	        
	        p2.add(user_name);
	        p2.add(user_name_txt);
	        p2.add(password);
	        p2.add(password_text);
	        add(p2,BorderLayout.CENTER);
	        
	        p3.add(login);
	        p3.add(cancel);
	        login.addActionListener((ActionListener)this);
	        cancel.addActionListener((ActionListener)this);
	        add(p3,BorderLayout.SOUTH);
	        setSize(640,450);
	        setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public Boolean verifyUser(String username,String password) {
		//implement verification
		//return true if match exits
		//else false
		return false;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==login) {
			//verification
			//check the details from database and authorize
			if(verifyUser( user_name_txt.getText(),password_text.getPassword().toString())){
				
			}
			else {
				//wrong password
				//implement popup
				JOptionPane.showMessageDialog(cancel, "Wrong password");
			}
		}
	}

}
