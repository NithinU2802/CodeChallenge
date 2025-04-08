import java.util.*;

public class MinMax_Sum
{
    
    public static void miniMaxSum(List<Integer> arr) {
        long sum=0,prev=arr.get(0),max=arr.get(0),min=arr.get(0);
        for(int i:arr){
            sum+=i;
            if(max<i) 
                max=i;
            if(min>i) 
                min=i;
        }
        System.out.println((sum-max)+" "+(sum-min));
    }
    
	public static void main(String[] args) {
	    List<Integer> input=new ArrayList<>();
		for(int i=0;i<5;i++)
		    input.add(x.nextInt());
		miniMaxSum(input);
	}
}
