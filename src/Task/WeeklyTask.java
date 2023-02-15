package Task;
import java.time.*;

public class WeeklyTask extends Task {
    public WeeklyTask(int type, String title, String description) {
        super(type, title, description);
    }

    @Override
    public boolean appearsIn(LocalDateTime time) {
        if (time.toLocalDate().getDayOfWeek() == getDateTime().toLocalDate().getDayOfWeek()
                && !time.isBefore(getDateTime()))
            return true;
        else return false;
        }
}