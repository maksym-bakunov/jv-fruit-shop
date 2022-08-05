package core.basesyntax.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FileReaderCsv implements FileReader {
    @Override
    public List<String> readFile(String path) {
        File file = new File(path);
        try {
            List<String> list = Files.readAllLines(file.toPath());
            list.remove(0);
            return list;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}