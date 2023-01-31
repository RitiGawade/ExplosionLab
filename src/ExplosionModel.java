public class ExplosionModel
{
    Explodable exp;

    void displaypoly()
    {
        exp = (Explodable) new GunShotI();
        exp.explode();

        exp = (Explodable) new GrenadeA();
        exp.explode();

    }
}
