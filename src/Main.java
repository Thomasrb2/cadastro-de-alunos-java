import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Aluno> alunos = new ArrayList<>();
        boolean rodando = true;

        while (rodando) {

            System.out.println("""
             ---------------------------
                 CADASTRO DE ALUNOS    
             ---------------------------

            1 - Adicionar aluno
            2 - Consultar alunos
            3 - Sair
            """);

            int opcao = Leitura.lerInteiro();
            Leitura.lerTexto(); // limpar buffer

            switch (opcao) {

                case 1:
                    Aluno aluno = new Aluno();

                    System.out.print("Nome: ");
                    aluno.setNome(Leitura.lerTexto());

                    System.out.print("Idade: ");
                    aluno.setIdade(Leitura.lerInteiro());
                    Leitura.lerTexto();

                    System.out.print("Curso: ");
                    aluno.setCurso(Leitura.lerTexto());

                    System.out.print("Matrícula: ");
                    aluno.setMatricula(Leitura.lerInteiro());
                    Leitura.lerTexto();

                    System.out.print("Semestre: ");
                    aluno.setSemestre(Leitura.lerInteiro());
                    Leitura.lerTexto();

                    alunos.add(aluno);

                    System.out.println(aluno.getNome() + " foi cadastrado com sucesso!");
                    break;

                case 2:
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado!");
                    } else {
                        for (Aluno a : alunos) {
                            System.out.println("""
                            -----------------------------
                            Nome: %s
                            Idade: %d
                            Curso: %s
                            Matrícula: %d
                            Semestre: %d
                            -----------------------------
                            """.formatted(
                                a.getNome(),
                                a.getIdade(),
                                a.getCurso(),
                                a.getMatricula(),
                                a.getSemestre()
                            ));
                        }
                    }
                    break;

                case 3:
                    rodando = false;
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        Leitura.fechar();
    }
}