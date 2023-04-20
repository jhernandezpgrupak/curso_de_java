public class EjemploMatricesStringFor {
    public static void main(String[] args) {
        String[][] nombres = {{"Pepe","Pepa"},{"Josefa","Paco"},{"Roberto","Berta"}};

        for (int i = 0; i < nombres.length; i++){
            for (int j = 0; j < nombres[i].length; j++){
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Iterando con forEach");

        for(String[] fila : nombres){
            for (String columna : fila){
                System.out.print(columna + "\t");
            }
            System.out.println();
        }
    }
}
