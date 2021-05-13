public static double propLong(int n){
double total = 0.0;
int x = n;
  if (isLongSeq(n) == true){
    while(x != 1){
      if(x % 2 == 0){
        x = x/2;
      }
      else{
        x = x*3+1;
      }
      total = total + x;
    }

  }
  return (n/total);
}
