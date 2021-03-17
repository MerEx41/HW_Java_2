import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Object[] persons = new Object[4];
        Object[] course = new Object[4];
        Random rand = new Random();
        for (int i = 0; i < persons.length; i++) {
            if (rand.nextInt(3) == 1) {
                persons[i] = new Cat(String.valueOf(i+1), rand.nextInt(20), rand.nextInt(30));
            } else if (rand.nextInt(2) == 1) {
                persons[i] = new Person(String.valueOf(i+1), rand.nextInt(30), rand.nextInt(20));
            } else {
                persons[i] = new Robot(String.valueOf(i+1), rand.nextInt(50), rand.nextInt(50));
            }
        }
        for (int i = 0; i < course.length; i++) {
            if ((i + 1) % 2 == 0) {
                course[i] = new Wall(rand.nextInt(10));
            } else {
                course[i] = new Treadmill(rand.nextInt(15));
            }

        }

        for (Object person : persons) {
            if (person instanceof Cat) {
                for (Object obstacle : course) {
                    if (obstacle instanceof Treadmill) {
                        if (((Treadmill) obstacle).runDistance(((Cat) person).runLimit)) {
                            Cat.run();
                            System.out.println("Участник  " + ((Cat) person).name + " кот пробежал дистанцию.");
                        } else {
                            Cat.run();
                            System.out.println("Участник " + ((Cat) person).name + " кот не пробежал дистанцию и покидает соревнование.");
                            break;
                        }
                    } else {
                        if (((Wall) obstacle).jumpOver(((Cat) person).jumpLimit)){
                            Cat.jump();
                            System.out.println("Участник " + ((Cat) person).name + " кот перепрыгнул препятствие.");
                        } else {
                            Cat.jump();
                            System.out.println("Участник " + ((Cat) person).name + " кот не перепрыгнул препятствие и покидает соревнование.");
                            break;
                        }

                    }
                }

            } else if (person instanceof Person) {
                for (Object obstacle : course) {
                    if (obstacle instanceof Treadmill) {
                        if (((Treadmill) obstacle).runDistance(((Person) person).runLimit)) {
                            Person.run();
                            System.out.println("Участник " + ((Person) person).name + " человек пробежал дистанцию.");
                        } else {
                            Person.run();
                            System.out.println("Участник " + ((Person) person).name + " человек е пробежал дистанцию и покидает соревнование.");
                            break;
                        }
                    } else {
                        if (((Wall) obstacle).jumpOver(((Person) person).jumpLimit)){
                            Person.jump();
                            System.out.println("Участник " + ((Person) person).name + " человек перепрыгнул препятствие.");
                        } else {
                            Person.jump();
                            System.out.println("Участник " + ((Person) person).name + " человек не перепрыгнул препятствие и покидает соревнование.");
                            break;
                        }

                    }
                }

            } else {
                for (Object obstacle : course) {
                    if (obstacle instanceof Treadmill) {
                        if (((Treadmill) obstacle).runDistance(((Robot) person).runLimit)) {
                            Robot.run();
                            System.out.println("Участник " + ((Robot) person).name + " робот пробежал дистанцию.");
                        } else {
                            Robot.run();
                            System.out.println("Участник " + ((Robot) person).name + " робот не пробежал дистанцию и покидает соревнование.");
                            break;
                        }
                    } else {
                        if (((Wall) obstacle).jumpOver(((Robot) person).jumpLimit)){
                            Robot.jump();
                            System.out.println("Участник " + ((Robot) person).name + " робот перепрыгнул препятствие.");
                        } else {
                            Robot.jump();
                            System.out.println("Участник " + ((Robot) person).name + " роботне перепрыгнул препятствие и покидает соревнование.");
                            break;
                        }

                    }
                }
            }
        }
    }
}



