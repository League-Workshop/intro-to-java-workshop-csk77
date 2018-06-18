import ddf.minim.*;   
Minim minim;     
AudioPlayer sound;

void setup () {
  
  size(800,800);
  fill(#FFD37C);
ellipse(400, 400, 750, 750);
fill(#F22720);
ellipse(400, 400, 700, 700);
fill(#FFF305);
ellipse(400, 400, 550, 550);
minim = new Minim(this);     
sound = minim.loadFile("ding.wav");      

  
}
void draw() {
  PImage pepperoni = loadImage("pepperoni.png");
  pepperoni.resize(10, 10);

PImage beef = loadImage("beef.png");
  beef.resize(10, 10);
  if (mousePressed) {
    sound.play();
sound.rewind();
    if (mouseButton == RIGHT) {
  image(pepperoni, mouseX, mouseY);
    } else {
  image(beef, mouseX, mouseY); }
  }
}