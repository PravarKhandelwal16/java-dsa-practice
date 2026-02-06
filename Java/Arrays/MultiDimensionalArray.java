public class MultiDimensionalArray {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

// Print MultiDimensional Array
 