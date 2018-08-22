package ac.pradita.it.ui_imk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class room extends AppCompatActivity {

    private Spinner status, kelas, lantai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        status = (Spinner) findViewById(R.id.status);
        status.setOnItemSelectedListener(new room.ItemSelectedListener());
    }

    public class ItemSelectedListener implements AdapterView.OnItemSelectedListener
    {
        String firstItem = String.valueOf(status.getSelectedItem());

        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
            if (firstItem.equals(String.valueOf(status.getSelectedItem()))) {
            } else {
                Toast.makeText(parent.getContext(),
                        "" + parent.getItemAtPosition(pos).toString(), Toast.LENGTH_LONG).show();
                // Ketika item dipilih oleh pengguna
            }
        }
        @Override
        public void onNothingSelected(AdapterView<?> arg) {
        }
    }
}