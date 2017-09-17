package br.com.jcf.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtVlAlc;
    private EditText edtVlGas;
    private Button btnVerificar;
    private TextView tvResposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtVlAlc = (EditText) findViewById(R.id.edtVlAlc);
        edtVlGas = (EditText) findViewById(R.id.edtVlGas);
        btnVerificar = (Button) findViewById(R.id.btnVerificar);
        tvResposta = (TextView) findViewById(R.id.tvResposta);
    }

    public void verificar(View view) {

        //Recupera os Valores Digitados
        String txtAlc = edtVlAlc.getText().toString();
        String txtGas = edtVlGas.getText().toString();

        //Converter valores para númerico
        Float vlAlc = Float.parseFloat(txtAlc);
        Float vlGas = Float.parseFloat(txtGas);

        //Alcool / Gasolina
        if (vlAlc == 0 && vlGas == 0 && vlAlc == null && vlGas == null) {

            Toast.makeText(this, "Digite um valor válido", Toast.LENGTH_SHORT).show();

        } else {

            Float resultado = vlAlc / vlGas;

            if (resultado >= 0.7) {
                //Gasolina
                tvResposta.setText("É melhor utilizar Gasolina !!!");
            } else {
                //Álcool
                tvResposta.setText("É melhor utilizar Álcool !!!");
            }
        }


    }
}
