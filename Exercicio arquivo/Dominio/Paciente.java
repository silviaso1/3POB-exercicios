package Dominio;

public class Paciente {
    private int id;
    private double peso;
    private double altura;

    public Paciente(int id, double peso, double altura) {
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void mostrarPaciente() {
        System.out.println("ID: " + id + ", Peso: " + peso + " kg, Altura: " + altura + " m");
    }

    @Override
    public String toString() {
        return id + "," + peso + "," + altura;
    }
}
