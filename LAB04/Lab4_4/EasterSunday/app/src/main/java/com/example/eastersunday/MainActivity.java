package com.example.eastersunday;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.widget.TextView;
import java.time.Year;


public class MainActivity extends AppCompatActivity {

    EditText year;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView linc = findViewById(R.id.license);
        String textLincense = "© "+Year.now().toString()+" Jirakit Jirapongwanich. All right reserved.\n";
        linc.setText(textLincense);

        year = (EditText) findViewById(R.id.inputYear);
        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String y = year.getText().toString();
                if (y.length()!=0) {
                    Intent intent = new Intent(getApplicationContext(), Results.class);
                    intent.putExtra("Year", y);
                    startActivity(intent);
                }else{
                    Toast toast=Toast.makeText(getApplicationContext(),"Please enter year!",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        Button help = (Button) findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("How to use this app ?");
                alert.setMessage("This application can check what days in year is Easter Sunday." +
                        " You only enter year in A.D. and press Check button to see the result.");
                alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Write your code here to execute after dialog
                    }
                });
                alert.show();
            }
        });
    }
}