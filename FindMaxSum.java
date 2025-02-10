class FindMaxSum {

public static int findCrossSum(int arr[], int low, int mid, int high){
		int leftMax=0,rightMax=0,sum=0;
		for(int i=mid;i>=low;i--){
		    sum+=arr[i];
		    if(sum>leftMax)
		        leftMax=sum;
		}
		sum=0;
		for(int i=mid+1;i<=high;i++){
		    sum+=arr[i];
		    if(sum>rightMax)
		        rightMax=sum;
		}
		return leftMax+rightMax;		
	}


    public static int findMaxSum(int arr[], int low, int high) {
	    if(low==high)
	        return arr[low];
	    int mid=low+(high-low)/2;
	    return Math.max(Math.max(findMaxSum(arr,low,mid),findMaxSum(arr,mid+1,high)),findCrossSum(arr,low,mid,high));
	}
  
	public static void main(String[] args) {
    int n=x.nextInt();
		int arr[] = new int[n];
    for(int i=0;i<n;i++)
      arr[i]=x.nextInt();
		System.out.println("Maximum sum: " + findMaxSum(arr, 0, arr.length - 1));
	}
}
