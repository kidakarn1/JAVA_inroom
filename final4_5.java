package final4;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class final4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		String sub3 = "",sub2 = "",sub1 = "";
		JTextField n1 = new JTextField();
		JTextField n2 = new JTextField();
		JTextField n3 = new JTextField();
		Object show[]={
				"Input a: ",n1,
				"Input b: ",n2,
				"Input c: ",n3
		};
		  JOptionPane.showConfirmDialog(null,show,"",1);
			a = Integer.parseInt(n1.getText());
			b = Integer.parseInt(n2.getText());
			c = Integer.parseInt(n3.getText());  
            double result = b * b - 4.0 * a * c;
            if (result > 0.0) {
                double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
                double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
                sub1 = "The roots are " + r1 + " and " + r2;
            } else if (result == 0.0) {
                double r1 = -b / (2.0 * a);
                 sub2 = "The root is " + r1;
            } else {
            	 sub3 ="The equation has no real roots.";
            }
            JOptionPane.showConfirmDialog(null,sub1+"\n"+sub2+"\n"+sub3);

	}

}
