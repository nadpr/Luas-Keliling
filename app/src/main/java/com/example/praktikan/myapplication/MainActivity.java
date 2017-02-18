package com.example.praktikan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText panjang, tinggi;
    TextView hasil;
    String Panjang, Tinggi;
    //double hasilnya, panjangnya, tingginya = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        panjang = (EditText)findViewById(R.id.panjang);
        tinggi = (EditText) findViewById(R.id.tinggi);
        hasil = (TextView) findViewById(R.id.hasil);
    }

    public void reset(View v){
        panjang.setText("");
        tinggi.setText("");
        hasil.setText("");
    }
    public void luaspersegi(View v){
        double p = Double.parseDouble(panjang.getText().toString());
        double t = Double.parseDouble(tinggi.getText().toString());
        double h = p * t;
        hasil.setText(h+"");
    }
    public void kelpersegi(View v){
        double p = Double.parseDouble(panjang.getText().toString());
        double t = Double.parseDouble(tinggi.getText().toString());
        double h = (p + t)*2;
        hasil.setText(h+"");
    }
    public void luassegitiga(View v){
        double p = Double.parseDouble(panjang.getText().toString());
        double t = Double.parseDouble(tinggi.getText().toString());
        double h = p * t *1/2;
        hasil.setText(h+"");
    }
    public void kelsegitiga(View v){
        double p = Double.parseDouble(panjang.getText().toString());
        double t = Double.parseDouble(tinggi.getText().toString());
        double h = (2 * t)+p;
        hasil.setText(h+"");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
