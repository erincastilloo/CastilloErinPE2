package erin.castillo.com.castilloerinpe2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    Button btnSearch, btnSave;
    EditText fName, fAge, fGender;

    //FirebaseDatabase mFirebaseDatabase;
    //DatabaseReference mDatabaseReference;

    Record sRecordDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("PRACTICAL EXAM NO. 2");

        fName = findViewById(R.id.fName);
        fAge = findViewById(R.id.fAge);
        fGender = findViewById(R.id.fGender);

        btnSearch = findViewById(R.id.btnSearch);
        btnSave = findViewById(R.id.btnSave);
    }
}
