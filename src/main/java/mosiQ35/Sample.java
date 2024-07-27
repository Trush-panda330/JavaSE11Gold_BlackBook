package mosiQ35;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Sample {
    public static void main(String[] args) {
        List<Reader> list = new ArrayList<>();
        File file = new File("sample.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            for (String fileName = br.readLine();
                 fileName != null; fileName = br.readLine()) {
                BufferedReader br2 = new BufferedReader(new FileReader(fileName));

                list.add(br2);
                process(br2);
            }
        } catch (IOException e) {
        }finally {
            for (Reader r : list) {
                try {
                    r.close();
                } catch(IOException ex) {
                    // do something
                }
            }
        }

    }
    private static void process(BufferedReader br2) {
        // do something
    }
}

/* 　　以下　b2 生成時にtry-with-resource を使用し
*          catchした際にスタックトレースを出力するように変更した場合のコード
*
*
*

 */
//
//package mosiQ35;
//
//import java.io.*;
//import java.util.List;
//import java.util.ArrayList;
//
//public class futureSubmit1.Sample {
//    public static void main(String[] args) {
//        File file = new File("sample.txt");
//
//        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//            for (String fileName = br.readLine(); fileName != null; fileName = br.readLine()) {
//                try (BufferedReader br2 = new BufferedReader(new FileReader(fileName))) {
//                    process(br2);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static void process(BufferedReader br2) {
//        // ファイルの処理
//    }
//}
