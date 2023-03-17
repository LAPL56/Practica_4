public class ArtekTestArrays {
    public static void main(String[] args) {}

        public static void Prueba(int option){
            //int option = Integer.parseInt(args[0]);
            switch (option)
            {
                case 0:
                    //TODO Display Random numbers results
                    ArtekArrays Arrays = new ArtekArrays();
                    Arrays.MakeRandomNumbers();

                    int[] numbers = {4, 8, 8, 9, 7, 8, 10};

                    Arrays.AverageNumbers(numbers);

                    Arrays.MedianaNumbers(numbers);

                    Arrays.ModaNumber(numbers);

                    int[] NumDesc = Arrays.OrderByDesc(numbers);

                    Arrays.OrderByAsc(NumDesc);

                    Arrays.ParNumbers(numbers);

                    Arrays.ImparNumbers(numbers);

                    Arrays.ParPositionNumber(numbers);
                    break;
                case 1:
                    //TODO Display Students results;
                    ArtekArraysStudents Students = new ArtekArraysStudents();
                    String [][] students = Students.MakeStudentArray();

                    //Opciones:
                    // 1. Primer nombre
                    // 2. Segundo nombre
                    // 3. Apellido paterno
                    // 4. Apellido materno

                    Students.OrderByDesc(students,1);
                    Students.OrderByAsc(students,2);
                    break;
            }
        }
    }

