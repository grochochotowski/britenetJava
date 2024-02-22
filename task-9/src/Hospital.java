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

}
