package IOUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile
{
    public static InputStream readFile(String filePath)
    {
        try {
            InputStream is = new FileInputStream(filePath);
            return is;
        } catch (IOException e) {

        }
        return null;
    }
}
