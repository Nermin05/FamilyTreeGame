public enum Education {
    DO_NOT_GO_SCHOOL(0),
    PUBLIC_SCHOOL(-100),
    PRIVATE_SCHOOL(-1000),
    DO_NOT_GO_UNIVERSITY(0),
    UNIVERSITY(-500),
    PAID_UNIVERSITY(-5000);
    private final int pay;
    Education(int pay) {
        this.pay = pay;
    }
    public long getPay() {
        return pay;
    }
}
