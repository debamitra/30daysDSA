class MoveNegatives {
    
    static void rearrange(int arr[], int n){
        int ptr1=0,ptr2=0;
        while(ptr1<n){
        while(ptr1<n && arr[ptr1]<0) ptr1++; //first non-negative item
        
        if(ptr1>=n) return;
        ptr2=ptr1;
        while(ptr2<n && arr[ptr2]>0) ptr2++; //first negative item
        if(ptr2>=n) return;
        int temp = arr[ptr1];
        arr[ptr1]= arr[ptr2];
        arr[ptr2]= temp;
        ptr1++;
        ptr2++;
        }
    }
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
	public static void main (String[] args) {
	
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length;
 
        rearrange(arr, n);
        printArray(arr, n);
	}
}
