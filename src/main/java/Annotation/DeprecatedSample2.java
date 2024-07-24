package Annotation;

public class DeprecatedSample2 {

    /**
     * @deprecated このメソッドはバージョン1.5で非推奨となり、将来的に削除される予定です。
     * 代わりに {@link #newMethod()} を使用してください。
     */
    @Deprecated(since = "1.5", forRemoval = true)
    public void oldMethod() {
        // 古いメソッドの実装
    }

    public void newMethod() {
        // 新しいメソッドの実装
    }
}
