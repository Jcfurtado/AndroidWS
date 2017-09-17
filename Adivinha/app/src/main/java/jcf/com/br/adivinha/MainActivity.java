package jcf.com.br.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnJogar;
    private TextView tvTxResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogar = (Button) findViewById(R.id.btnJogar);
        tvTxResultado = (TextView) findViewById(R.id.tvTxResultado);

    }

    public void Jogar(View view) {
        Random randomico = new Random();
        int nrAleatorio = randomico.nextInt(11);
        tvTxResultado.setText("Número Sorteado: " + nrAleatorio);
    }
}
