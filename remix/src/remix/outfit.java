package remix;
import java.util.*;


public class outfit {

	ArrayList<Object> Items; 
	
	public void addItem( Object item ){
		
		this.Items.add(item);
		System.out.println("added");
	} 
	
	public void outfit(){
		
		Items = new ArrayList<Object>(); 
		
	} 
	
}
