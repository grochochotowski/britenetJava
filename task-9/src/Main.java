import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // patients

        ArrayList<Patient> patients = new ArrayList<>();
        File file = new File("newpatients.txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            System.out.println(line);
            String[] lineSplit = line.split(";");
            Patient newPatient = new Patient(lineSplit[0], lineSplit[1], lineSplit[2], lineSplit[3], 0, Integer.parseInt(lineSplit[4]));
            patients.add(newPatient);
        }
        scan.close();

        Random random = new Random();
        for (Patient patient : patients) {
            int newDays = random.nextInt(10) + 1;
            patient.setDaysStaying(newDays);
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

        patients.sort(Comparator.comparingInt(Patient::getDaysStaying));
        for (Patient patient : patients) patient.display();

        patients.sort(Comparator.comparingInt(Patient::getAge));
        for (Patient patient : patients) patient.display();
    }
}