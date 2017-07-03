package com.example.ghilaman.proveacaso;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.apache.http.params.HttpConnectionParams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public class setUrlContent extends AsyncTask{
        @Override
        protected Object doInBackground(Object[] params) {
            try {
                URL url = new URL((String)params[0]);
                HttpURLConnection h = (HttpURLConnection) url.openConnection();
                h.setConnectTimeout(5000);
                h.connect();
                OutputStream o = h.getOutputStream();
                BufferedOutputStream b = new BufferedOutputStream(o);
                b.write(Integer.parseInt("ashoasopf"));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
