import java.util.*;

public class Main
{
    
    public static int[] mergeArrays(int[] a,int[] b,int m,int n){
        int i=0,j=0,k=0;
        int[] res=new int[n+m];
        while(i<m || j<n){
            if(i<m && j<n){
                if(a[i]>b[j])
                    res[k++]=b[j++];
                else 
                    res[k++]=a[i++];
            }else if(i<m)
                res[k++]=a[i++];
            else 
                res[k++]=b[j++];
        }
        return res;
    }
    
	public static void main(String[] args) {
	    Scanner x=new Scanner(System.in);
		int m=x.nextInt();
	    int[] a=new int[m];
	    for(int i=0;i<m;i++)
	        a[i]=x.nextInt();
		int n=x.nextInt();
		int[] b=new int[n];
		for(int i=0;i<n;i++)
		    b[i]=x.nextInt();
		for(int i:mergeArrays(a,b,m,n))
		    System.out.println(i);
	}
}
