import java.nio.file.*;
public class PathTest {
    public static void main(String... args) {
        //FileSystem fs = FileSystems.getDefault();
		//Path path = fs.getPath("C:\\Users\\Sean\\foo");
        Path path = Paths.get("C:\\Users\\Sean\\foo");
		System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("subpath(0,2): %s%n", path.subpath(0, 2));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n", path.getRoot());
        System.out.format("%n");

        Path p = Paths.get("C:\\Users\\Sean\\..\\..\\foo");
        System.out.println(p.normalize());
        System.out.format("p.getNameCount: %d%n", p.getNameCount());
        System.out.format("%n");

        Path p1 = Paths.get("Users");
        Path p2 = Paths.get("Users/Sean/foo");
        Path p1_p2 = p1.relativize(p2);
        System.out.println(p1_p2);
        Path p2_p1 = p2.relativize(p1);
        System.out.println(p2_p1);
        System.out.format("%n");

        Path p3 = Paths.get("C:\\Users\\Sean\\foo");
        System.out.format("%s%n", p3.resolve("bar"));
        System.out.format("%n");
        Path p4 = Paths.get("bar");
        System.out.format("%s%n", p4.resolve("C:\\Users\\Sean\\foo"));
        System.out.format("%n");
        Path ps = Paths.get("C:\\Users\\Sean\\foo");
        System.out.format("%s%n", ps.resolveSibling("bar"));
    }
}
