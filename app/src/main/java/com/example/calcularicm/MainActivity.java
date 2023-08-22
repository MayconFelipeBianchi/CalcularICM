package com.example.calcularicm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private EditText editTextAltura;

    private EditText editTextPeso;

    private Button buttonHomen;

    private Button buttonMulher;

    private Button buttonLimpar;


    public void setButtonHomen(Button buttonHomen) {
        this.buttonHomen = buttonHomen;
    }

    public void setButtonMulher(Button buttonMulher) {
        this.buttonMulher = buttonMulher;
    }

    public Button getButtonLimpar() {
        return buttonLimpar;

    }

    public EditText getEditTextAltura() {
        return editTextAltura;
    }

    public EditText getEditTextPeso() {
        return editTextPeso;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAltura = findViewById(R.id.idTextoAltura);
        editTextPeso = findViewById(R.id.idTextoPeso);

        buttonHomen = findViewById(R.id.btHomen);
        buttonMulher= findViewById(R.id.btMulher);
        buttonLimpar= findViewById(R.id.limparTudo);
    }
}