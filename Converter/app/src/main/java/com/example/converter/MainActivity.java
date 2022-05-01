package com.example.converter;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.converter.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    public EditText edtText;
   public RadioButton m2c,c2m,k2m,m2k,f2i,i2f;
  public  Button Submitbtn,cancelButton;
  public  RadioGroup Group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtText=findViewById(R.id.editText);
        m2c=findViewById(R.id.meterToCentimeter);
        c2m=findViewById(R.id.CentimeterToMeter);
        k2m=findViewById(R.id.KilometerToMeter);
        m2k=findViewById(R.id.MeterToKilometer);
        f2i=findViewById(R.id.FootToInch);
        i2f=findViewById(R.id.InchToFoot);
        Submitbtn=findViewById(R.id.Button);
        Group=findViewById(R.id.radioGroup);
        cancelButton=findViewById(R.id.CancelButton);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.CancelButton) {
                    edtText.setText("");
                }
            }
        });
        Submitbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                try {
                    int selected = Group.getCheckedRadioButtonId();
                    Submitbtn = (RadioButton) findViewById(selected);
                    String value = Submitbtn.getText().toString();
                    if (selected == R.id.Button) {
                        edtText.setText("");
                    }
                    if (selected == R.id.meterToCentimeter) {
                        String value1 = edtText.getText().toString();
                        Double value2 = Double.parseDouble(value1);
                        value2 = value2 * 100;
                        edtText.setText("" + value2);

                    }
                    if (selected == R.id.CentimeterToMeter) {
                        String value1 = edtText.getText().toString();
                        Double value2 = Double.parseDouble(value1);
                        value2 = value2 * 0.01 ;
                        edtText.setText(""+value2);
                    }
                    if(selected == R.id.KilometerToMeter){
                        String value1 = edtText.getText().toString();
                        Double value2 = Double.parseDouble(value1);
                        value2 = value2 *1000;
                        edtText.setText(""+value2);
                    }if(selected == R.id.MeterToKilometer){
                        String value1 = edtText.getText().toString();
                        Double value2 = Double.parseDouble(value1);
                        value2 = value2 *.001;
                        edtText.setText(""+value2);
                    }if(selected == R.id.InchToFoot){
                        String value1 = edtText.getText().toString();
                        Double value2 = Double.parseDouble(value1);
                        value2 = value2 *0.0833333;
                        edtText.setText(""+value2);
                    }if(selected == R.id.FootToInch){
                        String value1 = edtText.getText().toString();
                        Double value2 = Double.parseDouble(value1);
                        value2 = value2 *12;
                        edtText.setText(""+value2);
                    }


                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Enter a number",Toast.LENGTH_SHORT).show();
                }

            }

        });
    }
}