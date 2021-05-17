public ArrayList<MemberInfo> removeMembers(int year){
  ArrayList<MemberInfo> removeList = new ArrayList<MemberInfo>();
  for( int i = 0 ;i < memberList.size();i++){
    if (memberList.get(i).getGradYear() == year){
       removeList.add(memberList.get(i));
       memberList.remove(i);
    }
    return removeList;
}
