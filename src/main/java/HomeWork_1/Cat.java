package HomeWork_1;

    public class Cat extends JumpAndRun {
        int maxHeight;
        int maxLength;
        String name;

        public Cat(int maxHeight, int maxLength, String CatName) {
            this.maxHeight = maxHeight;
            this.maxLength = maxLength;
            this.name = CatName;
        }

        @Override
        public int getMaxHeight() {
            return maxHeight;
        }

        @Override
        public void jump() {
            System.out.println("Кот прыгает");
        }

        @Override
        public int getMaxLength() {
            return maxLength;
        }

        @Override
        public void run() {
            System.out.println("Кот бежит");
        }

        @Override
        public String toString() {
            return "Кот по кличке " + name;
        }

}
