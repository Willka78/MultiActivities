package de.hbrs.willi_pustowalow.multiactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    Button okBtn = null;
    EditText nameEdt = null;
    EditText ageEdt = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nameEdt = (EditText) findViewById(R.id.nameEdt);
        ageEdt = (EditText) findViewById(R.id.ageEdt);

        okBtn = (Button) findViewById(R.id.okBtn);

        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent();

                in.putExtra("RetName", nameEdt.getText().toString());
                in.putExtra("RetAge",  ageEdt.getText().toString());

                setResult(RESULT_OK, in);
                finish();
            }
        });

//        Intent in = getIntent();
//        Bundle b = in.getExtras();
//
//        if(b != null){
//
//            int s = b.getInt("KeyA");
//
//            setTitle(String.valueOf(s));
//        }


    }
}
