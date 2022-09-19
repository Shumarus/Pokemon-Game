package tipos;
import pokemon.*;
public class Fogo extends Pokemon {
    public Fogo(int vida, int dano, String nome, int xp, int nivel, boolean vivo, String tipo) {
        super(vida, dano, nome, xp, nivel, vivo, tipo);
        setTipo("Fogo");
    }
    public String t1 = "Planta";
    public String t2 = "Gelo";
    public String t3 = "Agua";
    public void ataque(Pokemon p) {
        if(p.tipo.equals(t1)) {
            p.vida = p.vida -(dano + 5);
        } else if (p.tipo.equals(t2)) {
            p.vida = p.vida -(dano + 5);
        } else if(p.tipo.equals(t3)) {
            p.vida = p.vida -(dano - 5);
        } else {
            p.vida = p.vida - dano;
        }
        if(p.vida <= 0) {
            p.setVida(0);
            p.setVivo(false);
        }
    }
}
