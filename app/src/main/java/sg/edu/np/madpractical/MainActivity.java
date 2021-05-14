package sg.edu.np.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static String TAB = "MAD Practical";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User myself = new User();
        myself.setName("Melvin");
        myself.setDescription("Accomplished Mobile Application Developer");
        myself.setFollowed(false);
        Button follow = findViewById(R.id.follow);
        follow.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                boolean status = myself.isFollowed();
                status = !status;
                if (!status){
                    follow.setText("Follow");
                    myself.setFollowed(false);
                }
                else if (status){
                    follow.setText("Unfollow");
                    myself.setFollowed(true);
                }
                else {
                    System.out.println("You messed up somewhere bro");
                }
            }
        });

        TextView nameText = findViewById(R.id.name);
        TextView descText = findViewById(R.id.description);

        nameText.setText(myself.getName());
        descText.setText(myself.getDescription());

    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TAB, "Start!");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.v(TAB, "Resume!");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.v(TAB, "Pause!");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.v(TAB, "Stop!");
    }
}