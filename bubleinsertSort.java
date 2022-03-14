/*Create an interface SortNumber with two sorting methods 
void bubbleSort():
void insertionSort():
Implement a class Sort which defines all these methods to sort 10 numbers.*/
interface SortNumber
{
	public void bubbleSort();
	public void insertionSort();
}

class Sort implements SortNumber
{
    int[] arr ={9,14,3,2,43,11,58,22,45,12};
    int key;
    
    public void insertionSort()
    {
        int n = arr.length;
        
        for(int j=1;j<n;j++)
        {
            int key = arr[j];
            int i = j-1;

            while((i>-1) && (arr[i]>key))
            {
                arr[i+1]=arr[i];
                i--;
            }

            arr[i+1]=key;
            
        }
        System.out.println("\nArray After Insertion Sort");  
        
        for(int i=0; i < arr.length; i++)
		{  
     			System.out.print(arr[i] + " ");  
 		} 
    }
    
    
    public void bubbleSort()
    {
        int n = arr.length;
        int temp = 0;

        for(int i=0;i<n-1;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println("\nArray After Bubble Sort");  
        
        for(int i=0; i < arr.length; i++)
		{  
     			System.out.print(arr[i] + " ");  
 		} 
    }
}

public class bubleinsertSort
{
    public static void main(String args[])
    {
        Sort s1 = new Sort();
        s1.bubbleSort();
        s1.insertionSort();
    }

}

































