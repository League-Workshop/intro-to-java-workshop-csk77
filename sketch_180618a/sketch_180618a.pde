void setup() {
    size(500, 500);
}
void draw() {
    background(#FFFFFF);
    noStroke();
    fill(#E80000);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#068E00);
    rect(176, 103, 12, 32);
    fill(#FFFFFF);
    if (mousePressed) {
    ellipse(75,200,50,50);
    }
}