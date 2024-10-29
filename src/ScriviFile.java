import java.io.*;

public class ScriviFile {
    private FileWriter fileWriter;
    private BufferedWriter fileWriterBuffer;

    public ScriviFile(String file) {
        try {
            this.fileWriter = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
         fileWriterBuffer = new BufferedWriter(fileWriter);
    }

    public boolean write(String s) {
        if (!s.equals("")) {
            try {
                fileWriterBuffer.write(s + "\n");
                fileWriterBuffer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return true;
        } else {
            return false;
        }
    }

}
