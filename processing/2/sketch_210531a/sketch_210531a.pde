void setup() {
  size(640, 360);
  noSmooth();
  fill(126);
  background(0);
}

void draw() {
  if (mousePressed) {
    stroke(0);
    fill(0);
  } else {
    stroke(255);
    fill(255);
  }
  
  circle(mouseX,mouseY,20);
}
