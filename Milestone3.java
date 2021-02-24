public class Milestone3 {
	// https://docs.oracle.com/javase/tutorial/essential/concurrency/sleep.html
	public static void main(String args[]) throws InterruptedException {
		
		String temps = new String("");
		byte th = 0, tm = 0, ts = 0;
		
		while(true) {
			temps = (th < 10 ? "0" : "") + th + ":" +
					(tm < 10 ? "0" : "") + tm + ":" + 
					(ts < 10 ? "0" : "") + ts; 
			System.out.print(temps + '\r'); // Por desgracia, el retorno de carro '\r' no funciona

			Thread.sleep(1000);
			if (++ts == 60) {
				ts = 0;
				if (++tm == 60) {
					tm = 0;
					if (++th == 24)
						th = 0;
				}
			}			
		}
	}
}