import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class bz_localDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Formatting : " + now);
        System.out.println(now.plusDays(100));
        System.out.println(now.minusDays(10));
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = now.format(format);
        System.out.println("After formatting : " + formatDateTime);
    }
}