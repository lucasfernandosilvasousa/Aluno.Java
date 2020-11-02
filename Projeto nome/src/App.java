public class master  {
    public static void main(String[] args) {
    String nome;
    String serie;
    Scanner insert = new Scanner(System.in);
    Pessoa pessoa = new Pessoa(nome, serie);

    
    System.out.print("qual seu nome: ");
    nome = insert.nextLine();
    
    System.out.print("qual sua serie: ");
    serie = insert.nextLine();
    
   
    pessoa.setNome(nome);
    pessoa.setSerie(serie);
    
    }
}
