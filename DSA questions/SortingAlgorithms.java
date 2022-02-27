All below sorting algorithm(Bubble,Selection,Insertion) uses nXn time complexity therefore cant be used in this leetcode problem because it will give TLE error.

    void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
Bubble sort---> On every iteration it pushes biggest number of array to its right place. First it puts biggest to last then second biggest to second last and so on.......

	public int[] bubbleSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){swap(arr,j,j+1);flag=true;}
            }
            if(!flag)break;
        }
        return arr;
    }
Selection sort---> On every iteration it selects right element for index(i) first smallest element then second smallest then third smallest and swaps with 0 , 1, 2............

	
	public int[] selectionSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min])min=j;
            }
            if(min!=i)swap(arr,min,i);
        }
        return arr;
    }
Insertion sort---->It inserts right element at right place one by one. It is best algorithm when the array is already sorted or nearly sorted because it will sort in only o(n).

	public int[] insertionSort(int[] arr) {
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0&&arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
        }
        return arr;
    }
Code for quickSort

public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }
    void quickSort(int[]arr,int left,int right){
        if(left<right){
            int pivot=findPivot(arr,left,right);
            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot+1,right);
        }
    }
    int findPivot(int[]arr,int left,int right){
        int pivot=arr[left];
        int l=left,r=right;
		// here l<r because no need to swap same index 
        while(l<r){
		//here l<=right because we want to go l to next big element but if we use l<r if will stop in between
            while(l<=right&&arr[l]<=pivot)l++;
			//here r>=left is using because of same reason above and one point is that when it if decreasing its index it will stop(in worst condition) at left because arr[left]will definately not big than pivot so it prevents it going out of bound.
            while(r>=left&&arr[r]>pivot)r--;
            if(l<r)swap(arr,l,r);
        }
        swap(arr,left,r);
        return r;
    }
    void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
MergeSort

public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    void mergeSort(int[]arr,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);     
        }
           
    }
    void merge(int[]arr,int left,int mid,int right){
        int[]temp=new int[right-left+1];
        int a=left,b=mid+1,k=0;
        while(a<=mid&&b<=right){
            if(arr[a]<arr[b]){
                temp[k++]=arr[a++];
            }
            else temp[k++]=arr[b++];
        }
        while(a<=mid)temp[k++]=arr[a++];
        while(b<=right)temp[k++]=arr[b++];
        for(int i=left;i<=right;i++){
            arr[i]=temp[i-left];
        } 
    }
Heap sort--->While creating max heap heapify function compares parent to child and if parent value is less than child then we swap parent and child and go to child and compares its child

public int[] sortArray(int[] arr) {
        int n=arr.length;
        for(int i=n/2;i>=0;i--)heapify(arr,i,n);
        for(int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            heapify(arr,0,i);
            arr[i]=temp;
        }
        return arr;
    }
    void heapify(int []arr,int index,int n){
        int first=index*2+1;
        int second=index*2+2;
        int min=index;
        if(first<n&&arr[min]<arr[first])min=first;
        if(second<n&&arr[min]<arr[second])min=second;
        if(min!=index){
            swap(arr,index,min);
            heapify(arr,min,n);
        }
    }
    void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }