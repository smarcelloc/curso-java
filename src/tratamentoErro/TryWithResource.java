package tratamentoErro;

import java.io.*;

public class TryWithResource {

    public static String readFirstLineFromFile(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

}
/*
try (
    java.util.zip.ZipFile zf = new java.util.zip.ZipFile(zipFileName);
    java.io.BufferedWriter writer = java.nio.file.Files.newBufferedWriter(outputFilePath, charset)
)

*/