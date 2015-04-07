package lab5;

import javax.annotation.PostConstruct;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Ольга on 07.04.2015.
 */
public class FileCreator {
    String fileName;

    public FileCreator(String fileName) {
        this.fileName = fileName;
    }

    @PostConstruct
    public void writeFile(){
        try(FileWriter fileWriter = new FileWriter("test.txt"))
        {
            fileWriter.append("bla-bla...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
