public class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private int matricula;
    private int semestre;

     public void setNome(String nome){
        this.nome = nome;
     }
     public void setIdade(int idade){
        this.idade = idade;
     }
     public String getNome(){
        return this.nome;
     }
     public int getIdade(){
        return this.idade;
     }
     public void setCurso(String curso){
        this.curso = curso;
     }
     public String getCurso(){
        return this.curso;
     }
     public void setMatricula(int matricula){
        this.matricula = matricula;
     }
     public int getMatricula(){
        return this.matricula;
     } 
     public void setSemestre(int semestre){
        this.semestre = semestre;
     }
     public int getSemestre(){
        return this.semestre;
     }

    
}
