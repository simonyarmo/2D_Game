package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Bandana extends SuperObject{
    public OBJ_Bandana(){
        name = "Bandana";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/res/items/Bandana.png"));
        }catch(IOException b){
            b.printStackTrace();
        }
    }


}
