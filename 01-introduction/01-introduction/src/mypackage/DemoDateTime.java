package mypackage;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.zip.DataFormatException;

public class DemoDateTime {
    public static void main(String[] args) {
        LocalDateTime thoiDiemHienTai = LocalDateTime.now();
        System.out.println(thoiDiemHienTai);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
        String format = formatter.format(now);
        System.out.println(format);

        String ngayCuaToi = "23:00:16 16/06/2024";
        LocalDateTime ngay = LocalDateTime.parse(ngayCuaToi, formatter);
        System.out.println(ngay);
    }
}
