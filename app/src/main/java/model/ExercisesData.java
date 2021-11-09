package model;

import com.example.assignment.R;

import java.util.ArrayList;
import java.util.List;

 class ExercisesData implements IExerciseData{
    private ArrayList<Exercise> exercises;

    public ExercisesData() {
        exercises = new ArrayList<>();

        exercises.add(new Exercise(R.drawable.plank,"plank","abs",20));
        exercises.add(new Exercise(R.drawable.legraises,"leg raises","abs",60));
        exercises.add(new Exercise(R.drawable.mountainclimber,"mountain climber","abs",120));

        exercises.add(new Exercise(R.drawable.pushup,"push-ups","chest",20));
        exercises.add(new Exercise(R.drawable.kneepushup,"knee push-ups","chest",60));
        exercises.add(new Exercise(R.drawable.widearmpushup,"wide arm push-ups","chest",120));

        exercises.add(new Exercise(R.drawable.legbarbell,"leg barbell","arm",20));
        exercises.add(new Exercise(R.drawable.floortriceps,"floor tricep dips","arm",60));
        exercises.add(new Exercise(R.drawable.doorwaycurls,"doorway curls","arm",120));

        exercises.add(new Exercise(R.drawable.crustylunges,"cursty lunges","leg",20));
        exercises.add(new Exercise(R.drawable.squat,"jumping squats","leg",60));
        exercises.add(new Exercise(R.drawable.wallsit,"wall sit","leg",120));

        exercises.add(new Exercise(R.drawable.pikepushup,"pike push-ups","shoulder&back",20));
        exercises.add(new Exercise(R.drawable.childpose,"child pose","shoulder&back",60));
        exercises.add(new Exercise(R.drawable.sidearmsrise,"side arms rise","shoulder&back",120));

    }

    @Override
    public ArrayList<Exercise> getExercises(String type) {
        ArrayList<Exercise> res=new ArrayList<>();
        for (Exercise e:exercises) {
            if (e.getType().equalsIgnoreCase(type))
                res.add(e);
        }
        return res;
    }

    @Override
    public String[] getTypes() {
        String[] types = new String[]{"abs","chest","leg","arm","shoulder&back"};
        return types;
    }
}
