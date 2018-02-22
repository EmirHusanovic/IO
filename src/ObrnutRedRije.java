import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ObrnutRedRije {
	public static void main(String[] args) throws IOException {
		System.out.print("Unesite ime fajla: ");
		Scanner unos = new Scanner(System.in);
		String name = unos.nextLine();
		Path path = Paths.get(name);
		BufferedReader bRead = Files.newBufferedReader(path);
		String s;
		while ((s = bRead.readLine()) != null) {
			
			String[]list=s.split(" ");
			for (int i = list.length - 1; i >= 0; i--) {
				System.out.print(list[i]+" ");
			}
		}

	}

}
