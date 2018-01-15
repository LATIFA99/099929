import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class two extends JFrame{
       private JTextField resultfield;
       private JButton one , two , three , four ,five ,six, seven , eight , nine ,zero ,plus ,  minus ,divide , multiply , Del , decimal , reset, equals;
       private String stemp1 ,stemp2 ,sresult;
       private double result = 0.0;
       private JPanel contentPanel;
       private JLabel l1, l2,l2a, l3, l4, l5;
       private boolean equalsClicked = false , opChosen = false;
       char operation = ' ';
       
       public two() {
    	   super("calculator");
    	   
    	   
    	   resultfield = new JTextField(null, 30);
    	   resultfield.setEditable(false);
    	   
    	   nine = new JButton("9");
    	   eight = new JButton("8");
    	   seven = new JButton("7");
    	   six = new JButton("6");
    	   five = new JButton("5");
    	   four = new JButton("4");
    	   three = new JButton("3");
    	   two = new JButton("2");
    	   one = new JButton("1");
    	   zero = new JButton("0");
    	   multiply = new JButton("*");
    	   divide = new JButton("/");
    	   plus = new JButton("+");
    	   minus = new JButton("-");
    	   equals = new JButton("=");
    	   decimal = new JButton(".");
    	   Del = new JButton("D");
    	   reset = new JButton("reset");
    	   l1 = new JLabel("");
    	   l2 = new JLabel(" ");
    	   l2a = new JLabel(" ");
    	   l3 = new JLabel(" ");
    	   l4 = new JLabel(" ");
    	   l5 = new JLabel(" ");
    	   
    	   
    	   Dimension dim = new Dimension(50, 50);
    	    
    	   nine.setPreferredSize(dim);
    	   eight.setPreferredSize(dim);
    	   seven.setPreferredSize(dim);
    	   six.setPreferredSize(dim);
    	   five.setPreferredSize(dim);
    	   four.setPreferredSize(dim);
    	   three.setPreferredSize(dim);
    	   two.setPreferredSize(dim);
    	   one.setPreferredSize(dim);
    	   zero.setPreferredSize(dim);
    	   reset.setPreferredSize(dim);
    	   Del.setPreferredSize(dim);
    	   decimal.setPreferredSize(dim);
    	   multiply.setPreferredSize(dim);
    	   divide.setPreferredSize(dim);
    	   plus.setPreferredSize(dim);
    	   minus.setPreferredSize(dim);
    	   equals.setPreferredSize(dim);
    	   resultfield.setPreferredSize(new Dimension(200, 35));
    	   l1.setPreferredSize(new Dimension(205, 50));
    	   l4.setPreferredSize(new Dimension(150, 50));
    	   l5.setPreferredSize(new Dimension(100, 50));
    	   reset.setPreferredSize(new Dimension(100,30));
    	   l2.setPreferredSize(dim);
    	   l2a.setPreferredSize(new Dimension(100,50));
    	   l3.setPreferredSize(dim);
    	   
    	   Numb num = new Numb();
    	   Calcu c = new Calcu();
    	   
    	   one.addActionListener(num);two.addActionListener(num);three.addActionListener(num);four.addActionListener(num);
    	   five.addActionListener(num);six.addActionListener(num);seven.addActionListener(num);eight.addActionListener(num);
    	   nine.addActionListener(num);zero.addActionListener(num);decimal.addActionListener(num);Del.addActionListener(num);
    	   
    	   plus.addActionListener(c); minus.addActionListener(c); divide.addActionListener(c);
    	   multiply.addActionListener(c); equals.addActionListener(c);
    	   reset.addActionListener(c); 
    	   
    	   
    	   contentPanel = new JPanel();
    	   contentPanel.setBackground(Color.GREEN);
    	   contentPanel.setLayout(new FlowLayout());
    	   contentPanel.add(resultfield, BorderLayout.CENTER);
    	   contentPanel.add(l1);contentPanel.add(reset);l2a = new JLabel(" "); 
    	   contentPanel.add(seven); contentPanel.add(eight);contentPanel.add(nine); contentPanel.add(l2);contentPanel.add(plus);contentPanel.add(minus);
    	   contentPanel.add(four);  contentPanel.add(five); contentPanel.add(six);contentPanel.add(l3);contentPanel.add(divide);contentPanel.add(multiply);
    	   contentPanel.add(one); contentPanel.add(two); contentPanel.add(three); contentPanel.add(l4);
    	   contentPanel.add(zero); contentPanel.add(decimal); contentPanel.add(l5); contentPanel.add(equals); contentPanel.add(Del);
    	   
    	   
    	   
    	   this.setContentPane(contentPanel);
    	   
       }
       private class Numb implements ActionListener{
    	   public void actionPerformed(ActionEvent event) {
    		   JButton src = (JButton)event.getSource();
    		   
    		   if(src.equals(one)) {
    			   if(opChosen == false) {
    				   if(stemp1==null) {
    					   stemp1 = "1";
    				   }else {
    					   stemp1 =stemp1 + "1";
    				   }
    			   }else {
    				   if(stemp2==null) {
    					   stemp2 = "1";
    				   }else {
    					   stemp2 = stemp2 + "1";
    				   }
    			   }
    		   }
    		   if(src.equals(two)) {
    			   if(opChosen == false) {
    				   if(stemp1==null) {
    					   stemp1 = "2";
    				   }else {
    					   stemp1 =stemp1 + "2";
    				   }
    			   }else {
    				   if(stemp2==null) {
    					   stemp2 = "2";
    				   }else {
    					   stemp2 = stemp2 + "2";
    				   }
    			   }
    		   }
    		   if(src.equals(three)) {
    			   if(opChosen == false) {
    				   if(stemp1==null) {
    					   stemp1 = "3";
    				   }else {
    					   stemp1 =stemp1 + "3";
    				   }
    			   }else {
    				   if(stemp2==null) {
    					   stemp2 = "3";
    				   }else {
    					   stemp2 = stemp2 + "3";
    				   }
    			   }
    		   }
    		   if(src.equals(four)) {
    			   if(opChosen == false) {
    				   if(stemp1==null) {
    					   stemp1 = "4";
    				   }else {
    					   stemp1 =stemp1 + "4";
    				   }
    			   }else {
    				   if(stemp2==null) {
    					   stemp2 = "4";
    				   }else {
    					   stemp2 = stemp2 + "4";
    				   }
    			   }
    		   }
    		   if(src.equals(five)) {
    			   if(opChosen == false) {
    				   if(stemp1==null) {
    					   stemp1 = "5";
    				   }else {
    					   stemp1 =stemp1 + "5";
    				   }
    			   }else {
    				   if(stemp2==null) {
    					   stemp2 = "5";
    				   }else {
    					   stemp2 = stemp2 + "5";
    				   }
    			   }
    		   }
    		   if(src.equals(six)) {
    			   if(opChosen == false) {
    				   if(stemp1==null) {
    					   stemp1 = "6";
    				   }else {
    					   stemp1 =stemp1 + "6";
    				   }
    			   }else {
    				   if(stemp2==null) {
    					   stemp2 = "6";
    				   }else {
    					   stemp2 = stemp2 + "6";
    				   }
    			   }
    		   }
    		   if(src.equals(seven)) {
    			   if(opChosen == false) {
    				   if(stemp1==null) {
    					   stemp1 = "7";
    				   }else {
    					   stemp1 =stemp1 + "7";
    				   }
    			   }else {
    				   if(stemp2==null) {
    					   stemp2 = "7";
    				   }else {
    					   stemp2 = stemp2 + "7";
    				   }
    			   }
    		   }
    		   if(src.equals(eight)) {
    			   if(opChosen == false) {
    				   if(stemp1==null) {
    					   stemp1 = "8";
    				   }else {
    					   stemp1 =stemp1 + "8";
    				   }
    			   }else {
    				   if(stemp2==null) {
    					   stemp2 = "9";
    				   }else {
    					   stemp2 = stemp2 + "8";
    				   }
    			   }
    		   }
    		   if(src.equals(nine)) {
    			   if(opChosen == false) {
    				   if(stemp1==null) {
    					   stemp1 = "9";
    				   }else {
    					   stemp1 =stemp1 + "9";
    				   }
    			   }else {
    				   if(stemp2==null) {
    					   stemp2 = "9";
    				   }else {
    					   stemp2 = stemp2 + "9";
    				   }
    			   }
    		   }
    		   if(src.equals(zero)) {
    			   if(opChosen == false) {
    				   if(stemp1==null) {
    					   stemp1 = "0";
    				   }else {
    					   stemp1 =stemp1 + "0";
    				   }
    			   }else {
    				   if(stemp2==null) {
    					   stemp2 = "0";
    				   }else {
    					   stemp2 = stemp2 + "0";
    				   }
    			   }
    		   }
    		   if(src.equals(decimal)) {
    			   if(opChosen == false) 
    				   if(stemp1==null) {
    					   stemp1 = "0.";
    				   }else {
    					   if(stemp1 !=null) {
    					   if(stemp1.contains(" .")) {
    						   System.out.println("You already have a decimal point!");
    					   }else {
    						   stemp1 += "."; 
    					   }
    				   }
    			   }else {
    				   if(stemp2==null) {
    					   stemp2 = "0.";
    				   }else 
    				   if(stemp2 !=null){
    					   if(stemp1.contains(".")) {
    						   System.out.println("you have a decimal point!");
    					   }else {
    						   stemp2 += '.';
    					   }
    				   }
    			   }
    		   }
    		   if(src.equals(Del)) {
    			   if(opChosen==false) {
    				   if(stemp1==null) {
    					   System.out.println("Cannot reset!");
    				   }else {
    					   stemp1 = stemp1.substring(0, stemp1.length()-1);
    				   }
    			   }else {
    				   if(stemp2==null){
    					   System.out.println("Cannot reset again!");
    				   }else {
    					   stemp2 = stemp2.substring(0, stemp2.length()-1);
    				   }
    			   }
    		   }
    		   if(equalsClicked==false) {
    			   if(opChosen==false) {
    				   resultfield.setText(stemp1);
    			   }else {
    				   resultfield.setText(stemp2);
    			   }
    		   }
    		   
    		   
    		   if (opChosen==false) {
    			   resultfield.setText(stemp1);
    		   }else {
    			   resultfield.setText(stemp2);
    		   }
    		   
    	   }
       }
       private class Calcu implements ActionListener{
 public void actionPerformed(ActionEvent event) {
	 JButton src = (JButton)event.getSource();
	 
	 if(src.equals(plus)) {
		 if(stemp1==null) {
			 System.out.println("Choose your numbers first!");
		 }else {
			 if(stemp1 != null && stemp2 == null) {
				 opChosen = true;
				 operation = '+';
			 }else {
				 if(stemp1 !=null && stemp2 ==null) {
					 System.out.println("Two operations only!");
				 }
			 }
			 
		 }
	 }
	 if(src.equals(minus)) {
		 if(stemp1==null) {
			 System.out.println("Choose your numbers first!");
		 }else {
			 if(stemp1 != null && stemp2 == null) {
				 opChosen = true;
				 operation = '-';
			 }else {
				 if(stemp1 !=null && stemp2 ==null) {
					 System.out.println("Two operations only!");
				 }
			 }
			 
		 }
	 }
	 if(src.equals(multiply)) {
		 if(stemp1==null) {
			 System.out.println("Choose your numbers first!");
		 }else {
			 if(stemp1 != null && stemp2 == null) {
				 opChosen = true;
				 operation = '*';
			 }else {
				 if(stemp1 !=null && stemp2 ==null) {
					 System.out.println("Two operations only!");
				 }
			 }
			 
		 }
	 }
	 if(src.equals(divide)) {
		 if(stemp1==null) {
			 System.out.println("Choose your numbers first!");
		 }else {
			 if(stemp1 != null && stemp2 == null) {
				 opChosen = true;
				 operation = '/';
			 }else {
				 if(stemp1 !=null && stemp2 ==null) {
					 System.out.println("Two operations only!");
				 }
			 }
			 
		 }
	 }
	 if(src.equals(equals)) {
		 if(stemp1==null) {
			 System.out.println("Choose BOTH numbers first!");
		 }
		 
		 if(stemp1 !=null && stemp2 !=null) {
			 double d1 = 0.0; double d2 = 0.0;
			
			 d1= Double.parseDouble(stemp1);
			 d2= Double.parseDouble(stemp2);
			 
			 switch(operation) {
			 case '+':
			 result = d1 + d2;
			 break;
			 case '-':
				 result = d1 - d2;
				 break;
			 case '*':
				 result = d1 * d2;
				 break;
			 case '/':
				 result = d1 /d2;
			 }
			 
			 sresult = Double.toString(result);
			 resultfield.setText(sresult); 
			 if(operation == '/' && d2 == 0.0) {
				 resultfield.setText("error");
			 }
		 }
	 }
	 if(src.equals(reset)) {
		 stemp1 = null;
		 stemp2 = null;
		 equalsClicked = false;
		 opChosen = false;
		 operation = ' '; 
		 resultfield.setText(null);
		 sresult = null;
	 }
	 
    	   }
       }
}
