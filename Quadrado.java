package Figuras2D;

public class Quadrado implements FiguraGeometrica2D {

    private double lado;

    public Quadrado(double lado) {
        super();
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double caculeArea() {
        System.out.println("Calcular área do quadrado");
        return lado * lado;
    }

    @Override
    public double CalculaPerimetro() {
        System.out.println("Calcular perímetro do quadrado");
        return 4 * lado;
    }

    @Override
    public String pegarTipo() {
        return "Quadrado";
    }

    public int compareTo(FiguraGeometrica2D outraFigura) {
        return Double.compare(this.caculeArea(), outraFigura.caculeArea());
    }
}
