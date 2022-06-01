package com.example.myloginapp;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class workshop extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshop);

        List<Data> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView_Adapter adapter = new RecyclerView_Adapter(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public List<Data> fill_with_data() {

        List<Data> data = new ArrayList<>();
        data.add(new Data(" -M9 Active workshop\n\n -0.5km dari tempat anda \n\n -No tel +60123441223 \n\n -https://www.google.com/maps/dir/3.2330445,101.6766662/m9+active+workshop/@3.2362675,101.6729634,14z/data=!3m1!4b1!4m9!4m8!1m1!", R.drawable.bengkel1));
        data.add(new Data(" -Ady Motorsport\n\n -4.0km dari tempat anda \n\n -No tel +60189666983 \n\n -https://www.google.com/maps/dir/3.2330445,101.6766662/m9+active+workshop/@3.2362675,101.6729634,14z/data=!3m1!4b1!4m9!4m8!1m1!", R.drawable.bengkel2));
        data.add(new Data(" -APEX Line Racing Workshop\n\n -6.5km dari tempat anda \n\n -No tel +60194540470 \n\n -https://www.google.com/maps/dir/3.2330445,101.6766662/m9+active+workshop/@3.2362675,101.6729634,14z/data=!3m1!4b1!4m9!4m8!1m1!", R.drawable.bengkel4));
        data.add(new Data(" -TSM Bodywork & Repairing Workshop\n\n -5.2km dari tempat anda \n\n -No tel +60126462079 \n\n -https://www.google.com/maps/dir/3.2330445,101.6766662/m9+active+workshop/@3.2362675,101.6729634,14z/data=!3m1!4b1!4m9!4m8!1m1!", R.drawable.bengkel5));
        data.add(new Data(" -Rasa Soon Fatt Workshop Sdn. Bhd\n\n -7.5km dari tempat anda \n\n -No tel +6012344122 \n\n - -https://www.google.com/maps/dir/3.2330445,101.6766662/m9+active+workshop/@3.2362675,101.6729634,14z/data=!3m1!4b1!4m9!4m8!1m1!", R.drawable.bengkel6));
        data.add(new Data(" -Kok Keong Car Workshop\n\n -9.7km dari tempat anda \n\n -No tel +60123725524\n\n - -https://www.google.com/maps/dir/3.2330445,101.6766662/m9+active+workshop/@3.2362675,101.6729634,14z/data=!3m1!4b1!4m9!4m8!1m1!", R.drawable.bengkel7));
        data.add(new Data(" -M9 Active workshop\n\n -0.5km dari tempat anda \n\n -No tel +6012344122 \n\n -https://www.google.com/maps/dir/3.2330445,101.6766662/m9+active+workshop/@3.2362675,101.6729634,14z/data=!3m1!4b1!4m9!4m8!1m1!", R.drawable.bengkel8));


        return data;
    }
}