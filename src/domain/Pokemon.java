package domain;

public class Pokemon {
    private String figure;
    private String name;
    private int life;
    private int attack;
    
    public Pokemon(){
        
    }
    
    public Pokemon(String figure, String name, int life,  int attack){
        this.figure = figure;
        this.name = name;
        this.life = life;
        this.attack = attack;
    }

    public String getFigure() {
        return this.figure;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return this.life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pokemon{figure=").append(figure);
        sb.append(", name=").append(name);
        sb.append(", life=").append(life);
        sb.append(", attack=").append(attack);
        sb.append('}');
        return sb.toString();
    }
    
}
