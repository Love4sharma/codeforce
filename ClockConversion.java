import java.util.*;

public class ClockConversion {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t > 0) {

                  String time = sc.next();

                  String timeDivide[] = time.split(":");

                  int hour = Integer.parseInt(timeDivide[0]);

                  String min = timeDivide[1];
                  if (hour == 0) {
                        System.out.println("12:" + min + " AM");
                        t--;
                        continue;
                  }

                  String ans = "";

                  String l = "";
                  String amOrPm = "";

                  if (hour < 12) {

                        String p = "";
                        if (hour < 10)
                              p = "0";

                        l = p + hour + ":" + min;
                        amOrPm = "AM";
                        ans = l + " " + amOrPm;
                  } else {

                        if (hour == 12) {
                              l = "" + hour + ":" + min;
                              amOrPm = "PM";
                              ans = l + " " + amOrPm;
                        } else {

                              int hour2 = hour - 12;
                              String p = "";
                              if (hour2 < 10)
                                    p = "0";

                              l = p + hour2 + ":" + min;
                              amOrPm = "PM";
                              ans = l + " " + amOrPm;

                        }

                  }

                  System.out.println(ans);

                  t--;
            }

      }
}
