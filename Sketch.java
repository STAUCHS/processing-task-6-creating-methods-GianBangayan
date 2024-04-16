import processing.core.PApplet;
import java.math.*;

public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    stroke(0);

    //makes an alternating  grid of robot heads
    for(int i = -1; i <= 10; i++){
      for(int j = -1; j <= 10; j++){
        if(((i+j)%2) == 0){
            drawRobot(i*75, j*75, 0.1);
            
        }
      }
    }
    //makes an alternating grid of differently sized stick figures
    for(int i = -1; i <= 10; i++){
      for(int j = -1; j <= 10; j++){
        if(((i+j)%2) == 1){
          drawMan(i*100,j*100,Math.sqrt(i*j)/10);
        }
      }
    }
  }
  /**
   * Draws a line from the start coordinates to the end coordinates
   * @param intStartX start x
   * @param intStartY start y
   * @param intEndX end x
   * @param intEndY end y
   * @author G. Bangayan
   */
  public void drawLine(int intStartX, int intStartY, int intEndX, int intEndY){
    beginShape();
    vertex(intStartX,intStartY);
    vertex(intEndX,intEndY);
    endShape(CLOSE);
  }
  /**
   * Draws a stick man from the x position and y position
   * @param transX the x position
   * @param transY the y position
   * @param size the size of the stick man
   * @author G. Bangayan
   */
  public void drawMan(int transX, int transY, double size){
    fill(0, 0, 0);
    translate(transX, transY);
    ellipse((int)(30*size),(int)(0.0001*size),(int)(100*size),(int)(100*size));
    drawLine((int)(30*size),(int)(50*size), (int)(30*size), (int)(100*size));
    drawLine((int)(30*size), (int)(60*size), (int)(0*size), (int)(80*size));
    drawLine((int)(30*size), (int)(60*size), (int)(60*size), (int)(80*size));
    drawLine((int)(30*size), (int)(100*size), (int)(0*size), (int)(150*size));
    drawLine((int)(30*size), (int)(100*size), (int)(60*size), (int)(150*size));
    translate(-transX, -transY);
  }

    /**
   * Draws a robot head of a certain size at the given position
   * @param transX the x position
   * @param transY the y position
   * @param size the size of the robot head
   * @return
   * @author G. Bangayan
   */
  public void drawRobot(int transX, int transY, double size){
    translate(transX, transY);
      float fltHeightRatio = (float)size/1;
      float fltWidthRatio = (float)size/1;
      //change robot colour
      fill(160, 160, 160);
      //draw robot head
      beginShape();
        vertex(100*fltWidthRatio, 100*fltHeightRatio);
        vertex(100*fltWidthRatio, 700*fltHeightRatio);
        vertex(700*fltWidthRatio, 700*fltHeightRatio);
        vertex(700*fltWidthRatio, 100*fltHeightRatio);
      endShape(CLOSE);
  
      //Draw Eyeballs
      fill(255, 255, 255);
      ellipse(250*fltWidthRatio, 300*fltHeightRatio, 200*fltWidthRatio, 200*fltHeightRatio);
      ellipse(550*fltWidthRatio, 300*fltHeightRatio, 200*fltWidthRatio, 200*fltHeightRatio);
      //Draw Pupils
      fill(0, 0, 0);
      ellipse(550*fltWidthRatio, 300*fltHeightRatio, 50*fltWidthRatio, 50*fltHeightRatio);
      ellipse(250*fltWidthRatio, 300*fltHeightRatio, 50*fltWidthRatio, 50*fltHeightRatio);
  
      //Draw Mouth box
      fill(200, 200, 200);
      beginShape();
      vertex(250*fltWidthRatio, 600*fltHeightRatio);
      vertex(250*fltWidthRatio, 500*fltHeightRatio);
      vertex(550*fltWidthRatio, 500*fltHeightRatio);
      vertex(550*fltWidthRatio, 600*fltHeightRatio);
      endShape(CLOSE);
  
      //Draw Mouth diamond
      fill(230, 230, 230);
      beginShape();
      vertex(250*fltWidthRatio, 550*fltHeightRatio);
      vertex(400*fltWidthRatio, 600*fltHeightRatio);
      vertex(550*fltWidthRatio, 550*fltHeightRatio);
      vertex(400*fltWidthRatio, 500*fltHeightRatio);
      endShape(CLOSE);
  
      // Draw mouth lines
      fill(0, 0, 0);
      drawLine(Math.round(250 * fltWidthRatio), Math.round(600 * fltHeightRatio), Math.round(250 * fltWidthRatio), Math.round(500* fltHeightRatio));
      drawLine(Math.round(300 * fltWidthRatio), Math.round(600 * fltHeightRatio), Math.round(300 * fltWidthRatio), Math.round(500* fltHeightRatio));
      drawLine(Math.round(350 * fltWidthRatio), Math.round(600 * fltHeightRatio), Math.round(350 * fltWidthRatio), Math.round(500* fltHeightRatio));
      drawLine(Math.round(400 * fltWidthRatio), Math.round(600 * fltHeightRatio), Math.round(400 * fltWidthRatio), Math.round(500* fltHeightRatio));
      drawLine(Math.round(450 * fltWidthRatio), Math.round(600 * fltHeightRatio), Math.round(450 * fltWidthRatio), Math.round(500* fltHeightRatio));
      drawLine(Math.round(500 * fltWidthRatio), Math.round(600 * fltHeightRatio), Math.round(500 * fltWidthRatio), Math.round(500* fltHeightRatio));
      drawLine(Math.round(550 * fltWidthRatio), Math.round(600 * fltHeightRatio), Math.round(550 * fltWidthRatio), Math.round(500* fltHeightRatio));
     // define other methods down here.
  
     //draw head antenna 
     fill(0, 0, 0);
     beginShape();
     vertex(385*fltWidthRatio, 100*fltHeightRatio);
     vertex(415*fltWidthRatio, 100*fltHeightRatio);
     vertex(415*fltWidthRatio, 50*fltHeightRatio);
     vertex(385*fltWidthRatio, 50*fltHeightRatio);
     endShape(CLOSE);
  
     //Draw head antenna bobble
     fill(255, 0, 0);
     ellipse(400*fltWidthRatio, 50*fltHeightRatio, 50*fltWidthRatio, 50*fltHeightRatio);
     translate(-transX,-transY);
  }
}