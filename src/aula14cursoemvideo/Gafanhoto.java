
package aula14cursoemvideo;

   public class Gafanhoto extends Pessoa {
       //atributos 
       private String login;
       private int totalAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
    // super > chama O CONSTRUTOR  da classe acima "PESSOA"    
        super(nome, idade, sexo);
        
        //vai na variável"login" e salva o "login", são login diferentes 
        this.login = login;
        System.out.println(this.getNome()+",fez login na sua conta ");
        
        // vai na variável "totalAss" e salva lá as mudanças 
        this.totalAssistido = 0;
    }
       
       
        
       //metodo
       public void viuMais1(){
           
           this.totalAssistido++;
           System.out.println(this.getNome()+"  viu mais um");
       
       
       }

       
       
    // metodos especiais    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    
    // sobrescrever 
    @Override
    public String toString() {
        return "Gafanhoto{" +super.toString() + "\nlogin=" + login + ", totalAssistido=" + totalAssistido + '}';
    }
    
    
}
