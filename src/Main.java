public class Main {
    public static void main(String[] args) {
/**
 * Написати enum для планети сонячної системи. Клас повинен містити такі дані:
  * порядковий номер від сонця (для супутників застосовується номер планети)
 * віддаленість від попередньої планети (для меркурія 0)
 * віддаленість від сонця
 * радіус
 * попередня планета
 * наступна планета
 * Відстань від попередньої планети вказується явно.
 * Відстань від сонця обчислюється в конструкторі.
 * Точність даних не є важливою, допускається застосування невеликих чисел.
 */
//didnt get this one "Відстань від сонця обчислюється в конструкторі."
// Planet(int orderFromSun, double distanceFromPrevious, double radius, Planet previousPlanet) {
//...
//        this.distanceFromSun = previousPlanet != null ? previousPlanet.distanceFromSun + distanceFromPrevious : distanceFromPrevious;
//...
//    }
        //Апдейт по дз. Наступну планету не можливо додати як аргумент конструктора тому що вона ще не ініціалізована.
        // Можна написати метод який буде віддавати наступну планету. Як на мене можна просто викинути це поле
        // this.distanceToTheSun = previousPlanet.getDistanceToTheSun() + distanceFromThePreviousPlanet;

//SunSystem.VENUS.getDistanceToSun();
        System.out.println(SunSystem.MERCURY.getDistanceToSun());
        System.out.println(SunSystem.VENUS.getDistanceToSun());
        System.out.println(SunSystem.EARTH.getDistanceToSun());
        System.out.println(SunSystem.MARS.getDistanceToSun());
        System.out.println(SunSystem.JUPITER.getDistanceToSun());
        System.out.println(SunSystem.SATURN.getDistanceToSun());
        System.out.println(SunSystem.URANUS.getDistanceToSun());
        System.out.println(SunSystem.NEPTUNE.getDistanceToSun());

    }
}