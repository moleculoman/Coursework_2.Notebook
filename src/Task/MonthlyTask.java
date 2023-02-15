package Task;
import java.time.*;

public class MonthlyTask extends Task {
    public MonthlyTask(int type, String title, String description) {
        super(type, title, description);
    }


    @Override
    public boolean appearsIn(LocalDateTime time) {
        return time.toLocalDate().getDayOfMonth() == getDateTime().toLocalDate().getDayOfMonth()
                && !time.isBefore(getDateTime());
    }
}