package Annotation.FunctionalInteaFaceSample;

@FunctionalInterface
public interface FunctionalInterFace {
    void execute(); // 抽象メソッドが1つだけが絶対条件

    // デフォルトメソッドやstaticメソッドを含むことはできる
    default void defaultMethod() {
        System.out.println("This is a default method");
    }

    static void staticMethod() {
        System.out.println("This is a static method");
    }
}
