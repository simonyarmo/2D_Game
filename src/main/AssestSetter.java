package main;
import object.OBJ_Bandana;
import object.OBJ_Chest;
import object.OBJ_Door;
import object.OBJ_Key;
public class AssestSetter {
    GamePanel gp;
    public AssestSetter(GamePanel gp){
        this.gp = gp;
    }

    public void setObject(){
    gp.obj[0] = new OBJ_Key();
    gp.obj[0].worldX = 17*gp.tileSize;
    gp.obj[0].worldY = 26 *gp.tileSize;

    gp.obj[1] = new OBJ_Key();
    gp.obj[1].worldX = 25*gp.tileSize;
    gp.obj[1].worldY = 15 *gp.tileSize;

    gp.obj[2] = new OBJ_Door();
    gp.obj[2].worldX = 14*gp.tileSize;
    gp.obj[2].worldY = 30 *gp.tileSize;

    gp.obj[3] = new OBJ_Door();
    gp.obj[3].worldX = 5*gp.tileSize;
    gp.obj[3].worldY = 24 *gp.tileSize;

    gp.obj[4] = new OBJ_Chest();
    gp.obj[4].worldX = 5*gp.tileSize;
    gp.obj[4].worldY = 22 *gp.tileSize;

//    gp.obj[5] = new OBJ_Key();
//    gp.obj[5].worldX = 25*gp.tileSize;
//    gp.obj[5].worldY = 15 *gp.tileSize;

        gp.obj[5] = new OBJ_Bandana();
        gp.obj[5].worldX = 25*gp.tileSize;
        gp.obj[5].worldY = 20 *gp.tileSize;

    }
}
