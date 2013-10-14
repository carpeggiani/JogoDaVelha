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
 *  Classe que implementa a funcionalidade da árvore de possibilidades.
 * 
 *  
 */

package arvore;

import java.util.LinkedList;

public class Arvore {

    // Matriz que servirá como base para comparação
    int matrizDeEstados[][] = new int[3][3];
    // Arvore que irá armazenar todas as possibilidades de jogada
    LinkedList<LinkedList> arvore = new LinkedList<>();

    public Arvore() {
        // Inicialização da Matriz de Estados para comparação
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizDeEstados[i][j] = 9;
            }
        }
    }

    // Construtor para incializar a matriz com uma que já existe
    public Arvore(int[][] matrizDeEstados) {
        for (int i = 0; i < 3; i++) {
            System.arraycopy(matrizDeEstados[i], 0, this.matrizDeEstados[i], 0, 3);
        }
    }

    // Reescrita do método toString
    @Override
    public String toString() {
        String texto = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                texto += "[" + matrizDeEstados[i][j] + "]";
            }
            texto += "\n";
        }
        texto += "\n";
        return texto;
    }

    // Carrega as alterações na árvore, tendo como base o pai e o filho
    void carregar(LinkedList<LinkedList> pai, LinkedList filho, Arvore v, int comeco) {
        if (comeco == 1) {
            for (LinkedList a : pai) {
                for (Object b : a) {
                    filho.add(v.gerarArvore((Arvore) b, 1));
                }
            }
        } else {
            for (LinkedList a : pai) {
                for (Object b : a) {
                    filho.add(v.gerarArvore((Arvore) b, 0));
                }
            }
        }
    }

    // Método que dado os pais, irá gera todos os filhos
    LinkedList<Arvore> gerarArvore(Arvore origem, int jogadorInicial) {
        // Váriaveis para auxiliar no processo
        LinkedList<Arvore> listaDeNovosFilhos = new LinkedList<>();
        int matrizTemporaria[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Reinicializa com a matriz de origem, vinda do pai
                for (int r = 0; r < 3; r++) {
                    System.arraycopy(origem.matrizDeEstados[r], 0, matrizTemporaria[r], 0, 3);
                }
                // Verifica se a posição na matriz esta vazia e a preenche
                // Depois disso a nova matriz é adicionado a lista de filhos
                if (origem.matrizDeEstados[i][j] == 9) {
                    matrizTemporaria[i][j] = jogadorInicial;
                    listaDeNovosFilhos.add(new Arvore(matrizTemporaria));
                }
            }
        }
        // Adiciona os novos filhos na árvore de busca
        this.arvore.add(listaDeNovosFilhos);
        // Retorna uma lista com os filhos
        return listaDeNovosFilhos;
    }
}
