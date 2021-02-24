import java.util.ArrayList;

public class Milestone1Fase4 {
	public static void main(String args[]) {
		ArrayList<Character> nom = new ArrayList<>(), cognom = new ArrayList<>();
		nom.add('R'); nom.add('o');	nom.add('g'); nom.add('e');	nom.add('r');
		cognom.add('T'); cognom.add('o'); cognom.add('r'); cognom.add('r'); cognom.add('e'); cognom.add('n'); cognom.add('t');

		ArrayList<Character> FullName = new ArrayList<>(nom);
		FullName.add(' ');
		FullName.addAll(cognom);
						
		System.out.println(FullName);
	}
}