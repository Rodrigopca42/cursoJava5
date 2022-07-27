package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Triangulo;

public class Programa {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Entre com as medidas do triangulo X: ");
        x.a = tec.nextDouble();
        x.b = tec.nextDouble();
        x.c = tec.nextDouble();

        System.out.println("Entre com as medidas do triangulo Y: ");
        y.a = tec.nextDouble();
        y.b = tec.nextDouble();
        y.c = tec.nextDouble();

       
        double areaX = x.area();       
        double areaY = y.area();

    System.out.printf("Área do Triangulo X: %.2f%n", areaX);
    System.out.printf("Área do Triangulo Y: %.2f%n", areaY);

    if(areaX > areaY){
        System.out.println("Maior Área: X");
    }
    else{
        System.out.println("Maior Área: Y");
    }
     System.out.println(" ");



    }
}
