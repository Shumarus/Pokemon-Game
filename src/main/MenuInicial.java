package main;
import javax.swing.*;
import java.awt.event.*;
public class MenuInicial extends JFrame implements ActionListener {
    JLabel fundo, titulo, pokebola1, pokebola2;
    JButton b1, b2, b3;
    public MenuInicial() {
        super("Pokemon");
        setLayout(null);
        setSize(700, 520);
        setResizable(false);
        fundo = new JLabel(new ImageIcon("img\\FundoPokemon.png"));
        fundo.setBounds(0, 0, 700, 520);
        titulo = new JLabel(new ImageIcon("img\\PokemonLogo.png"));
        titulo.setBounds(13, 0, 650, 252);
        pokebola1 = new JLabel(new ImageIcon("img\\Pokebola-Pokémon-PNG-1024x1022Invertida.png"));
        pokebola1.setBounds(450, 250, 200, 200);
        pokebola2 = new JLabel(new ImageIcon("img\\Pokebola-Pokémon-PNG-1024x1022(1).png"));
        pokebola2.setBounds(50, 250, 200, 200);
        b1 = new JButton("Iniciar Jogo");
        b2 = new JButton("Sobre o Jogo");
        b3 = new JButton("Sair");
        b1.setBounds(295, 280, 110, 50);
        b2.setBounds(295, 341, 110, 50);
        b3.setBounds(295, 399, 110, 50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(titulo);
        getContentPane().add(pokebola1);
        getContentPane().add(pokebola2);
        getContentPane().add(fundo);
        setVisible(true);
        this.setLocationRelativeTo(null);
    }
    public void actionPerformed(ActionEvent ae) {
        Object obj = ae.getSource();
        if(obj == b3) {
            System.exit(0);
        } else if(obj == b2) {
            JOptionPane.showMessageDialog(this, "->Pokemon eh uma serie de jogos desenvolvidos pela Game Freak e publicados pela Nintendo.\nLancado pela primeira vez em 1996 no Japao para o console Game Boy, sendo a principal serie de jogos\nde RPG da empresa, continuou em cada geracao de portateis da Nintendo, ate os dias de hoje.\n\n->No jogo original, seu objetivo eh basicamente derrotar todos os mestres de ginasio presentes no jogo e\ncompletar a Pokedex com todos os 151 pokemon da primeira geracao.\n\n->Nessa nossa versao do jogo seu objetivo eh capturar e evoluir os melhores pokemon que voce encontrar e\nderrotar o mestre do ginasio presente no jogo, com a maior pontuacao possivel.\n\n\n->Dev: TiagoAlmeida");
        } else if(obj == b1) {
            //fechar o menu inicial e abrir o mapa do jogo;
        }
    }
    public static void main(String[] args) {
        MenuInicial m = new MenuInicial();
    }
}