public class java_29_4 {
    public static void main(String[] args) {
        //Write a java program to add 2 matrices of size 2x3
        int[][] mat1={{2,3,4},{5,6,7}};
        int[][] mat2={{5,6,5},{4,3,2}};
        int[][] result={{0,0,0},{0,0,0}};
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j <mat1[i].length; j++) {
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        for (int i = 0; i <result.length ; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]+" ");

            }
            System.out.println("\n");

        }

    }
}
