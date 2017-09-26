package palembang.gelumbang.zefta.uwalq.latihankedua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvHasil = (TextView) findViewById(R.id.tv_hasil);
        //Inisialiasi Extra
        Bundle extras = getIntent().getExtras();
        //Mengambil string yang sudah disimpan didalam putExtra dan mengembalikannya berdasarkan String Key
        String sHasil = extras.getString("hasil");
        tvHasil.setText(sHasil);
    }
}
