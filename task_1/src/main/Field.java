package main;


public class Field {
    Object[][] cell;
    String[][] title; // the name of cell (if its with wolf/ rabbit/ plant or empty)
    public int h, w;
    /**
     * numOfWolves - number of Wolves,
     * numOfRabbits - number of Rabbits,
     * numOfPlants - number of Plants
     */
    public int numOfWolves, numOfRabbits, numOfPlants;

    public Field(int h, int w, int numOfWolves, int numOfRabbits, int numOfPlants) {
        this.h = h;
        this.w = w;
        this.numOfWolves = numOfWolves;
        this.numOfRabbits = numOfRabbits;
        this.numOfPlants = numOfPlants;

        this.cell = new Object[h][w];
        this.title = new String[h][w];
        //WOLF LOOP
        int i = 0;
        while (i < numOfWolves) {
            // WOLF
            // coordinates of wolf
            int j = (int) (Math.random() * h);
            int k = (int) (Math.random() * w);

            int energy = 100;
            // 0 - forward, 1 - backward, 2 - left, 3 - right
            int direction = 0;
            if (cell[j][k] == null) {
                this.cell[j][k] = new Wolf(j, k, energy, direction);
                this.title[j][k] = "W";
                i++;
            }
        }
        // RABBIT LOOP
        i = 0;
        while (i < numOfRabbits) {
            // RABBIT
            // coordinates of rabbit
            int j = (int) (Math.random() * h);
            int k = (int) (Math.random() * w);

            int energy = 100;
            // 0 - forward, 1 - backward, 2 - left, 3 - right
            int direction = 0;
            if (cell[j][k] == null) {
                this.cell[j][k] = new Rabbit(j, k, energy, direction);
                this.title[j][k] = "R";
                i++;
            }
        }
        // PLANT LOOP
        i = 0;
        while (i < numOfPlants) {
            // PLANT
            // coordinates of plant
            int j = (int) (Math.random() * h);
            int k = (int) (Math.random() * w);

            if (cell[j][k] == null) {
                this.cell[j][k] = new Plant(j, k);
                this.title[j][k] = "P";
                i++;
            }
        }
    }

    public void print() {
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if (cell[i][j] instanceof Wolf) {
                    System.out.print(" W ");
                } else if (cell[i][j] instanceof Rabbit) {
                    System.out.print(" R ");
                } else if (cell[i][j] instanceof Plant) {
                    System.out.print(" P ");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
}