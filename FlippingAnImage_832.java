package LeetCode_Questions;

public class FlippingAnImage_832 {
    public void reverse(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[arr.length-i-1];
            arr[arr.length-i-1]=arr[i];
            arr[i]=temp;
        }
    }
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0;i<A.length;i++){
            reverse(A[i]);
            for(int j=0;j<A[i].length;j++){
                if(A[i][j]==1)
                    A[i][j]=0;
                else
                    A[i][j]=1;
            }
        }
        return A;
    }

    public void mainFlippingAnImage_832(){
        int[][] x = {{1,1,0},{1,0,1},{1,1,1}};

        x = flipAndInvertImage(x);

        GeneralFunctions gf = new GeneralFunctions();
        gf.print2D(x);
    }
}
