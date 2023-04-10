import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    // Atributos
    static int id = 0;
    private String name;
    private String email;
    private String specialty;

    Doctor(){
        System.out.println("Construyendo el objeto Doctor.");
    }
    Doctor(String name, String specialty){
        System.out.println("El nombre del doctor: "+name);
        id++;
        this.name = name;
        this.specialty = specialty;
    }
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
        id++;
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    // Método para añadir citas
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }
    // Devuelve la lista de citas
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }


    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
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
    }
}
