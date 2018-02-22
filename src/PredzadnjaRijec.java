import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PredzadnjaRijec {
	public static void main(String[] args) throws IOException {
		System.out.print("Unesite ime fajla: ");
		Scanner unos = new Scanner(System.in);
		String name = unos.nextLine();
		Path path = Paths.get(name);
		BufferedReader bRead = Files.newBufferedReader(path);
		String s;
		while ((s = bRead.readLine()) != null) {
			String[] line = s.split(" ");
			System.out.println(line[line.length-2]);
		}

	}

}
