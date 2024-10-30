package important.topics;

import java.io.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) throws IOException {

        // Section 1: Basic File Operations
        File file = new File("D:\\FILES\\Learnings.xlsx");
        if (file.exists()) {
            System.out.println("File deleted: " + file.delete());
        } else {
            System.out.println("File created: " + file.createNewFile());
        }
        
        System.out.println("Is Hidden: " + file.isHidden());
        System.out.println("Set Writable: " + file.setWritable(true));
        System.out.println("Can Write: " + file.canWrite());
        System.out.println("Set Read-Only: " + file.setWritable(false));

        // Section 2: Relative Paths
        File relativeFile = new File("./check.txt");
        if (relativeFile.exists()) {
            System.out.println("Relative file deleted: " + relativeFile.delete());
        } else {
            System.out.println("Relative file created: " + relativeFile.createNewFile());
        }

        // Section 3: Directory Operations
        File folder = new File("./VamsiTest/checks/reddy/");
        if (folder.exists()) {
            System.out.println("Folder deleted: " + folder.delete());
        } else {
            System.out.println("Folders created: " + folder.mkdirs());
        }

        // Section 4: Directory Listing and Info
        File directory = new File("D:\\Work_Spaces\\ProblemSolving\\CoreJava\\src\\important\\topics");
        System.out.println("File list: " + Arrays.toString(directory.list()));
        System.out.println("File objects: " + Arrays.toString(directory.listFiles()));
        System.out.println("Directory Name: " + directory.getName());
        System.out.println("Parent Directory: " + directory.getParent());
        System.out.println("Absolute Path: " + directory.getAbsolutePath());
        System.out.println("Last Modified: " + new Date(directory.lastModified()));
        System.out.println("Is File: " + directory.isFile());

        System.out.println("=== Advanced Operations ===");
        
        // Section 5: File Reading
        File fileToRead = new File("D:\\Example.txt");
        if (!fileToRead.exists()) {
            fileToRead.createNewFile();
            System.out.println("File created: " + fileToRead.getName());
        }

        // FileInputStream Example
        try (FileInputStream stream = new FileInputStream(fileToRead)) {
            int value;
            while ((value = stream.read()) != -1) {
                System.out.print((char) value);
            }
        }
        System.out.println();

        // Scanner Example
        try (Scanner sc = new Scanner(fileToRead)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }

        // FileReader Example
        try (FileReader reader = new FileReader("D:\\Example.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        }
        System.out.println();

        // BufferedReader Example
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Example.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }

        // Section 6: File Writing
        File outputFile = new File("./test.txt");
        if (!outputFile.exists()) {
            outputFile.createNewFile();
        }

        // FileOutputStream Example
        try (FileOutputStream fos = new FileOutputStream(outputFile)) {
            fos.write(97); // a
            fos.write(98); // b
            fos.write(99); // c
            fos.write(100); // d
        }
        System.out.println("FileOutputStream: File written successfully.");

        // FileWriter Example
        try (FileWriter writer = new FileWriter("./tests.txt")) {
            writer.write("Vamsi");
        }
        System.out.println("FileWriter: File written successfully.");

        // BufferedWriter Example
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./testss.txt"))) {
            bufferedWriter.write("Vamsikishore Reddy");
        }
        System.out.println("BufferedWriter: File written successfully.");
    }
}
