import java.util.ArrayList;

public class Hospital {
    private int maxPatients;
    private ArrayList<Patient> patients;

    public Hospital() {
    }

    public Hospital(int maxPatients, ArrayList<Patient> patients) {
        this.maxPatients = maxPatients;
        this.patients = patients;
    }
}
