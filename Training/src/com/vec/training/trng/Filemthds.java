package com.vec.training.trng;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Filemthds {
    public static void main(String[] args) {
        File myObj = new File("D:/XML.txt");
        File dir = new File("D:/Python");

        // File Information
        System.out.println("Absolute path: " + myObj.getAbsolutePath());
        System.out.println("Writable: " + myObj.canWrite());
        System.out.println("Readable: " + myObj.canRead());
        System.out.println("File size in bytes: " + myObj.length());
        System.out.println("List of the files are: " + Arrays.toString(dir.list()));
        System.out.println("File name: " + myObj.getName());

        try {
            File newFile = new File("D:/newFile.txt");

            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName());

                // Writing to the file
                try (FileWriter myWriter = new FileWriter(newFile)) {
                    myWriter.write("The caterpillar is a prisoner to the streets that conceived it\r\n"
                    		+ "Its only job is to eat or consume everything\r\n"
                    		+ "Around it, in order to protect itself from this mad city\r\n"
                    		+ "While consuming its environment the\r\n"
                    		+ "Caterpillar begins to notice ways to survive\r\n"
                    		+ "One thing it noticed is how much the\r\n"
                    		+ "World shuns him, but praises the butterfly\r\n"
                    		+ "The butterfly represents the talent,\r\n"
                    		+ "The thoughtfulness, and the beauty within the caterpillar\r\n"
                    		+ "But having a harsh outlook on life the caterpillar sees the\r\n"
                    		+ "Butterfly as weak and figures out\r\n"
                    		+ "A way to pimp it to his own benefits\r\n"
                    		+ "Already surrounded by this mad city the caterpillar\r\n"
                    		+ "Goes to work on the cocoon which institutionalizes him\r\n"
                    		+ "He can no longer see past his own thoughts\r\n"
                    		+ "He's trapped\r\n"
                    		+ "When trapped inside these walls certain ideas take roots,\r\n"
                    		+ "Such as going home, and bringing back new concepts to this mad city\r\n"
                    		+ "The result?\r\n"
                    		+ "Wings begin to emerge, breaking the cycle of feeling stagnant\r\n"
                    		+ "Finally free, the butterfly sheds light on situations that\r\n"
                    		+ "The caterpillar never considered, ending the internal struggle\r\n"
                    		+ "Although the butterfly and caterpillar are\r\n"
                    		+ "Completely different, they are one and the same.");
                    System.out.println("Successfully wrote to the file.");
                }

                // Reading from the file
                try (Scanner myReader = new Scanner(newFile)) {
                    System.out.println("\nReading file content:");
                    while (myReader.hasNextLine()) {
                        System.out.println(myReader.nextLine());
                    }
                }

                // Deleting the file
                if (newFile.delete()) {
                    System.out.println("\nDeleted the file: " + newFile.getName());
                } else {
                    System.out.println("Failed to delete the file.");
                }

            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
