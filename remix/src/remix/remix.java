package remix;
import java.util.*;



public class remix {


	
	public static void main(String[] args) {
		
		

		
		ArrayList<Object> Wardrobe = new ArrayList<Object>(); 
		System.out.println	("Wardrobe initial size:"+ Wardrobe.size());
		

		ArrayList<outfit> Outfits = new ArrayList<outfit>(); 
		System.out.println	("Outfits initial size:"+ Outfits.size());

		outfit outfit1 = new outfit(); 
		
		fakeoutfit fakeoutfit1 = new fakeoutfit(); 
		int fake_size = ((ArrayList)fakeoutfit1.Items).size();
		
		/*
		for( int i = 0; i < fake_size; i++){
			
			System.out.println(" " + (fakeoutfit1.Items).get(0))
			
		}
		*/
		for (Object object : fakeoutfit1.Items) {
			if(object.getClass().equals(skirt.class)){
				System.out.println(object.getClass().getName()); 
				System.out.println( ((skirt)object).material );
				((skirt)object).material = new String("newcotton");
				System.out.println( ((skirt)object).material );				
			}
		}
		/**************************
		   test testinst = new test(); // test instance 
		 
		   testinst.a();
		   
		/**************************/

		
		
		
	}

	
	
	
} 





