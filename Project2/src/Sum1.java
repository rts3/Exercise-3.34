import java.util.Scanner;
public class Sum1 {

	public static void main(String[] args) {
	 //initializing the five numbers,sum, largest, and smallest of the numbers
        int sum, ave, max, min;

		 // read from keyboard
		 Scanner input = new Scanner(System.in);
	        //initializing the five numbers,sum, largest, and smallest of the numbers
		 
		 int first,second,third,fourth, fifth;

	     System.out.print("Enter First number: ");
	     first = input.nextInt();
	     System.out.print("Enter Second number: ");
	     second = input.nextInt();
	     System.out.print("Enter Third number: ");
	     third = input.nextInt();	        
	     System.out.print("Enter Fourth number: ");
	     fourth = input.nextInt();
	     System.out.print("Enter Fifth number: ");
	     fifth = input.nextInt();
	     int[] aOut = {first, second, third, fourth, fifth};

        int[] A = { 5, 42, 77, 24, 42};
        int[] B = iSort(A);
    }
	 
 	public static int[] iSort(int[] A){
    // perform an Insertion sort on an arbitrary length array 
    int i,j = 0,Ai = 0;
    	// search every array element for proper location in ascending order
        for( i=1;i<A.length;i++){
        	Ai=A[i];
        	j=0;
        	//look for insertion location.
        	while(A[j]<Ai&& j<i){
        		j++;
        	}
        	
        	if(j<i){  //if insertion found,
        		// shift elements right of insertion point
        		for(int k=i; k>j; k--){
        			A[k]= A[k-1];
        		}
        		A[j]=Ai;// insert value into array
        	}
        }  // end for loop
        return A;
    }
}

//