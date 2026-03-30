import static java.lang.IO.readln;

void main() {

    IO.print("Gostaria de adotar um Pet? (s/n)");
    char resp = readln().charAt(0);

    if(resp == 's'){
        IO.print("Voce tem um quintal grande? (s/n)");
        char resp1 = readln().charAt(0);

        if(resp1 == 's'){
            IO.print("Voce pode adotar");

        }else if (resp1 == 'n') {
            IO.print("Voce vai passear com ele 2x no dia? (s/n)");
            char resp2 = readln().charAt(0);

            if(resp2 == 's'){
                IO.print("Voce pode adotar");
            } else {
                IO.print("Voce nao pode adotar!");
            }
        }
    } else {
        IO.print("Voce Não Pode Adotar");
    }

}