package br.com.alura.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

import br.com.alura.agenda.modelo.Aluno;

public class FormularioHelper {

    private final EditText camponome;
    private final EditText campoendereco;
    private final EditText campotelefone;
    private final EditText camposite;
    private final RatingBar camponota;


    public FormularioHelper(FormularioActivity activity){

        camponome = (EditText) activity.findViewById(R.id.formulario_nome);
        campoendereco = (EditText) activity.findViewById(R.id.formulario_endereco);
        campotelefone = (EditText) activity.findViewById(R.id.formulario_telefone);
        camposite = (EditText) activity.findViewById(R.id.formulario_site);
        camponota = (RatingBar) activity.findViewById(R.id.formulario_nota);
    }

    public Aluno pegaAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome(camponome.getText().toString());
        aluno.setEndereco(campoendereco.getText().toString());
        aluno.setTelefone(campotelefone.getText().toString());
        aluno.setNome(camponome.getText().toString());
        aluno.setNota(Double.valueOf(camponota.getProgress()));

        return aluno;
    }
}
