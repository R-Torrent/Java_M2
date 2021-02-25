/** Back-end Java
*** M2 - Milestone 1 - Fase 2
*** Roger Torrent */

import java.util.ArrayList;
import java.util.HashSet;

public class M2_Milestone1Fase2 {
	public static void main(String args[]) {
		ArrayList<Character> nom = new ArrayList<Character>();
		nom.add('R');
		nom.add('1');
		nom.add('g');
		nom.add('e');
		nom.add('r');
		
		String[] m = {
			"Els noms de persones no contenen números!",
			"VOCAL",
			"CONSONANT"
		};
		
		HashSet<Character> Vocals = new HashSet<Character>();
		Vocals.add('A'); Vocals.add('a');
		Vocals.add('E'); Vocals.add('e');
		Vocals.add('I'); Vocals.add('i');
		Vocals.add('O'); Vocals.add('o');
		Vocals.add('U'); Vocals.add('u');
		
		for (Character lletra : nom)
			System.out.println(lletra + ": " + (Character.isDigit(lletra) ? m[0] :
				(Vocals.contains(lletra) ? m[1] : m[2])));
	}
}