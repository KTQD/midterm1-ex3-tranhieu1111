import java.io.*;

public class Main {
    public static void main(String[] args) {
        String input = "input.txt";
        String output = "output.txt";
        thayTheFile(input, output);
    }

    private static void thayTheFile(String input, String output) {
        try (BufferedReader reader = new BufferedReader(new FileReader(input));
             BufferedWriter writer = new BufferedWriter(new FileWriter(output))) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("Nha Trang", "Vũng Tàu");
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Thay thế thành công.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
