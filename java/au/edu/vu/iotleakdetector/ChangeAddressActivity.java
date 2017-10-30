package au.edu.vu.iotleakdetector;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class ChangeAddressActivity extends AppCompatActivity {

    private static final int request_code = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_address);

    }


    public void onClick(View v) {
        // EditText address = (EditText) findViewById(R.id.address);

        Intent i = new Intent(this, WebViewActivity.class);

        final EditText address = (EditText) findViewById(R.id.address);

        String myString = address.getText().toString();
        i.putExtra("qString", myString);
        startActivityForResult(i, request_code);
    }

}