/*************************************************************************************
*AUTHOR       :  ALVIN VARGHESE
*PROGRAM      :  TO implement SignUp form using Event handling
*DATE         :  3/2/2022
*version      :  1.0  
**************************************************************************************/
package BasicPrograms;
import java.awt.*;
import java.awt.event.*;
class 	SignUpForm extends Frame implements ActionListener {
	Label lblTitle,lblt2,lblfirstName,lbllastName,lblphno,lblGender,lblmail,pass,msg;
	TextField txtfirstName,txtlastName,txtphno,txtmail,txtpass;
	Checkbox checkMale, checkFemale;
	CheckboxGroup cbg;
	Button sub,reset;
 
	public SignUpForm() {
		setTitle("User Sign Up form");
		setSize(1650,1080);
		setLayout(null);
		setVisible(true);
		Color formColor = new Color(204,204,204);
		setBackground(formColor);
 
		Font titleFont = new Font("arial", Font.BOLD, 25);
		Font labelFont =new  Font("arial", Font.BOLD, 18);
		Font textFont =new  Font("arial", Font.PLAIN, 18);
 
		lblTitle=new Label("Sign Up");  
		lblTitle.setBounds(70,40,300,50);
		lblTitle.setFont(titleFont);
		lblTitle.setForeground(Color.BLACK);
		add(lblTitle);
		
		lblt2=new Label("Create your account using gmail");  
		lblt2.setBounds(70,75,300,50);
		lblt2.setFont(labelFont);
		lblt2.setForeground(Color.WHITE);
		add(lblt2);
		
		lblfirstName=new Label("First Name");  
		lblfirstName.setBounds(70,150,150,30);
		lblfirstName.setFont(labelFont);  
		lblfirstName.setForeground(Color.BLACK);
		add(lblfirstName);
 
		txtfirstName=new TextField();
		txtfirstName.setBounds(70,180,200,30);
		txtfirstName.setFont(textFont);
		add(txtfirstName);
		
		lbllastName=new Label("Last Name");  
		lbllastName.setBounds(300,150,150,30);
		lbllastName.setFont(labelFont);  
		lbllastName.setForeground(Color.BLACK);
		add(lbllastName);
 
		txtlastName=new TextField();
		txtlastName.setBounds(300,180,200,30);
		txtlastName.setFont(textFont);
		add(txtlastName);
 
 
		lblphno=new Label("Phone Number");  
		lblphno.setBounds(70,250,150,30);
		lblphno.setFont(labelFont);
		lblphno.setForeground(Color.BLACK);
		add(lblphno);
 
		txtphno=new TextField();
		txtphno.setBounds(70,280,435,30);
		txtphno.setFont(textFont);
		add(txtphno);
 
		
		lblmail=new Label("Email");  
		lblmail.setBounds(70,425,150,30);
		lblmail.setFont(labelFont);
		lblmail.setForeground(Color.BLACK);
		add(lblmail);
 
		txtmail=new TextField();
		txtmail.setBounds(70,455,435,30);
		txtmail.setFont(labelFont);
		add(txtmail);
 
		lblGender=new Label("Gender");  
		lblGender.setBounds(70,350,150,30);
		lblGender.setFont(labelFont);
		lblGender.setForeground(Color.BLACK);
		add(lblGender);
 
		cbg = new CheckboxGroup();
 
		checkMale = new Checkbox("Male",cbg,true);
		checkMale.setBounds(220,350, 100, 30);
		checkMale.setFont(textFont);
		checkMale.setForeground(Color.BLACK);
		add(checkMale);
 
		checkFemale = new Checkbox("Female",cbg,false);
		checkFemale.setBounds(350,350,100, 30);
		checkFemale.setFont(textFont);
		checkFemale.setForeground(Color.BLACK);
		add(checkFemale);
 
		pass=new Label("Password");  
		pass.setBounds(70,545,150,30);
		pass.setFont(labelFont);
		pass.setForeground(Color.BLACK);
		add(pass);
 
		txtpass=new TextField();
		txtpass.setBounds(70,575,435,30);
		txtpass.setFont(labelFont);
		add(txtpass);
		txtpass.setEchoChar('*');
		
		sub=new Button("Create");
		sub.setBounds(400,650,150,30);
		sub.setFont(labelFont);
		sub.setBackground(Color.BLACK);
		sub.setForeground(Color.WHITE);
		add(sub);
		sub.addActionListener(this);
 
		reset=new Button("Reset");
		reset.setBounds(560,650,150,30);
		reset.setFont(labelFont);
		reset.setBackground(Color.BLACK);
		reset.setForeground(Color.WHITE);
		add(reset);
		reset.addActionListener(this);
		
		
 
		// Close Button Code
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
			
		});
		
	}

	public void actionPerformed(ActionEvent e) {
		 if (e.getSource() == sub) {
			 Font msgFont = new Font("arial", Font.BOLD, 30);
			 msg=new Label();
				msg.setBounds(630,350,1000,30);
				msg.setFont(msgFont);
				msg.setText("Account created! For Account details visit console");
				add(msg);
			 String data2;
             String data1
                 = "\n\n Name \t\t\t:\t"
                   + txtfirstName.getText() +" "+txtlastName.getText()+ "\n\n"
                   + " Mobile Number \t\t:\t"
                   + txtphno.getText() + "\n\n";
             boolean isChecked=checkMale.getState();
 			if(isChecked)
 			{
 				 data2 = " Gender \t\t:\tMale "+ "\n\n";
 			}
 			else
 			{
 				 data2 = " Gender \t\t:\tFemale"
	                            + "\n\n";
 			}
             String data3 = " Email \t\t\t:\t" + txtmail.getText();
             String data4 = "\n\n Password \t\t:\t" + txtpass.getText();
             System.out.println("\n-----------Account Details---------------------");
             System.out.println( data1 + data2 + data3+ data4);
             
         }
			 
		 else if (e.getSource() == reset) {
	            String def = "";
	            txtfirstName.setText(def);
	            txtlastName.setText(def);
	            txtphno.setText(def);
	            txtmail.setText(def);	
	}
 
}
	public static void main(String[] args) {
		new SignUpForm();
	}
 
}
