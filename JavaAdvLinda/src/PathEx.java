
import java.io.IOException;
import java.nio.file.*;

public class PathEx {
    public static void main(String[] args) throws IOException {

        Path source = Paths.get("Files/test.txt");
        System.out.println(source);

        Path realPath = source.toRealPath();
        System.out.println(realPath);

        Path target = Paths.get("Files/new_test.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);



    }
}
