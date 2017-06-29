package comp3350.WinnipegTransitGo.persistence.transitAPI;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Winnipeg Transit API client.
 * Makes the direct calls to Winnipeg Transit's web service.
 *
 * @author Dima Mukhin
 * @version 1.0
 * @since 2017-05-21
 */
public interface TransitAPIClient {

    @GET("stops.json?usage=short")
    Call<TransitAPIResponse> getBusStops(@Query("distance") String distance,
                                         @Query("lat") String lat,
                                         @Query("lon") String lon,
                                         @Query("walking") boolean walking,
                                         @Query("api-key") String apiKey);

    @GET("stops/{number}/schedule.json?usage=short")
    Call<TransitAPIResponse> getBusStopSchedule(@Path("number") int stopNumber,
                                                @Query("api-key") String apiKey);

}
