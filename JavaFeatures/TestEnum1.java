public enum TestEnum1 {
    HIGH{
        @Override
        public String asLowerCase() {
            return HIGH.toString().toLowerCase();
        }
    },
    MEDIUM{
        @Override
        public String asLowerCase() {
            return MEDIUM.toString().toLowerCase();
        }
    },
    LOW{
        @Override
        public String asLowerCase() {
            return LOW.toString().toLowerCase();
        }
    };
    public abstract String asLowerCase();
    public static String getValye(TestEnum1 enum1){
        return enum1.asLowerCase();
    }
}
