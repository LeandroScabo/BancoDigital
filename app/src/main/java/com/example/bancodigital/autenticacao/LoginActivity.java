package com.example.bancodigital.autenticacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.bancodigital.R;

public class LoginActivity extends AppCompatActivity {

    private EditText edtEmail;
    private EditText edtSenha;
    private ProgressBar progressBar;

    @Override
    protected void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        iniciaComponentes();

    }

    public void validaDados(View view){
        String email = edtEmail.getText().toString();
        String senha = edtSenha.getText().toString();

        if(!email.isEmpty()){
            if(!senha.isEmpty()){

                progressBar.setVisibility(View.VISIBLE);

                logar(email, senha);

        }else {
            edtSenha.requestFocus();
            edtSenha.setError("Informe seu Senha");
        }

        }else {
            edtEmail.requestFocus();
            edtEmail.setError("Informe seu Email");
        }

    }

    private void logar(String email, String senha) {

    }

    public void criarConta(View view){
        startActivity(new Intent(this, CadastroActivity.class));
    }

    private void iniciaComponentes(){
        edtEmail = findViewById(R.id.edtEmail);
        edtSenha = findViewById(R.id.edtSenha);
        progressBar = findViewById(R.id.progressBar);
    }

}