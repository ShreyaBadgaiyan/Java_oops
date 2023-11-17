public class java_28_multiDimensionalArray {
    public static void main(String[] args) {
        int[] marks;//1D array
        int[][] flats;//2D array
        flats=new int[2][3];//2 rows 3 columns
        flats[0][0]=100;
        flats[0][1]=101;
        flats[0][2]=102;
        flats[1][0]=110;
        flats[1][1]=111;
        flats[1][2]=112;
        for(int i=0;i< flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
