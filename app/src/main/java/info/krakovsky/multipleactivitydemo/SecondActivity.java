package info.krakovsky.multipleactivitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
//        Intent thisIntent = getIntent();
        String name=getIntent().getStringExtra("name");
        if (name==null)
        {
            name="No name";
        }
        Toast.makeText(this, name+" was Clicked", Toast.LENGTH_SHORT).show();
    }

    public void goToPrev(View view) {
//        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
//        startActivity(intent);
        finish();
    }
}
