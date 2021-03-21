import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Location {
    @Getter
    @Setter
    public int xCoord;

    @Getter
    @Setter
    public int yCoord;

    public boolean equals(Object obj) {

        if (obj instanceof Location) {

            Location other = (Location) obj;
            if (xCoord == other.xCoord && yCoord == other.yCoord) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int result = 17; //

        result = 37 * result + xCoord;
        result = 37 * result + yCoord;
        return result;
    }
}
