package hashcode.qualification;

public class Ride {

  private int rideIndex;
  
  private Coordinate start;
  private Coordinate end;

  private int earliestStart;
  private int latestEnd;

  public int getRideIndex() {
    return rideIndex;
  }

  public void setRideIndex(int rideIndex) {
    this.rideIndex = rideIndex;
  }

  public Coordinate getStart() {
    return start;
  }

  public void setStart(Coordinate start) {
    this.start = start;
  }

  public Coordinate getEnd() {
    return end;
  }

  public void setEnd(Coordinate end) {
    this.end = end;
  }

  public int getEarliestStart() {
    return earliestStart;
  }

  public void setEarliestStart(int earliestStart) {
    this.earliestStart = earliestStart;
  }

  public int getLatestEnd() {
    return latestEnd;
  }

  public void setLatestEnd(int latestEnd) {
    this.latestEnd = latestEnd;
  }

  public String toStringVerbose() {
    return start.toString() + " -> " + end.toString() + ", [" + earliestStart + " - " + latestEnd
        + "]\n";
  }

  @Override
  public String toString() {
    return "" + rideIndex;
  }

}
