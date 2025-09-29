import java.util.Arrays;

public class Arrayz {

    public static double[] sort(double[] array){
        boolean sorted = false;
        while( sorted == false){
            sorted = true;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i + 1]){
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }
    
    public static boolean isMagicSquare(int[][] square){
        int n = square.length;
        int magicSum = 0;
        for(int j = 0; j < n; j++){
            magicSum += square[0][j];
        }
        
        // Check rows
        for(int i = 1; i < n; i++){
            int rowSum = 0;
            for(int j = 0; j < n; j++){
                rowSum += square[i][j];
            }
            if(rowSum != magicSum) return false;
        }
        
        // Check columns
        for(int j = 0; j < n; j++){
            int colSum = 0;
            for(int i = 0; i < n; i++){
                colSum += square[i][j];
            }
            if(colSum != magicSum) return false;
        }
        
        // Check main diagonal
        int diagSum1 = 0;
        for(int i = 0; i < n; i++){
            diagSum1 += square[i][i];
        }
        if(diagSum1 != magicSum) return false;
        
        // Check secondary diagonal
        int diagSum2 = 0;
        for(int i = 0; i < n; i++){
            diagSum2 += square[i][n - 1 - i];
        }
        if(diagSum2 != magicSum) return false;
        
        return true;

    }
    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    
    public static void main(String[] args){
        
        // Test-Code für Teilaufgabe e)
        System.out.println("Aufgabe e)");
        System.out.println(Arrays.toString(sort(new double[] { 3.4, 2.1, 5.6, 1.2, 4.8 })));

        // Test-Code für Teilaufgabe f)
        System.out.println("Aufgabe f)");
        int[][] magicSquare = new int[][] { { 12, 6, 15, 1 },
                { 13, 3, 10, 8 },
                { 2, 16, 5, 11 },
                { 7, 9, 4, 14 }
        };
        System.out.println(isMagicSquare(magicSquare));
        int[][] nonMagicSquare = new int[][] { { 1, 6, 15, 1 },
                { 13, 3, 10, 8 },
                { 2, 16, 5, 11 },
                { 7, 9, 4, 14 }
        };
        System.out.println(isMagicSquare(nonMagicSquare));
        System.out.println( isMagicSquare(new int[][] { { 1, 2 }, { 3, 4 } }));
    }
}
