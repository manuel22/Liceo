package BaseDeDatos;

import java.io.*;//no olviden importar esta librería al inicio de su programa

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionMySQL {

    public int estado = 1;

    public int getEstado() {
        return estado;
    }
    public String db = "centroodontologico";
    public String url = "jdbc:mysql://localhost/" + db;
    public String user = "root";
    public String pass = "";
    public String log = " ";
    public String log2 = " ";

    public ConexionMySQL() {
    }

    public Connection Conectar() {
        Connection link = null;
        try {

            //Cargamos el Driver MySQL
            Class.forName("org.gjt.mm.mysql.Driver");
            //Creamos un enlace hacia la base de datos
            link = DriverManager.getConnection(this.url, this.user, this.pass);
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex);
            comprobarSSql(ex);
            log = ex.getMessage() + "codigo de Erorr: " + String.valueOf(ex.getErrorCode());
            //log2=;
            escribir("log.txt");
            //ejecutar("echo"+ex+">dump.txt");
//            JOptionPane.showMessageDialog(null, "La base de datos no existe, se esta creando la base de datos\n Por favor espere...");
            //String path="C:\\wamp\\bin\\mysql\\mysql5.5.8\\bin\\";
            //ejecutar("CrearBase.bat");

            //ejecutar(path+"mysqladmin -uroot  create sgd");
            //ejecutar(path+"mysql -u root  sgd <C:\\SistemaGDDB_sgd.sql");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return link;
    }

    public void comprobarSSql(SQLException exec) {
        if (sistemaOperativo().startsWith("Windows")) {//comprueba si es windows
            if (exec.getErrorCode() == 0) {
                estado = 0;
                //Si entra en este estrucctura es porque no hay conexxion con el servicio de mysql
                JOptionPane.showMessageDialog(null, "no esta en ejecucion el servicio de mysql");
                JOptionPane.showMessageDialog(null, System.getProperty("user.dir"));
                ejecutar("IniciarMysql.bat");

            } else {
                if (exec.getErrorCode() == 1049) {
                    estado = 1049;
                    //Si entra en este estrucctura es porque no existe la base de datos
                    ejecutar("CrearBase.bat");
                    JOptionPane.showMessageDialog(null, "La base de datos Creada Exitosamente..\nPuede ahora ingresar al sistema..");
                    //System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "error no especificado comnicese con su preveedor de sistema");

                }

            }
        }
        if (sistemaOperativo().startsWith("Linux"))//comprueba si el sitema esta en linux
        {
            JOptionPane.showMessageDialog(null, "estas en linux");
        }




    }

    public void ejecutar(String archivo) {
        try {
            String comando;
            Process proceso = Runtime.getRuntime().exec(archivo);
            BufferedReader lector = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            while ((comando = lector.readLine()) != null) {
                System.out.println(comando);

            }
            lector.close();
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
//esto es solo un método, no una clase, el método deberá ser incluido en una clase java para su uso
    public void escribir(String nombreArchivo) {
        File f;
        f = new File(nombreArchivo);

//Escritura
        try {
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            wr.write(log);//escribimos en el archivo 
            wr.append("error: " + log); //concatenamos en el archivo sin borrar lo existente
            //ahora cerramos los flujos de canales de datos, al cerrarlos el archivo quedará guardado con información escrita
            //de no hacerlo no se escribirá nada en el archivo
            wr.close();
            bw.close();
        } catch (IOException e) {
        };
    }

    public String LeerArchivo(String archivo) {
        String lectura = null;
        {
            try {
                // Abrimos el archivo
                FileInputStream fstream = new FileInputStream(archivo);
                // Creamos el objeto de entrada
                DataInputStream entrada = new DataInputStream(fstream);
                // Creamos el Buffer de Lectura
                BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
                //String strLinea;
                lectura = buffer.toString();
                // Leer el archivo linea por linea
                //while ((strLinea = buffer.readLine()) != null)   {
                // Imprimimos la línea por pantalla
                //  System.out.println (strLinea);
                //}
                // Cerramos el archivo
                entrada.close();
            } catch (Exception e) { //Catch de excepciones
                System.err.println("Ocurrio un error: " + e.getMessage());
            }
        }
        return lectura;
    }

    private String sistemaOperativo() {
        String sSistemaOperativo = System.getProperty("os.name");
        System.out.println(sSistemaOperativo);
        return sSistemaOperativo;
    }
}
