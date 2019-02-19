package final4;
import javax.swing.JOptionPane;
public class final4_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String messger ="";
		boolean check=true,total=true;
		while(check){
			messger = JOptionPane.showInputDialog("Enter positive number");
			int checknumber = Integer.parseInt(messger);
			int limit = (int) Math.sqrt(checknumber);
		      for (int i = 2; i <= limit; i++) { // วนลูปตรวจสอบจำนวนเฉพาะเริ่มต้นที่ 2 ถึงจำนวนสุดท้าย
		          if (checknumber % i == 0) {
		        	  	total=false;
		        	  	//System.out.println(total);
		        	  	break;
		          }
		      }
		      if (total) {
		    	  JOptionPane.showMessageDialog(null,"<html><body>"+
							"Number"+checknumber+"<p>is prime number</p></body></html>",
							"PROGRAME",	
							JOptionPane.INFORMATION_MESSAGE);
							check =false;
		      }
		      else {
		    	  	total=true;
					JOptionPane.showMessageDialog(null,"<html><body>"+
					"Number"+checknumber+"<p>is not prime number</p></body></html>",
					"PROGRAME",	
					JOptionPane.INFORMATION_MESSAGE);		
		      }
		}
	}
}