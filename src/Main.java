import Task.*;

import java.time.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskService taskService = new TaskService();
        System.out.println("Добавьте заголовок для Вашей задачи (обязательно): ");
        String title = new Scanner(System.in).nextLine();
        System.out.println("Добавьте тип Вашей задачи (Рабочая = 1, Личная = 2): ");
        int type = new Scanner(System.in).nextInt();
        System.out.println("Добавьте описание задачи: ");
        String description = new Scanner(System.in).nextLine();
        taskService.add(new MonthlyTask(type,title,description));

        System.out.println("Добавьте заголовок для Вашей задачи (обязательно): ");
        title = new Scanner(System.in).nextLine();
        System.out.println("Добавьте тип Вашей задачи (Рабочая = 1, Личная = 2): ");
        type = new Scanner(System.in).nextInt();
        System.out.println("Добавьте описание задачи: ");
        description = new Scanner(System.in).nextLine();
        taskService.add(new DailyTask(type,title,description));

        taskService.getAllByDate(LocalDate.of(2023,2,16)).stream().forEachOrdered(System.out::println);

    }
}