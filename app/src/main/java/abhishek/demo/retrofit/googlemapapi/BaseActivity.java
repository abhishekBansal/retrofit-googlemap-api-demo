package abhishek.demo.retrofit.googlemapapi;

import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;

import abhishek.demo.retrofit.googlemapapi.api.ApiService;
import abhishek.demo.retrofit.googlemapapi.dialogs.LoadingDialog;
import abhishek.demo.retrofit.googlemapapi.utils.fragmenttransactionhandler.FragmentTransactionHandler;

import javax.inject.Inject;


/**
 * Created by shishank
 * on 08/01/16.
 */
public abstract class BaseActivity extends AppCompatActivity {

    private FrameLayout contentFrame;
    protected FragmentTransactionHandler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_base);

        contentFrame = findViewById(R.id.base_container);
        handler = new FragmentTransactionHandler();
    }

    @Override
    public void setContentView(int layoutResId) {
        getLayoutInflater().inflate(layoutResId, contentFrame, true);
    }

    @Override
    protected void onResume() {
        super.onResume();
        handler.setActivity(this);
        handler.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        handler.pause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.setActivity(null);
    }

    protected FragmentTransactionHandler getHandler() {
        return handler;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void dismissLoadingDialogWithHandler(LoadingDialog dialog) {
        Message msg
                = getHandler().obtainMessage(FragmentTransactionHandler.LOADING_DIALOG_DISMISS_MSG,
                dialog);
        getHandler().sendMessage(msg);
    }

}
