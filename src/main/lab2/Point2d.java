import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Point2d {

    @Setter
    @Getter
    private double xCoord;

    @Setter
    @Getter
    private double yCoord;

}