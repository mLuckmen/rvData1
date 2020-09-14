package id.ac.telkomuniversity.dph3a4.rvdata1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<DataModel> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1 layout
        // 2 Model
        // dummy data
        DataModel dataModel = new DataModel();
        dataModel.setId("1");
        dataModel.setNamaPengadaan("Pengadaan 1");
        dataModel.setTglAwal("1 Agustus");
        dataModel.setTglAkhir("2 Agustus");

        for (int i = 0; i < 5; i++) {
            data.add(dataModel);
        }

        // 3 Adapter
        // 4 Layout Manager
    }
}
