public class Main {
    public static void main(String[] args) {
        Algoritmo algo = new Algoritmo();
        int[][] tablero = new int[6][6];
        for(int i=0; i<tablero.length; i++){
            for (int j=0; j< tablero.length; j++){
                tablero[i][j]=0;
            }

        }
        tablero[0][0]=1;
        Booleano exito = new Booleano(false);
        algo.viajeCaballero(tablero, 2, 0, 0, exito);
    }
}
