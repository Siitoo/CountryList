package l.sito.countrylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CountryActivity extends AppCompatActivity {

    private  RecyclerView country_list_view;
    private List<String> countries;
    private CountryListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        countries = new ArrayList<>();
        countries.add("Spain");
        countries.add("France");
        countries.add("Japan");

        for(int i = 0; i < 200; ++i)
        {
            countries.add("Country " + i);
        }

        country_list_view = findViewById(R.id.countryListView);
        country_list_view.setLayoutManager(new LinearLayoutManager((this)));

        adapter = new CountryListAdapter(this,countries);
        country_list_view.setAdapter(adapter);
        country_list_view.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }

}
