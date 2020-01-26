package id.ac.poliban.mi.yusfan.listpahlawan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class PahlawanAdapter extends BaseAdapter {
    private List<Pahlawan> data = new ArrayList<>();

    public PahlawanAdapter(List<Pahlawan> data){
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img_pahlawan;
        TextView tvPahlawanName;
        TextView tvPahlawanDesc;

        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_pahlawan, parent, false);

        img_pahlawan = convertView.findViewById(R.id.img_pahlawan);
        tvPahlawanName = convertView.findViewById(R.id.tv_pahlawan_name);
        tvPahlawanDesc = convertView.findViewById(R.id.tv_pahlawan_description);

        Glide.with(parent.getContext())
                .load(data.get(position).getPahlawan())
                .apply(new RequestOptions().override(60,60))
                .into(img_pahlawan);
        tvPahlawanName.setText(data.get(position).getPahlawanName());
        tvPahlawanDesc.setText(data.get(position).getPahlawanDesc());

        return convertView;
    }
}