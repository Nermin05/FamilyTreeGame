public enum Education {
    PUBLIC_SCHOOL(-100),
    PRIVATE_SCHOOL(-1000),
    UNIVERSITY(-500),
    PAID_UNIVERSITY(-5000);
    final int pay;

    Education(int pay) {
        this.pay = pay;
    }

    public long getPay() {
        return pay;
    }
}
