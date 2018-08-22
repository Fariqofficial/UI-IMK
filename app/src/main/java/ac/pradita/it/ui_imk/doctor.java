package ac.pradita.it.ui_imk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class doctor extends AppCompatActivity {

    private Spinner spinner;
    private RadioGroup radioGroup;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //pilih radio button yang ada di radio button group
                int SelectedId = radioGroup.getCheckedRadioButtonId();

                // mencari radio button
                radioButton = (RadioButton) findViewById(SelectedId);
            }
        });

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new doctor.ItemSelectedListener());
    }

    public class ItemSelectedListener implements AdapterView.OnItemSelectedListener
    {
        //untuk memilih item pertama
        String firstItem = String.valueOf(spinner.getSelectedItem());

        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
            if (firstItem.equals(String.valueOf(spinner.getSelectedItem()))) {
                // Ketika Item Pertama Di Pilih
            } else {
                Toast.makeText(parent.getContext(),
                        "Agamanya adalah : " + parent.getItemAtPosition(pos).toString(), Toast.LENGTH_LONG).show();
                // Ketika item dipilih oleh pengguna
            }
        }
        @Override
        public void onNothingSelected(AdapterView<?> arg) {
        }
    }
}
