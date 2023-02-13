package Task;
import java.time.*;

public class DailyTask extends Task {
    public DailyTask(){
        super();
    }

    @Override
    public boolean appearsIn(LocalDateTime time) {
        return !time.isBefore(getDateTime());
    }
}