package final4;
import javax.swing.JOptionPane;
public class final4_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String get="",total="";
		String Snumber = JOptionPane.showInputDialog("Enter start number");
		String Enumber = JOptionPane.showInputDialog("Enter end number");
		int SInumber = Integer.parseInt(Snumber);
		int EInumber = Integer.parseInt(Enumber);
		int i=1,m=0;
		int check=SInumber,innum;
			while(check<EInumber){
				 m = 3*i;
				 total += (SInumber*m)+" ";
				 if (i%5==0) {
					 total+="<tr></tr>";
				 }
				 i++;
				 innum = (SInumber==5)? 15:9;
				 check+=innum;
			}
			JOptionPane.showMessageDialog(null,"<html><body>"+
					"<table border='1'><tr>"+total+"</tr>","PROGRAME",JOptionPane.INFORMATION_MESSAGE);
	}
}
