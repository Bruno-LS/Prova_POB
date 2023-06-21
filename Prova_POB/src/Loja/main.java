package Loja;

import java.util.*;
//import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ArrayList<Produto>();

		Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1. Incluir Produto");
            System.out.println("2. Excluir Produto");
            System.out.println("3. Alterar Produto");
            System.out.println("4. Listar todos os Produtos");
            System.out.println("5. Listar um Produto específico");
            System.out.println("Qualquer coisa p/ Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                	public static void incluirProduto(Produto produto) {
            	        produtos.add(produto);
            	    }
                    break;
                case 2:
                	public static void excluirProduto(int id) {
            	        produtos.removeIf(produto -> produto.getId() == id);
            	    }
                    break;
                case 3:
                	public static void alterarProduto(int id, Produto novoProduto) {
            	        for (int i = 0; i < produtos.size(); i++) {
            	            Produto produto = produtos.get(i);
            	            if (produto.getId() == id) {
            	                novoProduto.setId(id);
            	                produtos.set(i, novoProduto);
            	                break;
            	            }
            	        }
            	    }
                    break;
                case 4:
                	public static List<Produto> listarProdutos() {
            	        return produtos;
            	    }
                    break;
                case 5:
                	public static Produto buscarProduto(int id) {
            	        for (Produto produto : produtos) {
            	            if (produto.getId() == id) {
            	                return produto;
            	            }
            	        }
            	        return null;
            	    }
                    break;
                default:
                	System.out.println("Encerrando o programa...");
                	break;
            }
        } while (opcao != 0);

        scanner.close();   

		
	}

}


