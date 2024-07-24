package Exception.try_with_resources;

import java.sql.SQLException;


class MyReso implements AutoCloseable {
    private String msg;
    public MyReso(String msg) {
        this.msg = msg;
    }
    public void method() throws SQLException {
        throw new SQLException("method() でのエラー");
    }
    public void close() throws SQLException {
        System.out.println("close() : " + msg);
        throw new SQLException("close() でのエラー : " + msg);
    }
}
public class Throwable {
    public static void main(String[] args) {
        try (MyReso obj1 = new MyReso("obj1");
             MyReso obj2 = new MyReso("obj2")) {
            try {
                obj1.method();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }  catch(SQLException e) {
            System.out.println("e.getMessage() : " + e.getMessage());
            System.out.println("e.getSuppressed()で取り出した情報");
            java.lang.Throwable[] errAry = e.getSuppressed();
            System.out.println("  抑制例外数 : " + errAry.length);
            for (java.lang.Throwable ex : errAry) {
                System.out.println(" " + ex.getMessage());
            }
        } finally {
            System.out.println("finally ブロック");
        }


    }

}
