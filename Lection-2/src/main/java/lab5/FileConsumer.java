package lab5;

import javax.annotation.PostConstruct;
import java.io.File;

/**
 * Created by Ольга on 07.04.2015.
 */
public class FileConsumer {

    String fileName;
    public FileConsumer(String fileName) {
        this.fileName = fileName;
    }

    @PostConstruct
    public void consumeFile(){
        System.out.println(new File("test.txt").length());
    }
}
