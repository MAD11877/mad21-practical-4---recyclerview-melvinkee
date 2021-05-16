package sg.edu.np.madpractical;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptor extends RecyclerView.Adapter<Viewholder> {
    ArrayList<User> data;

    public Adaptor(ArrayList<User> input) {
        data = input;
    }
}
