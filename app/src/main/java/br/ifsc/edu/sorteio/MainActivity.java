package br.ifsc.edu.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    EditText editTextInicial ;
    EditText editTextFinal   ;
    TextView TextViewResultado;
    Random gerador = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextInicial   = findViewById(R.id.editTextInicial  );
        editTextFinal     = findViewById(R.id.editTextFinal    );
        TextViewResultado = findViewById(R.id.textViewResultado);
        TextViewResultado.setText(" ");


    }

    public void sortear(View view)
    {
        int inicial = Integer.parseInt(editTextInicial.getText().toString());
        int fina = Integer.parseInt(editTextFinal.getText().toString());
        int random = gerador.nextInt((fina - inicial) + 1) + inicial;
        TextViewResultado.setText(Integer.toString(random));

    }
}
