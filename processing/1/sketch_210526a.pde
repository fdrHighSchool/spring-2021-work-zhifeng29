 void setup() {
   size(1000, 1000);
  for(int i = 50; i <=1000;i = i +50){
    noFill();
    arc(500, 500, i, i, 0, QUARTER_PI, CHORD  );
     
  }
}
