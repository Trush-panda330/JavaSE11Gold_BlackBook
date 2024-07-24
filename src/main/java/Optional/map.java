package Optional;

import java.util.Locale;
import java.util.Optional;

public class map {
    public static void main(String[] args) {
        Optional<String> sample = Optional.of("test"); //sampleに test　を代入
        Optional<String> result = null; // result には　nullを
        if (sample.isPresent()) {  // isPresent()で参照を持っているのでtrueを返す
            String str = sample.get(); // get()でstr に sampleの参照 test を代入
            result = Optional.of(str.toUpperCase());
        }
        System.out.println(sample.get());
        System.out.println(result.get());
    }
}
