
package crud;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class teste {
 private String email;
 private String nome;
 private String CPF;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
 
String CRUD(){
     try {
         FileWriter fw = new FileWriter("CRUD.txt");
         PrintWriter pw = new PrintWriter(fw);
         pw.println(this.nome);
         pw.println(this.CPF);
         pw.println(this.email);
         pw.flush();
         pw.close();
         fw.close();
     } catch (IOException ex) {
         Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
     }
     return "CADASTRADO COM SUCESSO";
    
}

}
