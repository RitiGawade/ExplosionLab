public abstract class AbstractExplosion {
    AbstractExplosion ax;

    void displayabstractpoly()
    {
        ax = new GunShotA();
        ax.explode();

        ax = new GrenadeA();
        ax.explode();
    }

    public abstract void explode();
}
