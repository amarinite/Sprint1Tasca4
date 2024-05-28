package n1exercici1;

import java.util.ArrayList;

public class Months {
    public static void main(String[] args) {
        ArrayList<String> months = addMonths();
    }

    public static ArrayList<String> addMonths() {
        ArrayList<String> months = new ArrayList<>();

        months.add("january");
        months.add("february");
        months.add("march");
        months.add("april");
        months.add("may");
        months.add("june");
        months.add("july");
        months.add("august");
        months.add("september");
        months.add("october");
        months.add("november");
        months.add("december");

        return months;
    }
}
