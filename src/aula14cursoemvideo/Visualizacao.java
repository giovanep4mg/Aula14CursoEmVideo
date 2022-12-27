
package aula14cursoemvideo;

public class Visualizacao {
    
    // agregação
    private Gafanhoto expectador;
    private Video filme;

    
    // metodo construtor 
    public Visualizacao(Gafanhoto expectador, Video filme) {
        this.expectador = expectador;
        this.filme = filme;
       //pega o totalAss..  soma mais 1 e salva na variável "expectador".
        this.expectador.setTotalAssistido(this.expectador.getTotalAssistido() + 1);
        //pega o total Views, soma mais 1, e salva na variável "filme"
        this.filme.setViews(this.filme.getViews() + 1 );
        
         
    }

    
    // polimorfismo tipo >>> SOBRECARGA
    public void avaliar(){
    
        this.filme.setAvaliacao(5);
        System.out.println("Este video foi avaliado em 5 pontos ");
    }
    
    
    public void avaliar(int nota){
        
        this.filme.setAvaliacao(nota);
        System.out.println("Este video foi avaliado em "+nota);
    
    }
    
    public void avaliar (float porc){
      int tot = 0;
      
      if(porc <= 20 ){
         tot = 3;    
      }else if (porc <= 50){
         tot = 5;
      }else if (porc <= 90){
         tot = 8;
      }else {
         tot = 10;
      }
    this.filme.setAvaliacao(tot);
        System.out.println("Este video foi avaliado em "+tot);
    
    
    }//<< fim metodo 
    
    
    
    
   // metodos especiais 

    public Gafanhoto getExpectador() {
        return expectador;
    }

    public void setExpectador(Gafanhoto expectador) {
        this.expectador = expectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "expectador=" + expectador + ", filme=" + filme + '}';
    }
    
    
    
    
    
}
