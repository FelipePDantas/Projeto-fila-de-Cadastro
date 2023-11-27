package entities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FiladePessoas {
    private ArrayList<Pessoa> pessoas;

    public FiladePessoas() {
        this.pessoas = new ArrayList<>();

    }
    public void addPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    public List<Pessoa> getFilaPrioridade(){
        return pessoas.stream().filter(x -> x.ePrioridade).toList();

    }

    public List<Pessoa> getFilaComum(){
        return pessoas.stream().filter(x ->!x.ePrioridade).toList();
    }
}


