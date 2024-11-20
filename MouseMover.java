import java.awt.*;
import java.util.Random;
import java.util.Date;
import java.time.Instant;

public class MouseMover{

public static final int minutes = 3;
public static final int max_x = 400;
public static final int max_y = 400;


public static void main(String [] args) throws Exception{
    Robot robot = new Robot();
    Random random = new Random();
    int px_tmp =0;
    int py_tmp = 0;
    int mouse_x = 0;
    int mouse_y = 0;

    while(true){
        int x = random.nextInt(max_x);
        int y = random.nextInt(max_y);

        Point p = MouseInfo.getPointerInfo().getLocation();
        if(px_tmp == 0 || (p.x ==px_tmp && p.y == py_tmp) || (mouse_x == p.x &&mouse_y==p.y)){
            //System.out.println(Date.from(Instant.now()));
        robot.mouseMove(x,y);
        px_tmp = x;
        py_tmp = y;
    }
    mouse_x = p.x;
    mouse_y = p.y;
        Thread.sleep(minutes * 60 *1000);
}
}
}
