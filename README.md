# ConverterUtils

Solving problems of converting and working with dates in java

java.util.Date:

    1. Date (yourDate) plus/minus a few hours (fewHours) given timezone:

            Date result = new Date(yourDate.getTime() + fewHours * 3600 * 1000L);
            Date result = new Date(yourDate.getTime() - fewHours * 3600 * 1000L);

    2. Date (yourDate) plus/minus a few minutes (fewMinutes) given timezone:

           Date result = new Date(yourDate.getTime() + fewMinutes * 60 * 1000L);
           Date result = new Date(yourDate.getTime() - fewMinutes * 60 * 1000L);

    3. Date (yourDate) plus/minus a few second (fewSecond) given timezone:

           Date result = new Date(yourDate.getTime() + fewSecond * 1000L);
           Date result = new Date(yourDate.getTime() - fewSecond * 1000L);