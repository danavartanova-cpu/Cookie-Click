import java.util.Timer;
import java.util.TimerTask;

public class Game {
    protected int blueyCounter;
    private int bPC;
    private int bPS;
    protected int upgrade1Cost = 5;
    protected int upgrade2Cost = 25;
    protected int upgrade3Cost = 35;
    protected int upgrade4Cost = 45;
    protected int upgrade5Cost = 55;
    protected int upgrade6Cost = 65;
    protected int upgrade7Cost = 75;
    protected int upgrade8Cost = 85;
    protected int upgrade9Cost = 95;
    protected int upgrade10Cost = 1000;
    protected int upgrade11Cost = 1025;

    public Game() {
        this.blueyCounter = 0;
        this.bPC = 1;
        this.bPS = 0;

        Timer timer = new Timer();
        TimerTask slow = new TimerTask() {
            @Override
            public void run() {
                slowBluey();
            }
        };
        timer.schedule(slow, 0, 1000);
    }



    public void slowBluey() {
        this.blueyCounter+=bPS;
    }


    public void click() { blueyCounter+=bPC;}


    public void buyUpgrade1() {
        if (blueyCounter >= upgrade1Cost) {
            blueyCounter -= upgrade1Cost;
            bPC++;
            upgrade1Cost += bPC;
        }
    }

    public void buyUpgrade2() {
        if (blueyCounter >= upgrade2Cost) {
            blueyCounter -= upgrade2Cost;
            bPS+=3;
            upgrade2Cost += bPS;
        }
    }

    public void buyUpgrade3() {
        if (blueyCounter >= upgrade3Cost) {
            blueyCounter -= upgrade3Cost;
            bPC+=5;
            upgrade3Cost += bPC;
        }
    }

    public void buyUpgrade4() {
        if (blueyCounter >= upgrade4Cost) {
            blueyCounter -= upgrade4Cost;
            bPC +=7;
            upgrade4Cost += bPC;
        }
    }

    public void buyUpgrade5() {
        if (blueyCounter >= upgrade5Cost) {
            blueyCounter -= upgrade5Cost;
            bPC += 9;
            upgrade5Cost += bPC;
        }
    }

    public void buyUpgrade6() {
        if (blueyCounter >= upgrade6Cost) {
            blueyCounter -= upgrade6Cost;
            bPC += 12;
            upgrade6Cost += bPC;
        }
    }

    public void buyUpgrade7() {
        if (blueyCounter >= upgrade7Cost) {
            blueyCounter -= upgrade7Cost;
            bPC += 14;
            upgrade7Cost += bPC;
        }
    }

    public void buyUpgrade8() {
        if (blueyCounter >= upgrade8Cost) {
            blueyCounter -= upgrade8Cost;
            bPC += 16;
            upgrade8Cost += bPC;
        }
    }

    public void buyUpgrade9() {
        if (blueyCounter >= upgrade9Cost) {
            blueyCounter -= upgrade9Cost;
            bPC += 18;
            upgrade9Cost += bPC;
        }
    }

    public void buyUpgrade10() {
        if (blueyCounter >= upgrade10Cost) {
            blueyCounter -= upgrade10Cost;
            bPC += 20;
            upgrade10Cost += bPC;
        }
    }

    public void buyUpgrade11() {
        if (blueyCounter >= upgrade11Cost) {
            blueyCounter -= upgrade11Cost;
            bPC += 22;
            upgrade11Cost += bPC;
        }
    }

}
