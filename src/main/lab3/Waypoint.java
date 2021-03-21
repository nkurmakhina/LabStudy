import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Waypoint {

    @Getter
    @Setter
    Location loc;

    @Getter
    @Setter
    Waypoint prevWaypoint;

    @Getter
    @Setter
    private float prevCost;

    @Getter
    @Setter
    private float remainingCost;


    public void setCosts(float prevCost, float remainingCost) {
        this.prevCost = prevCost;
        this.remainingCost = remainingCost;
    }

    public float getTotalCost() {
        return prevCost + remainingCost;
    }

    public Waypoint(Location loc, Waypoint prevWaypoint) {
        this.loc = loc;
        this.prevWaypoint = prevWaypoint;
    }
}
