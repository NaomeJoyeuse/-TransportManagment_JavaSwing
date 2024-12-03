
package MODEL;

/**
 *
 * @author Naome
 */
public class Route {
    private String route_id;
    private String route_name;
    private String starting_point;
    private String ending_point;

    public Route() {
    }

    @Override
public String toString() {
    return route_id;
}

    public Route(String route_id, String route_name, String starting_point, String ending_point) {
        this.route_id = route_id;
        this.route_name = route_name;
        this.starting_point = starting_point;
        this.ending_point = ending_point;
    }

    public String getRoute_id() {
        return route_id;
    }

    public void setRoute_id(String route_id) {
        this.route_id = route_id;
    }

    public String getRoute_name() {
        return route_name;
    }

    public void setRoute_name(String route_name) {
        this.route_name = route_name;
    }

    public String getStarting_point() {
        return starting_point;
    }

    public void setStarting_point(String starting_point) {
        this.starting_point = starting_point;
    }

    public String getEnding_point() {
        return ending_point;
    }

    public void setEnding_point(String ending_point) {
        this.ending_point = ending_point;
    }
    
    
    
}
