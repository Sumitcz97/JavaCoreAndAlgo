package BasicJava;

public class Arrays {
    public static void main(String[] args){
        int[][] arr= {{0,1,2,3}, {4,5,6,7}, {8,9,10,11}};
        System.out.println("The Array Size is "+ arr[0].length);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("Arrays i:"+i+" j:"+j+" value:"+arr[i][j]);
            }
        }

    }
}
