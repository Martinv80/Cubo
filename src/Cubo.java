public class Cubo {
    // Atributos
    private double ancho;
    private double alto;
    private double largo;

    // Constructor vacío por defecto
    public Cubo() {
    }

    // Constructor con parámetros
    public Cubo(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    // Métodos Getters y Setters
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    // Método para calcular el volumen
    public double calcularVolumen() {
        return this.ancho * this.alto * this.largo;
    }

    // Representación en texto del objeto
    @Override
    public String toString() {
        return "Cubo{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", largo=" + largo +
                '}';
    }
}
