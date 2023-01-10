import java.util.Scanner;


public class quizPrincipal {
    public static void menu(){
        
       System.out.println("!!!Quiz!!!\n");
       System.out.println("1. Inicio do jogo");
       System.out.println("0. Sair");
   }
    
    
   public static void Cfilmes(){
       System.out.println(" Inicio do Jogo!!!\n Boa sorte!!!\n");
   
       quizPerguntas.filmes();
       System.out.println(quizPerguntas.filmes.get(2));
      }
   public static void Aanimes(){
      
       quizPerguntas.animes();
       System.out.println(quizPerguntas.animes.get(0));
      }
   public static void Dlivros(){
      
       quizPerguntas.livros();
       System.out.println(quizPerguntas.livros.get(3));
      }
   public static void Danimes(){
      
       quizPerguntas.animes();
       System.out.println(quizPerguntas.animes.get(3));
      }
   public static void Afilmes(){
      
       quizPerguntas.filmes();
       System.out.println(quizPerguntas.filmes.get(0));
      }
    public static void Elivros(){
      
       quizPerguntas.livros();
       System.out.println(quizPerguntas.livros.get(4));
      }
   
   public static void Bfilmes(){
       
       quizPerguntas.filmes();
       System.out.println(quizPerguntas.filmes.get(1));
      }
   public static void Banimes(){
      
       quizPerguntas.animes();
       System.out.println(quizPerguntas.animes.get(1));
      }
   public static void Alivros(){
      
       quizPerguntas.livros();
       System.out.println(quizPerguntas.livros.get(0));
      }
   public static void Canimes(){
      
       quizPerguntas.animes();
       System.out.println(quizPerguntas.animes.get(2));
      }
   public static void Efilmes(){
      
       quizPerguntas.filmes();
       System.out.println(quizPerguntas.filmes.get(4));
      }
   public static void Dfilmes(){
       
       quizPerguntas.filmes();
       System.out.println(quizPerguntas.filmes.get(3));
      }
   public static void Eanimes(){
      
       quizPerguntas.animes();
       System.out.println(quizPerguntas.animes.get(4));
      }
   public static void Blivros(){
      
       quizPerguntas.livros();
       System.out.println(quizPerguntas.livros.get(1));
      }
   public static void Clivros(){
      
       quizPerguntas.livros();
       System.out.println(quizPerguntas.livros.get(2));
      }

   
   public static void main(String[] args){
   int opcao;  
   Scanner qp = new Scanner(System.in);
   quizJogador jogador1 = new quizJogador();
   
   System.out.println("Digite seu nome:");
   String nome = qp.nextLine();
   jogador1.setNome(nome);
   
   System.out.println("O nome do Jogador é: "+jogador1.getNome());
   
   
   System.out.println("Digite sua idade:");
   int idade = qp.nextInt();
   jogador1.setIdade(idade);
    if(idade >= 12){
        System.out.println("Acesso liberado!!!\n"); 
      
    do{
        
        menu();
        opcao = qp.nextInt();
       
        switch(opcao){
            
            case 1:
              
            System.out.println("Escolha a quantidade de perguntas:\n");
            
            System.out.println("1. 15 perguntas");
            System.out.println("2. 10 perguntas");
            System.out.println("3. 5 perguntas");
            
            int quantidade;
            
            quantidade = qp.nextInt();
            
            if(quantidade == 1){
                
                System.out.println("Categoria: Filmes\n");
                
            int resposta;
           
                Cfilmes();
                resposta = qp.nextInt();  
                
                if (resposta == 2){
                    System.out.println("Você acertou!!!\n");
                } else if(resposta == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }
            
                System.out.println("Categoria: Animes\n");
                
            int respostaA;
           
                Aanimes();
                respostaA = qp.nextInt();  
                
                if (respostaA == 1){
                    System.out.println("Você acertou!!!\n");
                } else if(respostaA == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaA == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaA == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }
             
                System.out.println("Categoria: Livros\n");
                
            int respostab;
           
                Dlivros();
                respostab = qp.nextInt();  
                
                if (respostab == 2){
                    System.out.println("Você acertou!!!\n");
                } else if(respostab == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostab == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostab == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
                System.out.println("Categoria: Animes\n");
                
            int respostac;
           
                Danimes();
                respostac = qp.nextInt();  
                
                if (respostac == 2){
                    System.out.println("Você acertou!!!\n");
                } else if(respostac == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostac == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostac == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }
            
                System.out.println("Categoria: Filmes\n");
                
            int respostad;
           
                Afilmes();
                respostad = qp.nextInt();  
                
                if (respostad == 3){
                    System.out.println("Você acertou!!!\n");
                } else if(respostad == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostad == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostad == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }
            
                System.out.println("Categoria: Livros\n");
                
            int respostae;
           
                Elivros();
                respostae = qp.nextInt();  
                
                if (respostae == 1){
                    System.out.println("Você acertou!!!\n");
                } else if(respostae == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostae == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostae == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }
             
                System.out.println("Categoria: Filmes\n");
                
            int respostaf;
           
                Bfilmes();
                respostaf = qp.nextInt();  
                
                if (respostaf == 3){
                    System.out.println("Você acertou!!!\n");
                } else if(respostaf == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaf == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaf == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
                System.out.println("Categoria: Animes\n");
                
            int respostag;
           
                Banimes();
                respostag = qp.nextInt();  
                
                if (respostag == 4){
                    System.out.println("Você acertou!!!\n");
                } else if(respostag == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostag == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostag == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
                System.out.println("Categoria: Livros\n");
                
            int respostah;
           
                Alivros();
                respostah = qp.nextInt();  
                
                if (respostah == 3){
                    System.out.println("Você acertou!!!\n");
                } else if(respostah == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostah == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostah == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
                System.out.println("Categoria: Animes\n");
                
            int respostai;
           
                Canimes();
                respostai = qp.nextInt();  
                
                if (respostai == 4){
                    System.out.println("Você acertou!!!\n");
                } else if(respostai == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostai == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostai == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
                System.out.println("Categoria: Filmes\n");
                
            int respostaj;
           
                Efilmes();
                respostaj = qp.nextInt();  
                
                if (respostaj == 2){
                    System.out.println("Você acertou!!!\n");
                } else if(respostaj == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaj == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaj == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
                System.out.println("Categoria: Filmes\n");
                
            int respostak;
           
                Dfilmes();
                respostak = qp.nextInt();  
                
                if (respostak == 3){
                    System.out.println("Você acertou!!!\n");
                } else if(respostak == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostak == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostak == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }
             
                System.out.println("Categoria: Animes\n");
                
            int respostal;
           
                Eanimes();
                respostal = qp.nextInt();  
                
                if (respostal == 1){
                    System.out.println("Você acertou!!!\n");
                } else if(respostal == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostal == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostal == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
                System.out.println("Categoria: Livros\n");
                
            int respostam;
           
                Blivros();
                respostam = qp.nextInt();  
                
                if (respostam == 2){
                    System.out.println("Você acertou!!!\n");
                } else if(respostam == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostam == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostam == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
                System.out.println("Categoria: Livros\n");
                
            int respostan;
           
                Clivros();
                respostan = qp.nextInt();  
                
                if (respostan == 4){
                    System.out.println("Você acertou!!!\n");
                } else if(respostan == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostan == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostan == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }
            } else if(quantidade == 2){
                
                System.out.println(" Inicio do Jogo!!!\n Boa sorte!!!\n");
                
                System.out.println("Categoria: Livros\n");
                
                int resposta1;
           
                Elivros();
                resposta1 = qp.nextInt();  
                
                if (resposta1 == 1){
                    System.out.println("Você acertou!!!\n");
                } else if(resposta1 == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta1 == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta1 == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }
               
                System.out.println("Categoria: Filmes\n");
                
            int resposta2;
           
                Bfilmes();
                resposta2 = qp.nextInt();  
                
                if (resposta2 == 3){
                    System.out.println("Você acertou!!!\n");
                } else if(resposta2 == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta2 == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta2 == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
                System.out.println("Categoria: Animes\n");
                
            int resposta3;
           
                Banimes();
                resposta3 = qp.nextInt();  
                
                if (resposta3 == 4){
                    System.out.println("Você acertou!!!\n");
                } else if(resposta3 == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta3 == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta3 == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
                System.out.println("Categoria: Livros\n");
                
            int resposta4;
           
                Alivros();
                resposta4 = qp.nextInt();  
                
                if (resposta4 == 3){
                    System.out.println("Você acertou!!!\n");
                } else if(resposta4 == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta4 == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta4 == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
                System.out.println("Categoria: Animes\n");
                
            int resposta5;
           
                Canimes();
                resposta5 = qp.nextInt();  
                
                if (resposta5 == 4){
                    System.out.println("Você acertou!!!\n");
                } else if(resposta5 == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta5 == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta5 == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
                System.out.println("Categoria: Filmes\n");
                
            int resposta6;
           
                Efilmes();
                resposta6 = qp.nextInt();  
                
                if (resposta6 == 2){
                    System.out.println("Você acertou!!!\n");
                } else if(resposta6 == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta6 == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta6 == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
                System.out.println("Categoria: Filmes\n");
                
            int resposta7;
           
                Dfilmes();
                resposta7 = qp.nextInt();  
                
                if (resposta7 == 3){
                    System.out.println("Você acertou!!!\n");
                } else if(resposta7 == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta7 == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta7 == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }
             
                System.out.println("Categoria: Animes\n");
                
            int resposta8;
           
                Eanimes();
                resposta8 = qp.nextInt();  
                
                if (resposta8 == 1){
                    System.out.println("Você acertou!!!\n");
                } else if(resposta8 == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta8 == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta8 == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
                System.out.println("Categoria: Livros\n");
                
            int resposta9;
           
                Blivros();
                resposta9 = qp.nextInt();  
                
                if (resposta9 == 2){
                    System.out.println("Você acertou!!!\n");
                } else if(resposta9 == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta9 == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta9 == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
                System.out.println("Categoria: Livros\n");
                
            int resposta10;
           
                Clivros();
                resposta10 = qp.nextInt();  
                
                if (resposta10 == 4){
                    System.out.println("Você acertou!!!\n");
                } else if(resposta10 == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta10 == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta10 == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }
            } else if(quantidade == 3){
                System.out.println(" Inicio do Jogo!!!\n Boa sorte!!!\n");
                
                System.out.println("Categoria: Filmes\n");
                
                int respostax;
           
                Efilmes();
                respostax = qp.nextInt();  
                
                if (respostax == 2){
                    System.out.println("Você acertou!!!\n");
                } else if(respostax == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostax == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostax == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
                System.out.println("Categoria: Filmes\n");
                
            int respostaxx;
           
                Dfilmes();
                respostaxx = qp.nextInt();  
                
                if (respostaxx == 3){
                    System.out.println("Você acertou!!!\n");
                } else if(respostaxx == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaxx == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaxx == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }
             
                System.out.println("Categoria: Animes\n");
                
            int respostaxxx;
           
                Eanimes();
                respostaxxx = qp.nextInt();  
                
                if (respostaxxx == 1){
                    System.out.println("Você acertou!!!\n");
                } else if(respostaxxx == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaxxx == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaxxx == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
                System.out.println("Categoria: Livros\n");
                
            int respostaxxxx;
           
                Blivros();
                respostaxxxx = qp.nextInt();  
                
                if (respostaxxxx == 2){
                    System.out.println("Você acertou!!!\n");
                } else if(respostaxxxx == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaxxxx == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaxxxx == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
                System.out.println("Categoria: Livros\n");
                
            int respostaxxxxx;
           
                Clivros();
                respostaxxxxx = qp.nextInt();  
                
                if (respostaxxxxx == 4){
                    System.out.println("Você acertou!!!\n");
                } else if(respostaxxxxx == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaxxxxx == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaxxxxx == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }
            
            }
            
           
        }
    } while(opcao !=0);
            System.out.println("Fim de Jogo!!!\n Até o próximo QUIZ!!!");
    }else {
        System.out.println("Acesso negado!!!");
    }
    }
}
