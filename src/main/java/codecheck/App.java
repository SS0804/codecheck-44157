package codecheck;

public class App {
	public static void main(String[] args) {

		String[] param1 = args[0].split(":");
		String[] param2 = args[1].split(":");
		String str = args[2];

		String result = null;


		  if (Integer.parseInt(str) % Integer.parseInt(param1[0]) == 0) {

			  result = param1[1];

		  } else if (Integer.parseInt(str) % Integer.parseInt(param2[0]) == 0)  {

			  result = result + param2[1];


		  } else {
			  result  = str;
		  }

			System.out.println(result);
		}
}
