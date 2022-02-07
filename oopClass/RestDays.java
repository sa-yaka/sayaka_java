import java.time.LocalDate;
import java.util.Scanner;

public class RestDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();
        in.close();

        LocalDate date = LocalDate.of(year, month, day);

        System.out.println(date.getYear() + ":" + date.getMonthValue() + ":" + date.getDayOfMonth());
        

    }
}

// class UseDate{
// private int day;
// private int month;
// private int year;
//
// public UseDate(int d, int m, int y){
// day = d;
// month = m;
// year = y;
// }
//
//
// }