void setup(){
  size(800,800);

}
void draw() {
   int x = 400;
  int y = 400;
  if (mousePressed) {
   fill(#5BF804);
  } else {
    fill(#3166FF);
  }
  
  ellipse(x,y,100,100);
}