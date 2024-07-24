package Annotation;


public class SuppressWarning_deprecation {

    @Deprecated
    public void oldMethod() {
        System.out.println("This is an old method.");
    }

    @SuppressWarnings("deprecation")
    public void useOldMethod() {
        oldMethod(); // deprecationで警告を抑制している
        //付けていないと上の＠Deprecatedにより警告が出る
    }

    public static void main(String[] args) {
        SuppressWarning_deprecation myClass = new SuppressWarning_deprecation();
        myClass.useOldMethod();
    }
}
