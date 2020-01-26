package id.ac.poliban.mi.yusfan.listpahlawan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Pahlawan> pahlawan = new ArrayList<>();
    private ListView lvPahlawan;
    private BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvPahlawan = findViewById(R.id.listview);

        pahlawan.addAll(PahlawanData.getAllPahlawan());

        adapter = new PahlawanAdapter(pahlawan);

        lvPahlawan.setAdapter(adapter);

        lvPahlawan.setOnItemClickListener((parent, view, position, id) -> {
            new AlertDialog.Builder(this)
                    .setTitle("Pahlawan yang anda pilih")
                    .setMessage(pahlawan.get(position).toString())
                    .setPositiveButton("OK", null).show();
        });
    }
}
