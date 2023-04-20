public class EjemploMatricesX {
    public static void main(String[] args) {
        int[][] matriz = new int[20][20];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j || j == matriz[i].length-1-i) {
                    //Comparo j con el total de matriz -1 y -1 para decrementar al de izquierda a derecha
                    matriz[i][j] = 11;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }
}