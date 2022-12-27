/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula14cursoemvideo;

public class Aula14CursoEmVideo {

    public static void main(String[] args) {
        // cria um vetor de filmes
        Video v[] = new Video[3];
        
        // criando videos
        v[0] = new Video("Aula 1 do curso ");
        v[1] = new Video("Filme Batman ");
        v[2] = new Video("Aula 3 do curso ");
        
        // criando objetos para criar usuarios 
        Gafanhoto g[] = new Gafanhoto[2];
        
        // criando usuarios, gafanhotos
        g[0] = new Gafanhoto("Giovani", 39, "Masculino", "nego");
       // g[1] = new Gafanhoto("Guilherme", 12, "M", "gui");
        
        // criando objeto de visualizaçao 
        Visualizacao vis[] = new Visualizacao[5];
        
        
 // passa os parametros de quem está visualizando ,e qual video está vendo 
        vis[0] = new Visualizacao(g[0], v[1]);
        g[0].getLogin();// mostrando quem fez o login , o usuario
        v[0].play();// dando play no video escolhido 
        v[1].like(); // dando o like no video
        vis[0].avaliar();// avaliando o video ,ja salvo os pontos 
        vis[0].avaliar(10);// avaliando com o parametros passados "inteiro"
        vis[0].avaliar(90.0f);// avaliando com parametros passados "float"
        v[1].pause(); // pausando o video 
        
        
        g[1] = new Gafanhoto("Guilherme", 12, "M", "gui");
        vis[1] = new Visualizacao(g[1], v[2]);
        g[1].getLogin();// mostrando quem fez o login , o usuario
        v[1].play();// dando play no video escolhido 
        v[1].like(); // dando o like no video
        vis[1].avaliar();// avaliando o video ,ja salvo os pontos 
        vis[1].avaliar(30);// avaliando com o parametros passados "inteiro"
        vis[1].avaliar(25.0f);// avaliando com parametros passados "float"
        
        
        
        
        
        System.out.println(vis[0].toString());// mostra os status da visualização 
        
        System.out.println(vis[1].toString());// mostra os status da visualização 
        
        
        
        
        
        
        
        
        
    }
    
}//<<fim classe 
