import java.io.*;
import java.util.Scanner;

public class File_encryption_decryption {
    // Simple Caesar cipher encryption/decryption function
    private static void processFile(int shift, String inputFilePath, String outputFilePath) throws IOException {
        try (
                Reader fileReader = new FileReader(inputFilePath);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                Writer fileWriter = new FileWriter(outputFilePath);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            int character;
            while ((character = bufferedReader.read()) != -1) {
                // Apply the shift to the character's ASCII value
                int processedChar = character + shift;
                bufferedWriter.write(processedChar);
            }
            System.out.println("File successfully processed and saved to " + outputFilePath);
        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Prompt user for mode (encryption or decryption)
        System.out.println("Do you want to (E)ncrypt or (D)ecrypt a file? Enter E or D:");
        String mode = scanner.nextLine().trim().toUpperCase();

        if (!mode.equals("E") && !mode.equals("D")) {
            System.out.println("Invalid mode entered. Please enter E or D.");
            return;
        }

        // 2. Prompt user for file name/path
        System.out.println("Enter the input file path/name (e.g., input.txt):");
        String inputPath = scanner.nextLine().trim();

        // 3. Define output file path
        String outputPath;
        if (mode.equals("E")) {
            outputPath = inputPath.replace("C:Users/shivam/sk.txt", "adfgv jlsnvbs") + "_encrypted.txt";
        } else {
            outputPath = inputPath.replace("C:Users/shivam/sk.txt", "dkasfhhgvbiand") + "_decrypted.txt";
        }

        // A simple "key" (shift value)
        int key = 7; // You can also prompt the user to input the key

        // 4. Encrypt or decrypt the file accordingly
        try {
            if (mode.equals("E")) {
                System.out.println("Encrypting file...");
                processFile(key, inputPath, outputPath);
            } else {
                System.out.println("Decrypting file...");
                // Decryption uses a negative shift value
                processFile(-key, inputPath, outputPath);
            }
        } catch (IOException e) {
            System.out.println("An error occurred during file processing: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

