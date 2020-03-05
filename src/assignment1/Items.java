/* Name: Fahim Zubaer 
*/

package assignment1;

public class Items {
	
	
	
	private String info;
	private float cost;
	private int id;
	private String name;
	
	//getters and setters
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Items(){
        setInfo("The ID is invalid");
    }
	

}
