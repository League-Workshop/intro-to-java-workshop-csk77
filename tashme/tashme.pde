PImage mustache;
PImage friend;
PImage hat;
void setup() {
   friend = loadImage("friend.png");
   
   hat = loadImage("hat.png");
mustache = loadImage("mustache.png");
size(800, 600);

friend.resize(800,600);

mustache.resize(500,200);
}

void draw() {
  if (mousePressed) {
    background(friend);
  image(mustache,mouseX-250, mouseY-100);
  }
  

  
}