package sg.edu.np.madpractical;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptor extends RecyclerView.Adapter<Viewholder> {
    ArrayList<User> data;

    public Adaptor(ArrayList<User> input) {
        this.data = input;
    }

    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list, parent, false);
        return new Viewholder(item);
    }

    public void onBindViewHolder(Viewholder holder, int position) {
        User list_item = data.get(position);
        holder.txt1.setText(list_item.getName());
        holder.txt2.setText(list_item.getDescription());
        holder.image.setImageResource(list_item.getId());
    }

    public int getItemCount() {
        return data.size();
    }
}
