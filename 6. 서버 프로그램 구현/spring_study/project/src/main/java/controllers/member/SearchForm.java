package controllers.member;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
public class SearchForm {
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDateTime sdate;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDateTime edate;
}
