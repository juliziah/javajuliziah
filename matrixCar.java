public class matrixCar {
    public static void main(String[] args) {
        String [][] matrix = new String[3][3];

        matrix[0][0] = "Honda"; matrix[0][1] =" Axia"; matrix[0][2] = "Proton"; 
        matrix[1][0] = "X70"; matrix[1][1] = "Myvi"; matrix[1][2] = "Produa"; 
        matrix[2][0] = "Ativa"; matrix[2][1] = "Hilux"; matrix[2][2] = "Vigo";

        int [][] matrix2 = {
            {25000, 30000, 40000},
            {70000, 35000, 25000},
            {90000, 80000, 85000}
        };
       
        for (int row=0; row<matrix.length; row++) {
            for (int col=0; col<matrix[row].length; col++) {
            if (matrix2[row][col] > 50000){
            System.out.println(matrix[row][col] +"," + matrix2[row][col]);
            }
        
            }
          
        }


    }
}