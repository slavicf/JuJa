/**
 * Created by Intellij IDEA.
 * User: Jaroslav Frunt
 * Date: 04.10.2018
 */
public class Permutation {

    // Swapping 2 elements in array
    static void swap(char[] chars, int pos1, int pos2) {
        char temp = chars[pos1];
        chars[pos1] = chars[pos2];
        chars[pos2] = temp;
        return;
    }

    static void permutation(char[] chars, int depth, int pointer) {
        if (depth > 1) {
            permutation(chars, depth - 1, pointer);
        }

        System.out.println(chars);

        int pos1 = 0; //(pointer > 0) ? 0 : 1;
        int pos2 = 1; //(pointer > 1) ? 1 : 2;
        swap(chars, pos1, pos2);


        return;
    }

    public static void main(String[] args) {

//        String string = "algorithm";
        String string = "123456789";
        char[] chars = string.toCharArray();
        char[] chars2 = chars.clone();

        int depth = 2;
        int pointer = 2;

        permutation(chars, depth, pointer);
//        int pointEnd = chars.length - 1;
//
////        System.out.println(string);
//
//        System.out.println(String.valueOf(chars));
//        for (int i = 0; i < pointEnd; i++) {
//            swap(chars, pointer++, pointer);
//            System.out.println(String.valueOf(chars));
//        }
    }

}
