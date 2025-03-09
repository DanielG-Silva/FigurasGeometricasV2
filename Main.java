package Figuras2D;

public class Main {
    public static void main(String[] args) {
        ArmazenarFiguras2D repositorio = new ArmazenarFiguras2D();
        
        repositorio.adicionaFigura(new Circulo(5));
        repositorio.adicionaFigura(new Circulo(3));
        repositorio.adicionaFigura(new Circulo(7));

        System.out.println("Antes de ordenar:");
        for (int i = 0; i < repositorio.figuras.size(); i++) {
            System.out.println(repositorio.getTipoFigura(i) + ", área: " + repositorio.getArea(i));
        }

        repositorio.ordenarPorArea();

        System.out.println("\n depois de ordenar:");
        for (int i = 0; i < repositorio.figuras.size(); i++) {
            System.out.println(repositorio.getTipoFigura(i) + ", área: " + repositorio.getArea(i));
        }
    }
}
