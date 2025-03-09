package Figuras2D;

public class Circulo implements FiguraGeometrica2D {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double caculeArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double CalculaPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String pegarTipo() {
        return "Círculo";
    }

    @Override
    public int compareTo(FiguraGeometrica2D outraFigura) {
        return Double.compare(this.caculeArea(), outraFigura.caculeArea());
    }
}
