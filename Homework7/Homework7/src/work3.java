
public class work3 {

	public static void main(String[] args) {
		
		 int[] array = new int[]{6,5,4,3,5,1,42,-1};
         
	        int element;
	        int size=array.length;
	                
	        for (int i=1;i<size;i++){
	                for (int j=size-1;j>=i;j--){ 
	                        if (array[j-1]>array[j]){
	                                element = array[j-1];
	                                array[j-1]=array[j];
	                                array[j]=element;
	                        }
	                }       
	        }
	        for (int i=0;i<size;i++){
	                System.out.print(" "+array[i]);
	        }
	                        
	    }
	}
