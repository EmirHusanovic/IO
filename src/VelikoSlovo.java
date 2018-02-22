import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class VelikoSlovo {
	public static void main(String[] args) throws IOException {
		System.out.print("Unesite ime fajla: ");
		Scanner unos = new Scanner(System.in);
		String name = unos.nextLine();
		Path path = Paths.get(name);
		BufferedReader bRead = Files.newBufferedReader(path);
		String s;
		while ((s = bRead.readLine()) != null) {
			String[] str = s.split(" ");
			for (int i = 0; i < str.length; i++) {
				for (int j = 1; j < str[i].length(); i++) {
					System.out.print(Character.toUpperCase(str[i].charAt(0)));
					System.out.println(str[i].charAt(j));
				}
			}
			System.out.println();
		}

	}

}
