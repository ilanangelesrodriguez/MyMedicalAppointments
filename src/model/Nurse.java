package model;

public class Nurse extends User{
    private String specialty;
    public Nurse(String name, String email){
        super(name, email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital Dos de Mayo");
        System.out.println("Área: Cabeza y Cuello");
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
