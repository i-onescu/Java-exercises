package exercise1;

public abstract class Monster {

    int hp = 10;

    public abstract void attack(Monster theEnemy);

    public abstract void attack(Monster theEnemy, int attackPower);

    public void inflictDamage(int damage, Monster theEnemy){
        theEnemy.setHp(theEnemy.getHp() - damage);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getMonster(){
        return getClass().getSimpleName();  //took some time to find this NGL
    }
}
