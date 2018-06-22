float birdX=100;
float birdYVelocity = 10;
float gravity = .5;
float birdY=300;
float pipeY=0;
float pipeX=800;
int lose = 0;
int score =0;
 int pipeHeight = (int) random(30,390);
void setup() {
  size(800,600);
}

void draw(){
 if (lose==0) {
   if (birdY>=570) {
     lose=1;
   }
   if(intersectsPipes()) {
     lose=1;
   }
  if (pipeX<0) {
    pipeX=800;
   pipeHeight = (int) random(30,390);
  }
  if(pipeX==birdX) {
   score++; 
  }
  background(#08BBFF);
  fill(#FFF300);
  stroke(#FFF300);
  ellipse(birdX,birdY, 30,30);
   birdY=birdY-birdYVelocity;
   birdYVelocity-=gravity;
   fill(#834604);
  stroke(#834604);
  rect(0,570,800,30);
  fill(#1CFF00);
  stroke(#1CFF00);
  
  pipeX-=2;
  
  rect(pipeX, pipeHeight+200, 30, 800-pipeHeight-200);
rect(pipeX, pipeY, 30, pipeHeight);
  fill(#000000);
  textSize(30);
  text("Score: " + score, 100, 100);
}
if (lose ==1) {
  fill(#000000);
  textSize(100);
  text("You lose!", 200,300);
  textSize(30);
  text("Score: " + score, 350, 400);
}
}
void mousePressed() {
  birdYVelocity=10;
}
boolean intersectsPipes() { 
     if (birdY> 600-pipeHeight&&birdY < pipeHeight && birdX > pipeX && birdX < (pipeX+30)){
          return true; }
     else if (birdY> 800-pipeHeight-200 && birdX > pipeX && birdX < (pipeX+30)) {
          return true; }
     else { return false; }
}