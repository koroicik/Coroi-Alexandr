import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
   public static void main(String[] args) {
      String fileName = "data.txt";

      try {
         FileWriter fileWriter = new FileWriter(fileName);
         fileWriter.write("1, "Молоко", "Ультрапастеризованное молоко 3.2%", 60, 1000, "мл"\n");
         fileWriter.write("2, "Хлеб", "Белый хлеб", 30, 500, "г"\n");
         fileWriter.write("3, "Яблоки", "Сорт Гала", 80, 100, "кг"\n");
         fileWriter.write("4, "Масло", "Сливочное масло 82.5%", 120, 200, "г"\n");
         fileWriter.write("5, "Колбаса", "Докторская колбаса", 250, 100, "г"\n");
         fileWriter.close();
         System.out.println("File created successfully.");
      } catch (IOException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }
   }
}
