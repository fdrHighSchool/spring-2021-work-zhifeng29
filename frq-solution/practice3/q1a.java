public int scoreGuess (string guess){
  int count = 0;

  for(int i = 0;i < secret.length()-guess.length();i++){
    if (secret.substring(i,i+guess.length()) == guess){
      count++;
    }
  }

  return count*guess.length()*guess.length();
}
