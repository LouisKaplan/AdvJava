package java112.project3;

import java.util.*;

/**
 * Simple bean for scores of Badger Football games
 * @author Peter Knibbe
 */

public class BadgerScores {
    private Map<String, ArrayList<Integer>> badgerMap;
    private Map<String, ArrayList<Integer>> opponentMap;
    private ArrayList<String> dates;
    private ArrayList<String> opponents;
    private ArrayList<Integer> badgerFinalScore;
    private ArrayList<Integer> opponentFinalScore;

    /**
     * Returns the final Badger scores of each game
     * @return badgerFinalScore the final Badger scores by game
     */

    public ArrayList<Integer> getBadgerFinalScore() {
        return badgerFinalScore;
    }

    /**
     * Returns the final Badger opponent scores of each game
     * @return opponentFinalScore the final Badger opponentscores by game
     */

    public ArrayList<Integer> getOpponentFinalScore() {
        return opponentFinalScore;
    }

    /**
     * Returns the value of the Badger scores
     * @return badgerMap the map of Badger scores by date
     */

    public Map<String, ArrayList<Integer>> getBadgerMap() {
        return badgerMap;
    }

    /**
     * Returns the value of the Badger opponent scores
     * @return opponentMap the map of Badger opponent scores by date
     */

    public Map<String, ArrayList<Integer>> getOpponentMap() {
        return opponentMap;
    }

    /**
     * returns the list of Badger opponents for 2016 in date order
     * @return opponents the Badger's opponents for 2016
     */

    public ArrayList<String> getOpponents() {
        return opponents;
    }

    /**
     * Returns the value of dates.
     * @return dates the dates of the 2016 games
     */

    public ArrayList<String> getDates() {
        return dates;
    }

    /**
     * default constructor
     */

    public BadgerScores() {
        badgerMap = new HashMap<String, ArrayList<Integer>>();
        opponentMap = new HashMap<String, ArrayList<Integer>>();
        dates = new ArrayList<String>();
        opponents = new ArrayList<String>();

        populateDates();
        populateBadgers();
        populateOpponents();
    }

    /**
     * populate the dates array list
     */

    private void populateDates() {
        dates.add("Sat, Sep 3");
        dates.add("Sat, Sep 10");
        dates.add("Sat, Sep 17");
        dates.add("Sat, Sep 24");
        dates.add("Sat, Oct 1");
        dates.add("Sat, Oct 15");
        dates.add("Sat, Oct 22");
        dates.add("Sat, Oct 29");
        dates.add("Sat, Nov 5");
        dates.add("Sat, Nov12");
        dates.add("Sat, Nov19");
        dates.add("Sat, Nov26");
    }

    /**
     * populate the badgers score map
     */

    private void populateBadgers() {
        ArrayList<Integer> scores;
        badgerFinalScore = new ArrayList<Integer>();

        // LSU game on September 3
        scores = buildArray(0, 6, 7, 3, null, 16);
        badgerMap.put(dates.get(0), scores);
        badgerFinalScore.add(scores.get(5));

        // Akron game on September 10
        scores = buildArray(9, 21, 10, 14, null, 54);
        badgerMap.put(dates.get(1), scores);
        badgerFinalScore.add(scores.get(5));

        // Georgia State game on September 17
        scores = buildArray(6, 0, 7, 10, null, 23);
        badgerMap.put(dates.get(2), scores);
        badgerFinalScore.add(scores.get(5));

        // Michigan State game on September 24
        scores = buildArray(7, 6, 17, 0, null, 30);
        badgerMap.put(dates.get(3), scores);
        badgerFinalScore.add(scores.get(5));

        // Michigan game on October 1
        scores = buildArray(0, 0, 7, 0, null, 7);
        badgerMap.put(dates.get(4), scores);
        badgerFinalScore.add(scores.get(5));

        // Ohio State game on October 15
        scores = buildArray(10, 6, 0, 7, 0, 23);
        badgerMap.put(dates.get(5), scores);
        badgerFinalScore.add(scores.get(5));

        // Iowa game on October 22

        scores = buildArray(0, 7, 7, 3, null, 17);
        badgerMap.put(dates.get(6), scores);
        badgerFinalScore.add(scores.get(5));

        // Nebraska game on October 29
        scores = buildArray(7, 3, 7, 0, 6, 23);
        badgerMap.put(dates.get(7), scores);
        badgerFinalScore.add(scores.get(5));

        // Northwestern game on November 5
        scores = buildArray(0, 10, 3, 8, null, 21);
        badgerMap.put(dates.get(8), scores);
        badgerFinalScore.add(scores.get(5));

        // Illinois game on November 12
        scores = buildArray(21, 10, 3, 14, null, 48);
        badgerMap.put(dates.get(9), scores);
        badgerFinalScore.add(scores.get(5));

        // Purdue game on November 19
        scores = buildArray(null, null, null, null, null, null);
        badgerMap.put(dates.get(10), scores);
        badgerFinalScore.add(scores.get(5));

        // Minnesota game on November 26
        scores = buildArray(null, null, null, null, null, null);
        badgerMap.put(dates.get(11), scores);
        badgerFinalScore.add(scores.get(5));
    }

    /**
     * populate the opponents' score map
     */

    private void populateOpponents() {
        ArrayList<Integer> scores;
        opponentFinalScore = new ArrayList<Integer>();

        // LSU game on September 3
        scores = buildArray(0, 0, 14, 0, null, 14);
        badgerMap.put(dates.get(0), scores);
        opponents.add("LSU");
        opponentFinalScore.add(scores.get(5));

        // Akron game on September 10
        scores = buildArray(0, 10, 0, 0, null, 10);
        badgerMap.put(dates.get(1), scores);
        opponents.add("Akron");
        opponentFinalScore.add(scores.get(5));

        // Georgia State game on September 17
        scores = buildArray(0, 0, 10, 7, null, 17);
        badgerMap.put(dates.get(2), scores);
        opponents.add("GSU");
        opponentFinalScore.add(scores.get(5));

        // Michigan State game on September 24
        scores = buildArray(3, 3, 0, 0, null, 6);
        badgerMap.put(dates.get(3), scores);
        opponents.add("MSU");
        opponentFinalScore.add(scores.get(5));

        // Michigan game on October 1
        scores = buildArray(0, 7, 0, 7, null, 14);
        badgerMap.put(dates.get(4), scores);
        opponents.add("Michigan");
        opponentFinalScore.add(scores.get(5));

        // Ohio State game on October 15
        scores = buildArray(3, 3, 7, 10, 7, 30);
        badgerMap.put(dates.get(5), scores);
        opponents.add("OSU");
        opponentFinalScore.add(scores.get(5));

        // Iowa game on October 22
        scores = buildArray(0, 6, 0, 3, null, 9);
        badgerMap.put(dates.get(6), scores);
        opponents.add("Iowa");
        opponentFinalScore.add(scores.get(5));

        // Nebraska game on October 29
        scores = buildArray(0, 7, 0, 10, 0, 17);
        badgerMap.put(dates.get(7), scores);
        opponents.add("Nebraska");
        opponentFinalScore.add(scores.get(5));

        // Northwestern game on November 5
        scores = buildArray(0, 7, 0, 0, null, 7);
        badgerMap.put(dates.get(8), scores);
        opponents.add("Northwestern");
        opponentFinalScore.add(scores.get(5));

        // Illinois game on November 12
        scores = buildArray(3, 0, 0, 0, null, 3);
        badgerMap.put(dates.get(9), scores);
        opponents.add("Illinois");
        opponentFinalScore.add(scores.get(5));

        // Purdue game on November 19
        scores = buildArray(null, null, null, null, null, null);
        badgerMap.put(dates.get(10), scores);
        opponents.add("Purdue");
        opponentFinalScore.add(scores.get(5));

        // Minnesota game on November 26
        scores = buildArray(null, null, null, null, null, null);
        badgerMap.put(dates.get(11), scores);
        opponents.add("Minnesota");
        opponentFinalScore.add(scores.get(5));
    }

    /**
     * build array from the input ints
     * @return scores the quarter-by-quarter scores of a team in a game
     */

    private ArrayList<Integer> buildArray(Integer q1, Integer q2, Integer q3,
                                          Integer q4, Integer ot, Integer total) {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(q1);
        scores.add(q2);
        scores.add(q3);
        scores.add(q4);
        scores.add(ot);
        scores.add(total);
        return scores;
    }
}