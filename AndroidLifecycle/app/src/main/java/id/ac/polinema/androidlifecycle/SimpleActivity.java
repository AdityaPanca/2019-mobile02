package id.ac.polinema.androidlifecycle;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SimpleActivity extends AppCompatActivity {

    // Mendeklarasikan atribut dengan nama nameInput dengan tipe EditText
    private EditText nameInput;
    // Mendeklarasikan atribut dengan nama outputText dengan tipe TextView
    private TextView outputText;

    // ....
    // rest of code here...


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        nameInput=findViewById(R.id.input_name);
        outputText= findViewById(R.id.text_output);
    }

    public void handleSubmit(View view) {
            String name = nameInput.getText().toString();
            outputText.setText("Hello " + name);
    }
}
