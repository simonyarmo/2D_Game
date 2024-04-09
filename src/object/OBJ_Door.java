package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Door extends SuperObject {
    public OBJ_Door(){
        name = "Door";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/res/items/door.png"));
        }catch(IOException b){
            b.printStackTrace();
        }
        collision =true;
    }
}
