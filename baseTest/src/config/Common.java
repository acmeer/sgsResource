package config;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Common {

    //获取当前行号
    public void getLineNumber() {
        String fileName = Thread.currentThread().getStackTrace()[1].getFileName();
        int lineNumber = Thread.currentThread().getStackTrace()[1].getLineNumber();
        System.out.println(fileName);
        System.out.println(lineNumber);
    }

    //获取当前日期
    public void getDate() {
        Date now = new Date();
        SimpleDateFormat sdYear = new SimpleDateFormat("yyyy");
        SimpleDateFormat sdMonth = new SimpleDateFormat("MM");
        String yearFormat = sdYear.format(now);
        String monthFormat = sdMonth.format(now);
        int count = 25;
        String countString = String.format("%05d", count + 1);
        System.out.println("XM" + yearFormat + monthFormat + countString);

        String productCode = "Y";
        final Calendar cal = Calendar.getInstance();
        productCode += cal.get(Calendar.YEAR);
        System.out.println(productCode);
    }
}
