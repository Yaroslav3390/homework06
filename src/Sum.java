public class Sum {
    public static void main(String[] args){

        int[]  numbers = {1, 2, 3, 2, 4, 5};
        int total = 0;

        for ( int i = 0; i < numbers.length; i++){
            total += numbers[i];
        }
        System.out.println(total);

    }

}