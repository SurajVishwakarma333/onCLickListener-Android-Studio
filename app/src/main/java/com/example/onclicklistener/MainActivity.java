package com.example.onclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //using TextView from .xml file
        TextView textView = findViewById(R.id.txtView); //here textview is layout name which was created here only and txtView is layout id name which was defined in .xml file.

        //using Button from .xml file
        Button button = findViewById(R.id.btn); //here button is layout name which was created here only and btn is layout id name which was defined in .xml file.

        //using editText from .xml file
        EditText editText = findViewById(R.id.editTextTextPersonName);//here editText is layout name which was created here only and editTextTextPersonName is layout id name which was defined in .xml file.

    }

    //using onClickListener to perform something if we clock on button
    //firstly we have to add android:onClick="btn" in .xml file.
    public void btn(View view) {
        TextView textView= findViewById(R.id.txtView);
        textView.setText("Hello suraj");    //by default it shows hello world but if you click on button it will show hello suraj.

        //here we are going to get the users name and we are going to say hello to the user.when we click on button
        EditText editText = findViewById(R.id.editTextTextPersonName);
        textView.setText("hello "+editText.getText().toString());    //getting name and displaying it
    }

}

/* notes:-
setText to set new text to display.
getText to get text from existing one.
 */


