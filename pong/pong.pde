int ballX=900;
int ballY=500;
int xSpeed = 10;
int ySpeed = (int) random(10);
int paddleX = 1720;
int paddleY=500;
int lose = 0;
int score = 0;
void setup() {
  size(1800,1000);
}

void draw() {
  textSize(20);

  if (lose == 0) {
      
    if (ballX>=1770) {
    
      lose =1;
      textSize(100);
      text("YOU LOSE", 900, 500);
    }
  paddleY=mouseY;
  if (true==intersects(ballX, ballY, paddleX, paddleY, 100)) {
   ySpeed=-ySpeed; 
   xSpeed=-xSpeed;
   score++;
  }
  fill(#0329FA);
        
        fill(#0329FA);
        textSize(20);
  background(255,255,255);
  text("Score " + score, 50, 50);
rect(paddleX, paddleY, 20,100);
ballX+=xSpeed;
if (score == 25) {
  lose =2;
}
xSpeed*=1.05;
ballY+=ySpeed;
if(ballY > height-20 || ballY<0){
    ySpeed = -ySpeed;
}
if(ballX > width || ballX<0){
    xSpeed = -xSpeed;
}
fill(#0329FA);//in draw method

stroke(#0329FA); //in draw method
  ellipse(ballX, ballY, 30, 30); //in draw method
  }
  if (lose == 1) {
       textSize(100);
      text("YOU LOSE", 900, 500);   
  }
   if (lose == 2) {
       textSize(100);
      text("YOU WIN", 900, 500);   
  }
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY,
int paddleLength) {
    if (ballX > paddleX && ballY > paddleY && ballY < paddleY + paddleLength)
        return true;
    else
        return false;
}