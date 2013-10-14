/* 
 * Inteligência Artificial I
 * Aplicativo: Jogo da Velha
 * Classe: TesteArvore
 * 
 * Alunos
 *  Eliezer Emanuel Bernart
 *  Vinicius Mores
 *  Vagner Lucas Gomes
 *  Willian Carpegiani
 * 
 * Descrição
 *  Classe utilizada para realizar testes na árvore de possibilidades do jogo 
 * 
 *  ** Pode ser executada individualmente (SHIFT+F6)
 */

package arvore;

import java.util.LinkedList;

public class TesteArvore {

    public static void main(String[] args) {
        Arvore v = new Arvore();
        int[][] matriz = new int[3][3];



        for (int i = 0; i < 3; i++) {
            System.arraycopy(v.matrizDeEstados[i], 0, matriz[i], 0, 3);
        }

//        v.matrizDeEstados[0][0] = 0 ;
//        v.matrizDeEstados[0][1] = 1 ;
//        v.matrizDeEstados[0][2] = 0 ;
//        v.matrizDeEstados[1][0] = 1 ;
//        v.matrizDeEstados[1][1] = 0 ;


        LinkedList<LinkedList> nivelUm = new LinkedList<>();
        LinkedList<LinkedList> nivelDois = new LinkedList<>();
        LinkedList<LinkedList> nivelTres = new LinkedList<>();
        LinkedList<LinkedList> nivelQuatro = new LinkedList<>();
        LinkedList<LinkedList> nivelCinco = new LinkedList<>();
        LinkedList<LinkedList> nivelSeis = new LinkedList<>();
        LinkedList<LinkedList> nivelSete = new LinkedList<>();
        LinkedList<LinkedList> nivelOito = new LinkedList<>();
        LinkedList<LinkedList> nivelNove = new LinkedList<>();
        LinkedList<LinkedList> nivelDez = new LinkedList<>();

        nivelUm.add(v.gerarArvore(v, 1));
        System.out.println(nivelUm.size());
        v.carregar(nivelUm, nivelDois, v, 0);
        System.out.println(nivelDois.size());
        v.carregar(nivelDois, nivelTres, v, 1);
        System.out.println(nivelTres.size());
        v.carregar(nivelTres, nivelQuatro, v, 0);
        System.out.println(nivelQuatro.size());
        v.carregar(nivelQuatro, nivelCinco, v, 1);
        System.out.println(nivelCinco.size());
        v.carregar(nivelCinco, nivelSeis, v, 0);
        System.out.println(nivelSeis.size());
        v.carregar(nivelSeis, nivelSete, v, 1);
        System.out.println(nivelSete.size());
        v.carregar(nivelSete, nivelOito, v, 0);
        System.out.println(nivelOito.size());
        v.carregar(nivelOito, nivelNove, v, 1);
        System.out.println(nivelNove.size());
        v.carregar(nivelNove, nivelDez, v, 0);


        System.out.println(v.arvore);
    }
}
