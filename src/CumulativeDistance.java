import java.util.Arrays;
import java.util.Scanner;

public class CumulativeDistance {

    public static void main (String [] args) {
        Scanner sc1 = new Scanner(System.in);
        sc1.useDelimiter("\\n");
        int count = sc1.nextInt();

        String xCoors = sc1.next();
        String yCoors = sc1.next();

        Scanner scx = new Scanner(xCoors).useDelimiter(" ");
        Scanner scy = new Scanner(yCoors).useDelimiter(" ");

        double[] ax = new double[count];
        double[] ay = new double[count];
        double[] dist = new double[count];
        double total_dist = 0.0;

        // fill in x-vector and y-vector
        for (int i=0; i< count; i++ ) {
            ax[i] = scx.nextDouble();
            ay[i] = scy.nextDouble();
        }

        scx.close();
        scy.close();
        System.out.println(Arrays.toString(ax));
        System.out.println(Arrays.toString(ay));

        for (int i=1; i<count; i++) {
            double dx = ax[i]-ax[i-1];
            double dy = ay[i]-ay[i-1];
            dist[i] = Math.sqrt(dx*dx + dy*dy);
            total_dist += dist[i];
        }

        System.out.println(Arrays.toString(dist));
        System.out.println(String.format("%.2f",total_dist));
    }
}
