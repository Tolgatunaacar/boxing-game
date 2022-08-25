public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name,int damage,int weight,int health,int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter opponent){
        System.out.println("------------------------");
        System.out.println(this.name + " => " + opponent.name + " " +  this.damage + " hasar vurdu.");

        if(opponent.dodge()){
            System.out.println(opponent.name + "Gelen hasarı blokladı....");
            return opponent.health;
        }
        if (opponent.health - this.damage <= 0 ){
            return 0;
        }
        return opponent.health - this.damage;
    }

    boolean dodge(){
        double rate = Math.random()*100;
        return rate <= this.dodge;
    }
}
