import java.io.File;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // patients

        ArrayList<Patient> patients = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        File file = new File("./newpatients.txt");

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] lineSplit = line.split(";");
            Patient newPatient = new Patient(lineSplit[0], lineSplit[1], lineSplit[2], lineSplit[3], 0, Integer.parseInt(lineSplit[4]));
            patients.add(newPatient);
        }

        for (Patient patient : patients) patient.display();

        patients.sort(new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                // Compare by name first
                int nameComparison = p1.getName().compareTo(p2.getName());
                if (nameComparison != 0) {
                    return nameComparison;
                }

                // If names are equal, compare by surname
                return p1.getSurname().compareTo(p2.getSurname());
            }
        });

        for (Patient patient : patients) patient.display();

        
    }
}