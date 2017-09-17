package br.com.jcf.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView tvNovaFrase;
    private Button btnNovaFrase;

    private String[] frases = new String[]{
            "A cerveja é a prova viva de que Deus nos ama e nos quer ver felizes.",
            "Vender uma cerveja ruim é um crime contra o amor cristão.",
            "Dê-me uma mulher que ame a cerveja e eu conquistarei o mundo.",
            "A cerveja americana é como sexo numa canoa: demasiado próxima da água.",
            "A cerveja é a única realidade virtual que eu preciso.",
            "Dê um peixe a um homem e ele o comerá. "
                    + "\n" + "Ensina-o a pescar e ele ficará todo o dia sentado no " +
                    "barco a beber cerveja.",
            "Senhor, dai-me café para mudar as coisas que eu posso mudar, " +
                    "e cerveja para aceitar as coisas que eu não posso."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNovaFrase = (TextView) findViewById(R.id.tvNovaFrase);
        btnNovaFrase = (Button) findViewById(R.id.btnNovaFrase);


    }

    public void novaFrase(View view) {

        Random random = new Random();
        int nrAleatorio = random.nextInt(frases.length);

        tvNovaFrase.setText(frases[nrAleatorio]);
    }

}
