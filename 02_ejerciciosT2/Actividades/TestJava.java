


/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class TestJava {

    
    public static void main(String[] args) {
        String nombreSO = "os.name";                 //Nombre del sistema operativo
        String versionSO = "os.version";             //Versi�n del sistema operativo
        String arquitecturaSO = "os.arch";           //Arquitectura del sistema operativo
        String file_separator = "file.separator";    //Car�cter que separa los componentes de una ruta de acceso de archivo. Esto es "" en UNIX y "" en Windows./\
        String java_class_path= "java.class.path";   //Ruta utilizada para buscar directorios y archivos JAR que contienen archivos de clase. Los elementos de la ruta de acceso de clase est�n separados por un car�cter espec�fico de la plataforma especificado en la propiedad.path.separator
        String java_home = "java.home";              //Directorio de instalaci�n para Java Runtime Environment (JRE)
        String java_vendor = "java.vendor";          //Nombre del proveedor de JRE
        String java_vendor_url = "java.vendor.url";  //URL del proveedor de JRE
        String java_version = "java.version";        //N�mero de versi�n de JRE
        String line_separator = "line.separator";    //Secuencia utilizada por el sistema operativo para separar l�neas en archivos de texto
        String path_separator = "path.separator";    //Car�cter separador de trazado utilizado enjava.class.path
        String user_dir = "user.dir";                //Directorio de trabajo de usuarios
        String user_home = "user.home";              //Directorio de inicio de usuario
        String user_name = "user.name";              //Nombre de cuenta de usuario
        
        System.out.println("=============================");
        System.out.println("= Informaci�n sobre el S.O. =");
        System.out.println("=============================");
        System.out.println("Nombre del S.O.: "+ System.getProperty(nombreSO));
        System.out.println("Versi�n del S.O.: " + System.getProperty(versionSO));
        System.out.println("Arquitectura del S.O.: "+System.getProperty(arquitecturaSO));
        System.out.println("File separator: "+System.getProperty(file_separator));
        System.out.println("Java class path: "+System.getProperty(java_class_path));
        System.out.println("Java home: "+System.getProperty(java_home));
        System.out.println("Java vendor: "+System.getProperty(java_vendor));
        System.out.println("Java vendor url: "+System.getProperty(java_vendor_url));
        System.out.println("Java versi�n: "+System.getProperty(java_version));
        System.out.println("Line separator: "+System.getProperty(line_separator));
        System.out.println("Path separator: "+System.getProperty(path_separator));
        System.out.println("User dir: "+System.getProperty(user_dir));
        System.out.println("User home: "+System.getProperty(user_home));
        System.out.println("User name: "+System.getProperty(user_name));
    }

}
