import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceWordsInFile {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {

                line = line.replaceAll("Nha Trang", "Vũng Tàu");
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Đã thay thế và ghi vào file " + outputFile);

        } catch (IOException e) {
            System.err.println("Xảy ra lỗi khi đọc hoặc ghi file: " + e.getMessage());
        }
    }
}

