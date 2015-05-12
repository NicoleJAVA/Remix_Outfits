package remix;
import java.util.*;

public class test {

    int[][] x;

    
    public void a(){
    	x = new int[10][]; 
        for (int i = 0; i < x.length; i++) {
            x[i] = new int[i]; 
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = i + j;
        		//System.out.print(" "+ x[i][j]);
        		
            }
            //System.out.println("\n");
        }
        /***
        int[] s = {1, 2,5,66, 11}; 
        s[s.length+1] = 8888 ;
    	for (int k=0; k<s.length; k++){
    		System.out.print(" " + s[k]);
    	}
    	/***/
        
		ArrayList<Object> wardrobe = new ArrayList<Object>(); 
		System.out.println	("initial size:"+ wardrobe.size());
		
		ArrayList<garment> wardrobe1 = new ArrayList<garment>(); 
		System.out.println	("initial size:"+ wardrobe1.size());
		
		blouse blouse1 = new blouse(); 
		pants pants1 = new pants(); 
		wardrobe.add(blouse1);
		wardrobe.add(pants1);
		System.out.println("testing:"+wardrobe.get(0));
		System.out.println("testing:"+wardrobe.get(1));
		blouse1.shape = new String("MyBlouse");
		System.out.println("what is the blouse: "+blouse1.shape); 
		
		blouse blouse2 = new blouse("MySecondBlouse"); 
		System.out.println("the 2nd blouse is : "+ blouse2.shape);
		
		fakeoutfit t2 = new fakeoutfit();		
		blouse b1 = new blouse();
		t2.addItem(b1);
		//t2.Items.get(0).shape = new String("shape222"); 
		b1.shape = new String("shape222"); 

		System.out.println("get:  " + ((blouse)t2.Items.get(0)).shape);
		System.out.println("the shape is " + b1.shape);		
		
		
		
		
		
		
		
		
    }
    

	
}
