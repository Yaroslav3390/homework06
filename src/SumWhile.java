public class SumWhile {
        public static void main(String[] args){

            int[]  numbers = {1, 2, 3, 2, 4, 5};
            int total = 0;
            int i = 0;

            while (i < numbers.length){

                total += numbers[i];
                i++;
                System.out.println(total);
            }

        }

    }


