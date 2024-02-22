import java.util.ArrayList;

public class Hospital {
    private int maxPatients;
    private ArrayList<Patient> patients;

    // constructors
    public Hospital() {
    }
    public Hospital(int maxPatients, ArrayList<Patient> patients) {
        this.maxPatients = maxPatients;
        this.patients = patients;
    }

    // getters setters
    public int getMaxPatients() {
        return maxPatients;
    }

    public void setMaxPatients(int maxPatients) {
        this.maxPatients = maxPatients;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    // methods
    public void display() {
        System.out.printf("%d/%d patients", patients.size(), maxPatients);
    }

    public void displayPatientsFromWard(String ward) {
        for (Patient patient : patients) {
            if (patient.wardName.equals(ward)) patient.display();
        }
    }

    public int returnAverageStayedDays() {
        int sum = 0;
        for (Patient patient : patients) {
            sum += patient.getDaysStaying();
        }
        return sum/patients.size();
    }

    public int returnMaxDaysStayed() {
        int max = 0;
        for (Patient patient : patients) {
            if (max < patient.getDaysStaying()) max = patient.getDaysStaying();
        }
        return max;
    }

    public int returnHowManyOlder(int age) {
        int count = 0;
        for (Patient patient : patients) {
            if (patient.getAge() > age) count += 1;
        }
        return count;
    }
}
