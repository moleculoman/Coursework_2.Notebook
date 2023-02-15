package Task;
import java.time.*;

public class YearlyTask extends Task {
    public YearlyTask(int type, String title, String description) {
        super(type, title, description);
    }

    @Override
    public boolean appearsIn(LocalDateTime time) {
        return time.toLocalDate().getDayOfYear() == getDateTime().toLocalDate().getDayOfYear()
                && !time.isBefore(getDateTime());
    }
}