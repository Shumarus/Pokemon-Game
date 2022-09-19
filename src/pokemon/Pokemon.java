package pokemon;
public abstract class Pokemon {
    public int vida = 50;
    public int dano = 15;
    public String nome;
    public int xp = 0;
    public int nivel = 1;
    public boolean vivo = true;
    public String tipo;
    public Pokemon(int vida, int dano, String nome, int xp, int nivel, boolean vivo, String tipo) {
        this.vida = vida;
        this.dano = dano;
        this.nome = nome;
        this.xp = xp;
        this.nivel = nivel;
        this.vivo = vivo;
        this.tipo = tipo;
    }
    public void upar() {
        if(xp >= 200) {
            nivel++;
            dano = dano + 10;
            vida = vida + 30;
            xp = 0;
        }
    }
    public void morte() {
        if(vida <= 0) {
            vida = 0;
            vivo = false;
        }
    }
    public abstract void ataque(Pokemon p);
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getDano() {
        return dano;
    }
    public void setDano(int dano) {
        this.dano = dano;
    }
    public int getXp() {
        return xp;
    }
    public void setXp(int xp) {
        this.xp = xp;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public boolean isVivo() {
        return vivo;
    }
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}
