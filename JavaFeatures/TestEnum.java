public enum TestEnum {
    HIGH(4),
    low(-1),
    MID(5);

    private int x;
    TestEnum(int x) {
        this.x=x;

    }

    public static void main(String[] args) {
        TestEnum testEnum = TestEnum.MID;

        System.out.println("TestEnum : "+testEnum);
    }

}
