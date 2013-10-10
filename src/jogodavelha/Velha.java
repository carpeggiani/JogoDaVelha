/* 
 * Inteligência Artificial I
 * Aplicativo: Jogo da Velha
 * Classe: Velha
 * 
 * Alunos
 *  Eliezer Emanuel Bernart
 *  Vinicius Mores
 *  Vagner Lucas Gomes
 *  Willian Carpegiani
 * 
 * Descrição
 *  Classe que representa cada um dos campos do tabuleiro. Esta classe extende
 *  o objeto JToggleButton, adicionando a ele um campo valor, que será utilizado
 *  para armazenar as jogadadas.
 * 
 */

package jogodavelha;

import java.awt.Font;
import javax.swing.JToggleButton;

public class Velha extends JToggleButton {

    /* int value
     * 
     * 0 - Computador
     * 1 - Jogador
     * 9 - Vazio 
     */
    private int value = 9;

    public Velha() {
        this.setFont(new Font("Ubuntu", Font.BOLD, 48));
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }    
    
}
