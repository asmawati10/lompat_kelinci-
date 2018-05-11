import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nilai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nilai extends Actor
{
    private int totalCount=0; //Counter default awal=0
    public void act() 
    {
       gameOver();//method gameOverr
       
      
            
    }   
    public void Counter()//kelas Counter
    {
        setImage(new GreenfootImage("0",30,Color.WHITE,Color.BLACK));//membuat
    }
    public void Counting (int hitung)//method Conting
     {
         totalCount +=hitung;
         setImage(new GreenfootImage(""+totalCount,30,Color.WHITE,Color.BLACK));
     }
    public void gameOver() //method gameOver
    {
        if (totalCount >=50) //bila totalCount>=50
    {
        Greenfoot.stop(); //stop permainan
        Greenfoot.playSound("gameover.mp3");
        System.out.println("CONGRATULATION! YOU WON! Click RESET to play again");
            
}
}
}