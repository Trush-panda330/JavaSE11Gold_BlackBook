package mosiQ29;

public class Sample {
    private static void test() throws TestException {
        try{
            throw new TestException("A");
        } catch (SampleException | RuntimeException e) {
            throw new RuntimeException("B");
        }
    }

    public static void main(String[] args) {
        try {
            test();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

