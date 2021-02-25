/** Back-end Java
*** M2 - Milestone 1 - Fase 3
*** Roger Torrent */

import java.util.ArrayList;
import java.util.HashMap;

public class M2_Milestone1Fase3 {
	public static void main(String args[]) {
		ArrayList<Character> nom = new ArrayList<Character>();
		nom.add('R'); nom.add('o'); nom.add('g'); nom.add('e'); nom.add('r');
		nom.add('T'); nom.add('o'); nom.add('r'); nom.add('r'); nom.add('e'); nom.add('n'); nom.add('t');
		
		HashMap<Character, Integer> Mapa = new HashMap<Character, Integer>();
		
		for (Character lletra : nom)
			if(!Mapa.containsKey(lletra))
				Mapa.put(lletra, 1);
			else
				Mapa.put(lletra, Mapa.get(lletra) + 1);

		// System.out.println(Mapa);
		for (Character lletra : Mapa.keySet())
			System.out.println(lletra + ": " + Mapa.get(lletra));
	}
}