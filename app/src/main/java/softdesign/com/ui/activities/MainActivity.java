package softdesign.com.ui.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.snackbar.Snackbar;

import softdesign.com.R;
import softdesign.com.utils.ConstantManager;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    private ImageView mCall;
    private CoordinatorLayout mCoordinatorLayout;


    private static final String TAG = ConstantManager.TAG_PREFIX + "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate");

        mCall = findViewById(R.id.call);
        mCoordinatorLayout = findViewById(R.id.coordinator);

        mCall.setOnClickListener(this);

        if (savedInstanceState==null){
            showSnackbar("активити запускается впервые");
        }else {
                showSnackbar("активити уже создавалась");
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.call:
                showProgress();
               // runWithDelay();
             break;
    }}
    public void showSnackbar(String message){
         Snackbar.make(mCoordinatorLayout,message,Snackbar.LENGTH_LONG).show();
    }
    /*private void runWithDelay(){
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
              hideProgress();
            }
        },5000);
    }*/
}
