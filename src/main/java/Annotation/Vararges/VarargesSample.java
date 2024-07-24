package Annotation.Vararges;

public class VarargesSample {

    // 可変長引数を受け取るメソッド
    public static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        // 引数が1つの場合
        printNumbers(1);

        // 引数が複数の場合
        printNumbers(1, 2, 3, 4, 5);

        // 引数が0個の場合
        printNumbers();
    }
}
