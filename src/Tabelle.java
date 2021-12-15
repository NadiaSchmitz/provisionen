import java.text.DecimalFormat;
import Prog1Tools.IOTools;

public class Tabelle {

	public static void main(String[] args) {
		
		int i, index;
		
		DecimalFormat df = new DecimalFormat("###");
		
		i = IOTools.readInteger("Geben Sie eine Zahl > 0 ein: ");
		
		if (i <= 20) {
			for (i = 1; i <= 20; i++) {
				System.out.println("|   " + i + "    |   " + df.format(Math.pow(i, 2)) + "   |");
			}
		} else if (i >= 170 & i <= 190) {
			for (i = 170; i <= 190; i++) {
				System.out.println("|   " + i + "    |   " + df.format(Math.pow(i, 2)) + "   |");
			}
		} else if (i >= 32760 & i <= 32780) {
			for (i = 32760; i <= 32780; i++) {
				System.out.println("|   " + i + "    |   " + df.format(Math.pow(i, 2)) + "   |");
			}
		} else {
			System.out.println("Falsche Eingabe");
		}
		
	}

}
