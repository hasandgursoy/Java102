package Enums;

public enum Day {
    
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int day;

    Day(int day){
        this.day = day;
    }

    public int getDay(){
        return this.day;
    }

    public String getDayName(){
        String days = null;
        switch(this.day){
            case 1:
                days = "PAZARTESİ";
                break;
            case 2:
                days = "SALI";
                break;
        }
        return days;
    }

}
