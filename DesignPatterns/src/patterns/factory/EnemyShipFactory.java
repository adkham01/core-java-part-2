package patterns.factory;

public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String shipType){
        EnemyShip enemyShip =  null;

        if(shipType.equalsIgnoreCase("u")){
            return new UEFOEnemyShip();
        }
        else if(shipType.equalsIgnoreCase("r")){
            return new RocketEnemyShip();
        }
        else if(shipType.equalsIgnoreCase("b")){
            return new BigUFOEnemyShip();
        }
        return null;
    }
}
