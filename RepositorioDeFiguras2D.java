package Figuras2D;
import java.util.ArrayList;
import java.util.List;

public class RepositorioDeFiguras2D {

    private List<FiguraGeometrica2D> figuras = new ArrayList<>();

    public boolean adicionaFigura(FiguraGeometrica2D figura) {
        return figuras.add(figura);
    }

    public FiguraGeometrica2D removeFigura(int posicao) {
        System.out.println("Removendo figura na posição: " + posicao);
        return figuras.remove(posicao);
    }

    public double getArea(int posicao) {
        System.out.println("Área da figura na posição " + posicao);
        return figuras.get(posicao).caculeArea();
    }

    public double getPerimetro(int posicao) {
        System.out.println("Perímetro da figura na posição " + posicao);
        return figuras.get(posicao).CalculaPerimetro();
    }

    public String getTipoFigura(int posicao) {
        System.out.println("Tipo da figura na posição " + posicao);
        return figuras.get(posicao).pegarTipo();
    }
}