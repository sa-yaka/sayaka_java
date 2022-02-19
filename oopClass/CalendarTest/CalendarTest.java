package CalendarTest;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // 构造对象，初始化为当前日期
        int month = date.getMonthValue(); // 获得当前的月份
        int today = date.getDayOfMonth(); // 获得当前的日期

        date = date.minusDays(today - 1); // 将 date 设置为一周的第一天
        DayOfWeek weekday = date.getDayOfWeek(); // 得到这一天为星期几
        int value = weekday.getValue(); // 返回一个整数，表示当天为星期几 1 = Monday ... 6 = Saturday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) { // 2022-01-29 时 value 为 6.
            System.out.print("    ");
        }

        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*"); // 是当天就打印 *
            else
                System.out.print(" ");
            date = date.plusDays(1); // 到下一天
            if (date.getDayOfWeek().getValue() == 1) // 如果是一周的第一天就换行
                System.out.println();
        }

        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
    }
}
