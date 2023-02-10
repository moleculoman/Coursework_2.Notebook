package Task;
import java.time.LocalDateTime;
import java.util.Scanner;

public abstract class Task {
    private static int idGenerator;
    private String title;
    private Type type;
    private final int id;
    private final LocalDateTime dateTime;
    private String description;

    abstract public boolean appearsIn(LocalDateTime time);

    public Task(String title, Type type){
        this.id = idGenerator;
        idGenerator++;
        System.out.println("Добавьте заголовок для Вашей задачи (обязательно): ");
        this.title = new Scanner(System.in).nextLine();
        if (title.isEmpty())
            throw new IllegalArgumentException("Отсутствует заголовок задачи");

        System.out.println("Добавьте тип Вашей задачи (Рабочая = 1, Личная = 2): ");
        if (new Scanner(System.in).nextInt() == 1)
            this.type = Type.WORK;
            else this.type = Type.PERSONAL;

        System.out.println("Добавьте описание задачи (необязательно): ");
        description = new Scanner(System.in).nextLine();
        dateTime = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public int getId(){
        return id;
    }
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Задача{" +
                "Описание='" + title + '\'' +
                ", Тип =" + type +
                ", id=" + id +
                ", дата=" + dateTime +
                ", описание ='" + description + '\'' +
                '}';
    }
}
