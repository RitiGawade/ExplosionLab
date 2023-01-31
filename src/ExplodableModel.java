public class ExplodableModel {

    Explosion ex;

    void displayexplodepoly()
    {
        ex = new Explosion();
        ex.explode();

        ex = new Explosion();
        ex.explode();
    }
}

