import java.util.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		String multi = String.valueOf(A*B*C);
		char[] r = new char[multi.length()];
		int[] count = new int[10];
		
		for(int i=0;i<multi.length();i++) {
			r[i] = multi.charAt(i);
			
			switch (r[i]) {
			case '0':
				count[0]++;
				break;
			case '1':
				count[1]++;
				break;
			case '2':
				count[2]++;
				break;
			case '3':
				count[3]++;
				break;
			case '4':
				count[4]++;
				break;
			case '5':
				count[5]++;
				break;
			case '6':
				count[6]++;
				break;
			case '7':
				count[7]++;
				break;
			case '8':
				count[8]++;
				break;
			case '9':
				count[9]++;
				break;
			default:
				;
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println(count[i]);
		}
	}
}
