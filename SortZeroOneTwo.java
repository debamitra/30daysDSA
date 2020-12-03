public static void sort012(int a[], int n){
    int start = 0;
    
    while(a[start]==0){ //first position in array with non-zero value
        start++;
        if(start>=n)
         return;
    }
    int zero = start;
    while(zero<n && start < n){
        while(zero<n && a[zero]!=0 ) zero++;
        if(zero>=n)
            break;
        a[zero]=a[start];
        a[start]=0;
        start++;
        
    }
    //replace 2s
    
    int end = n-1;
    
    while(a[end]==2){ 
        end--;
        if(end<0)
         return;
    }
    int two = end;
    while(two>=0 && end >=0){
        while(two>=0 && a[two]!=2 ) two--;
        if(two < 0)
            break;
        a[two]=a[end];
        a[end]=2;
        end--;
        
    }
    
    
    
}
