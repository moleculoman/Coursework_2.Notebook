package Task;
import java.time.*;

public class WeeklyTask extends Task {
    public WeeklyTask(){
        super();
    }

    @Override
    public boolean appearsIn(LocalDateTime time) {
        if (time.toLocalDate().getDayOfWeek() == getDateTime().toLocalDate().getDayOfWeek()) {
            time.isBefore(getDateTime());
        }
        return false;
    }
}