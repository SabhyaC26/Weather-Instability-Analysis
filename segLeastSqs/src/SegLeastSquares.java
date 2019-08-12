import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SegLeastSquares {

    public static int DATA_DIM = 100;

    public static void main(String args[]) throws IOException {
        //Get scanner instance
        Scanner scanner = new Scanner(new File(args[0]));

        //Set the delimiter used in file
        scanner.useDelimiter(",");

        //Get all tokens and store them in the ArrayList below
        int count = 0;
        String[][] data = new String[DATA_DIM][2];
        while (scanner.hasNext()) {
            String next = scanner.next();
            System.out.println(Integer.parseInt(next));
//            if (count % 2 == 0) {
//                data[count][0] = "hi";
//            } else {
//                data[count - 1][1] = next;
//            }
        }
        scanner.close();

        for (int i = 0; i < DATA_DIM; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(data[i][j] + "");
            }
            System.out.println();
        }
    }

}
