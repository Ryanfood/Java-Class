import java.io.*;
import java.nio.file.*;
import java.util.regex.PatternSyntaxException;
public class ListDirectory {
	public static void main(String[] args) {
		Path dir = Paths.get(args[0]);
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
			for (Path file : stream) {
				System.out.print(file.getFileName());
				if(Files.isDirectory(file)){
					System.out.println(":¥Ø¿ý");
				} else if(Files.isRegularFile(file)){					
					System.out.println(":ÀÉ®×");
				}
			}
		} catch (PatternSyntaxException | DirectoryIteratorException | IOException x) {
			System.err.println(x);
		}
	}
}
