package abhishek.demo.retrofit.googlemapapi.models;

import lombok.Data;

/**
 * Created by abhishek
 * on 04/11/17.
 */

@Data
public class Steps {
    /**
     * distance : {"text":"0.1 mi","value":172}
     * duration : {"text":"1 min","value":40}
     * end_location : {"lat":42.360989,"lng":-71.0611984}
     * html_instructions : Head <b>north</b> on <b>Cambridge St</b> toward <b>Sudbury St</b>
     * polyline : {"points":"}kpaGf{upLA?QHSJQJURMJQNMLKLIHIJIJGHCDMZIR[v@"}
     * start_location : {"lat":42.3598335,"lng":-71.0598776}
     * travel_mode : DRIVING
     * maneuver : turn-right
     */

    private Distance distance;
    private Duration duration;
    private Location end_location;
    private String html_instructions;
    private PolyLine polyline;
    private Location start_location;
    private String travel_mode;
    private String maneuver;
}
