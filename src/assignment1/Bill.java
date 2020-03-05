/* Name: Fahim Zubaer 
*/

package assignment1;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;

public class Bill {
	
	private String transac;
	private String time;
	private  int num=0;
	private float total=0;
	private float total1=0;
	private ArrayList<Orders> order1;
	
	public Bill() {
		this.order1=new ArrayList<Orders>();
	}
	 public void add(Orders order1){
	    	this.order1.add(order1);
	    }
	
	public String getTransac() {
		return transac;
	}
	public void setTransac(String transac) {
		this.transac = transac;
	}
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
	public float getTotal1() {
		return total1;
	}
	public void setTotal1(float total1) {
		this.total1 = total1;
	}
	
	public void datetime() {
		Date date1=new Date();
		
		DateFormat Dformat1= new SimpleDateFormat("yyy/mm/dd HH:mm;ss a z");
		
        this.time = Dformat1.format(date1);
        
        
        Dformat1 = new SimpleDateFormat("yyMMddHHmmss");
        
       
        this.transac = Dformat1.format(date1);
	}
	
	
	
	

}
