JSONArray complaints;
void setup() {
  size(400, 400);
  background(2);
  // load JSON from URL
  complaints = loadJSONArray("https://data.cityofnewyork.us/resource/erm2-nwe9.json");
  int brooklynRodents = 0;
  String address = "";
  // filter for complaint type "Rodent"
  for(int i = 0; i < complaints.size(); i++) {
    JSONObject complaint = complaints.getJSONObject(i);
    String borough = complaint.getString("borough");
    String type = complaint.getString("descriptor");
    if(borough.equals("BROOKLYN") && type.equals("Rat Sighting")) {
      address += complaint.getString("incident_address") + "\n";
      brooklynRodents++;  
    }
  }
  textSize(32);
  text(brooklynRodents, width/2, height-20);
  textSize(20);
  text(address, 50, 50);
  // sort by borough and year
}
