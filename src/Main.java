import java.util.Date;

import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Adriana Bellido","Neurocirujano");
        myDoctor.addAvailableAppointment(new Date(),"4pm");
        myDoctor.addAvailableAppointment(new Date(),"10am");
        myDoctor.addAvailableAppointment(new Date(),"12am");

        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }


        /*Patient patient1 = new Patient("Ilan","ilanangelesrodriguez@gmail.com");
        Patient patient2 = new Patient("Jesús","jesusangelesrodriguez@gmail.com");
        System.out.println(patient1);
        System.out.println(patient2);

        System.out.println(patient1.getName());
        System.out.println(patient2.getName());
        patient2 = patient1;*/
    }
}
