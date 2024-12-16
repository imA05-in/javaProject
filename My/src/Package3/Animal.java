    package Package3;

    public abstract class Animal {
        public abstract void walk();
        public  void speak(String animal){
            System.out.println(animal+" speaks");
        }
     Animal(){
         System.out.println("Animal constructor");
     }
    }
    class Dog extends Animal {
        public void walk() {
            System.out.println("dog walks");
            speak("dog");
        }
        Dog(){
            System.out.println("Dog constructor");
        }
    }
        class Main {
            public static void main(String[] args) {
                Dog dog = new Dog();
                dog.walk();
                System.out.println();
            }
        }
