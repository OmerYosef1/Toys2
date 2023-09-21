package il.co.omer.toys;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import il.co.omer.model.Toy;
import il.co.omer.model.Toys;

public class ToysAdapter extends RecyclerView.Adapter<ToysAdapter.ToysHolder> {

    private Context context;
    private Toys toys;
    private int singel_layout;

    public ToysAdapter(Context context, Toys toys, int singel_layout) {
        this.context = context;
        this.toys = toys;
        this.singel_layout = singel_layout;
    }

    @NonNull
    @Override
    public ToysAdapter.ToysHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ToysHolder(LayoutInflater.from(context).inflate(singel_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ToysAdapter.ToysHolder holder, int position) {
        Toy toy=toys.get(position);
        if(toys!=null)
        {
            holder.textName.setText(toy.getName());
            holder.textPrice.setText(String.valueOf(toy.getPrice()));
        }

    }

    @Override
    public int getItemCount() {
        return (toys == null) ? 0 : toys.size();
    }

    public static class ToysHolder extends RecyclerView.ViewHolder{

        private TextView textName;
        private TextView textPrice;
        public ToysHolder(@NonNull View itemView) {
            super(itemView);
            textName=itemView.findViewById(R.id.textName);
            textPrice=itemView.findViewById(R.id.textPrice);
        }
}

}
