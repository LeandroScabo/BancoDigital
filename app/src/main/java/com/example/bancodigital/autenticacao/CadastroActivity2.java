package com.example.bancodigital.autenticacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.bancodigital.R;
import com.example.bancodigital.model.Usuario;

public class CadastroActivity2 extends AppCompatActivity {

    private EditText edtNome;
    private EditText edtEmail;
    private EditText edtTelefone;
    private EditText edtSenha;
    private EditText edtConfirmaSenha;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro2);

        iniciaComponestes();

    }

    public void validaDados(View View){

        String nome = edtNome.getText().toString();
        String email = edtEmail.getText().toString();
        String telefone = edtTelefone.getText().toString();
        String senha = edtSenha.getText().toString();
        String confirmasenha = edtConfirmaSenha.getText().toString();

        if (!nome.isEmpty()) {

            progressBar.setVisibility(View.VISIBLE);

            Usuario  usuario= new Usuario();
            usuario.setNome(nome);
            usuario.setEmail(email);
            usuario.setTelefone(telefone);
            usuario.setSenha(senha);
            usuario.setSaldo(0);

            cadastrarUsuario(Usuario);

        }else  {
            edtNome.requestFocus();
            edtNome.setError("Informe seu nome");
        }

    }

    private void cadastrarUsuario(Usuario usuario) {
    }

    private void iniciaComponestes(){
        edtNome = findViewById(R.id.edtNome);
        edtEmail = findViewById(R.id.edtEmail);
        edtTelefone = findViewById(R.id.edtTelefone);
        edtSenha = findViewById(R.id.edtSenha);
        edtConfirmaSenha = findViewById(R.id.edtConfitmaSenha);
        progressBar = findViewById(R.id.progressBar);
    }

}