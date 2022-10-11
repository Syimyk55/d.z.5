public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(900);
boss.setDemage(80);
boss.setProtection("lightning");
        System.out.println(boss.getDemage()+ "- Demage");
        System.out.println(boss.getHealth()+" - Health");
        System.out.println(boss.getProtection()+ " - Protection");
    }
    }
