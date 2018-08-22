package ac.pradita.it.ui_imk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class medicine extends AppCompatActivity {

    private Spinner jenis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);

        jenis = (Spinner) findViewById(R.id.jenis);
        jenis.setOnItemSelectedListener(new medicine.ItemSelectedListener());
    }

    public class ItemSelectedListener implements AdapterView.OnItemSelectedListener
    {
        //untuk memilih item pertama
        String firstItem = String.valueOf(jenis.getSelectedItem());

        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
            if (firstItem.equals(String.valueOf(jenis.getSelectedItem()))) {
                // Ketika Item Pertama Di Pilih
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