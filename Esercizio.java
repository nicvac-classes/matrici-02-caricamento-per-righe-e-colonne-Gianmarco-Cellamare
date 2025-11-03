
public class Esercizio {

    public static void riempiPerRighe(/* scrivere qui i parametri formali */) {
        int conta = 0;
        int i;
        int conta;
        i=0;
        while (i <= RIGHE-1;) {
            j=0;
            while (j <= COLONNE-1;) {
               conta = conta + 1;
               M[i][j] = conta;
               j=j+1
             }
             i=i+1;
        }
    }

    public static void riempiPerColonne(/* scrivere qui i parametri formali */) {
        int conta = 0;
        int i;
        int conta;
        i=0;
        while (j <= COLONNE-1;) {
            i=0;
            while (i <= RIGHE-1;) {
               conta = conta + 1;
               M[i][j] = conta;
               i=i+1
             }
             j=j+1;
        }

  }

    public static void main(String[] args) {
          int RIGHE = 3;
          int COLONNE = 5;
          int[][] matricePerRighe = new int[RIGHE][COLONNE];
          int[][] matricePerColonne = new int[RIGHE][COLONNE];
  
          riempiPerRighe(matricePerRighe, RIGHE, COLONNE);
          riempiPerColonne(matricePerColonne, RIGHE, COLONNE);
  
          System.out.println("Per righe:");
          UtilsMatrice.visualizza(matricePerRighe);
 
          System.out.println("Per colonne:");
          UtilsMatrice.visualizza(matricePerColonne);
    }
}