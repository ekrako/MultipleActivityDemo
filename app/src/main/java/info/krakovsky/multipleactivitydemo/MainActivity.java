package info.krakovsky.multipleactivitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myListView = findViewById(R.id.myListView);
        final ArrayList<String> myFriends = new ArrayList() ;
//        asList("Oren","Eleanor","Daniel","Revital","Dalit")
        myFriends.add("Oren");
        myFriends.add("Eleanor");
        myFriends.add("Daniel");
        myFriends.add("Revital");
        myFriends.add("Dalit");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,myFriends);
        myListView.setAdapter(arrayAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("name",myFriends.get(position));
                startActivity(intent);
            }
        });
    }
}
