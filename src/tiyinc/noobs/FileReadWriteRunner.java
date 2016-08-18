package tiyinc.noobs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by BenLee on 8/18/16.
 */

public class FileReadWriteRunner {
    public static void main(String[] args){
        System.out.println("Running...");
        FileReadWriteRunner runner = new FileReadWriteRunner();
        runner.testWriteFile();
    }

    public void testWriteFile(){
        System.out.println("test write file!");
        FileWriter testWriter = null;
        try {
            File testFile = new File("noobs.txt");
            testWriter = new FileWriter(testFile);
            testWriter.write("new stuff");
        }catch (Exception exception) {
            exception.printStackTrace();
        }finally {
            if (testWriter != null ){
                try {
                    testWriter.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
