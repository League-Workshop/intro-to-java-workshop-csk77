PImage rainbow;
PImage unicorn;
void setup () {
  
         rainbow = loadImage("rainbow.jpg");
  unicorn = loadImage("unicorn.png");


size(800, 600);

rainbow.resize(width,height);


}
void draw () { 
  background(rainbow);
  image(unicorn, mouseX, mouseY);
}