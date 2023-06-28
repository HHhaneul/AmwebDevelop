package exam02;

public class Schedule {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int _year) {
        year = _year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int _month) {
        month = _month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int _day) {
        if (month == 2 && _day > 28){
            day = 28;
        }else {
        day = _day;
        }
    }
    void showInfo(){
        System.out.println("year=" + year + " month=" + month + " day=" + day);
    }

}
