import java.util.Arrays;
public class ArtekArraysStudents {
    public String[][] MakeStudentArray() {
        String[][] students =  {
                {"Juan", "Pablo", "García", "Pérez"},
                {"María", "", "López", "Hernández"},
                {"Miguel", "", "Rodríguez", "González"},
                {"Ana", "Isabel", "Martínez", "Sánchez"},
                {"Pedro", "", "Díaz", "Gómez"},
                {"Sofía", "Alejandra", "Ramírez", "Fernández"}
                // Agregue aquí los nombres de los alumnos en el mismo formato
        };
        return students;
    }

    public String[][] OrderByDesc (String[][] students, int option){
        switch (option){
            case 1:
                //Order by name
                Arrays.sort(students, (a, b) -> b[0].compareTo(a[0])); // ordenar por el primer nombre
                System.out.println("\nEl arreglo ha sido ordenado por el primer nombre de forma descendente:");
                break;
            case 2:
                //Order by second name
                //If doesn't have order last
                Arrays.sort(students, (a, b) -> b[1].compareTo(a[1])); // ordenar por el segundo nombre
                System.out.println("\nEl arreglo ha sido ordenado por el segundo nombre de forma descendente:");
                break;
            case 3:
                //Order by father's family
                Arrays.sort(students, (a, b) -> b[2].compareTo(a[2])); // ordenar por el apellido paterno
                System.out.println("\nEl arreglo ha sido ordenado por el apellido paterno de forma descendente:");
                break;
            case 4:
                //Order by mothers family
                //If doesn't haver order last
                Arrays.sort(students, (a, b) -> b[3].compareTo(a[3])); // ordenar por el apellido materno
                System.out.println("\nEl arreglo ha sido ordenado por el apellido materno de forma descendente:");
                break;
        }
        for (String[] student : students) {
            System.out.println(Arrays.toString(student));
        }
        return students;
    }

    public static String[][] OrderByAsc(String[][] students, int order) {
        switch (order) {
            case 1:
                Arrays.sort(students, (a, b) -> a[0].compareTo(b[0])); // ordenar por el primer nombre
                System.out.println("\nEl arreglo ha sido ordenado por el primer nombre de forma ascendente:");
                break;
            case 2:
                Arrays.sort(students, (a, b) -> a[1].compareTo(b[1])); // ordenar por el segundo nombre
                System.out.println("\nEl arreglo ha sido ordenado por el segundo nombre de forma ascendente:");
                break;
            case 3:
                Arrays.sort(students, (a, b) -> a[2].compareTo(b[2])); // ordenar por el apellido paterno
                System.out.println("\nEl arreglo ha sido ordenado por el apellido paterno de forma ascendente:");
                break;
            case 4:
                Arrays.sort(students, (a, b) -> a[3].compareTo(b[3])); // ordenar por el apellido materno
                System.out.println("\nEl arreglo ha sido ordenado por el apellido materno de forma ascendente:");
                break;
            default:
                System.out.println("\nCriterio inválido para ordenar el arreglo.");
                break;
        }

        for (String[] student : students) {
            System.out.println(Arrays.toString(student));
        }

        return students;
    }
}
