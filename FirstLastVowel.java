import java.util.*;

public class Main {
    
    public static List<Integer> hasVowels(String[] strArr, String[] queries) {
        int n = strArr.length;
        int[] sm = new int[n + 1]; 
        for (int i = 0; i < n; i++)
            if (isVowel(strArr[i].charAt(0)) && isVowel(strArr[i].charAt(strArr[i].length() - 1)))
                sm[i + 1] = sm[i] + 1;
            else
                sm[i + 1] = sm[i];

        List<Integer> res = new ArrayList<>();
        for (String query : queries) {
            String[] parts = query.split("-");
            int l = Integer.parseInt(parts[0]); 
            int r = Integer.parseInt(parts[1]); 
            res.add(sm[r] - sm[l - 1]); 
        }
        return res;
    }

    private static boolean isVowel(char c) {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        x.nextLine();
        String[] strArr = new String[n];
        for(int i=0;i<n;i++)
            strArr[i]=x.nextLine();
        int m=x.nextInt();
        x.nextLine();
        String[] query = new String[m];
        for(int i=0;i<m;i++)
            query[i]=x.nextLine();
        List<Integer> result = hasVowels(strArr, query);
        for(int i:result)
            System.out.println(i);
    }

}
