/* Name: Fahim Zubaer 
*/

package assignment1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.Predicate;

import javax.management.loading.PrivateClassLoader;
import javax.swing.JOptionPane;

public class Resolve {
	
	private final float tax=0.06f;
	private static final String input="inventory.txt";
	private final String output="transaction.txt";
	private Bill Bill1;
	private boolean flag=false;
	private static ArrayList<Items>list;
	

public static void search() {
	list= new ArrayList<>();
	FileReader validInputCheck =null;
	BufferedReader scannedfile =null;
		
	try {
		
		validInputCheck= new FileReader(input);
		
	}catch (FileNotFoundException e) {
		JOptionPane errorBox = new JOptionPane("Invalid file", JOptionPane.ERROR_MESSAGE);
	}
	
	try {scannedfile = new BufferedReader(validInputCheck);
	
	String tmp;
	
	while((tmp = scannedfile.readLine())!=null){
		String[] tmp1 = new String[3];
		Items list1= new Items();
		
		tmp1= tmp.split(",", 3);
		list1.setId(Integer.valueOf(tmp1[0]));
		list1.setName(tmp1[1]);
		list1.setCost(Float.valueOf(tmp1[2]));
		
		list.add(list1);			
	}
	
	}catch (IOException e) {
		e.printStackTrace();
	}
}

public Items search1(int id){
	
    for(Items item:list){
    	
        if(item.getId() ==id)
        	
            return item;
    }
    
    return new Items();
}

private float discount(Items list, int num) {
	float total = list.getCost()*(float) num;
	
	if(num <5) {
		return total;
	}
	if(num>5 && num<10) {
		return total - (total * 0.1f);
	}
	if(num>10 && num<15) {
		return total - (total * 0.15f);
	}
	if(num>=15 ) {
		return total - (total * 0.2f);
	}
	else return 0f;

}

private int  discount1(int num) {
	
	if(num<5) 
		return 0;
	else if(num<10)
		return 10;
	else if(num<15)
		return 15;
	else if(num>=15)
		return 20;
	else 
		return 0;
		
	}

public Resolve() {
	this.Bill1 = new Bill();
	
	if(flag==false) {
		search();
		
		flag=true;
	}
}

public void process(Items list, int num, int num1){
	
    Orders order = new Orders();
    order.setBook(list);
    order.setNum(num);
    order.setDiscount((float) discount1(num));
    order.setTotal(discount(list, num));
    
    this.Bill1.add(order);
    this.Bill1.setTotal(discount(list, num));
    this.Bill1.setTotal(this.Bill1.getTotal() + (this.Bill1.getTotal() * tax));
    this.Bill1.setNum(num1);
    }

public void getbook(Items list, int num){
    list.setInfo(String.valueOf(list.getId()) + " "+list.getName()+" "+String.valueOf(list.getCost()+" "+String.valueOf(num) +" "+String.valueOf(discount1(num))+ "% "+String.valueOf(discount(list, num))));
}

public float gettotal(Items list, int num){
    return Bill1.getTotal() + discount(list, num);
}

}






