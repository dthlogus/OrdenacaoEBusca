package controller;

import service.TxtService;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TxtController {

    private TxtService txtService;

    public TxtController(TxtService txtService){
        this.txtService = txtService;
    }

    public void arrayComPortugues(){
        try {
            this.txtService.LeitorArquivo("dic_portugues");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
