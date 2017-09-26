package palembang.gelumbang.zefta.uwalq.latihankedua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnPindahActivity, btnSubmit;
    EditText etText;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = (TextView) findViewById(R.id.tv_result);
        etText = (EditText) findViewById(R.id.et_text);
        btnPindahActivity = (Button) findViewById(R.id.btn_pindahactivity);
        btnSubmit = (Button) findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sEtText = etText.getText().toString();
                tvResult.setText(sEtText);
            }
        });


        btnPindahActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sEtText = etText.getText().toString();
               //Inisialisasi Intent
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                //Simpan hasil Inputan kedalam string dan disimpan menggunakan method putExtra, dengan String Key
                intent.putExtra("hasil", sEtText);
                //Memulai intent (Memulai perpindahan Activity)
                startActivity(intent);
            }
        });


    }
}
