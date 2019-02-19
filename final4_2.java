package final4;
import javax.swing.JOptionPane;
public class final4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Snumber="";
		int checknumber=0;
		Snumber =JOptionPane.showInputDialog("Programe");
		char[] num = Snumber.toCharArray();
		int Even_number=0,Add_number=0,zero=0;
		for(char n:num){
			String check = n+"";
			System.out.println(n);
			if (check.equals('0'+"")){
				 zero+=1;
				 System.out.println(n);
			 }
			 else if (n%2==0){
				 Even_number+=1;
			 }
			 else {
				 Add_number+=1;
			 }
			
		}
		JOptionPane.showMessageDialog(null,"<html><body>"+
		"<table border='1'><tr><td>เลขคู่</td><td>เลขคี่</td><td>เลขศูนย์</td></tr>"+
		"<tr><td>"+Even_number+"</td>"+"<td>"+Add_number+"</td>"+
		"<td>"+zero+"</td></tr>","PROGRAME",JOptionPane.INFORMATION_MESSAGE
	);

	}
}
