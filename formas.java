import java.util.ArrayList;

public abstract class Forma2D {
    public abstract double calcularPerimetro();
}

class Triangulo extends Forma2D {
    private double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return 3 * lado;
    }
}

class Quadrado extends Forma2D {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando objetos das formas
        Triangulo triangulo = new Triangulo(5.0);
        Quadrado quadrado = new Quadrado(4.0);

        // Criando ArrayList de Forma2D e adicionando objetos
        ArrayList<Forma2D> formas = new ArrayList<>();
        formas.add(triangulo);
        formas.add(quadrado);

        // Iterando e calculando/imprimindo perímetros
        for (Forma2D forma : formas) {
            double perimetro = forma.calcularPerimetro();
            System.out.println("Perímetro: " + perimetro);
        }
    }
}
