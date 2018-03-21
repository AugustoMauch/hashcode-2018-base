package hashcode.qualification;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Reads a challenge input file and creates a ChallengeDescription from its contents
 */
public class ChallengeReader {

  private static final Logger log = LoggerFactory.getLogger(ChallengeReader.class);

  public static ChallengeDescription readChallenge(String fileName) {
    ChallengeDescription challengeDescription = new ChallengeDescription();
    try {
      log.info("Reading file {}", fileName);
      List<String> stringifiedChallengeDescription = Files.readAllLines(new File(fileName).toPath(),
          Charset.defaultCharset());
      int nRow = 0;
      String[] header = stringifiedChallengeDescription.get(nRow++).split(" ");
      int index = 0;
      challengeDescription.setnRows(Integer.parseInt(header[index++]));
      challengeDescription.setnCols(Integer.parseInt(header[index++]));
      challengeDescription.setnCars(Integer.parseInt(header[index++]));
      int nRides = (Integer.parseInt(header[index++]));
      challengeDescription.setPerRideBonus(Integer.parseInt(header[index++]));
      challengeDescription.setnSteps(Integer.parseInt(header[index]));

      List<Ride> rides = new ArrayList<>();

      for (int rideIndex = 0; rideIndex < nRides; rideIndex++) {
        String[] rideLine = stringifiedChallengeDescription.get(nRow++).split(" ");
        int lineIndex = 0;
        int startRow = Integer.parseInt(rideLine[lineIndex++]);
        int startCol = Integer.parseInt(rideLine[lineIndex++]);
        int endRow = Integer.parseInt(rideLine[lineIndex++]);
        int endCol = Integer.parseInt(rideLine[lineIndex++]);
        int earliestStart = Integer.parseInt(rideLine[lineIndex++]);
        int latestEnd = Integer.parseInt(rideLine[lineIndex]);
        Ride ride = new Ride();
        ride.setStart(new Coordinate(startRow, startCol));
        ride.setEnd(new Coordinate(endRow, endCol));
        ride.setEarliestStart(earliestStart);
        ride.setLatestEnd(latestEnd);
        ride.setRideIndex(rideIndex);
        rides.add(ride);
      }
      challengeDescription.setRides(rides);
      System.out.println(challengeDescription);
    } catch (Exception e) {
      log.error("Error while reading file " + fileName, e);
    }
    return challengeDescription;
  }
  
  public static void main(String[] args) {
	  ChallengeReader.readChallenge("datasets/e_high_bonus.in");
  }

}
