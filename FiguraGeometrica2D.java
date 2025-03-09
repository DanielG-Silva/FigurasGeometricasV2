package Figuras2D;

public interface FiguraGeometrica2D extends Comparable<FiguraGeometrica2D> {
    double caculeArea();
    double CalculaPerimetro();
    String pegarTipo();
}
