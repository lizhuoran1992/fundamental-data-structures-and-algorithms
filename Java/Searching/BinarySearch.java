import java.lang.Math; 
import java.lang.Integer;

public class BinarySearch
{
  public static void main(String[] args)
  {
    int[] array = new int[2];
    for(int counter = 0; counter < array.length; counter++) {
    	array[counter] = counter + 1;
      	System.out.println("index: " + counter + " number:" + (counter+1));
    }
    Integer result = searchArray(2, array, -1, array.length);
    System.out.println(result);
  }
  
  public static Integer searchArray(int key, int[] array, int lowK, int uppK) {
    int mid = (lowK + uppK) / 2;
    
    if(key == array[mid]) {
    	return mid;
    } 
    if(uppK == lowK+1){
    	return null;
    }
    if(key > array[mid]) {
    	return searchArray(key, array, mid, uppK);	
    } else {
      	return searchArray(key, array, lowK, mid);
    }
  }
}
