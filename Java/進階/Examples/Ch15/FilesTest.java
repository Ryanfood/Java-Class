import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;
public class FilesTest {
	public static void main(String... args) throws IOException {
		Path file = Paths.get("C:\\Sean\\test.txt");
		Path target = Paths.get("C:\\Sean\\test1.txt");
		Files.move(file, target, StandardCopyOption.REPLACE_EXISTING);

		Charset charset = Charset.forName("US-ASCII");
		try {
			List<String> lines = Files.readAllLines(target, charset);
			for(String line : lines) {
				System.out.println(line);
			}
		} catch (NoSuchFileException x) {
			System.err.format("No such file: %s", x.getFile());
		} catch (IOException x) {
			System.err.println(x);
		}
	}
}
