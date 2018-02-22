import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class NameFile {
	public static void main(String[] args) throws IOException {
		System.out.print("unesite ime fajla: ");
		Scanner unos = new Scanner(System.in);
		String name = unos.nextLine();
		Path path = Paths.get(name);
		BufferedReader br = Files.newBufferedReader(path);

		String s;
		int lines = 0;
		int cout = 0;
		int count = 0;
		while ((s = br.readLine()) != null) {
			lines++;
			for (int i = 0; i < s.length(); i++) {
				if (Character.isLetter(s.charAt(i))) {
					cout++;
				}
			}
			String[] parts = s.split(" ");
			count = count + parts.length;

		}

		System.out.println("Fajl ima " + cout + " karaktera, linija ima " + lines + " a rijeci ima " + count + ".");
	}

}
