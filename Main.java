import  java.util.Arrays;

class Main {
  public static void main(String[] args) {
    
    int[] ua={3,1,9,5,8,4,7,2,6};
    System.out.print("Before Sorting: ");
    System.out.println(Arrays.toString(ua));

    
    sortB(ua);
  } // END main


  // Implement the Bubble Sort
  public static void sortB(int[] a) {

    System.out.print("Bubble Sort Finished :");
    System.out.println(Arrays.toString(a));
  }  // END sortB

  // Implement Selection Sort
  public static void sortS(int[] a) {
    System.out.print("Selection Sort Finished :");
    System.out.println(Arrays.toString(a));
  } // end sortS()

  // Implement Insertion  Sort
  public static void sortI(int[] a) {
    System.out.print("Insertion Sort Finished :");
    System.out.println(Arrays.toString(a));
  } // sortI()


  // Implement Merge  Sort : Just a helper for uniform "API"
  public static void sortM(int[] a) {

    sM(a, 0, a.length-1);  
    System.out.print("Merge Sort Finished :");
    System.out.println(Arrays.toString(a));
  } // end sortM()

  // Acutal Merge Sort.  This does the recursion
  public static void sM(int[] a, int l, int h) {

  } // end sM()

  // Merge Sort : Merge function
  public static void merge(int[] a,int l, int m, int h)
  {

  } // END merge()

}
