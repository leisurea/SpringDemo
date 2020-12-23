package cn.kxgz.conerter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String dateStr) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = format.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
            format = new SimpleDateFormat("yyyy/MM/dd");
            try {
                date = format.parse(dateStr);
            } catch (ParseException parseException) {
                parseException.printStackTrace();
            }
        }
        return date;
    }
}
