import java.util.Scanner;
public class temperature {

    public static void main(String[] args) {
        int[][] arr = new int[2][12];
        getData(arr);

        averageHigh(arr);
        averageLow(arr);
        System.out.println("Highest temperature: ");
        indexHighTemp(arr);
        System.out.println("Lowest temperature: ");
        indexLowTemp(arr);

    }
    static int[][] getData(int[][] array) {
        Scanner input;
        input = new Scanner(System.in);
        String high= "high";
        String low= "low";
        String s;
        for (int i = 0; i < array.length; i++) {
            if((i==0)) {
                System.out.println("Enter high temperature for each month: ");
            }
            else if (i==1){
                System.out.println("Enter low temperature for each month: ");
            }
                for (int j = 0; j < array[i].length; j++) {

                    array[i][j] = input.nextInt();

            }
        }
        return array;
    }

    static int indexHighTemp(int[][] array) {

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
        return max;
    }

    static int indexLowTemp(int[][] array) {

        int low = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < low) {
                    low = array[i][j];
                }
            }
        }
        System.out.println(low);
        return low;
    }

    static int averageHigh(int[][] array) {
        int total = 0;
        int sumRow=0;
        System.out.println("Ave High Temp: ");
        for ( int i = 0; i < array.length; i++) {
            sumRow = 0;
            for (int j = 0; j < array[0].length; j++) {
                sumRow+=array[i][j];

            }

            float high=(float)sumRow / 12;
            System.out.println(Math.round(high));
            break;
        }

        return sumRow;
    }

    static int averageLow(int[][] array) {
            int total = 0;
            int sumRow=0;
            System.out.println("Ave low Temp: ");
            for ( int i = 1; i < array.length; i++) {
                sumRow = 0;
                for (int j = 0; j < array[0].length; j++) {
                    sumRow+=array[i][j];

                }
                float low=(float)sumRow / 12;
                System.out.println(Math.round(low));

            }

            return sumRow;
        }
}