import java.util.Scanner;
public class ascii {
public static void main(String args[])
{
	int ascii=0;
	int[] asciarray = new int[256];
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a string");
	String sentance = sc.nextLine();
	for(int i =0;i<sentance.length();i++)
	{
		char letters = sentance.charAt(i);
		ascii = (int)letters;
		/*
		if(letters<7)
		{
			System.out.println("0"+Integer.toBinaryString(ascii));
		}
		*/
		System.out.print(Integer.toBinaryString(ascii)+", ");
		asciarray[letters]++;
			if(ascii==' ')
				System.out.println();
			
			
	sc.close();	
	}
	System.out.println();
	for(char i=0; i<asciarray.length;i++)
	{
		
			if(asciarray[i]>0)
			{
				System.out.println("'"+i+"' "+"appeared "+asciarray[i]+" times.");
			}
		}
		
	}

	
}

