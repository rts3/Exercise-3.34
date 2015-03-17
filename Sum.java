import java.util.Scanner;


public class Sum 
{
	public static void main(String[] args) 
	{

		//initializing the five numbers,sum, largest, and smallest of the numbers
        int sum, max, min, median;
        double ave;
		 
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
	     int[] A = {first, second, third, fourth, fifth};
	

     
        int[] B = iSort(A);
        int Alen = A.length;
        sum = 0;
        for (int ii=0; ii<Alen; ii++){
        	sum = sum + A[ii];
        
        
        
        }
        ave = sum/Alen ;
        min = B[0];
        max = B[Alen-1];
        System.out.println("Sum: "+ sum);
        System.out.println("Average: "+ ave);
        System.out.println("Max: "+ max);
        System.out.println("Min: "+ min);
    
        int i1 = Alen/2;
        if (Alen%2 > 0) { // array length is odd, pick middle element
        	median = B[i1];
        } else { // array length is even
        	if (Alen>1) {
        		median = (B[i1]+B[i1-1])/2;
        	} else {
        		median = B[0];
        	}
        } // end of if-else
        System.out.println("Median: "+ median);
   int mode=ArrayMode(B);
 
System.out.println("Mode: "+ mode);
   
    } // end of main
	public static int[] iSort(int[] A)
	{
	// perform an Insertion sort on an arbitrary length array 
	int i,j = 0,Ai = 0;
	// search every array element for proper location in ascending order
	
	    for( i=1;i<A.length;i++)
	    {
	    	Ai=A[i];
	    	j=0;
	    
	    	//look for insertion location.
	    	while(A[j]<Ai&& j<i){
	    		j++;
	    	}
	    	if(j<i){
	    		for(int k=i; k>j; k--){
	    			A[k]= A[k-1];
	    		}
	    		A[j]=Ai;
	    	}
	    }  // end for loop
	    return A;
	}// end of iSort
	public static int ArrayMode(int[] A) {

	    int Alen=A.length;
	    int mC=1;
	    int mCo=1;
	    int mVo =A[0];
	    int mV = mVo;
	for(int ii=1; ii<A.length;ii++){
		if(mV == A[ii]){
			mC= mC+1;
		
		}
		else{
			mV = A[ii];
			mC = 1;
		}
		if(mC>mCo){
			mV=A[ii];
			mVo=mV;
			mCo=mC;
			
		}
	}
	return mVo;
}	
	
}// end of class sum

	 
