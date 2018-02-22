import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReceniceFile {
	public static void main(String[] args) throws IOException {

		System.out.print("Unesite ime vaseg fajla: ");
		Scanner unos = new Scanner(System.in);
		String name = unos.nextLine();
		Path path = Paths.get(name);
		BufferedReader bRead = Files.newBufferedReader(path);
		String s;
		while ((s = bRead.readLine()) != null) {
			String[] list = s.split("\\.");

				for (int i = 0; i < list.length; i++) {
					if (list[i].length()<55){
					System.out.println(list[i]);

				} else if (list[i].length()>55){
					for (int j=0;j<55;j++){
					System.out.print(list[i].charAt(j));
					}
					System.out.print("...<Read Moore>");
					System.out.println();
				}
			}
		}
	}

}
