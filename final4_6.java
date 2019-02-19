package final4;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class final4_6 {
	public static void main(String[] args) {
	    StringBuilder result=new StringBuilder();
		JTextField n1 = new JTextField();
		JTextField n2 = new JTextField();
		Object show[]={
				"Enter the month (MM) :",n1,
				"Enter the year (YYYY) :",n2,
		};
		  JOptionPane.showConfirmDialog(null,show,"",1);
			int month = Integer.parseInt(n1.getText());
			int year = Integer.parseInt(n2.getText());
	    
	    String[] allMonths={
	            "", "January", "February", "March", "April", "May", "June",
	            "July", "August", "September", "October", "November", "December"
	    };
	    int[] numOfDays= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	    if (month == 2 && isLeapYear(year)) numOfDays[month]=29;
	    result.append("    "+allMonths[month]+ "  "+year+"\n"+"<html><table border=1><tr><td bgcolor='#ff0000'>S</td><td bgcolor='#ffff00'>M</td>"
	    		+ "<td bgcolor='#ff00ff'>Tu</td><td bgcolor='#40ff00'>W</td><td bgcolor='#ff8000'>Th</td><td bgcolor='#0080ff'>F</td><td bgcolor='#8000ff'>S</td></tr>");
	    int d= getstartday(month, 1, year);
	    String html ="<tr>";
	    result.append(html);
			    for (int i=0; i<d; i++){
			        result.append("<td  bgcolor='#FFFFFF'>&nbsp;</td>");
			    }
				    for (int i=1; i<=numOfDays[month];i++){
				        String daysSpace=String.format("<td>"+i+"</td>");
				        result.append(daysSpace);
				        if (((i+d) % 7==0) || (i==numOfDays[month])) result.append("</tr>");
				    }
			    String finalresult= "<html><font face='Arial'>"+result; 
			    JOptionPane.showMessageDialog(null, finalresult);
				}
		public static int getstartday(int m, int d, int y){
		    int year = y - (14 - m) / 12;
		    int x = year + year/4 - year/100 + year/400;
		    int month = m + 12 * ( (14 - m) / 12 ) - 2;
		    int num = ( d + x + (31*month)/12) % 7;
		    return num;
		}
		public static boolean isLeapYear (int year){
		    if ((year % 4 == 0) && (year % 100 != 0)) return true;
		    if (year % 400 == 0) return true;
		    return false;
		}
}
