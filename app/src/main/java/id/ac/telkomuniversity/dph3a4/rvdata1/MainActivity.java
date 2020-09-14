package id.ac.telkomuniversity.dph3a4.rvdata1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<DataModel> data = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvData1);
        // 1 layout
        // 2 Model
        // dummy data
        DataModel dataModel = new DataModel();
        dataModel.setId("18959112");
        dataModel.setNamaPengadaan("Belanja Services Wistakon");
        dataModel.setTglAwal("Oct 1, 2018");
        dataModel.setTglAkhir("Dec 1, 2018");

        data.add(dataModel);

        dataModel.setId("18576729");
        dataModel.setNamaPengadaan("Pengadaan peralatan persandian");
        dataModel.setTglAwal("Nov 1, 2018");
        dataModel.setTglAkhir("Nov 1, 2018");

        data.add(dataModel);

        dataModel.setId("18527780");
        dataModel.setNamaPengadaan("Pengadaan Security Control Center");
        dataModel.setTglAwal("Nov 1, 2018");
        dataModel.setTglAkhir("Dec 1, 2018");

        data.add(dataModel);

//        for (int i = 0; i < 5; i++) {
//            data.add(dataModel);
//        }

        // 3 Adapter
        recyclerView.setAdapter(new DataAdapter(MainActivity.this, data));

        // 4 Layout Manager
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}
