public boolean record (int score){
  for(int i = 0; i <ScoreList.size();i++){
    if(score < scoreList.get(i).getScore()){
      ScoreList.add(i,new ScoreInfo(score));
      return true;
    }
    else if (score == scoreList.get(i).getScore()){
      scoreList.get(i).increment();
      return false;
    }
  }
  scoreList.add(new ScoreInfo(score));
  return true;
}
