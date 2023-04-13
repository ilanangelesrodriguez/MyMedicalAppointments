package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    // Atributos
    private String specialty;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public enum Day{
        SUNDAY("Domingo"),
        MONDAY("Lunes"),
        TUESDAY("Martes"),
        WEDNESADY("Miercoles"),
        THURSDAY("Jueves"),
        FRIDAY("Viernes"),
        SATURDAY("Sabado");
        private String spanish;
        private Day(String spanish){
            spanish = spanish;
        }

        public String getSpanish() {
            return spanish;
        }
    }

    public Doctor(String name, String email){
        super(name, email);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    // Método para añadir citas
    public void addAvailableAppointment(String date, String time){

        availableAppointments.add(new AvailableAppointment(date, time));
    }
    // Devuelve la lista de citas
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() +
                "  specialty='" + specialty + '\n' +
                "  available='" + availableAppointments.toString() + '\n' +
                '}';
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital Dos de Mayo");
        System.out.println("Área: Neurología");
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time){
            try {
                this.date = format.parse(date);
            } catch (ParseException e){
                e.printStackTrace();
            }
            this.time = time;
        }
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }
        public String getDate() {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "AvailableAppointment { "+ '\n' +
                    "  date=" + date + '\n' +
                    "  time='" + time + '\n' +
                    '}';
        }
    }
}
