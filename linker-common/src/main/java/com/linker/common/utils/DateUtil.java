package com.linker.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式化工具
 * Created by dentalulcer on 05/07/2018.
 */
public class DateUtil {

    // 默认格式
    private static final String DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * 日期转字符串
     * @param date
     * @return
     */
    public static String dateToString(Date date) {
        if(date == null) {
            date = new Date();
        }
        SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_FORMAT);
        return sdf.format(date);
    }


}
