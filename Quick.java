import java.util.Random;
public class Quick{
  /*
  return the value that is the kth smallest value of the array.
  */
  public static int quickselect(int[] data, int k){

  }
  /*Modify the array such that:
  *1. Only the indices from start to end inclusive are considered in range
  *2. A random index from start to end inclusive is chosen, the corresponding
  *   element is designated the pivot element.
  *3. all elements in range that are smaller than the pivot element are placed before the pivot element.
  *4. all elements in range that are larger than the pivot element are placed after the pivot element.
  *@return the index of the final position of the pivot element.
  */
  public int partition(int[] data, int start, int end){
    Random rand = new Random();
    int n = rand.nextInt(end + 1) + start;
    while (start < end){

    }
  }
}
