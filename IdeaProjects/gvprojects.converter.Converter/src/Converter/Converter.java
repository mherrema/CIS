package Converter;

/**
 * Created with IntelliJ IDEA.
 * User: mitchherrema
 * Date: 1/10/13
 * Time: 7:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Converter {

    public void Convert(int num, int base1, int base2){
        int result = 0;
        double[] powers1;
        powers1 = new double[32];
        double[] powers2;
        powers2 = new double[32];
        for(int i=0; i<=31; i++){
            powers1[i]=Math.pow(base1,i);
            powers2[i]=Math.pow(base2,i);
        }


    }
}
