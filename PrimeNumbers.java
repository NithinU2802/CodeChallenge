/******************************************************************************

    Finding first n prime numbers

*******************************************************************************/
import java.util.*;

public class Main
{
    
    public static void primeNumbers(int n){
        boolean[] checkPrime=new boolean[n+1];
        Arrays.fill(checkPrime,true);
        for(int i=2;i*i<=n;i++)
            if(checkPrime[i]){
                for(int j=i*i;j<=n;j+=i)
                    checkPrime[j]=false;
            }
        for(int i=5;i<=n;i++)
            if(checkPrime[i])
                System.out.print(i+" ");
    }
    
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		primeNumbers(n);
	}
}
