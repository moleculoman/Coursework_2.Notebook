package Task;
import java.time.*;

public class YearlyTask extends Task {
    public YearlyTask() {
        super();
    }

    @Override
    public boolean appearsIn(LocalDateTime time) {
        if (time.toLocalDate().getDayOfYear() == getDateTime().toLocalDate().getDayOfYear()) {
            time.isBefore(getDateTime());
        }
        return false;
    }
}