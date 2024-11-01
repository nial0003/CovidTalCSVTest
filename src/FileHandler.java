import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    ArrayList<Covid19Data> listOfData;

    public FileHandler() {
        listOfData = new ArrayList<>();
    }

    public void loadData() {
        try (Scanner sc = new Scanner(new File("coronaTal222.csv"))) {

            while (sc.hasNext()) {
                String dataLinje = sc.nextLine();
                String[] attributes = dataLinje.split(";");
                String region = attributes[0];
                String aldersGruppe = attributes[1];
                int bekræftedeTilfælde = Integer.parseInt(attributes[2]);
                int døde = Integer.parseInt(attributes[3]);
                int indlagtePåIntensiv = Integer.parseInt(attributes[4]);
                int indlagte = Integer.parseInt(attributes[5]);
                String dato = attributes[6];
                if (!region.isBlank()) {
                    listOfData.add(new Covid19Data(region, aldersGruppe, bekræftedeTilfælde, døde, indlagtePåIntensiv, indlagte, dato));
                }
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public void printData(){
        for (Covid19Data data : listOfData){
            System.out.println(data.toString());
        }
    }

    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        fileHandler.loadData();
        fileHandler.printData();
    }
}
