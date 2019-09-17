package com.springboot.demo.Util;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarUtil {

    private static String getUniqueExecutionId() {
        Calendar cal = Calendar.getInstance();
        TimeZone tz = TimeZone.getTimeZone("GMT+05:30");
        cal.setTimeZone(tz);

        StringBuffer strBuff = new StringBuffer();
        strBuff.append(cal.get(Calendar.YEAR));
        strBuff.append(getTwoDigitFormattedValue((cal.get(Calendar.MONTH) + 1)));
        strBuff.append(getTwoDigitFormattedValue(cal.get(Calendar.DAY_OF_MONTH)));
        strBuff.append(getTwoDigitFormattedValue(cal.get(Calendar.HOUR_OF_DAY)));
        strBuff.append(getTwoDigitFormattedValue(cal.get(Calendar.MINUTE)));
        strBuff.append(getTwoDigitFormattedValue(cal.get(Calendar.SECOND)));
        strBuff.append(getThreeDigitFormattedValue(cal.get(Calendar.MILLISECOND)));

        return strBuff.toString();
    }

    private static String getTwoDigitFormattedValue(int val) {
        if (val <= 0) {
            return "00";
        } else if (val < 10) {
            return ("0" + val);
        } else {
            return ("" + val);
        }
    }

    private static String getThreeDigitFormattedValue(int val) {
        if (val <= 0) {
            return "000";
        } else if (val < 10) {
            return ("00" + val);
        } else if (val >= 10 && val < 100) {
            return ("0" + val);
        } else {
            return ("" + val);
        }
    }

    public static void main(String[] args) {
        System.out.println(CalendarUtil.getUniqueExecutionId());
    }
}
