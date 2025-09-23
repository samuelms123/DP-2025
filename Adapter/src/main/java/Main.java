public class Main {
    public static void main(String[] args) {
        NewDate c = new CalendarToNewDateAdapter();
        /*
        c.setDay(21);
        c.setMonth(12);
        c.setYear(2000);*/

        System.out.println(c);
        c.advanceDays(9);
        System.out.println(c);

        c.advanceDays(5);
        System.out.println(c);
    }
}
