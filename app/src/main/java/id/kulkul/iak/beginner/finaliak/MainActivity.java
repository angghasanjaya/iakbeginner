package id.kulkul.iak.beginner.finaliak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

//    String[] fruits = {"Apple", "Guava", "Papaya", "Rambutan", "Watermelon"};
    ArrayList<FruitModel> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.myListView);

//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,fruits);
//        myListView.setAdapter(adapter);

        data = new ArrayList<>();

        data.add(new FruitModel(R.drawable.apple, "Apple", "Malus"));
        data.add(new FruitModel(R.drawable.banana, "Banana", "Musa"));
        data.add(new FruitModel(R.drawable.durians, "Durians", "Durio"));
        data.add(new FruitModel(R.drawable.grape, "Grape", "Vitis vinifera"));
        data.add(new FruitModel(R.drawable.guava, "Guava", "Psidium guajava"));
        data.add(new FruitModel(R.drawable.orange, "Orange", "Citrus reticulata"));
        data.add(new FruitModel(R.drawable.papaya, "Papaya", "Carica papaya"));
        data.add(new FruitModel(R.drawable.rambutan, "Rambutan", "Nephelium lappaceum !"));
        data.add(new FruitModel(R.drawable.strawberry, "Strawaberry", "Fragaria × ananassa"));
        data.add(new FruitModel(R.drawable.watermelon, "Watermelon", "Citrullus lanatus"));

        FruitAdapter adapter = new FruitAdapter(this, R.layout.custom_layout, data);
        myListView.setAdapter(adapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(getApplicationContext(),data.get(position).title,Toast.LENGTH_SHORT).show();
                Intent targetActivity = new Intent(getApplicationContext(),DetailActivity.class);


                targetActivity.putExtra("icon", data.get(position).icon);
                targetActivity.putExtra("title", data.get(position).title);
                targetActivity.putExtra("sub", data.get(position).sub);

                startActivity(targetActivity);



            }
        });




    }
}
