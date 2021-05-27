public String findBetterGuess(String guess1, String guess2){
  int g1 = scoreGuess(guess1);
  int g2 = scoreGuess(guess2);

  if (g1 > g2){
    return guess1;
  }
  else if g2 > g1{
    return guess2;
  }
  else{
    int find = 0;
    while(find == 0){
      find = guess1.substring(i,i+1).compareTo(guess2.substring(i,i+1))
      i++;
    }
    if (find < 0){
      return guess2;
    }
    else{return guess1}
  }
}
