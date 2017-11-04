package abhishek.demo.retrofit.googlemapapi.api;

import abhishek.demo.retrofit.googlemapapi.models.Directions;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by abhishek
 * on 08/04/16.
 */

public interface ApiService {
    @GET("directions/json")
    Call<Directions>
    getDirectionsBetween(@Query("origin") String origin, @Query("destination") String Destination);
}
