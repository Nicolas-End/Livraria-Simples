import Library.*;
void main() {
    Scanner sc = new Scanner(System.in);
    List<User> users = new ArrayList<>();
    List<Book> books = new ArrayList<>();

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
                userOptions(users,userIntInput,userStringInput,sc);
                break;

            case 2:
                booksOptions(books,userIntInput,userStringInput,sc);
                break;

            case 3:
                borrowOptions(books,users,userIntInput,sc);
                break;
            default:
                System.out.println("Saindo...");
        }
    }
}



void userOptions(List<User> users, int userIntInput, String userStringInput, Scanner sc){

    while(userIntInput!=5) {
        System.out.println("""
                \nOpções disponiveis:\n 1-Ver usuarios Disponiveis\n 2-Adicionar Usuario\n 3-Excluir Usuario \n 4- Ver Dados Usuario Espcifico\n 5-Voltar""");
        System.out.print("Escolha uma: ");
        userIntInput = sc.nextInt();

        switch (userIntInput) {
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
                users.remove(users.get(userIntInput - 1));
                break;

            case 4:
                showListUser(users);

                System.out.print("Digite o numero que deseja ver os dados detalhadamente: ");
                userIntInput = sc.nextInt();

                User u = users.get(userIntInput - 1);

                System.out.printf("\nId do usuário: %d\n", u.getId());
                System.out.printf("Nome do usuário: %s\n", u.getName());
                System.out.print("livros Emprestado \n");
                showBorrowedBooks(users, userIntInput);
                break;
            case 5:
                System.out.println("Voltando ...");
                break;
            default:
                System.out.println("Opção Invalida");


        }
    }
}

void booksOptions(List<Book> books, int userIntInput, String userStringInput, Scanner sc){
    while(userIntInput!=5) {
        System.out.println("""
                \nOpções disponiveis:\n 1-Ver livros Disponiveis\n 2-Adicionar Livro\n 3-Excluir Livro \n 4- Ver Dados Livro Espcifico\n 5-Voltar""");
        System.out.print("Escolha uma: ");
        userIntInput = sc.nextInt();

        switch (userIntInput){
            case 1:
                showBooks(books);
                System.out.print("\nDigite qualquer tecla: ");
                sc.next();
                break;
            case 2:
                System.out.print("\nDigite o titulo do livro: ");
                String title = sc.next();
                System.out.print("\nDigite o nome do Autor");
                String author =sc.next();
                books.add(new Book(title,author));
                break;
            case 3:
                showBooks(books);
                System.out.print("Digite o numero que deseja excluir: ");
                userIntInput = sc.nextInt();
                books.remove(books.get(userIntInput - 1));
                break;
            case 4:
                showBooks(books);

                System.out.print("Digite o numero que deseja ver os dados detalhadamente: ");
                userIntInput = sc.nextInt();

                Book book = books.get(userIntInput - 1);

                System.out.printf("\nId do Livro: %s",book.getId());
                System.out.printf("\nTitulo do livro: %s\n", book.getTitle());
                System.out.printf("Autor do Livro: %s\n", book.getAuthor());
                if (book.getAvailable()){
                    System.out.println("livro esta disponivel");
                }
                else {
                    System.out.println("livro não esta disponivel ");
                }

                break;
            case 5:
                System.out.println("Voltando ...");
                break;
            default:
                System.out.println("Opção Invalida");
        }
    }
}

void borrowOptions(List<Book> books, List<User> users, int userIntInput, Scanner sc){
    userIntInput = 0;
    int userPosition;
    int bookPosition;

    while(userIntInput != 3) {
        System.out.println("Opções disponiveis: \n 1-Emprestar Livro\n 2-Devolver Livro\n 3-Voltar");
        System.out.print("Digite qual opção deseja: ");
        userIntInput = sc.nextInt();
        switch (userIntInput){
            case 1:

                showListUser(users);
                System.out.print("\nDigite qual usuario deseja emprestar o livro: ");
                userPosition = sc.nextInt();
                System.out.println("\n");

                showAvaliblesBooks(books);
                System.out.print("Digite qual livro deseja emprestar: ");
                bookPosition = sc.nextInt();

                new LibraryProcesses(users.get(userPosition-1),books.get(bookPosition-1)).addBorrowBook();

                System.out.println("Digite q para sair: ");
                sc.next();

                break;
            case 2:
                showListUser(users);
                System.out.print("\nDigite qual usuario deseja devolver o livro: ");
                userPosition = sc.nextInt();
                System.out.println("\n");

                showBorrowedBooks(users,userPosition);
                System.out.println("Digite qual livro deseja devolver: ");
                bookPosition = sc.nextInt();

                new LibraryProcesses(users.get(userPosition-1),books.get(bookPosition-1)).removeBorrowBook();
                System.out.println("Digite q para sair: ");
                sc.next();
                break;

            case 3:
                System.out.println("Voltando ..");
                break;
            default:
                System.out.println("Valor Invalido");
        }
    }
}



void showBooks(List<Book> books){
    for (int i = 0; i < books.size(); i++){
        System.out.print(i+1);
        System.out.print(" - ");
        System.out.print(books.get(i).getTitle());
        System.out.println();
    }
}
void showAvaliblesBooks(List<Book> books){
    for (int i = 0; i < books.size(); i++){
        if(books.get(i).getAvailable()) {
            System.out.print(i + 1);
            System.out.print(" - ");
            System.out.print(books.get(i).getTitle());
            System.out.println();
        }
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
    if(users.get(userIntInput-1).getBorrowedBooks() == null){
        System.out.println("Nenhum Livro Emprestado");
        return;
    }
    for (int i = 0; i < users.get(userIntInput-1).getBorrowedBooks().size(); i++){
        System.out.print(i+1);
        System.out.print(" - ");
        System.out.print(users.get(userIntInput-1).getBorrowedBooks().get(i).getTitle());
        System.out.println();
    }
}

