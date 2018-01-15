package fauzi.hilmy.howmanytimedoyouneed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etDistance, etSpeed;
    Button btnSubmit;
    TextView lblHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etDistance = (EditText)findViewById(R.id.etDistance);
        etSpeed = (EditText)findViewById(R.id.etSpeed);
        btnSubmit = (Button)findViewById(R.id.btnSubmit);
        lblHasil = (TextView)findViewById(R.id.lblHasil);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nDistance = etDistance.getText().toString();
                String nSpeed = etSpeed.getText().toString();

                if(nDistance.isEmpty()){
                    etDistance.setError("Alas Tidak Boleh Kosong");
                }else if (nSpeed.isEmpty()){
                    etSpeed.setError("Tinggi tidak boleh kosong");
                }else{
                    //mengubah nilai dari string k integer
                    int aDistance = Integer.parseInt(nDistance);
                    int aSpeed = Integer.parseInt(nSpeed);

                    int Waktu = aDistance / aSpeed;

                    lblHasil.setText("So, The Time Needed is " + Waktu + " Minutes");
                }
            }
        });
    }
}
