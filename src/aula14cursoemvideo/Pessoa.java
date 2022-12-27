
package aula14cursoemvideo;

 public abstract class Pessoa {
    // atributos 
     protected String nome;
     protected int idade;
     protected String sexo;
     protected int  experiencia;

     
     // metodo construtor 
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }
     
     
     //metodo 
     protected void ganharExp(int exp){
         
        this.ganharExp(exp) ;
         this.experiencia = this.getExperiencia()+ exp ;
         System.out.println(this.getNome()+" ganhou mais experiencia");
     
     
     }
     
     
     
     
        //metodos especiais 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", experiencia=" + experiencia + '}';
    }
     
    
    
}
