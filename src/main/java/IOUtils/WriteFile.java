package IOUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile
{
    public static void writeFile(String outputPath, String result)
    {
        try {
            File outFile = new File(outputPath);
            if (!outFile.exists()) {
                if (outFile.createNewFile()) {
                    FileOutputStream fout = new FileOutputStream(outFile);
                    fout.write(result.getBytes());
                    fout.close();
                }
            } else {
                FileOutputStream fout = new FileOutputStream(outFile);
                fout.write(result.getBytes());
                fout.close();
            }
        } catch (IOException e) {

        }
    }
}
