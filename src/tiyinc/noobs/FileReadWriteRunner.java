package tiyinc.noobs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by BenLee on 8/18/16.
 */

public class FileReadWriteRunner {
    public static void main(String[] args){
        System.out.println("Running...");
        FileReadWriteRunner runner = new FileReadWriteRunner();
        runner.testWriteFile();
        runner.testReadFile();
    }

    public void testWriteFile(){
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
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void testReadFile(){
        try {
            File testFile = new File("src/tiyinc/noobs/FileReadWriteRunner.java");
            Scanner fileScanner = new Scanner(testFile);
            while(fileScanner.hasNext()){
                String currentLine = fileScanner.nextLine();
                System.out.println(currentLine);
            }
        }catch (Exception exceptrion){
            exceptrion.printStackTrace();
        }

    }
}
