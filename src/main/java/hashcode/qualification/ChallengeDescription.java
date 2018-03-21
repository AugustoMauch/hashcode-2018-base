package hashcode.qualification;

import java.util.List;

public class ChallengeDescription {

  private int nRows;
  private int nCols;
  private int nCars;
  private int perRideBonus;
  private List<Ride> rides;
  private int nSteps;

  public int getnRows() {
    return nRows;
  }

  public void setnRows(int nRows) {
    this.nRows = nRows;
  }

  public int getnCols() {
    return nCols;
  }

  public void setnCols(int nCols) {
    this.nCols = nCols;
  }

  public int getnCars() {
    return nCars;
  }

  public void setnCars(int nCars) {
    this.nCars = nCars;
  }

  public int getPerRideBonus() {
    return perRideBonus;
  }

  public void setPerRideBonus(int perRideBonus) {
    this.perRideBonus = perRideBonus;
  }

  public List<Ride> getRides() {
    return rides;
  }

  public void setRides(List<Ride> rides) {
    this.rides = rides;
  }

  public int getnSteps() {
    return nSteps;
  }

  public void setnSteps(int nSteps) {
    this.nSteps = nSteps;
  }
  
  @Override
  public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append(nRows + " rows\n");
	builder.append(nCols + " columns\n");
	builder.append(nCars + " cars\n");
	builder.append(perRideBonus + " bonus\n");
	builder.append(rides.size() + " rides\n");
	builder.append(nSteps + " time limit\n");
	return builder.toString();
  }

}
