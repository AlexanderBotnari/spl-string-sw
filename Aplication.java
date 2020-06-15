import java.util.ArrayList;

public class Aplication {

	public static void main(String[] args) {
		
		ArrayList<String> devs = new ArrayList<>(); 
		  // 1. <String> - тип данных, который будет храниться в списке
		  // adding data to the list
		  devs.add("Johny");
		  devs.add("Valerya");
		  devs.add("Tatyana");
		  devs.add("Peter");
		  devs.add("Marry");
		  
		  // showing the initials, use "charAt(index)" from "String" class
		  for (String d : devs) {
			System.out.println(d.charAt(0)+".");
		}

		  // the longest name, use "length()" from "String" class
		  int maxLength = 0;
		 for (String str : devs) {
			 if(str.length() > maxLength)
			maxLength = str.length();
		}
		 System.out.println("The longest name is "+maxLength+" letters");
		  
		 
		  // swap values
		   String temp , a, b;
		   a = devs.get(0);
		   b = devs.get(4);
		   System.out.println("Before swapping : "+a+", "+ b);
		   temp = a;
		   a = b;
		   b = temp;   
		   System.out.println("After swapping : "+a+", "+ b);
      }

}
