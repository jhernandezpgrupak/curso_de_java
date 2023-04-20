public class EjemploMatricesBuscar {
    public static void main(String[] args) {
        int [][] matrizDeEnteros = {
                {35,90,1978},
                {15,2020,10,5},
                {677,127,32767,1999}
        };

        int elemento = 1999;
        boolean listo = false;
        int i, j = 0;
        buscar:for (i = 0; i < matrizDeEnteros.length; i++){
            for (j = 0; j < matrizDeEnteros[i].length; j++){
                if(matrizDeEnteros[i][j] == elemento){
                    listo = true;
                    break buscar;
                }
            }
        }
        if (listo){
            System.out.println("Elemento encontrado en las cordenadas:" + i + "," + j);
        }else{
            System.out.println("Elemento no encontrado");
        }
    }
}
