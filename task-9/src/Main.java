import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // patients
        System.out.println("PATIENTS");
        ArrayList<Patient> patients = new ArrayList<>();
        File file = new File("C:\\nonSystem\\IT\\Code\\britenetJava\\task-9\\src\\newpatients.txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            System.out.println(line);
            String[] lineSplit = line.split(";");
            Patient newPatient = new Patient(lineSplit[0], lineSplit[1], lineSplit[2], lineSplit[3], 0, Integer.parseInt(lineSplit[4]));
            patients.add(newPatient);
        }
        scan.close();

        System.out.println("\n\nInital:");
        for (Patient patient : patients) patient.display();
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
        System.out.println("\n\nSOrt by name and surname:");
        for (Patient patient : patients) patient.display();

        patients.sort(Comparator.comparingInt(Patient::getDaysStaying));
        System.out.println("\n\nSort by days staying:");
        for (Patient patient : patients) patient.display();

        patients.sort(Comparator.comparingInt(Patient::getAge));
        System.out.println(" \n\nSort by age:");
        for (Patient patient : patients) patient.display();


        // hospital
        System.out.println("\n\n\n\nHOSPITAL");
        Hospital hospital = new Hospital(10, patients);
        hospital.display();
        System.out.println(hospital.returnAverageStayedDays());
        System.out.println(hospital.returnHowManyOlder(65));

    }
}