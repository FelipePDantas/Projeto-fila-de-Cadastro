package entities;

import util.MsgComum;

public class PessoaComum extends Pessoa  {

    public FiladePessoas fl;

    public PessoaComum(String nome, int idade, String sexo) {
        super(nome, idade, sexo, false);
    }


}

