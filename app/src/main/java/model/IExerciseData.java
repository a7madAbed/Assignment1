package model;

import java.util.List;

public interface IExerciseData {
    List<Exercise> getExercises(String type);
    String[] getTypes();
}
