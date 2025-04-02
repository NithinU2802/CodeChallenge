public class SecondLargestElement
{
	public static void main(String[] args) {
		int[] a={1,5,11,8,9};
		int max=0,pre=0;
		for(int i=0;i<a.length;i++){
		    if(a[i]>max){
		        pre=max;
		        max=a[i];
		    }else if(pre<a[i])
                pre=a[i];		 
		}
		System.out.println("Second largest: "+pre);
	}
}
