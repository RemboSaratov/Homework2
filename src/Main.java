public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Task 1");
        System.out.println("dog " + dog);
        System.out.println("cat " + cat);
        System.out.println("paper " + paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Task 2");
        System.out.println("dog " + dog);
        System.out.println("cat " + cat);
        System.out.println("paper " + paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Task 3");
        System.out.println("dog " + dog);
        System.out.println("cat " + cat);
        System.out.println("paper " + paper);

        var friend = 19;
        System.out.println("Task 4");
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println("Task 5");
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var massBoxer1 = 78.2;
        var massBoxer2 = 82.7;
        var totalMassBoxer = massBoxer1 + massBoxer2;
        System.out.println("Task 6");
        System.out.println("сумма масс двух боксеров " + totalMassBoxer + "кг");
        var differenceMassBoxer = massBoxer2 - massBoxer1;
        System.out.println("разница масс двух боксеров " + differenceMassBoxer + "кг");

        System.out.println("Task 7");
        System.out.println("1 " + differenceMassBoxer + "кг");
        System.out.println("2. " + massBoxer2 % massBoxer1 + "кг" );

        var workTimeAllEmployee = 640;
        var workTimeEmployee = 8;
        var employee = workTimeAllEmployee / workTimeEmployee;
        System.out.println("Task 8");
        System.out.println("Всего работников в компании " + employee + " человек");
        employee = employee + 94;
        var newWorkTimeAllEmployee = employee * workTimeEmployee;
        System.out.println("Если в компании работает " + employee + " человек, то всего " + newWorkTimeAllEmployee + " часов работы может быть поделено между сотрудниками");
















    }
}
