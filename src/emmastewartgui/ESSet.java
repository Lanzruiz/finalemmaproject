
package emmastewartgui;

/**
 *
 * @author Emma
 */
public class ESSet {

    int setID;
    int numOrder;
    int numOfLaps;
    String strokeType;
    String setDis;
    int setTimeMins;
    int setTimeSecs;
    String setDescription;
    int workoutID;

    public int getSetID() {
        return this.setID;
    }

    public void setSetID(int setID) {
        this.setID = setID;
    }

    public int getWorkoutID() {
        return this.workoutID;
    }
    
    public void setWorkoutID(int workoutID) {
        this.workoutID = workoutID;
    }

    public int getNumOrder() {
        return this.setID;
    }

    public void setNumOrder(int numOrder) {
        this.numOrder = numOrder;
    }

    public int getNumOfLaps() {
        return this.numOfLaps;
    }

    public void setNumOfLaps(int numOfLaps) {
        this.numOfLaps = numOfLaps;
    }

    public String getStrokeType() {
        return this.strokeType;
    }

    public void setStrokeType(String strokeType) {
        this.strokeType = strokeType;
    }

    public String getSetDis() {
        return this.setDis;
    }

    public void setSetDis(String setDis) {
        this.setDis = setDis;
    }

    public int getSetTimeMins() {
        return this.setTimeMins;
    }

    public int setSetTimeMins(int setTimeMins) {
        return this.setTimeMins = setTimeMins;
    }

    public int getSetTimeSecs() {
        return this.setTimeSecs;
    }

    public int setSetTimeSecs(int setTimeSecs) {
        return this.setTimeSecs = setTimeSecs;
    }

    public String getSetDescription() {
        return this.setDescription;
    }

    public String setSetDescription(String setDescription) {
        return this.setDescription = setDescription;
    }

}
