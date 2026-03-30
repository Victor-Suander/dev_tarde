import static java.lang.IO.readln;

void main() {

    IO.print("Usuario: ");
    String user = readln();

    IO.print("Senha: ");
    String password = readln();

    if (user.equals("admin") && password.equals("1234")){
        IO.println("Logado");
    }else{
        IO.println("ERROR!");
    }

}