/* 
 * Inteligência Artificial I
 * Aplicativo: Jogo da Velha
 * Classe: Controlador
 * 
 * Alunos
 *  Eliezer Emanuel Bernart
 *  Vinicius Mores
 *  Vagner Lucas Gomes
 *  Willian Carpegiani
 * 
 * Descrição
 *  Classe que implementa os métodos de verificação e validação da partida,
 * 
 */
package jogodavelha;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Controlador {

    private int pontuacaoJogador = 0,
            pontuacaoComputador = 0,
            dimensao = 3,
            numeroJogadas = 0;
    private JTextField placarJogador,
            placarComputador;
    // Matriz de Jogo
    Velha velha[][];

    // Construtor recebendo os campos do placar e a matriz incial de jogo
    public Controlador(Velha matriz[][], JTextField placarJogador,
            JTextField placarComputador) {
        this.velha = matriz;
        this.placarComputador = placarComputador;
        this.placarJogador = placarJogador;
    }

    public int verificarPartida() {
        numeroJogadas++;
        //Verifica Linhas Horizontais
        for (int i = 0; i < dimensao; i++) {
            if ((velha[i][0].getValue() == velha[i][1].getValue())
                    && (velha[i][1].getValue() == velha[i][2].getValue())) {
                if (velha[i][0].getValue() != 9) {
                    return velha[i][0].getValue();
                }

            }
        }
        //Verifica Linhas Verticais
        for (int i = 0; i < dimensao; i++) {
            if ((velha[0][i].getValue() == velha[1][i].getValue())
                    && (velha[1][i].getValue() == velha[2][i].getValue())) {
                if (velha[0][i].getValue() != 9) {
                    return velha[0][i].getValue();
                }
            }
        }
        //Verifica Diagonal Principal
        if ((velha[0][0].getValue() == velha[1][1].getValue())
                && (velha[1][1].getValue() == velha[2][2].getValue())) {
            return velha[1][1].getValue();
        }
        //Verifica Diagonal Secundária
        if ((velha[2][0].getValue() == velha[1][1].getValue())
                && (velha[1][1].getValue() == velha[0][2].getValue())) {
            return velha[2][0].getValue();
        }
        // Verifica se o número máximo de jogadas foi atingido
        if (numeroJogadas == 9) {
            return 2;
        } else {
            return 3;
        }
    }

    // Determina e exibe qual foi o resultado da partida
    public int determinarVencedor(int resultado) {
        switch (resultado) {
            case 0:
                JOptionPane.showMessageDialog(null, "O computador venceu a partida!");
                pontuacaoComputador++;
                placarComputador.setText(String.valueOf(pontuacaoComputador));
                numeroJogadas = 0;
                return 0;
            case 1:
                JOptionPane.showMessageDialog(null, "Você venceu a partida!");
                pontuacaoJogador++;
                placarJogador.setText(String.valueOf(pontuacaoJogador));
                numeroJogadas = 0;
                return 1;
            case 2:
                JOptionPane.showMessageDialog(null, "Empate!");
                numeroJogadas = 0;
                return 2;
            default:
                return 3;
        }
    }

    // Implementa a jogada do computador
    public void jogarMaquina() {
        int linha, coluna;
        
        do {
            linha = (int) (Math.random() * (dimensao));
            coluna = (int) (Math.random() * (dimensao));
        } while (velha[linha][coluna].getValue() != 9);
        
        velha[linha][coluna].setValue(0);
        velha[linha][coluna].setText("O");
        velha[linha][coluna].setEnabled(false);
        velha[linha][coluna].setSelected(true);
    }

    
    // Método de reescrita para mostrar a matriz no console da aplicação
    @Override
    public String toString() {
        String texto = "";

        for (int i = 0; i < dimensao; i++) {
            for (int j = 0; j < dimensao; j++) {
                texto += velha[i][j].getValue() + "\t";
            }
            texto += "\n";
        }
        return texto;
    }
}
