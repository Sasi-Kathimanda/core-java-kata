package multithreading;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@ToString
public class Result {
    String name;
    LocalDateTime duration;
}
