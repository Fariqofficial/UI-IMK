package ac.pradita.it.ui_imk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @OnClick (R.id.doctor)
    void doctor(){
        Intent intent = new Intent(MainActivity.this, doctor.class);
        startActivity(intent);
    }

    @OnClick (R.id.patient)
    void patient(){
        Intent i = new Intent(MainActivity.this, patient.class);
        startActivity(i);
    }

    @OnClick (R.id.room)
    void room(){
        Intent a = new Intent(MainActivity.this, room.class);
        startActivity(a);
    }

    @OnClick (R.id.medicine)
    void medicine(){
        Intent b = new Intent(MainActivity.this, medicine.class);
        startActivity(b);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}

