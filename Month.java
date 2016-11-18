public enum Month {
    JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30),
    MAY(31), JUNE(30), JULY(31), AUGUST(31),
    SEPTEMBER(30), OKTOBER(31), NOVEMBER(30), DECEMBER(31);

    private int day;
    Month(int day) {
        this.day = day;
    }

    public int getDayCount(){
        return this.day;
    }

    public Month getNextMonth() {
        Month[] temp = Month.values();
        return temp[(ordinal()+1) * 13 % 12];
    }

    public static void main(String[] args) {
        Month next = Month.JANUARY;
        for (int i = 0; i< 15; i++) {
            System.out.println(next);
            next = next.getNextMonth();
        }
    }
}
