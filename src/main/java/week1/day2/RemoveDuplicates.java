package week1.day2;
public class RemoveDuplicates {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] text1 = text.split("\\s+");
		int count=0;
		for (int i = 0; i < text1.length; i++) 

		{
			for (int j = i+1; j < text1.length; j++) {
				if (text1[i].equalsIgnoreCase(text1[j]))	
				{
					count=count+1;
					if (count>1)
						text1[i]="";
				}
			}
			System.out.print(text1[i]+" ");	
		}
	}
}

