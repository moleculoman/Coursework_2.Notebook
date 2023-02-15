package Task;

import java.time.*;

public class DisposableTask extends Task{
    public DisposableTask(int type, String title, String description) {
        super(type, title, description);
    }
    @Override
    public boolean appearsIn(LocalDateTime time) {
        return time.toLocalDate().equals(getDateTime().toLocalDate());
    }
}