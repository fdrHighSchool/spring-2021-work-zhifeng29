public static int [][] resize (int [][] array2D){
  int size = numNonZeroRows(array2D);
  int[][] new2DArray = new int[size][3];
  for(int a = 0 ; a < array2D.length();a++){
    if (isNonZeroRow(array2D,a)){
      for(int i = 0;i < array2D[a].length();i++){
        new2DArray[a][i] = array2D[a][i];
      }
    }

  }
  return new2DArray;
}
