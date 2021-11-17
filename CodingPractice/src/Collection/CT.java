package Collection;

public class CT {

		public static void main(String[] args) {
		String s1 = "1 2 3 4 5";
	int sum = 0;


	String[] numbString=s1.split(" ");
	//char[] numb = s1.toCharArray();

	for(int i=0;i<numbString.length;i++)
	{
		int number=Integer.parseInt(numbString[i]);
	   sum+=number;
	}
	System.out.println(sum);
	
		}
	}

