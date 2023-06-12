public class SumWhile {
        public static void main(String[] args){

            int[]  numbers = {1, 2, 3, 2, 4, 5};
            int total = 0;
            int i = 0;
            total += numbers[i];


            while (i < numbers.length){
                i++;
                total += numbers[i];
            }
            System.out.println(total);

        }

    }


