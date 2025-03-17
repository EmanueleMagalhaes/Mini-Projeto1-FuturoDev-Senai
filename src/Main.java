import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Captura o nome da ONG e cria um objeto ONG
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da ONG: ");
        String sutentabilidadeVerde = scanner.nextLine();
        ONG ong = new ONG(sutentabilidadeVerde);

        // Captura os dados do projeto e cria um objeto ProjetoReflorestamento
        System.out.print("Digite o nome do projeto: ");
        String nomeProjeto = scanner.nextLine();
        System.out.print("Digite a descrição do projeto: ");
        String descricaoProjeto = scanner.nextLine();
        System.out.print("Digite a quantidade de árvores plantadas: ");
        int arvores = scanner.nextInt();
        scanner.nextLine();
        ProjetoReflorestamento projeto = new ProjetoReflorestamento(nomeProjeto, descricaoProjeto, arvores);
        ong.adicionarProjeto(projeto);

        // Captura os dados do voluntário e o associa ao projeto
        System.out.print("Digite o nome do voluntário: ");
        String nomeVoluntario = scanner.nextLine();
        System.out.print("Digite o email do voluntário: ");
        String emailVoluntario = scanner.nextLine();
        Voluntario voluntario = new Voluntario(nomeVoluntario, emailVoluntario);
        voluntario.participarProjeto(projeto);

        // Gera e exibe o relatório de impacto do projeto
        projeto.gerarRelatorioImpacto(arvores, arvores * 0.05);
        projeto.exibirRelatorio();

        // Lista os projetos da ONG
        ong.listarProjetos();

        // Fecha o scanner
        scanner.close();
    }*/


//******************exemplo 2 ********

        Scanner scanner = new Scanner(System.in);
        Organizacao ong = new ONG("Sustentabilidade Verde");


        while (true) {
            System.out.println("\n==== Sistema de Gestão de Projetos Sustentáveis ====");
            System.out.println("1. Adicionar Projeto");
            System.out.println("2. Listar Projetos");
            System.out.println("3. Adicionar Voluntário a um Projeto");
            System.out.println("4. Gerar e Exibir Relatório de Impacto");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nome do Projeto: ");
                String nomeProjeto = scanner.nextLine();
                System.out.print("Descrição: ");
                String descricao = scanner.nextLine();
                ProjetoSustentavel projeto = new ProjetoReflorestamento(nomeProjeto, descricao, 100);
                ong.adicionarProjeto(projeto);
                System.out.println("Projeto adicionado!");
            } else if (opcao == 2) {
                ong.listarProjetos();
            } else if (opcao == 3) {
                if (ong.getListaProjetos().isEmpty()) {
                    System.out.println("Nenhum projeto cadastrado ainda.");
                    continue;
                }

                ong.listarProjetos();
                System.out.print("Escolha um projeto pelo número: ");
                int escolhaProjeto = scanner.nextInt();
                scanner.nextLine();
                if (escolhaProjeto < 1 || escolhaProjeto > ong.getListaProjetos().size()) {
                    System.out.println("Projeto inválido!");
                    continue;
                }

                System.out.print("Nome do Voluntário: ");
                String nomeVoluntario = scanner.nextLine();
                System.out.print("Email do Voluntário: ");
                String emailVoluntario = scanner.nextLine();
                Voluntario voluntario = new Voluntario(nomeVoluntario, emailVoluntario);
                ong.getListaProjetos().get(escolhaProjeto - 1).adicionarVoluntario(voluntario);
                System.out.println("Voluntário adicionado ao projeto!");
            } else if (opcao == 4) {
                if (ong.getListaProjetos().isEmpty()) {
                    System.out.println("Nenhum projeto cadastrado para gerar relatório.");
                    continue;
                }

                ong.listarProjetos();
                System.out.print("Escolha um projeto para gerar relatório: ");
                int escolha = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Digite o número de árvores plantadas: ");
                int arvores = scanner.nextInt();
                System.out.print("Digite a redução de CO2 (toneladas): ");
                double reducaoCO2 = scanner.nextDouble();

                ProjetoSustentavel projeto = ong.getListaProjetos().get(escolha - 1);
                projeto.gerarRelatorioImpacto(arvores, reducaoCO2);
                projeto.exibirRelatorio();
            } else if (opcao == 5) {
                System.out.println("Saindo do sistema...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}
/*
//*************Exemplo 3 *****
        Scanner scanner = new Scanner(System.in);
        List<Organizacao> ongs = new ArrayList<>();
        ongs.add(new Organizacao("Sustentabilidade Verde"));

        while (true) {
            System.out.println("\n==== ONGs Cadastradas ====");
            for (int i = 0; i < ongs.size(); i++) {
                System.out.println((i + 1) + ". " + ongs.get(i).getNome());
            }
            System.out.println("\n1. Cadastrar nova ONG");
            System.out.println("2. Entrar em uma ONG existente");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                System.out.print("Digite o nome da nova ONG: ");
                String nomeOng = scanner.nextLine();
                ongs.add(new Organizacao(nomeOng));
                System.out.println("ONG cadastrada com sucesso!");
            } else if (escolha == 2) {
                System.out.print("Escolha uma ONG pelo número: ");
                int index = scanner.nextInt() - 1;
                scanner.nextLine();
                if (index < 0 || index >= ongs.size()) {
                    System.out.println("ONG inválida!");
                    continue;
                }
                Organizacao ong = ongs.get(index);
                while (true) {
                    System.out.println("\n==== Gestão da ONG: " + ong.getNome() + " ====");
                    System.out.println("1. Adicionar Projeto");
                    System.out.println("2. Listar Projetos");
                    System.out.println("3. Sair");
                    System.out.print("Escolha uma opção: ");
                    int opcao = scanner.nextInt();
                    scanner.nextLine();

                    if (opcao == 1) {
                        System.out.println("Escolha a categoria do projeto:");
                        System.out.println("1 - Projeto Reflorestamento");
                        System.out.println("2 - Projeto Reciclagem");
                        System.out.println("3 - Projeto de Energia Renovável");
                        System.out.print("Opção: ");
                        int categoria = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Nome do Projeto: ");
                        String nomeProjeto = scanner.nextLine();
                        System.out.print("Descrição: ");
                        String descricao = scanner.nextLine();

                        ProjetoSustentavel projeto;
                        if (categoria == 1) {
                            projeto = new ProjetoReflorestamento(nomeProjeto, descricao, arvoresPlantadas);
                        } else if (categoria == 2) {
                            projeto = new ProjetoReciclagem(nomeProjeto, descricao);
                        } else if (categoria == 3) {
                            projeto = new ProjetoEnergiaRenovavel(nomeProjeto, descricao);
                        } else {
                            System.out.println("Categoria inválida!");
                            continue;
                        }

                        ong.adicionarProjeto(projeto);
                        System.out.println("Projeto adicionado com sucesso!");
                    } else if (opcao == 2) {
                        ong.listarProjetos();
                    } else if (opcao == 3) {
                        break;
                    } else {
                        System.out.println("Opção inválida!");
                    }
                }
            } else if (escolha == 3) {
                System.out.println("Saindo do sistema...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}
*/