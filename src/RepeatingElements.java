public class RepeatingElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 5};


        for ( int i = 0; i < numbers.length; i++){
            for ( int j = ++i; j < numbers.length; j++){
                if((numbers[i]==(numbers[j])) && (i !=j)){
                    System.out.println("Duplicate Element : "+numbers[i]);
                }
                else if (numbers[i]!=numbers[j]) {
                    System.out.println("There are no duplicate elements " );
                }
            }



        }

    }
}
