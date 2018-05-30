package br.com.alura.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

public class FormularioHelper {

    public FormularioHelper(FormularioActivity activity){

        EditText camponome = (EditText) activity.findViewById(R.id.formulario_nome);
        EditText campoendereco = (EditText) activity.findViewById(R.id.formulario_endereco);
        EditText campotelefone = (EditText) activity.findViewById(R.id.formulario_telefone);
        EditText camposite = (EditText) activity.findViewById(R.id.formulario_site);
        RatingBar camponota = (RatingBar) activity.findViewById(R.id.formulario_nota);
    }
}
