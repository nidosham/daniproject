/*
 * 
 */
package zoomonitoring;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This program is used to read animals or habitats records from file and then
 * store it in a list which can be accesses using the method getLIST
 *
 */
class FileReader {

    String file;
    List<String> zooList;

    /**
     * constructor that reads the content of file provided and store data into a
     * list
     */
    FileReader(String file) {
        this.file = file;
        zooList = new ArrayList();
        String line;
        try {
            Scanner scan = new Scanner(new File(file));
            while (scan.hasNext()) {
                line = scan.nextLine();

                zooList.add(line);
            }
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
    }

    /**
     * This method is used to access list
     * @return list
     */
    List<String> getList() {
        return this.zooList;
    }

}
