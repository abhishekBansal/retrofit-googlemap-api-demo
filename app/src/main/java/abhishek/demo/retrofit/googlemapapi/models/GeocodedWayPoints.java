package abhishek.demo.retrofit.googlemapapi.models;

import java.util.List;

import lombok.Data;

/**
 * Created by abhishek
 * on 04/11/17.
 */
@Data
public class GeocodedWayPoints {
    /**
     * geocoder_status : OK
     * place_id : ChIJGzE9DS1l44kRoOhiASS_fHg
     * types : ["locality","political"]
     */

    private String geocoder_status;
    private String place_id;
    private List<String> types;
}
