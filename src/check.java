public class check {
    public static void main(String args[]){

        long startTime = System.currentTimeMillis();

        int i = 1;

        while (i < 99999999){
            Math.random();
            i++;
        }

        System.out.println("Math.random() Time: " + (System.currentTimeMillis() - startTime + "ms"));
        //System.out.println(Math.random());
        //System.out.println(c);
}
}
