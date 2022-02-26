package controller;

import service.Ordenador;
import service.TxtServiceImpl;

import java.io.IOException;
import java.util.Scanner;

public class TxtController {

    private TxtServiceImpl txtServiceImpl;
    private Ordenador ordenador;
    private String lingua;

    public TxtController(TxtServiceImpl txtServiceImpl, Ordenador ordenador){
        this.txtServiceImpl = txtServiceImpl;
        this.ordenador = ordenador;
    }

    public void sistemaOrdenacao(){
        Integer option = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual sistema de ordenaçào deseja usar?");
        System.out.println("1. Bubble");
        System.out.println("2. Insertion");
        System.out.println("3. Merge");
        System.out.println("4. Quick");
        option = scan.nextInt();
        switch (option){
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
            default:
                System.out.println("por favor, selecione um valor válido.");
                break;
        }
    }

    private void arrayComBubble(){
        try {
            this.txtServiceImpl.ordenadorBubble("dic_portugues");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void arrayComInsertion(){
        try {
            this.txtServiceImpl.ordenadorInsertion("dic_portugues");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void arrayComMergeSort(){
        try {
            this.txtServiceImpl.ordenadorMerge("dic_portugues");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void arrayComQuickSort(){
        try {
            this.txtServiceImpl.ordenadorQuick("dic_portugues");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
