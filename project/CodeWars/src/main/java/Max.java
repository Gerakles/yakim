public class Max {
    public static int sequence(int[] arr) {
        int max = arr[0];
        arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int[] sumArray = new int[arr.length];

        for (int i = 0; i < arr.length - max + 1; i++){
            int sum = 0;
            for (int j = i; j < i + max; j++  ){
                sum += arr[j];
            }
            sumArray[i] = sum;

        }
        System.out.println(getMax( sumArray));

        return getMax( sumArray );
    }
    public static int getMax(int[] arr){
        int max = 0;
        for(int maximum : arr ){
            if(maximum > max) max = maximum;
        }
        return max;
    }

    public static void main(String[] args) {
        sequence (new int[]{});
    }

}