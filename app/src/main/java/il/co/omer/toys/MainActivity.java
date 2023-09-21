package il.co.omer.toys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import il.co.omer.model.Toy;
import il.co.omer.model.Toys;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvToys;
    private Toys toys;
    private ToysAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();
        createToys();
        setRecyclerView();
    }

    private void setRecyclerView() {
        adapter=new ToysAdapter(this,toys,R.layout.single_toy_layout);
        rvToys.setAdapter(adapter);
        rvToys.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initializeViews() {
        rvToys=findViewById(R.id.rvToys);
    }
    private void createToys()
    {
        toys=new Toys();
        toys.add(new Toy("yazdanush",1.90));
        toys.add(new Toy("nati",0.90));
        toys.add(new Toy("nir",190));
        toys.add(new Toy("omer",1900));
        toys.add(new Toy("jonzy",0.000001));

    }

}