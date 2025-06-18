
import static java.lang.System.in;



public class Estudiante {
     //atributos
         private final int id;
         private final String nombre;
         private final String apellido;
         private final String direccion;
    //construtor

    public Estudiante(int id, String nombre, String apellido, String direccion, String[] telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }
     
    //metodos 
     
    public void mostrarDatos(){
            
         
             
    System.out.println("Id"+id);
    System.out.println("nombre:"+nombre);
        System.out.println("apellido:"+apellido);
        System.out.println("direccion:"+direccion);
                for(int i=0;i<3;i++) (
                System.out.println(telefono(in)+"telefono:")
         );
    }
 }

