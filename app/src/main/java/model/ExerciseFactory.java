package model;

public class ExerciseFactory {

    public IExerciseData getModel() {
        return new ExercisesData();
    }
}
