public class HorseBarnRunner {
    public static void main(String[] args) {
        Horse[] barn = new Horse[7];
        Horse h1 = new Horse("Trigger", 1340);
        Horse h2 = new Horse("Silver", 1210);
        Horse h3 = new Horse("Patches", 1350);
        Horse h4 = new Horse("Duke", 1410);
        barn[0] = h1;
        barn[2] = h2;
        barn[5] = h3;
        barn[6] = h4;
        HorseBarn barn1 = new HorseBarn(barn);
        System.out.println(barn1.horseBarnInfo());
        barn1.consolidate();
        System.out.println(barn1.horseBarnInfo());
    }
}
