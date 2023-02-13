package Task;
import java.time.*;

public class MonthlyTask extends Task {
    public MonthlyTask(){
        super();
    }

    @Override
    public boolean appearsIn(LocalDateTime time) {
        return time.toLocalDate().getDayOfMonth() == getDateTime().toLocalDate().getDayOfMonth()
                && !time.isBefore(getDateTime());
    }
}