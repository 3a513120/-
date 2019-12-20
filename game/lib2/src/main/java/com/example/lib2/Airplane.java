package com.example.lib2;
import java.util.Random;
public class Airplane extends FlyingObject implements Enemy {
    private int xspeed = 4;  //移动步骤
    private int yspeed = 4;

    /** 初始化数据 */
    public Airplane(){
        this.image = ShootGame.airplane;
        width = image.getWidth();
        height = image.getHeight();
        y = -height;
        Random rand = new Random();
        x = rand.nextInt(ShootGame.WIDTH - width);
    }

    /** 获取分数 */
    @Override
    public int getScore() {
        return 5;
    }

    /** //越界处理 */
    @Override
    public     boolean outOfBounds() {
        return y>ShootGame.HEIGHT;
    }

    /** 移动 */
    @Override
    public void step() {
        x += xspeed;
        y += yspeed;
        if(x > ShootGame.WIDTH-width){
            xspeed = -10;
        }
        if(x < 0){
            xspeed = 10;
        }
    }


}