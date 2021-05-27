public void addMembers(String[] names, int gradYear){
  for( int i = 0 ;i < names.length;i++){
    MemberTnfo temp = new MemberInfo(name[i], gradYear, true);
    memberList.add(temp);
  }

}
