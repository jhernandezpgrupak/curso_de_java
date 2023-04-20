public class EjemploMatricesMarco {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 || j == 0) {
                    matriz[i][j] = 1;
                    matriz[j][i] = 1;
                }else if(i == matriz.length-1 || j == matriz.length-1){
                    matriz[i][j] = 1;
                    matriz[j][i] = 1;
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