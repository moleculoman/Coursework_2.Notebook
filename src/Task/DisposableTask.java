package Task;

import java.time.*;

public class DisposableTask extends Task{
    @Override
    public boolean appearsIn(LocalDateTime time) {
        return time.equals(this.getDateTime().toLocalDate());
    }
}