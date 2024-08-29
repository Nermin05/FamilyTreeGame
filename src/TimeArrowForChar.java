public class TimeArrowForChar implements Runnable{
    private Thread thread;
    public void gameStartForChar() {
        thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        while (thread != null) {
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            Main.characterList.forEach(Character::aMonthPasses);
        }
    }
}
