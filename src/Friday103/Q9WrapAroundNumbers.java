package Friday103;

public class Q9WrapAroundNumbers {
    static void main(String[] args) {

                int[] colors = {1, 2, 3};
                int step = 7;

                int index = step % colors.length;
                System.out.println("Color index: " + index);
                System.out.println("Color value: " + colors[index]);
            }
        }

