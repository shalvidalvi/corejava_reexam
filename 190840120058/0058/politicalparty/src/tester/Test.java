package tester;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		
boolean flag =false;
		
		int arr[]=new int[4];
	
		
		Scanner sc=new Scanner(System.in);
		while(!flag)
		{
		System.out.println("1.  Party01");
		System.out.println("2.  Party02");
		System.out.println("3. Party03");
		System.out.println("4. Party04");
		System.out.println("5. Display the result");
		System.out.println("6. Display the winner");
		System.out.println("7. exit");
		
		System.out.println("Enter the candidate choice of the party");
		int choice;
		switch (sc.nextInt()) 
		{
		
		case 1:
			arr[0]=arr[0]+1;
			break;
			
		case 2:
			arr[1]=arr[1]+1;
			break;
		case 3:
			arr[2]=arr[2]+1;
			break;
		case 4:
			arr[3]=arr[3]+1;
			break;
			
		case 5:
			System.out.println("Party01" + " "+ arr[0]);
			System.out.println("Party02" + " "+ arr[1]);
			System.out.println("Party03" + " "+ arr[2]);
			System.out.println("Party04" + " "+ arr[3]);
			break;
			
		case 6:
			int index =500;
			int min =0 ;
			for (int i=0;i< 4;i++)
			{
				if(arr[i] > min)
				{
					index = i ;
					min = arr[i];
				}
			}
			if(index == 0) {
				System.out.println("Party01");
			}
			if(index == 1) {
				System.out.println("Party02");
			}
			if(index == 2) {
				System.out.println("Party03");
			}
			if(index == 3) {
				System.out.println("Party04");
			}
			
					
			break ;

		default:
			break;
		}
		}
	}

	}


