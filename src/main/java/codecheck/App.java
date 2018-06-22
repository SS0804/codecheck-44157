package codecheck;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {

		List<String> paramList = new ArrayList<String>();

		for (int i = 0; i < args.length; i++) {
			paramList.add(args[i]);
		}

		String result = "";

		String str = paramList.get(paramList.size()-1);

		for (int i = 0; i < paramList.size(); i++) {

			if(i != paramList.size()-1) {

				String[] param1 = paramList.get(i).split(":");

				if (Integer.parseInt(str) % Integer.parseInt(param1[0]) == 0) {

					result = result + param1[1];

				}

			} else {

				if (result.isEmpty()) {

					result  = str;
				}

			}

		}

		System.out.println(result);
	}
}
