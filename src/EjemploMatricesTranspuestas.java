public class EjemploMatricesTranspuestas {
    public static void main(String[] args) {
        int [][] matriz = {
                {1,2,3,4,5},      //Fila 0 => 1, 2, 3, 4
                {6,7,8,9,10},      //Fila 1 => 5, 6, 7, 8 (i=1, j=0)
                {11,12,13,14,15},   //Fila 2 => 9, 10, 11, 12
                {16,17,18,19,20},  //Fila 3 => 13, 14, 15, 16
                {21,22,23,24,25},
        };
        int aux = 0 ;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < i; j++){
                //System.out.println(matriz[j][i]);
                aux = matriz[i][j];//5
                matriz[i][j] = matriz[j][i]; //Matriz transpuesta
                matriz[j][i]=aux;
            }
        }

        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
