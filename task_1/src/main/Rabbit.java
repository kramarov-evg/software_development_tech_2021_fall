package main;

public class Rabbit {
    // Rabbit's coordinates
    private int x, y;
    // Rabbit's energy
    private int energy;
    /** Rabbit's view direction
     * 0 - forward, 1 - backward, 2 - left, 3 - right
     */
    private int direction;

    public Rabbit(int x, int y, int energy, int direction) {
        this.x = x;
        this.y = y;
        this.energy = energy;
        this.direction = direction;
    }
}