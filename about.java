import javax.swing.*;
import java.awt.*;

class About extends JFrame
{
	JFrame jf;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JButton b1,b2,b3;

	About()
	{
		jf=new JFrame();

		jf.setLayout(null);

		l1 = new JLabel("Pharmacy Inventory Manangement System");
		l1.setFont(new Font("Algerian",Font.BOLD,25));
		l1.setBounds(200,30,600,40);l1.setForeground(Color.black);
		jf.add(l1);



		l2 = new JLabel("This System developed by,");
		//l2.setFont(new Font("Times New Roman",Font.BOLD,20));
		l2.setBounds(100,150,600,40);
		jf.add(l2);

		
            l3 = new JLabel("Mr. Shubham Gupta");
		l3.setFont(new Font("Times New Roman",Font.BOLD,18));
		l3.setBounds(300,200,400,40);l3.setForeground(Color.black);
		jf.add(l3);
            
                       l8 = new JLabel("Mr. Shobhit Dwivedi");
		l8.setFont(new Font("Times New Roman",Font.BOLD,18));
		l8.setBounds(300,250,400,40);l8.setForeground(Color.black);
		jf.add(l8);

                       l9 = new JLabel("Mr. Saurabh Singh");
		l9.setFont(new Font("Times New Roman",Font.BOLD,18));
		l9.setBounds(300,300,400,40);l9.setForeground(Color.black);
		jf.add(l9);

            l10 = new JLabel("Mr. Sanket Saurabh");
		l10.setFont(new Font("Times New Roman",Font.BOLD,18));
		l10.setBounds(300,350,400,40);l10.setForeground(Color.black);
		jf.add(l10);




		l4 = new JLabel("Under the guidance of Dr. Karunendra   Verma.");
		l4.setFont(new Font("Times New Roman",Font.BOLD,18));l4.setForeground(Color.black);
		l4.setBounds(100,400,800,40);
		jf.add(l4);

		l5 = new JLabel("In this system we can add details of Medicines,Suppliers.");
		//l5.setFont(new Font("Times New Roman",Font.BOLD,20));
		l5.setBounds(100,450,800,40);
		jf.add(l5);

		l6 = new JLabel("We can also upadte,delete & search the existing details.");
		//l6.setFont(new Font("Times New Roman",Font.BOLD,20));
		l6.setBounds(100,500,800,40);
		jf.add(l6);

		l7 = new JLabel("It is helpfull for stock of Medicine & whrere we placed the medicine in store.");
		//l7.setFont(new Font("Times New Roman",Font.BOLD,20));
		l7.setBounds(100,550,800,40);
		jf.add(l7);

        jf.setTitle("About System");
		jf.setSize(900,700);
		jf.setLocation(20,20);
		jf.setResizable(false);
		jf.getContentPane().setBackground(Color.magenta);
		jf.setVisible(true);

	}

	public static void main(String args[])
	{
          new About();

	}
}
