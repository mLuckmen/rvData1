package id.ac.telkomuniversity.dph3a4.rvdata1;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyViewHolder>{
    private Context context;
    private List<DataModel> data = new ArrayList<>();

    // buat constructor
    public DataAdapter(Context context, List<DataModel> data) {
        this.context = context;
        this.data = data;
    }

    // Menyambungkan layout item
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_data, parent, false);
        return new MyViewHolder(itemView);
    }

    // set data
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    // jumlah data
    @Override
    public int getItemCount() {
        return 0;
    }

    // mengenalkan komponen dalam item
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvId, tvNama, tvAwal, tvAkhir;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvId = itemView.findViewById(R.id.tvId);
            tvNama = itemView.findViewById(R.id.tvNamaPengadaan);
            tvAwal = itemView.findViewById(R.id.tglAwalPekerjaan);
            tvAkhir = itemView.findViewById(R.id.tglAkhirPekerjaan);

        }
    }

    // extend kelas ini dengan RecyclerView.Adapter
}
