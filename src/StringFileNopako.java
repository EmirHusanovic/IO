import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class StringFileNopako {
	public static void main(String[] args) throws IOException {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite vas string: ");
		String name = unos.nextLine();
		Path path = Paths.get("test1.txt");
		// Files.createFile(path);
		BufferedWriter bWrite = Files.newBufferedWriter(path);
		bWrite.write(name);
		bWrite.flush();
		BufferedReader bReade = Files.newBufferedReader(path);
		String s;

		while ((s = bReade.readLine()) != null) {
			for (int i = s.length() - 1; i >= 0; i--) {
				System.out.print(s.charAt(i));
			}
		}

	}

}
