package by.milavitsky.homework.task1.runner;
import static by.milavitsky.homework.task1.validation.Validator.*;
import by.milavitsky.homework.task1.utils.DateUtils;
import static by.milavitsky.homework.task1.view.Message.*;

public class RunnerTask2 {
    public static int runTask2(int month, int year) {
        if(!isValuePositive(month) || !isValuePositive(year)){
        showMessage("Wrong year or month");
        }
        int days = DateUtils.getDaysInMonth(month, year);
        return days;
    }
}
