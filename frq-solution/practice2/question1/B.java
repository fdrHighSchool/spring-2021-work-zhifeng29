public static boolean isLongSeq(int n){
  if (hailstoneLength(n) > n){
    return true;
  }
  return false;
}
