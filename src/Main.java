


public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Dog: " + dog);
        System.out.println("Cat: " + cat);
        System.out.println("Paper: " + paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("Dog: " + dog);
        System.out.println("Cat: " + cat);
        System.out.println("Paper: " + paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("Dog: " + dog);
        System.out.println("Cat: " + cat);
        System.out.println("Paper: " + paper);

        var friend = 19;
        System.out.println("Friend: " + friend);
        friend = friend + 2;
        System.out.println("Friend: " + friend);
        friend = friend / 3;
        System.out.println("Friend: " +friend);

        var frog = 3.5;
        System.out.println("Frog: " + frog);
        frog = frog * 10;
        System.out.println("Frog: " +frog);
        frog = frog / 3.5;
        System.out.println("Frog: " + frog);
        frog = frog + 4;
        System.out.println("Frog: " + frog);

        var boxer1Weight = 78.2;
        var boxer2Weight = 87.2;
        var totalWeight = boxer1Weight + boxer2Weight;

        System.out.println("Масса первого боксёра: " + boxer1Weight + " кг");
        System.out.println("Масса второго боксёра: " + boxer2Weight + " кг");
        System.out.println("Общая масса боксёров: " + totalWeight + " кг");

        var weightDifference = boxer2Weight - boxer1Weight;

        System.out.println("Разница между массами бойцов: " + weightDifference + " кг");

        var remainder = boxer2Weight % boxer1Weight;

        System.out.println("Остаток от деления массы второго боксёра на массу первого: " + remainder);

        var totalHours = 640;
        var hoursPerWorker = 8;
        var totalWorkers = totalHours / hoursPerWorker;

        System.out.println("Всего работников в компании: " + totalWorkers + " человек");


        var newWorkers = totalWorkers + 94;
        var newTotalHours = newWorkers * hoursPerWorker;

        System.out.println("Если в компании работает " + newWorkers + "человек,то всего " + newTotalHours + " часов работы может быть поделено между сотрудниками.");






    }}









