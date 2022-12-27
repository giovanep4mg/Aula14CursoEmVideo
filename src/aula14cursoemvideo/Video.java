
package aula14cursoemvideo;

public class Video implements AcoesVideo{
//<<< aqui embaixo é ENCAPSULAMENTO >>>>>
    //atributos 
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    
    //metodo construtor
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    
// metodos especiais 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int)((this.avaliacao + avaliacao)/this.views);
        
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
//=========================================================================
    //<<< aqui embaixo é POLIMORFISMO tipo SOBREPOSIÇAO >>>
    //metodos implementados 
    @Override
    public void play() {
        // vai na variável "reproduzindo" e muda para "true"> verdadeiro 
        this.reproduzindo = true;
        System.out.println("Está assistindo o video : " +this.getTitulo());
    }

    @Override
    public void pause() {
        // vai na variável "reproduzindo"  e coloca "false" > falso
        this.reproduzindo = false;
        System.out.println("Está pausado o video " +this.getTitulo());
    }

    @Override
    public void like() {
        // vai na variável "curtidas" e adiciona mais 1.
        this.curtidas++;
        System.out.println(this.getTitulo()+" recebeu uma curtida ");
    }

    
    
   // para ver as coisas do video

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
    
}
