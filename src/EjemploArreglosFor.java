import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {
        int[] numeros = new int[7];
        int t = numeros.length;

        String[] productos = new String[7];
        productos[0] = "Memoria Kingston 4gb";
        productos[1] = "Disco duro barracuda";
        productos[2] = "Monitor Gamer MSI";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook air";
        productos[5] = "Memoria Kingston 2gb";
        productos[6] = "Memoria Kingston 8gb";
        Arrays.sort(productos);

        System.out.println("=== Usando for ===");
        for (int i = 0; i < t; i++){
            System.out.println("indice  = " + i + " producto = " + productos[i]);
        }
        System.out.println("=== Usando forEach ===");
        for (String prod : productos){
            System.out.println("prod = " + prod);
        }
        System.out.println("=== Usando while ===");
        int i = 0;
        while(i < t){
            System.out.println("productos[i] = " + productos[i]);
            i++;
        }
        System.out.println("=== Usando Do while ===");
        int j = 0;
        do{
            System.out.println("j = " + productos[j]);
            j++;
        }while(j < t);
    }
}
