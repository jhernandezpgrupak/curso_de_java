import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {
        int[] numeros = new int[4];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        String[] productos = new String[7];
        productos[0] = "Memoria Kingston 4gb";
        productos[1] = "Disco duro barracuda";
        productos[2] = "Monitor Gamer MSI";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook air";
        productos[5] = "Memoria Kingston 2gb";
        productos[6] = "Memoria Kingston 8gb";

        Arrays.sort(productos);

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);
    }
}
