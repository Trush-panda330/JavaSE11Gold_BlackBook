package Annotation.FunctionalInteaFaceSample;

public class Main {
    public static void main(String[] args) {
        FunctionalInterFace mf = () -> System.out.println("Executing lambda");
        mf.execute(); // "Executing lambda" と出力される
    }
}
