import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int a=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>a)
				a=arr[i];
		}
		int b=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]<b)
				b=arr[i];
		}
		System.out.println(b+" "+a);
	}
}
