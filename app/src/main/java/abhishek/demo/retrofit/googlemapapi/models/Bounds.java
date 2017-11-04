package abhishek.demo.retrofit.googlemapapi.models;

import lombok.Data;

/**
 * Created by abhishek on 04/11/17.
 */

@Data
public class Bounds {
    /**
     * northeast : {"lat":42.4614275,"lng":-71.0552091}
     * southwest : {"lat":42.3598335,"lng":-71.3496743}
     */

    private Location northeast;
    private Location southwest;
}

