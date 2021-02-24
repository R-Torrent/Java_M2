import javax.swing.JOptionPane;

public class Milestone2 {
	public static void main(String args[]) {
		int n;
		do
			n = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número entero entre 1 y 9"));
		while (n < 1 || n > 9);
		
		String escala = new String();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				escala += j;
			escala += "\n";
		}
		String piramide = new String();
		for (int i = n; i > 0; i--) {
			for(int j = 1; j <= 2 * n - 1; j++)
				piramide += Math.abs(j - n) < i ? "*" : " "; // Distancias desde el centro de la fila
			piramide += "\n";
		}

		JOptionPane.showMessageDialog(null, escala, "Escala de nombres", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, piramide, "Piràmide invertida", JOptionPane.INFORMATION_MESSAGE);
		// El panel no utiliza una letra monoespaciada por defecto, y el resultado no es óptimo
		System.out.print(piramide); // ¡Comprobación!
	}
}