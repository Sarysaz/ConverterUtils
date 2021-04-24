import java.util.Date;

public class JavaDate {

    /**
     * date plus a few hours given timezone
     * @param date date to which you need to add a few hours
     * @param fewHours few hours
     * @return Date
     */
    static Date datePlusFewHours(Date date, Integer fewHours) {
        Date result = new Date(date.getTime() + fewHours * 3600 * 1000L);
        return result;
    }

    /**
     * date minus a few hours given timezone
     * @param date date from which you need to subtract a few hours
     * @param fewHours few hours
     * @return Date
     */
    static Date dateMinusFewHours(Date date, Integer fewHours) {
        Date result = new Date(date.getTime() - fewHours * 3600 * 1000L);
        return result;
    }

    /**
     * date plus a few minutes given timezone
     * @param date date to which you need to add a few minutes
     * @param fewMinutes few minutes
     * @return Date
     */
    static Date datePlusFewMinutes(Date date, Integer fewMinutes) {
        Date result = new Date(date.getTime() + fewMinutes * 60 * 1000L);
        return result;
    }

    /**
     * date minus a few minutes given timezone
     * @param date date from which you need to subtract a few minutes
     * @param fewMinutes few minutes
     * @return Date
     */
    static Date dateMinusFewMinutes(Date date, Integer fewMinutes) {
        Date result = new Date(date.getTime() - fewMinutes * 60 * 1000L);
        return result;
    }

    /**
     * date plus a few second given timezone
     * @param date date to which you need to add a few second
     * @param fewSecond few second
     * @return Date
     */
    static Date datePlusFewSecond(Date date, Integer fewSecond) {
        Date result = new Date(date.getTime() + fewSecond * 1000L);
        return result;
    }

    /**
     * date minus a few second given timezone
     * @param date date from which you need to subtract a few second
     * @param fewSecond few second
     * @return Date
     */
    static Date dateMinusFewSecond(Date date, Integer fewSecond) {
        Date result = new Date(date.getTime() - fewSecond * 1000L);
        return result;
    }

}
