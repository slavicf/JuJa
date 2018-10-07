/**
 * Created by Intellij IDEA.
 * User: Jaroslav Frunt
 * Date: 04.10.2018
 */
public class Permutation {

    // Swapping 2 elements in array
    static void swap(char[] chars, int pos1) {
        int pos2 = pos1 - 1;
        char temp = chars[pos1];
        chars[pos1] = chars[pos2];
        chars[pos2] = temp;
        return;
    }

    static void permutation(char[] chars, int pointer) {
        if (pointer > 0) {
            permutation(chars, pointer - 1);
            swap(chars, pointer);
            System.out.println(chars);
        }


        return;
    }

    public static void main(String[] args) {

//        String string = "algorithm";
        String string = "012";
        char[] chars = string.toCharArray();
        char[] chars2 = chars.clone();

        int depth = 2;
        int pointer = 2;

        System.out.println(chars);
        permutation(chars, pointer);
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
