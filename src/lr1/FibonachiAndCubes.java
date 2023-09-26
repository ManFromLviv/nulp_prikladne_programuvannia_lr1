package lr1;

import java.util.ArrayList;

/**
 *
 * @author Valchevskyi
 */
public class FibonachiAndCubes {
    private final ArrayList<Integer> fibonachi;
    private final ArrayList<Integer> cubes;

    /*
     * @param N is count number Fibonachi
     */
    public FibonachiAndCubes(int N) {
        fibonachi = new ArrayList<>();
        cubes = new ArrayList<>();
        setFibonachi(N);
    }

    /** 
     * @param N is count number Fibonachi
     */
    public final void setFibonachi(int N) {
        if (fibonachi.size() != N) {
            if (N > 2) {
                // For append next number if row clear or row is one element.
                if (fibonachi.isEmpty()) {
                    fibonachi.add(1);
                    fibonachi.add(1);
                    cubes.add(1);
                } else if (fibonachi.size() == 1) {
                    fibonachi.add(1);
                }
                // Delete or append elements in Fibonachi and cubes rows.
                if (fibonachi.size() > N) {
                    for (int i = fibonachi.size() - 1; i >= N; i--) {
                        if (isCube(fibonachi.get(i))) {
                            cubes.remove(cubes.size() - 1);
                        }
                        fibonachi.remove(i);
                    }
                } else {
                    try {
                        for (int i = fibonachi.size(); i < N; i++) {
                            fibonachi.add(Math.addExact(fibonachi.get(i - 2), fibonachi.get(i - 1)));
                            if (isCube(fibonachi.get(i))) {
                                cubes.add(fibonachi.get(i));
                            }
                        }
                    } catch (ArithmeticException e) {
                        // Overflow int data type.
                    }
                }
            } else {
                fibonachi.clear();
                cubes.clear();
                if (N > 0) {
                    fibonachi.add(1);
                    cubes.add(1);
                    if (N == 2) {
                        fibonachi.add(1);
                    }
                }
            }
        }
    }

    
    /** 
     * @param number check value is cube
     * @return boolean is cube
     */
    private boolean isCube(int number) {
        return number == Math.pow((int) Math.pow(number, 1.0 / 3), 3);
    }

    
    /** 
     * @return String copy array list of Fibonachi and cubes
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Result:");
        stringBuilder.append(toStringBuilderArrayList(fibonachi, "\n\tFibonachi"));
        stringBuilder.append(toStringBuilderArrayList(cubes, "\n\tCubes"));
        return stringBuilder.toString();
    }

    
    /** 
     * @param arrayList for output data of array list
     * @param nameArrayList for output name array list
     * @return StringBuilder copy of array list
     */
    private StringBuilder toStringBuilderArrayList(ArrayList<Integer> arrayList, String nameArrayList) {
        StringBuilder stringBuilder = new StringBuilder(nameArrayList);
        stringBuilder.append(" => N: ").append(arrayList.size());
        stringBuilder.append(" => List: ");
        if (!arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size() - 1; i++) {
                stringBuilder.append(arrayList.get(i)).append(", ");
            }
            stringBuilder.append(arrayList.get(arrayList.size() - 1));
        } else {
            stringBuilder.append("none");
        }
        return stringBuilder;
    }
}
