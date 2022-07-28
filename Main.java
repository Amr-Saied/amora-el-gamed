import java.util.*;
import java.util.function.BiConsumer;


public class Main {

    public static void main(String[] args) {

        HashMap<Double, Double> amoraTest = new HashMap<>();

        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Please Enter the numbers of containers: ");
        x = input.nextInt();
        for(int i = 0 ; i < x;i++){
            System.out.println("Enter 1 to create a Cylinder or 2 to create a Cube: ");
            int y = input.nextInt();
            if( y == 1){
                double l, h, VW;
                System.out.println("Enter the radius: ");
                l = input.nextDouble();
                System.out.println("Enter the height: ");
                h = input.nextDouble();
                System.out.println("Enter the Filled amount in cubic meter: ");
                VW = input.nextDouble();
                Cylinder obj = new Cylinder();
                obj.GetDimensions(l, h, VW);
                amoraTest.put(obj.CalcVolume(), obj.GetEmptyVolume());
            } // end of first if codition
            if(y == 2){
                double r, w, h2, VW2;
                System.out.println("Enter the radius: ");
                r = input.nextDouble();
                System.out.println("Enter the height: ");
                h2 = input.nextDouble();
                System.out.println("Enter the Width: ");
                w = input.nextDouble();
                System.out.println("Enter the Filled amount in cubic meter: ");
                VW2 = input.nextDouble();
                Cube obj2 = new Cube();
                obj2.GetDimensions(r, h2, w, VW2);
                amoraTest.put(obj2.CalcVolume(), obj2.GetEmptyVolume());

            } // end of second if condition
        } // end of for loop


        for(Map.Entry<Double, Double> Helper: amoraTest.entrySet()){
            System.out.println("Volume: "+ Helper.getKey()+"           Remaining: "+Helper.getValue());
        }









    }
}
