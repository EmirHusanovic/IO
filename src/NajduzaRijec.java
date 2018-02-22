import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class NajduzaRijec {
	public static void main(String[] args) throws IOException {
		System.out.print("Unesite ima fajla: ");
		Scanner unos = new Scanner(System.in);
		String name = unos.nextLine();
		Path path = Paths.get(name);
		BufferedReader bRead = Files.newBufferedReader(path);
		String s;
		String r = " ";
		int duzina = 0;
		while ((s = bRead.readLine()) != null) {
			String[] rijec = s.split(" ");
			for (int i = 0; i < rijec.length; i++) {
				if (rijec[i].length() > duzina) {
					duzina = rijec[i].length();
					r = rijec[i];

				}
			}

		}
		System.out.println("Najduza rijec je " + r);
	}

}
