package ex5;

import java.io.File;
import java.nio.file.Path;

public class ScanDir {
    public static void main(String[] args) {

        scanDir("C:\\Users\\DaWig\\IdeaProjects\\PRO2-Project");
    }


    public static void scanDir(String path) {
        scanDir(path, 0);
    }

    public static void scanDir(String path, int niveau) {
        File aFile = new File(path);
        if (aFile.isDirectory()) {
            for (String child : aFile.list()) {
                for (int i = 0; i < niveau; i++) {
                    System.out.print("    ");
                }
                System.out.println("Directory " + niveau + " : " + child);
                scanDir(path + "\\" + child, niveau+1);

            }
        }
      else {
            String fileName = aFile.toString();
            for (int i = 0; i < niveau; i++) {
                System.out.print("    ");
            }
            System.out.println("File " + niveau + " : " + fileName);
        }
    }
}
