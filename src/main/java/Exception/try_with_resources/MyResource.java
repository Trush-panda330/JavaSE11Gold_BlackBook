package Exception.try_with_resources;

class MyResource implements AutoCloseable {
    private String msg;
    public MyResource(String msg) {
        this.msg = msg;
    }
    @Override
    public void close() throws Exception {
        System.out.println("close() : " + msg);
    }
}
