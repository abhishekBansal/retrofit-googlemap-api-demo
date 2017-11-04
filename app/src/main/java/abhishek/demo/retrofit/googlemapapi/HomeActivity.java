package abhishek.demo.retrofit.googlemapapi;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import abhishek.demo.retrofit.googlemapapi.api.ApiModule;
import abhishek.demo.retrofit.googlemapapi.models.Directions;
import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HomeActivity extends BaseDrawerActivity {

    @BindView(R.id.tv_distance)
    TextView tvDistance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        ApiModule.getInstance().getApiService().getDirectionsBetween("New Delhi", "Jaipur")
                .enqueue(new Callback<Directions>() {
                    @Override
                    public void onResponse(Call<Directions> call, Response<Directions> response) {
                        Directions directions = response.body();
                        if(directions != null && !directions.getRoutes().isEmpty()) {
                            Toast.makeText(HomeActivity.this,
                                    directions.getRoutes().get(0).getLegs().get(0).getDistance().getText(),
                                    Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<Directions> call, Throwable t) {

                    }
                });
    }
}
