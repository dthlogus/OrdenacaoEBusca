package controller;

import service.OrdenadorNumero;
import service.TxtServiceImpl;

import java.io.IOException;
import java.util.Scanner;

public class TxtController {

    private TxtServiceImpl txtServiceImpl;
    private OrdenadorNumero ordenadorNumero;
    private String lingua;

    public TxtController(TxtServiceImpl txtServiceImpl, OrdenadorNumero ordenadorNumero) {
        this.txtServiceImpl = txtServiceImpl;
        this.ordenadorNumero = ordenadorNumero;
    }

    public void escolhendoLingua() throws IOException {
        int option = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual língua deseja usar?");
        System.out.println("1. Portugues");
        System.out.println("2. Inglês");
        System.out.println("3. Alemão");
        System.out.println("4. Sair");
        option = scan.nextInt();
        switch (option) {
            case 1:
                lingua = "dic_portugues";
                break;
            case 2:
                lingua = "dic_english";
                break;
            case 3:
                lingua = "dic_german";
                break;
            case 4:
                System.exit(0);
            default:
                throw new IOException("Faltou selecionar um campo valido");
        }
        sistemaOrdenacao();
    }

        private void sistemaOrdenacao () throws IOException {
            int option = 0;
            Scanner scan = new Scanner(System.in);
            System.out.println("Qual sistema de ordenaçào deseja usar?");
            System.out.println("1. Bubble");
            System.out.println("2. Insertion");
            System.out.println("3. Merge");
            System.out.println("4. Quick");
            System.out.println("5. Relatório Total (Pode demorar para ser completado)");
            System.out.println("6. Sair");
            option = scan.nextInt();
            switch (option) {
                case 1:
                    arrayComBubble();
                    break;
                case 2:
                    arrayComInsertion();
                    break;
                case 3:
                    arrayComMergeSort();
                    break;
                case 4:
                    arrayComQuickSort();
                    break;
                case 5:
                    relatorioTotal();
                    break;
                case 6:
                    System.exit(0);
                default:
                    throw new IOException("Faltou selecionar um campo valido");
            }
        }

        private void arrayComBubble () {
            try {
                this.txtServiceImpl.ordenadorBubble(lingua);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        private void arrayComInsertion () {
            try {
                this.txtServiceImpl.ordenadorInsertion(lingua);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        private void arrayComMergeSort () {
            try {
                this.txtServiceImpl.ordenadorMerge(lingua);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        private void arrayComQuickSort () {
            try {
                this.txtServiceImpl.ordenadorQuick(lingua);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        private void relatorioTotal(){
            try{
                this.txtServiceImpl.relatorioTodos(lingua);
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }

    }
