package sg.edu.np.madpractical;

import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

public class Viewholder extends RecyclerView.ViewHolder {
    TextView txt1;
    TextView txt2;
    ImageView image;

    public Viewholder(View itemView) {
        super(itemView);
        txt1 = itemView.findViewById(R.id.name);
        txt2 = itemView.findViewById(R.id.description);
        image = itemView.findViewById(R.id.logo);
    }
}
