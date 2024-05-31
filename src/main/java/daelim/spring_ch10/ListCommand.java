package daelim.spring_ch10;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ListCommand {
    @DateTimeFormat(pattern = "yyyyMMddHH")
    private LocalDateTime from;
    @DateTimeFormat(pattern = "yyyyMMddHH")
    private LocalDateTime to;

    @DateTimeFormat(pattern = "yyyyMMddHH")
    public LocalDateTime getFrom() {
        return from;
    }

    public void setFrom(LocalDateTime from) {
        this.from = from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public void setTo(LocalDateTime to) {
        this.to = to;
    }
}
