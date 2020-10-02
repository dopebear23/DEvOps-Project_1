import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class EXP2ADA
{ 
  int partition(int arr[], int low, int high,int x) 
    {   int pivot;
        if(x==1)
            pivot = arr[(arr.length)/2]; 
        else
            pivot = arr[high];
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[j] < pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    void sort(int arr[], int low, int high,int x) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high,x); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1,x); 
            sort(arr, pi+1, high,x); 
        } 
    } 
    
    
    
    // Driver method 
    public static void main(String args[]) throws InterruptedException
    {   double starttime;
        double endtime;
        double restime;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array:      ");
        int n = sc.nextInt();
        
        int arr[] = new int[n]; 
  
        EXP2ADA ob = new EXP2ADA();
        System.out.println("-----QUICK SORT-----");
        System.out.println("\n\tBEST CASE:");

        for (int i=0;i<n;i++)
            arr[i]=i;
        
        starttime = System.nanoTime();
        TimeUnit.NANOSECONDS.sleep(50); 
        ob.sort(arr, 0, n-1,1);
        
        endtime = System.nanoTime();
        
        restime = (endtime-starttime)/1000000000;
        System.out.println("Best case time:  " + String.format("%.10f",restime));
    
    System.out.println("\n\tAVERAGE CASE:");
  
        for (int i=0;i<n;i++)
            arr[i]=rand.nextInt(n);
        
        starttime = System.nanoTime();
        TimeUnit.NANOSECONDS.sleep(50); 
        ob.sort(arr, 0, n-1,2); 
        
        endtime = System.nanoTime();
        
        restime = (endtime-starttime)/1000000000;
        System.out.println("Average case time:  " + String.format("%.10f",restime));
        
    System.out.println("\n\tWORST CASE:");
  
        for (int i=0;i<n;i++)
            arr[i]=n-i;
        starttime = System.nanoTime();
        TimeUnit.NANOSECONDS.sleep(50); 
        ob.sort(arr, 0, n-1,2); 
        endtime = System.nanoTime();
        
        restime = (endtime-starttime)/1000000000;
        System.out.println("Worst case time:  " + String.format("%.10f",restime));
    
    } 
} 