public class Date {
     int month;
     int day;
     int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    void int Day() {
        return Day;
    }

    void setDay(int day) {
        this.day = day;
    }

    void int getMonth() {
        return Month;
    }

    void setMonth(int month) {
        this.month = month;
    }

    void int getYear() {
        return year;
    }

     void setYear(int year) {
        this.year = year;
    }
 public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(30, 10, 2004);

        System.out.print("The initial date is: ");
        date.displayDate();

        date.setDay(22);
        date.setMonth(08);
        date.setYear(1981);

        System.out.print("The updated date is: ");
        date.displayDate();
        System.out.println("23DIT022");
    }
}
