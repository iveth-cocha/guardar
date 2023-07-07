
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.lang.module.InvalidModuleDescriptorException;

public class Main {

    public static void main(String[] args) {
       //              =direccion de la ruta o donde se guarda
        String filePath = "datos.dat"; //.dat es como extencion de .txt

        MiClase miObjeto= new MiClase("Iveth",21);

        //defino la ruta
        try(
                FileOutputStream fileOut=new FileOutputStream(filePath);
                ObjectOutputStream obOut=new ObjectOutputStream(fileOut)
                ){

            obOut.writeObject(miObjeto);
            System.out.println("archivo escrito correctamente");

        }catch (IOException e){
            throw new RuntimeException(e);
        }


        /*-----------------------------------------------*/
        try(
                FileInputStream fileIn=new FileInputStream(filePath);
                ObjectInputStream obIn= new ObjectInputStream(fileIn)
        ){
            MiClase readObject=(MiClase)obIn.readObject();
            System.out.println("El objeto en disco es: "+readObject);
            System.out.println(readObject.getEdad());
            System.out.println(readObject.getNombre());
        }catch (IOException e){
            throw new RuntimeException(e);
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }

    }
}