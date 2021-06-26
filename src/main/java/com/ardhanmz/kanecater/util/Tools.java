package com.ardhanmz.kanecater.util;

import java.sql.Timestamp;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tools {
    public static Timestamp convertToTimeStamp(long time){
        Date date = new Date(time);
        Format format = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        Timestamp timestamp = Timestamp.valueOf(format.format(date));
        return timestamp;
    }
}
