package ali;

import java.util.Scanner;

public class T1 {
	
	private static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		long  m,n;
		while(scan.hasNext()) {
			m = scan.nextInt();
			n = scan.nextInt();
			n++;
			int k = (int)1e9+7;
			long  ans = 1;
		    n = n % k;
		    while(m>0) {
		        if(m % 2 == 1)
		        ans = (ans * n) % k;
		        m = m/2;
		        n = (n * n) % k;
		    }
			System.out.println(ans);
		}
		
	}

}