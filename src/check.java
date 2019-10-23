import java.util.concurrent.TimeUnit;

public class check {
    public static void main(String args[]){


        long startTime = System.currentTimeMillis();

        int x = 1;
        int i = 1;

        while (i < 99999){
            x = 999 * 999;
            i++;
            //System.out.println(x);
        }

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        //long xxx = TimeUnit.MILLISECONDS.toSeconds(duration);
        //System.out.format("%.10f", duration);
        //float b = duration/1000;
        System.out.println(duration);




}}
