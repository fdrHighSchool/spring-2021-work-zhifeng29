int cellSize = 10;
color occupied = color(0, 200, 0);
color empty = color(0);
int[][] world; 
int xLocation;
int yLocation; 
void setup() {
  size (640, 360);
  world = new int[width/cellSize][height/cellSize];
  xLocation = (width/cellSize)/2;
  yLocation = (height/cellSize)/2;
  stroke(48);
  noSmooth();
  // Initialization of cells
  for (int x=0; x<width/cellSize; x++) {
    for (int y=0; y<height/cellSize; y++) {
      int state;
      if (x == xLocation && y == yLocation) { 
        state = 1;
      }
      else {
        state = 0;
      }
      world[x][y] = int(state);
    }
  }
  background(0);
}
void draw() {
  //Draw grid
  for (int x=0; x<width/cellSize; x++) {
    for (int y=0; y<height/cellSize; y++) {
      if (world[x][y]==1) {
        fill(occupied); 
      }
      else {
        fill(empty); 
      }
      rect (x*cellSize, y*cellSize, cellSize, cellSize);
    }
  }
  iteration();
  delay(100);
}
void iteration() {
  world[xLocation][yLocation] = 0;
  int move = int(random(4));
  if (move == 0) {
    xLocation += 1;
  } else if (move == 1) {
    xLocation -= 1;
  } else if (move == 2) {
    yLocation += 1;
  } else {
    yLocation -=1 ;    
  }
  if (xLocation==0 || xLocation==width-1 || yLocation==0 || yLocation==height-1) {
    //exit();    
    stop();
  }
  world[xLocation][yLocation] = 1;
}
