import java.util.*;

public class DeviceNamesSystem
{
    
    public static String[] deviceNamesSystem(String[] deviceNames,int n){
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<n;i++){
            map.put(deviceNames[i],map.getOrDefault(deviceNames[i],-1)+1);
            if(map.get(deviceNames[i])!=0)
                deviceNames[i]+=map.get(deviceNames[i]);
        }
        return deviceNames;
    }
    
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		x.nextLine();
		String[] deviceNames=new String[n];
		for(int i=0;i<n;i++)
		    deviceNames[i]=x.nextLine();
		for(String deviceName:deviceNamesSystem(deviceNames,n))
		    System.out.println(deviceName);
	}
}
