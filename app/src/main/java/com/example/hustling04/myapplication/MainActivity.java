package com.example.hustling04.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.inputName)
    EditText editName;

    @Bind(R.id.btnSaludar)
    Button btnSaludar;

    @Bind(R.id.labelSaludo)
    TextView txtSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSaludar)
    public void mostrarSaludo() {
        if (editName.getText().toString().trim().length() > 0) {
            EditText prueba = null;
            String saludo = editName.getText().toString().substring(0,1).toUpperCase() + editName.getText().toString().substring(1);
            //txtSaludo.setText(getString(R.string.saludo, saludo));
            txtSaludo.setText(prueba.getText());

        } else {
            Toast.makeText(MainActivity.this, "Por favor, introduce tu nombre", Toast.LENGTH_SHORT).show();
        }
    }

}
