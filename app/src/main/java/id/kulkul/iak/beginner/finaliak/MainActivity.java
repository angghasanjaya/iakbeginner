package id.kulkul.iak.beginner.finaliak;

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

    String[] fruits = {"Apple", "Guava", "Papaya", "Rambutan", "Watermelon"};
    ArrayList<String> data = new ArrayList<>(Arrays.asList(fruits));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.myListView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,fruits);
        myListView.setAdapter(adapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), data.get(position), Toast.LENGTH_SHORT).show();
            }
        });




    }
}
