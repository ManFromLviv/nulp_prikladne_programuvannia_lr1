package lr1;

/**
 *
 * @author Valchevskyi
 */

public class LR1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FibonachiAndCubes variantThree = new FibonachiAndCubes(47);
        System.out.println("Overflow in 47 element Fibonachi (max element - 46):");
        System.out.println(variantThree.toString());
        System.out.println("\nChange count element in Fibonachi:");
        variantThree.setFibonachi(4);
        System.out.println(variantThree.toString());
        variantThree.setFibonachi(2);
        System.out.println(variantThree.toString());
        variantThree.setFibonachi(0);
        System.out.println(variantThree.toString());
        variantThree.setFibonachi(1);
        System.out.println(variantThree.toString());    
        variantThree.setFibonachi(0);
        System.out.println(variantThree.toString()); 
        variantThree.setFibonachi(3);
        System.out.println(variantThree.toString());
        variantThree.setFibonachi(1);
        System.out.println(variantThree.toString());
        variantThree.setFibonachi(6);
        System.out.println(variantThree.toString());
        variantThree.setFibonachi(6);
        System.out.println(variantThree.toString());
        variantThree.setFibonachi(10);
        System.out.println(variantThree.toString());
    }
    
}
