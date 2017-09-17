package br.com.jcf.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnIdade;
    private EditText edtIdade;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIdade = (Button) findViewById(R.id.btnIdade);
        edtIdade = (EditText) findViewById(R.id.edtIdade);
        tvResultado = (TextView) findViewById(R.id.tvResultado);

    }

    public void descobrirIdade(View view) {

        //RECUPERAR O QUE FOI DIGITADO
        String textoDigitado = edtIdade.getText().toString();

        if (textoDigitado.isEmpty()) {
            //String vazia (msg de erro)
            tvResultado.setText("Nenhum número digitado!");
            Toast.makeText(this, "Digite a Idade do Cachorro", Toast.LENGTH_SHORT).show();
        } else {

            int valorDigitado = Integer.parseInt(textoDigitado);
            int resultadoFinal = valorDigitado * 7;

            tvResultado.setText("A idade do chachorro em anos humanos é: " + resultadoFinal + " anos");

        }

    }
}
