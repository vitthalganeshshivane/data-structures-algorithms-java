public class Interfaces {

    interface ChessPlayer {
        void moves();
    }

    static class Queen implements ChessPlayer {
        public void moves() {
            System.out.println("up, down, right, left, diagonal (in all directions)");
        }
    }

    static class Rook implements ChessPlayer {
        public void moves() {
            System.out.println("up, down, left, right");
        }
    }

    static class King implements ChessPlayer {
        public void moves() {
            System.out.println("up, down, left, right, diagonal (by 1 step)");
        }
    }

    // multilevel inheritance
    interface Herbivore {

    }

    interface Carnivore {

    }

    class Bear implements Herbivore, Carnivore {

    }

    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();
    }
}