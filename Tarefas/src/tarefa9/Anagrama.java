package tarefa9;

import java.util.ArrayList;
import java.util.List;

public class Anagrama {

	public static boolean eAnagrama(String palavra1, String palavra2) {
		palavra2=palavra2.toLowerCase();
		palavra1=palavra1.toLowerCase();
		int conta=0;
		
		
		List<Character>listaA=new ArrayList<Character>();
		List<Character>listaB=new ArrayList<Character>();
		for(char c:palavra1.replace(" ", "").toCharArray())
		{
			listaA.add(c);
		}
		for(char c:palavra2.replace(" ", "").toCharArray())
		{
			listaB.add(c);
		}
		return listaA.containsAll(listaB) && listaA.size()==listaB.size();
		
		
		
	}
	

}