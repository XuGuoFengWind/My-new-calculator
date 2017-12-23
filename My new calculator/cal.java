import java.awt.*;
import javax.swing.*;
public class cal extends JFrame{
	JFrame JF;
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10,jb11,jb12,jb13,jb14,
	jb15,jb16,jb17,jb18,jb19,jb20;
	JTextField jt;
	JPanel jp1,jp2,jp3,jp4,jp5,jp6;
	public static void main(String[] args) {
		cal ab=new cal();
	}
	public cal(){
		JF=new JFrame();
		JF.setLayout(null);
		
		jb1=new JButton("1");jb2=new JButton("2");
		jb3=new JButton("3");jb4=new JButton("4");
		jb5=new JButton("5");jb6=new JButton("6");
		jb7=new JButton("7");jb8=new JButton("8");
		jb9=new JButton("9");jb10=new JButton("0");
		jb11=new JButton("+");jb12=new JButton("-");
		jb13=new JButton("*");jb14=new JButton("/");
		jb15=new JButton(".");/*jb16=new JButton("C");*/
		jb17=new JButton("C");jb18=new JButton("%");
		jb19=new JButton("=");jb20=new JButton("S");
		
		jt=new JTextField();
		JF.getContentPane().add(jt);jt.setBounds(10, 10, 240, 40);
		
		JF.getContentPane().add(jb17);jb17.setBounds(10,50,60,40);
		JF.getContentPane().add(jb14);jb14.setBounds(70,50,60,40);
		JF.getContentPane().add(jb13);jb13.setBounds(130,50,60,40);
		JF.getContentPane().add(jb20);jb20.setBounds(190,50,60,40);
		
		JF.getContentPane().add(jb7);jb7.setBounds(10,90,60,40);
		JF.getContentPane().add(jb8);jb8.setBounds(70,90,60,40);
		JF.getContentPane().add(jb9);jb9.setBounds(130,90,60,40);
		JF.getContentPane().add(jb12);jb12.setBounds(190,90,60,40);
		
		JF.getContentPane().add(jb4);jb4.setBounds(10,130,60,40);
		JF.getContentPane().add(jb5);jb5.setBounds(70,130,60,40);
		JF.getContentPane().add(jb6);jb6.setBounds(130,130,60,40);
		JF.getContentPane().add(jb11);jb11.setBounds(190,130,60,40);
		
		JF.getContentPane().add(jb1);jb1.setBounds(10,170,60,40);
		JF.getContentPane().add(jb2);jb2.setBounds(70,170,60,40);
		JF.getContentPane().add(jb3);jb3.setBounds(130,170,60,40);
		JF.getContentPane().add(jb19);jb19.setBounds(190,170,60,80);
		
		JF.getContentPane().add(jb18);jb18.setBounds(10,210,60,40);
		JF.getContentPane().add(jb10);jb10.setBounds(70,210,60,40);
		JF.getContentPane().add(jb15);jb15.setBounds(130,210,60,40);
		
		JF.setTitle("¼òÒ×¼ÆËãÆ÷");
		JF.setSize(270,320);
		JF.setLocation(300,300);
		JF.setResizable(true);
		JF.setVisible(true);
		JF.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}