package Task;

import java.time.*;
import java.util.*;

public class TaskService {
    private Map<Integer,Task> taskMap = new HashMap<>();
    private Collection<Task> removedTask = new ArrayList<>();

    public void add(Task task){
        taskMap.put(task.getId(),task);
    }
    public void delete(int id){
        removedTask.add(taskMap.get(id));
        taskMap.remove(id);
    }

    public Collection<Task> getAllByDate(LocalDate time){
        Collection<Task> tasks = new ArrayList<>();
        for (Task value : taskMap.values()) {
            if (value.appearsIn(time.atStartOfDay()))
                tasks.add(value);
        }
        if (tasks.isEmpty())
            throw new TaskNotFoundException("Задачи на эту дату отсутствуют");
        return tasks;
    }
}