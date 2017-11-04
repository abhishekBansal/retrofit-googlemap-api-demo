package abhishek.demo.retrofit.googlemapapi.models;

import java.util.List;

import lombok.Data;

/**
 * @author abhishek
 */

@Data
public class Legs {
    /**
     * distance : {"text":"1.8 mi","value":2850}
     * duration : {"text":"11 mins","value":635}
     * end_address : Charlestown, Boston, MA, USA
     * end_location : {"lat":42.3781732,"lng":-71.06024889999999}
     * start_address : Boston, MA, USA
     * start_location : {"lat":42.3598335,"lng":-71.0598776}
     * steps : [{"distance":{"text":"0.1 mi","value":172},"duration":{"text":"1 min","value":40},"end_location":{"lat":42.360989,"lng":-71.0611984},"html_instructions":"Head <b>north<\/b> on <b>Cambridge St<\/b> toward <b>Sudbury St<\/b>","polyline":{"points":"}kpaGf{upLA?QHSJQJURMJQNMLKLIHIJIJGHCDMZIR[v@"},"start_location":{"lat":42.3598335,"lng":-71.0598776},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 mi","value":273},"duration":{"text":"1 min","value":86},"end_location":{"lat":42.3624195,"lng":-71.0585323},"html_instructions":"Turn <b>right<\/b> onto <b>Sudbury St<\/b>","maneuver":"turn-right","polyline":{"points":"espaGncvpLUSECAAEEEICCCEIMCIEI[{@Ys@M[_@_Ac@mAk@yAUk@GQEM"},"start_location":{"lat":42.360989,"lng":-71.0611984},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 mi","value":160},"duration":{"text":"1 min","value":73},"end_location":{"lat":42.36317589999999,"lng":-71.0569388},"html_instructions":"Continue onto <b>Haymarket Square<\/b>","polyline":{"points":"c|paGxrupLI_@YiA_@cBCGCMEIEKCGACCGIOIIGGEASK"},"start_location":{"lat":42.3624195,"lng":-71.0585323},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 mi","value":169},"duration":{"text":"1 min","value":43},"end_location":{"lat":42.3643627,"lng":-71.0582002},"html_instructions":"Slight <b>left<\/b> onto <b>Cross St<\/b>","maneuver":"turn-slight-left","polyline":{"points":"{`qaGzhupLC??@A?ABOXEFEHEFMNMNKLML[ZMLOLMJMHGDKJIHEDQT"},"start_location":{"lat":42.36317589999999,"lng":-71.0569388},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 mi","value":801},"duration":{"text":"3 mins","value":180},"end_location":{"lat":42.3709364,"lng":-71.06148069999999},"html_instructions":"Turn <b>right<\/b> onto <b>N Washington St<\/b>","maneuver":"turn-right","polyline":{"points":"ghqaGvpupLQLg@@GDKDGFcA@M?_@A]@qBHuBHg@A[@IFEBa@VQNSLULgAr@OHOHk@Z]TiAr@qBnAoBpAWPc@XYNWTSPUTGHSVCDGJEF"},"start_location":{"lat":42.3643627,"lng":-71.0582002},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 mi","value":805},"duration":{"text":"2 mins","value":136},"end_location":{"lat":42.3762299,"lng":-71.0552091},"html_instructions":"Turn <b>right<\/b> onto <b>Chelsea St<\/b>","maneuver":"turn-right","polyline":{"points":"kqraGfevpLC?C@EBCBEDEBEBEBC?C?E?MAs@iAKO[g@?Aa@q@Yc@MQeAgBIMy@qAw@iAe@o@MOQMe@m@OSMMy@_Aw@cAg@q@a@e@U]MSKO_@s@Q]Sc@KOCE[c@QUY[_BcB"},"start_location":{"lat":42.3709364,"lng":-71.06148069999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 mi","value":181},"duration":{"text":"1 min","value":33},"end_location":{"lat":42.37707049999999,"lng":-71.0570588},"html_instructions":"Turn <b>left<\/b> onto <b>Vine St<\/b>","maneuver":"turn-left","polyline":{"points":"mrsaG`~tpLKXk@hAYl@Yl@Wj@GNEZKn@Ih@"},"start_location":{"lat":42.3762299,"lng":-71.0552091},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 mi","value":289},"duration":{"text":"1 min","value":44},"end_location":{"lat":42.3781732,"lng":-71.06024889999999},"html_instructions":"Continue onto <b>Bunker Hill St<\/b><div style=\"font-size:0.9em\">Destination will be on the right<\/div>","polyline":{"points":"uwsaGriupLI\\Mf@I\\gAjEI^YjAYjAYfAK`@Mj@"},"start_location":{"lat":42.37707049999999,"lng":-71.0570588},"travel_mode":"DRIVING"}]
     * traffic_speed_entry : []
     * via_waypoint : []
     */

    private Distance distance;
    private Duration duration;
    private String end_address;
    private Location end_location;
    private String start_address;
    private Location start_location;
    private List<Steps> steps;
    private List<?> traffic_speed_entry;
    private List<?> via_waypoint;
}
