package ru.job4j.condition;

 class SwitchWeek {
    public  String nameOfDay(int day) {
        String name = null;
        switch (day){
            case 1:
                name = "monday";
                break;
            case 2:
                name = "Tuesday";
                break;
            case 3:
                name = "Wednesday";
                break;
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            case 6:
                name = "Saturday";
                break;
            case 7:
                name = "Sunday";
                break;
            default:
                name = "Error";
        }
        /* switch */
        return name;
    }

    public static void main(String[] args) {
        SwitchWeek days = new SwitchWeek();
        System.out.println(days.nameOfDay(9));
    }
}