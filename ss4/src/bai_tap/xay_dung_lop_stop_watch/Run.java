package bai_tap.xay_dung_lop_stop_watch;

public class Run {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("start");
        System.out.println("1 2 3");
        System.out.println("4 5 6");
        System.out.println("7 8 9");
        stopWatch.stop();
        System.out.println("end");
        System.out.println("time elapsed " + stopWatch.getElapsedTime().toMillis() +  " milliseconds");
    }
}
