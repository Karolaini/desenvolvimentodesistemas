package Karol;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Karol {
    LinkedList<String> alunos = new LinkedList<String>();
    
    public static void main(String[] args) {
      Karol a = new Karol();
      a.addAlunos();
      a.listar();
      a.procura(JOptionPane.showInputDialog("Que aluno deseja encontrar?"), a.alunos);
    }
    public void addAlunos(){
           int quantidade = Integer.parseInt(JOptionPane.showInputDialog(" Quantos alunos você quer cadastrar?"));
                for (int i = 1;i <= quantidade; i++){
                    alunos.add(JOptionPane.showInputDialog("Digite o nome do " +i+ " aluno!"));
           }      
    }
    public void listar(){
        String mensagem = "Alunos\n\n";
        for(String s:alunos){
            mensagem += s+"\n";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
    public void procura(String aluno, LinkedList<String> alunos){
        String mensagem = aluno+ " não foi encontrado!";
        for(String s:alunos){
            if(s.equals(aluno)){
                mensagem = aluno+ " foi Encontrado";
            }
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}

