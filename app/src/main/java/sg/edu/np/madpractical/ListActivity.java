package sg.edu.np.madpractical;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.List;
import java.util.Random;

public class ListActivity extends AppCompatActivity {
    private static String TAB = "MAD Practical";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ImageView image = findViewById(R.id.image);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog();
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TAB, "Start");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.v(TAB, "Resume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v(TAB, "Pause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v(TAB, "Stop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v(TAB, "Destroy");
    }

    private int randomGen(){
        Random ran = new Random();
        int otp = ran.nextInt(10000);
        return otp;
    }

    private void alertDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Profile");
        builder.setMessage("MADness");
        builder.setPositiveButton("View", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(ListActivity.this, MainActivity.class);
                int uid = randomGen();
                intent.putExtra("UID", uid);
                startActivity(intent);
                Log.v(TAB, "View!");
            }
        });
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}