package main;

public class Wolf {
    // Wolf's coordinates
    public int x, y;
    // Wolf's energy
    public int energy;
    /** Wolf's view direction
     * 0 - forward, 1 - backward, 2 - left, 3 - right
     */
    public int direction;

    public Wolf(int x, int y, int energy, int direction) {
        this.x = x;
        this.y = y;
        this.energy = energy;
        this.direction = direction;
    }
}