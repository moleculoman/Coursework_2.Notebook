import Task.*;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        TaskService taskService = new TaskService();
        taskService.add(new MonthlyTask());
        taskService.add(new DailyTask());
        taskService.add(new WeeklyTask());
        taskService.getAllByDate(LocalDate.of(2023,5,25)).stream().forEachOrdered(System.out::println);

    }
}