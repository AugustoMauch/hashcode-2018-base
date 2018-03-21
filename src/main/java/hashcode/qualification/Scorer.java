package hashcode.qualification;

import hashcode.qualification.scorer.ChallengeScorer;

public class Scorer {
  public static void main(String[] args) throws Exception {
	  String datasetFilePath = "datasets/a_example.in";
	  String outputFilePath = "output/a_example.out";
	  String[] arguments = {datasetFilePath, outputFilePath};
	  ChallengeScorer.main(arguments);
  }
}
