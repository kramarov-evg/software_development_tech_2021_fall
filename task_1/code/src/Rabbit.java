public class Rabbit {
    // rabbits cordinates
    public int x, y;
    // rabbits energy
    public int energy;
    // parameters of rabbits view direction
    // 0 - forward, 1 - backward, 2 - left, 3 - right
    public int direction;

    public Rabbit (int x, int y, int energy, int direction){
        this.x = x;
        this.y = y;
        this.energy = energy;
        this.direction = direction;
    }
}