package final4;
import javax.swing.JOptionPane;
public class final4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String messger1="",messger2="",messger3="";
		int number1=0,number2=0,number3=0,total=0;
		//for (int i=0;i<3;i++) {
			messger1 = JOptionPane.showInputDialog("Take three number:1");
			messger2 = JOptionPane.showInputDialog("Take three number:2");
			messger3 = JOptionPane.showInputDialog("Take three number:3");
			number1=Integer.parseInt(messger1);
			number2=Integer.parseInt(messger2);
			number3=Integer.parseInt(messger3);

		//}
		if (number1>number2) {
			total = number1;
			if (total>number3) {
				total = number1;
			}
			else {
				total = number3;
			}
		}
		else {
			total = number2;
			if(total>number3) {
				total = number2;
			}
			else {
				total = number3;
			}
		}
		JOptionPane.showMessageDialog(null,
		"<html><body border='0'><table><tr><th>"+
		"Input the 1st number:</th><th>"+number1+"</th></tr>"+
		"<tr><th>Input the 2nd number:</th><th>"+number2+"</th></tr>"+
		"<tr><th>Input the 3rd number:</th><th>"+number3+"</th></tr>"+
		"<tr><th colspan='2'>Expected Output:</th><tr><th colspan='2'>The greatest:"+total+"</th></tr></table></body></html>",
		"The greatest",JOptionPane.INFORMATION_MESSAGE);
	}

}
