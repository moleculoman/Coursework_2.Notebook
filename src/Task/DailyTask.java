package Task;
import java.time.*;

public class DailyTask extends Task {
    public DailyTask(int type, String title, String description) {
        super(type, title, description);
    }

    @Override
    public boolean appearsIn(LocalDateTime time) {
        return !time.isBefore(getDateTime());
    }
}