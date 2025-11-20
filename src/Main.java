import Library.*;
void main() {
    Scanner sc = new Scanner(System.in);
    List<User> users = new ArrayList<>();
    List<Book> books;
    LibraryProcesses libraryProcesses;
    int userIntInput = 0;
    String userStringInput = "";

    System.out.println("Olá sejá bem-vindo ao meu sistema de livraria");

    while(userIntInput!=4){
        System.out.println("""
                \nOpções disponiveis:\n 1-Usuarios\n 2-Livros\n 3-Emprestar ou Devolver Livros\n 4-sair""");
        System.out.print("Escolha uma: ");
        userIntInput = sc.nextInt();
        switch (userIntInput){
            case 1:
                userOptions(users,userIntInput,userStringInput);
                break;
            case 2:
                System.out.println("Livros");
                break;
            case 3:
                System.out.println("Emprestar ou Devolver");
                break;
            default:
                System.out.println("Saindo...");
        }
    }
}
void userOptions(List<User> users, int userIntInput, String userStringInput){
    Scanner sc = new Scanner(System.in);

    System.out.println("""
                \nOpções disponiveis:\n 1-Ver usuarios Disponiveis\n 2-Adicionar Usuario\n 3-Excluir Usuario \n 4- Ver Dados Usuario Espcifico\n 5-Voltar""");
    System.out.print("Escolha uma: ");
    userIntInput = sc.nextInt();

    switch (userIntInput){
        case 1:
            showListUser(users);
            System.out.print("\nDigite qualquer tecla: ");
            sc.next();
            break;
        case 2:
            System.out.print("Digite o nome do usuario: ");
            userStringInput = sc.next();
            users.add(new User(userStringInput));
            break;
        case 3:
            showListUser(users);
            System.out.print("Digite o numero que deseja excluir: ");
            userIntInput = sc.nextInt();
            users.remove(users.get(userIntInput-1));
            break;

        case 4:
            showListUser(users);
            System.out.print("Digite o numero que deseja ver os dados detalhadamente: ");
            userIntInput = sc.nextInt();
            System.out.printf("\nId do usuário: ", users.get(userIntInput -1 ).getId());
            System.out.printf("Nome do usuário: ", users.get(userIntInput - 1).getName());
            showBorrowedBooks(users,userIntInput);


    }
}


// mostra os usuario cadastrado e registrado na lista
void showListUser(List<User> users){
    for (int i = 0; i < users.size(); i++){
        System.out.print(i+1);
        System.out.print(" - ");
        System.out.print(users.get(i).getName());
        System.out.println();
    }
}
// mostra os livros que foram emprestado para um determinado usuario
void showBorrowedBooks(List<User> users, int userIntInput){
    for (int i = 0; i < users.get(userIntInput-1).getBorrowedBooks().size(); i++){
        System.out.print(i+1);
        System.out.print(" - ");
        System.out.print(users.get(userIntInput-1).getBorrowedBooks().get(i).getTitle());
        System.out.println();
    }
}