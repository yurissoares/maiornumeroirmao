package nativaexec1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetNumero {

	public static String maiorNumeroIrmao(String valor) {
		String s = String.valueOf(Integer.parseInt(valor));
		List<Integer> v = new ArrayList<>();
		
		for (int i = 0; i < s.length(); i++) {
			v.add(Integer.valueOf(Character.toString(s.charAt(i))));
		}
		
		Collections.sort(v);
		Collections.reverse(v);
		
		return v.toString().replaceAll("\\D*", "").trim();
		
	}

}
