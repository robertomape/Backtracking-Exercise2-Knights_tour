public class Algoritmo {
    int[] dx = {-1,-2,-2,-1, 1, 2, 2, 1};
    int[] dy = {-2,-1, 1, 2, 2, 1,-1,-2};


    public void viajeCaballero(int[][] tablero, int numMov, int x, int y, Booleano exito) {
        if (numMov > tablero.length*tablero.length){
            exito.setValor(true);
            System.out.println("Solución obtenida");
        }

        else {
            int k, u, v;
            k = 0;
            while ((!exito.getValor()) && (k < 8)){
                u = x + dx[k];
                v = y + dy[k];
                if ((u >= 0) && (u < tablero.length) && (v >= 0) && (v < tablero.length) && (tablero[u][v] == 0) ) {
                    tablero[u][v] = numMov;
                    numMov++;
                    viajeCaballero(tablero, numMov, u, v, exito);
                    if (!exito.getValor()) {
                        tablero[u][v] = 0;
                        numMov--;
                    }
                }
                k = k + 1;
            }
        }
    }
}
